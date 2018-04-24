package cn.soa.examsystem.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import cn.soa.examsystem.dao.IndexDAO;
import cn.soa.examsystem.entity.Admin;
import cn.soa.examsystem.exception.MyException;
import cn.soa.examsystem.service.inter.IndexService;
import cn.soa.examsystem.util.ExaminUtil;
import cn.soa.examsystem.util.JsonResult;


@Service("indexService")
public class IndexServiceImpl implements IndexService {
	@Resource
	private IndexDAO indexDAO;
	/**
	 * 根据用户ID查询对应的用户模块
	 * @param user_id 用户ID
	 * @return json对象
	 */
	@Cacheable(value = "myCache", key = "#user_id")
	public JsonResult<List<Map<String,Object>>> findUserModule(String user_id) throws MyException {
		if(user_id==null) {
			throw new MyException("用户ID为空,不能获取模板信息");
		}
		  List<Map<String, Object>> modules = indexDAO.findUserModule(user_id);
		if(modules==null) {
			throw new MyException("获取用户模板信息异常");
		}
		return new JsonResult<List<Map<String,Object>>>(modules);
	}
	
	/**
	 * 根据用户ID查询用户信息
	 * @param user_id 用户ID
	 * @return json对象
	 */  
	@Override
	@Cacheable(value = "findUserInfoByUserId", key = "#user_id")
	public JsonResult<List<Map<String,Object>>> findUserInfoByUserId(String user_id) throws MyException {
		if(user_id==null) {
			throw new MyException("用户ID为空,不能获取模板信息");
		}
		List<Map<String,Object>> findUserInfoByUserId = indexDAO.findUserInfoByUserId(user_id);
		List<String> findRoleNameByUserId = indexDAO.findRoleNameByUserId(user_id);
		if(findUserInfoByUserId==null) {
			throw new MyException("获取用户信息异常");
		}
		if(findRoleNameByUserId==null) {
			throw new MyException("获取用户角色信息异常");
		}
		String str="";//拼接角色名，并用逗号隔开
		for (int i = 0; i < findRoleNameByUserId.size(); i++) {
			if(i==0) {
				str+=findRoleNameByUserId.get(i).trim();
				continue;
			}
			str+=",";
			str+=findRoleNameByUserId.get(i).trim();
		}
		//将角色名称加入用户个人信息中
		findUserInfoByUserId.get(0).put("ROLE_NAME", str);
		return new JsonResult<List<Map<String,Object>>>(findUserInfoByUserId);
	}

	/**
	 * 根据用户ID修改对应的角色信息
	 * @param user_id 用户ID
	 * @return json对象
	 */
	@Override
	@CacheEvict(value = "findUserInfoByUserId", key = "#admin.user_id")
	public JsonResult<String> updateUserInfoByUserId(Admin admin) throws MyException {
		if(admin==null) {
			throw new MyException("用户信息获取异常");
		}
		Integer updateUserInfoByUserId = indexDAO.updateUserInfoByUserId(admin);
		String str="个人信息修改失败";
		if(updateUserInfoByUserId==1) {
			str="个人信息修改成功";
		}
		return new JsonResult<String>(str);
	}
	/**
	 * 根据用户ID和旧密码修改密码
	 */
	@Override
	public JsonResult<String> updateUserPassword(String user_id, String new_password, String old_password)
			throws MyException {
		if(user_id==null||new_password==null||old_password==null) {
			throw new MyException("获取用户修改密码信息获取异常");
		}
		//将获取的密码进行MD5转换
		 String new_password_md5 = ExaminUtil.toMD5(new_password);
		 String old_password_md5 = ExaminUtil.toMD5(old_password);
		 Integer updateUserPassword = indexDAO.updateUserPassword(user_id, new_password_md5, old_password_md5);
		 String str="旧密码错误,请重新输入";
			if(updateUserPassword==1) {
				str="密码修改成功";
			}
		 return new JsonResult<String>(str);
	}

}
