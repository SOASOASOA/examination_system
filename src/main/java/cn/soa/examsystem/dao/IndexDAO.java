package cn.soa.examsystem.dao;

import java.util.List;
import java.util.Map;

import cn.soa.examsystem.entity.Admin;

public interface IndexDAO {
	/**
	 * 根据用户ID查询对应的用户模块
	 * @param user_id 用户ID
	 * @return
	 */
	public List<Map<String,Object>> findUserModule(String user_id);
	/**
	 * 
	    * @Title: findUserInfoByUserId
	    * @Description: 根据用户ID查询用户信息
	    * @param @param user_id
	    * @param @return    参数说明
	    * @return Admin    返回类型
	    * @throws
	 */
	public List<Map<String,Object>> findUserInfoByUserId(String user_id);
	/**
	 * 根据用户ID查询对应的角色模块
	 * @param user_id 用户ID
	 * @return
	 */
	public List<String> findRoleNameByUserId(String user_id);
	/**
	 * 根据用户ID修改对应的角色信息
	 */
	public Integer updateUserInfoByUserId(Admin admin);
	/**
	 * 根据用户ID和旧密码修改密码
	 */
	public Integer updateUserPassword(String user_id,String new_password,String old_password);
}
