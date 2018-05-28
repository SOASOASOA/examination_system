
/**  
* @Title: UserManagementServiceImpl.java
* @Package cn.soa.examsystem.service.impl
* @Description: TODO(用一句话描述该文件做什么)
* @author zhugang
* @date 2018年4月27日
* @version V1.0  
*/

package cn.soa.examsystem.service.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.soa.examsystem.controller.form.UserFrom;
import cn.soa.examsystem.dao.UserManagementDao;
import cn.soa.examsystem.entity.Admin;
import cn.soa.examsystem.entity.Tree;
import cn.soa.examsystem.exception.MyException;
import cn.soa.examsystem.service.inter.UserManagementServiceInter;
import cn.soa.examsystem.util.ExaminUtil;
import cn.soa.examsystem.util.JsonResult;

/**
 * @ClassName: UserManagementServiceImpl
 * @Description: 用户管理service层实现类
 * @author hezy
 * @date 2018年4月27日
 *
 */
@Service("userManagementService")
public class UserManagementServiceImpl implements UserManagementServiceInter {
	
	@Resource
	private UserManagementDao userManagementDao;
	private Integer start_page;//起始行 
	private Integer end_page;//结束行
	
	/**
	 * 根据模块ID查询对应的功能模块信息
	 * @throws MyException 
	 */
	@Override
	public JsonResult<List<Map<String, Object>>> findUserFunctionlByID(String ua_id) throws MyException {
		if(ua_id==null) {
			throw new MyException("获取模本ID异常");
		}
		List<Map<String, Object>> findUserFunctionlByID = userManagementDao.findUserFunctionlByID(ua_id);
		if(findUserFunctionlByID==null) {
			throw new MyException("获取该模块功能信息异常");
		}
		return new JsonResult<List<Map<String, Object>>>(findUserFunctionlByID);
	}

	/**
	 * 更加user_id查询对应组织结构
	 * @throws MyException 
	 */
	@Override
	public JsonResult<List<Tree>> findOrganizationStructureByUserId(String user_id) throws MyException {
		if(user_id==null) {
			throw new MyException("获取用户ID异常");
		}
		List<Tree> findOrganizationStructureByUserId = userManagementDao.findOrganizationStructureByUserId(user_id);
		if(findOrganizationStructureByUserId==null) {
			throw new MyException("获取组织模块信息异常");
		}
		return new JsonResult<List<Tree>>(findOrganizationStructureByUserId);
	}

	/**
	 * 根据uos_id查询对应的节点组织
	 * @throws MyException 
	 */
	@Override
	public JsonResult<List<Map<String, Object>>> findNodeOrganizationByUosId(String uos_id) throws MyException {
		if(uos_id==null) {
			throw new MyException("获取用户UOSID异常");
		}
		List<Map<String, Object>> findNodeOrganizationByUosId = userManagementDao.findNodeOrganizationByUosId(uos_id);
		if(findNodeOrganizationByUosId==null) {
			throw new MyException("获取对应的节点组织信息异常");
		}
		return new JsonResult<List<Map<String, Object>>>(findNodeOrganizationByUosId);
	}

	/**
	 * 根据uos_id修改对应的节点名称
	 * @throws MyException 
	 */
	@Override
	public JsonResult<String> updateNodeNameByUosId(String uos_id, String user_name) throws MyException {
		if(uos_id==null||user_name==null) {
			throw new MyException("获取用户UOSID异常");
		}
		Integer updateNodeNameByUosId = userManagementDao.updateNodeNameByUosId(uos_id, user_name);
		String str="节点名称修改失败";
		if(updateNodeNameByUosId==1) {
			str="节点名称修改成功";
		}
		return new JsonResult<String>(str);
	}

	/**
	 * 增加新的子节点
	 */
	@Override
	public JsonResult<String> addNode(String user_father_id, String user_name) throws MyException {
		if(user_name==null||user_father_id==null) {
			throw new MyException("新增节点信息异常");
		}
		String uos_id=ExaminUtil.getUUID();
		Integer addNode = userManagementDao.addNode(uos_id, user_father_id, user_name);
		String str="新增节点失败";
		if(addNode==1) {
			str="新增节点成功";
		}
		return new JsonResult<String>(str);
	}
	/**
	 * 通过user_id查询对应组织结构根节点uos_id,并查询相同组织结构根uos_id相同的用户信息
	 */
	@Override
	public JsonResult<List<Map<String, Object>>> findUserInfoByUserID(String user_id,Integer page, Integer limit) throws MyException {
		if(user_id==null) {
			throw new MyException("用户ID异常");
		}
		if(page==null||limit==null) {
			throw new MyException("分页查询异常");
		}
		start_page=(page-1)*limit+1;//起始行 
		end_page=page*limit;//结束行
		List<Map<String, Object>> findUserInfoByUserID = userManagementDao.findUserInfoByUserID(user_id, start_page, end_page);
		if(findUserInfoByUserID==null) {
			throw new MyException("获取对应的用户信息异常");
		}
		//通过user_id查询对应用户角色的后代角色名称
		List<Map<String, Object>> findChildRoleByUserID = userManagementDao.findChildRoleByUserID(user_id);
		//判断当前用户角色是否包含子角色，如果存在后代角色则分别判断同一组织用户是否有修改权限(1.修改;2.无权限修改)
		//如果当前用户角色不包含后代角色，则说明用户无权修改任何角色信息
		if(findChildRoleByUserID!=null) {
			List<String> lists=new ArrayList<String>();
			for (Map<String, Object> map : findChildRoleByUserID) {
				String rolename=(String)map.get("ROLE_NAME");
				lists.add(rolename);
			}
			for (Map<String, Object> map : findUserInfoByUserID) {
				String role_name = (String)map.get("ROLE_NAME");
				if(lists.contains(role_name)) {
					map.put("PERMISSION","修改");
				}else {
					map.put("PERMISSION","无权限");
				}
			}
		}else {
			for (Map<String, Object> map : findUserInfoByUserID) {
					map.put("PERMISSION","无权限");
			}
		}
		Integer total = userManagementDao.findUserInfoTotalCountByUserID(user_id);
		return new JsonResult<List<Map<String, Object>>>(total,findUserInfoByUserID);
	}

	/**
	 * 根据uos_id查询用户信息
	 */
	@Override
	public JsonResult<List<Map<String, Object>>> findUserInfoByUosID(String user_id,String uos_id, Integer page, Integer limit)
			throws MyException {
		if(uos_id==null) {
			throw new MyException("UOS_ID异常");
		}
		if(page==null||limit==null) {
			throw new MyException("分页查询异常");
		}
		start_page=(page-1)*limit+1;//起始行 
		end_page=page*limit;//结束行
		 List<Map<String, Object>> findUserInfoByUosID = userManagementDao.findUserInfoByUosID(uos_id, start_page, end_page);
		if(findUserInfoByUosID==null) {
			throw new MyException("获取对应的用户信息异常");
		}
		//通过user_id查询对应用户角色的后代角色名称
		List<Map<String, Object>> findChildRoleByUserID = userManagementDao.findChildRoleByUserID(user_id);
		//对应的角色名称放入到lists集合中
		List<String> lists=new ArrayList<String>();
		for (Map<String, Object> map : findChildRoleByUserID) {
			lists.add((String)map.get("ROLE_NAME"));
		}
		//判断当前用户角色是否包含子角色，如果存在后代角色则分别判断同一组织用户是否有修改权限(1.修改;2.无权限修改)
		//如果当前用户角色不包含后代角色，则说明用户无权修改任何角色信息
		if(findChildRoleByUserID!=null) {
			for (Map<String, Object> map : findUserInfoByUosID) {
				String role_name = (String)map.get("ROLE_NAME");
				if(lists.contains(role_name)) {
					map.put("PERMISSION","修改");
				}else {
					map.put("PERMISSION","无权限");
				}
			}
		}else {
			for (Map<String, Object> map : findUserInfoByUosID) {
					map.put("PERMISSION","无权限");
			}
		}
		Integer total = userManagementDao.findUserInfoTotalCountByUosID(uos_id);
		return new JsonResult<List<Map<String, Object>>>(total,findUserInfoByUosID);
	}

	/**
	 * 根据USER_ID查询后代节点
	 */
	@Override
	public JsonResult<List<Map<String, Object>>> findChildRoleByUserID(String user_id) throws MyException {
		if(user_id==null) {
			throw new MyException("USER_ID异常");
		}
		List<Map<String, Object>> findChildRoleByUserID = userManagementDao.findChildRoleByUserID(user_id);
		if(findChildRoleByUserID==null) {
			throw new MyException("获取对应的用户角色信息异常");
		}
		return new JsonResult<List<Map<String, Object>>>(findChildRoleByUserID);
	}
	/**
	 * 根据组织uos_id新增对应的用户
	 */
	@Override
	public JsonResult<String> addNewUser(UserFrom userfrom) throws MyException {
		if(userfrom==null) {
			throw new MyException("新增用户表单数据异常");
		}
		List<String> checkUserAccount = userManagementDao.checkUserAccount(userfrom.getUser_account());
		if(checkUserAccount.size()>0) {
			throw new MyException("用户账号已存在,请重新命名");
		}
		Admin admin = new Admin();
		String user_id=ExaminUtil.getUUID();
		admin.setUser_id(user_id);
		admin.setUos_id(userfrom.getUos_id());
		admin.setUser_account(userfrom.getUser_account());
		admin.setUser_account_state(userfrom.getAccount_state());
		admin.setUser_birthdate(userfrom.getUser_birthdate());
		admin.setUser_certificaiton_num(userfrom.getUser_certificaiton_num());
		admin.setUser_company(userfrom.getUser_company());
		admin.setUser_email(userfrom.getUser_email());
		admin.setUser_name(userfrom.getUser_name());
		//对密码进行MD转换
		admin.setUser_password(ExaminUtil.toMD5(userfrom.getUser_password()));
		admin.setUser_phone_num(userfrom.getUser_phone_num());
		Date date = new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		admin.setUser_regist_time(sdf.format(date));
		admin.setUser_sex(userfrom.getUser_sex());
		Integer addNewUserByUosID = userManagementDao.addNewUser(admin);
		String ui_ur_id=ExaminUtil.getUUID();
		String ui_id=user_id;
		String ur_id=userfrom.getRole_id();
		Integer addUR_Relation = userManagementDao.addUR_Relation(ui_ur_id, ui_id, ur_id);
		String str="创建用户失败";
		if(addNewUserByUosID>0&&addUR_Relation>0) {
			str="创建用户成功";
		}
		return new JsonResult<String>(str);
	}

	/**
	 * 修改用户信息
	 */   
	@Override
	public JsonResult<String> updateUser(Admin admin) throws MyException {
		if(admin==null) {
			throw new MyException("修改用户表单数据异常");
		}
		Date date = new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		admin.setUser_modify_time(sdf.format(date));
		Integer updateUser = userManagementDao.updateUser(admin);
		String str="修改用户失败";
		if(updateUser>0) {
			str="修改用户成功";
		}
		return new JsonResult<String>(str);
	}
	/**
	 * 初始化所有用户密码
	 */
	@Override
	public JsonResult<String> updatePasswordOfAllUser() throws MyException {
		Integer updatePasswordOfAllUser = userManagementDao.updatePasswordOfAllUser();
		String str="初始化用户密码失败";
		if(updatePasswordOfAllUser>0) {
			str="初始化用户密码成功";
		}
		return new JsonResult<String>(str);
	}
	/**
	 * 批量修改指定用户的初始密码
	 */
	@Override
	public JsonResult<String> updatePasswordByID(List<String> lists) throws MyException {
		if(lists==null) {
			throw new MyException("初始化用户密码数据异常");
		}
		Integer updatePasswordByID = userManagementDao.updatePasswordByID(lists);
		String str="初始化用户密码失败";
		if(updatePasswordByID>0) {
			str="初始化用户密码成功";
		}
		return new JsonResult<String>(str);
	}
}
