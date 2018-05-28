package cn.soa.examsystem.service.inter;

import java.util.List;
import java.util.Map;

import cn.soa.examsystem.controller.form.UserFrom;
import cn.soa.examsystem.entity.Admin;
import cn.soa.examsystem.entity.Tree;
import cn.soa.examsystem.exception.MyException;
import cn.soa.examsystem.util.JsonResult;
/**
 * 用户管理service层
 */
public interface UserManagementServiceInter {
	/**
	 * 根据模块ID查询对应的功能模块信息
	 * @throws MyException 
	 */
	public JsonResult<List<Map<String,Object>>> findUserFunctionlByID(String ua_id) throws MyException;
	
	/**
	 * 更加user_id查询对应组织结构
	 * @throws MyException 
	 */
	public JsonResult<List<Tree>> findOrganizationStructureByUserId(String user_id) throws MyException;
	/**
	 * 根据uos_id查询对应的节点组织
	 * @throws MyException 
	 */
	public JsonResult<List<Map<String,Object>>> findNodeOrganizationByUosId(String uos_id) throws MyException;
	/**
	 * 根据uos_id修改对应的节点名称
	 * @throws MyException 
	 */
	public JsonResult<String> updateNodeNameByUosId(String uos_id,String user_name) throws MyException;
	/**
	 * 增加新的子节点
	 */
	public JsonResult<String> addNode(String user_father_id,String user_name) throws MyException;
	/**
	 * 通过user_id查询对应组织结构根节点uos_id,并查询相同组织结构根uos_id相同的用户信息
	 */
	public JsonResult<List<Map<String,Object>>> findUserInfoByUserID(String user_id,Integer page, Integer limit) throws MyException;
	/**
	 * 根据uos_id查询用户信息
	 */
	public JsonResult<List<Map<String,Object>>> findUserInfoByUosID(String user_id,String uos_id,Integer page, Integer limit) throws MyException;
	/**
	 * 根据USER_ID查询后代节点
	 */
	public JsonResult<List<Map<String,Object>>> findChildRoleByUserID(String user_id) throws MyException;
	/**
	 * 根据组织uos_id新增对应的用户
	 */
	public JsonResult<String> addNewUser(UserFrom userfrom) throws MyException;
	/**
	 * 修改用户信息
	 */
	public JsonResult<String>  updateUser(Admin admin) throws MyException;
	/**
	 * 初始化所有用户密码
	 */
	public JsonResult<String>  updatePasswordOfAllUser() throws MyException;
	/**
	 * 批量修改指定用户的初始密码
	 */
	public JsonResult<String>   updatePasswordByID(List<String> lists) throws MyException;

}
