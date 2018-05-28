
package cn.soa.examsystem.dao;

import java.util.List;
import java.util.Map;

import cn.soa.examsystem.entity.Admin;
import cn.soa.examsystem.entity.Tree;

/**
 * 
    * @ClassName: UserManagementDao
    * @Description: 用户管理
    * @author hezy
    * @date 2018年4月27日
    *
 */
public interface UserManagementDao {

	/**
	 * 根据模块ID查询对应的功能模块信息
	 */
	public List<Map<String,Object>> findUserFunctionlByID(String ua_id);
	/**
	 * 根据user_id查询对应组织结构
	 */
	public List<Tree> findOrganizationStructureByUserId(String user_id);
	/**
	 * 根据uos_id查询对应的节点组织
	 */
	public List<Map<String,Object>> findNodeOrganizationByUosId(String uos_id);
	/**
	 * 根据uos_id修改对应的节点名称
	 */
	public Integer updateNodeNameByUosId(String uos_id,String user_name);
	/**
	 * 增加新的子节点
	 */
	public Integer addNode(String uos_id,String user_father_id,String user_name);
	
	/**
	 * 根据uos_id初始化用户管理表格
	 */
	public List<Map<String,Object>> initUserTable(String uos_id);
	/**
	 * 通过user_id查询对应组织结构根节点uos_id,并查询此根节点组织下的用户信息
	 */
	public List<Map<String,Object>> findUserInfoByUserID(String user_id,Integer start_page,Integer end_page);
	/**
	 * 通过user_id查询对应用户角色的后代角色名称
	 */
	public List<Map<String,Object>> findChildRoleByUserID(String user_id);
	/**
	 * 通过user_id查询对应组织结构根节点uos_id,相同组织节点uos_id的用户总个数
	 */
	public Integer findUserInfoTotalCountByUserID(String user_id);
	/**
	 * 根据uos_id查询用户信息
	 */
	public List<Map<String,Object>> findUserInfoByUosID(String uos_id,Integer start_page,Integer end_page);
	/**
	 * 根据uos_id查询用户信息总个数
	 */
	public Integer findUserInfoTotalCountByUosID(String uos_id);
	/**
	 * 根据组织uos_id新增对应的用户
	 */
	public Integer addNewUser(Admin admin);
	/**
	 * 增加新增用户的角色信息关联关系
	 */
	public Integer addUR_Relation(String ui_ur_id,String ui_id,String ur_id);
	/**
	 * 检查用户账号是否存在
	 */
	public List<String> checkUserAccount(String user_account);
	/**
	 * 修改用户信息
	 */
	public Integer updateUser(Admin admin);
	/**
	 * 批量修改初始密码
	 */
	public Integer updatePasswordByID(List<String> lists);
	/**
	 * 初始化所有用户密码
	 */
	public Integer updatePasswordOfAllUser();
} 
