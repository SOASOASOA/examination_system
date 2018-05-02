
/**  
* @Title: UserManagementServiceImpl.java
* @Package cn.soa.examsystem.service.impl
* @Description: TODO(用一句话描述该文件做什么)
* @author zhugang
* @date 2018年4月27日
* @version V1.0  
*/

package cn.soa.examsystem.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.soa.examsystem.dao.UserManagementDao;
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

}
