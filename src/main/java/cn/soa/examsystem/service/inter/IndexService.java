package cn.soa.examsystem.service.inter;

import java.util.List;
import java.util.Map;

import cn.soa.examsystem.entity.Admin;
import cn.soa.examsystem.exception.MyException;
import cn.soa.examsystem.util.JsonResult;

/**
 * Index的Service层
 * @author hezhe
 *
 */
public interface IndexService {
	/**
	 * 根据用户ID查询对应的用户模块
	 * @param user_id 用户ID
	 * @return json对象
	 */
	public JsonResult<List<Map<String,Object>>> findUserModule(String user_id) throws MyException;
	/**
	 * 根据用户ID查询用户信息
	 * @param user_id 用户ID
	 * @return json对象
	 */
	public JsonResult<List<Map<String,Object>>> findUserInfoByUserId(String user_id) throws MyException;
	/**
	 * 根据用户ID修改对应的角色信息
	 * @param user_id 用户ID
	 * @return json对象
	 */
	public JsonResult<String> updateUserInfoByUserId(Admin admin) throws MyException;
	/**
	 * 根据用户ID和旧密码修改密码
	 */
	public JsonResult<String> updateUserPassword(String user_id,String new_password,String old_password) throws MyException;
}
