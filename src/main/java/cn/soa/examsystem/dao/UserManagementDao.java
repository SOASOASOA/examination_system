
package cn.soa.examsystem.dao;

import java.util.List;
import java.util.Map;

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
	 * 通过user_id查询对应组织结构根节点uos_id,并查询相同组织结构根uos_id相同的用户信息
	 */
	public List<Map<String,Object>> findUserInfoByUserID(String user_id,Integer start_page,Integer end_page);
	/**
	 * 通过user_id查询对应用户角色的后代角色名称
	 */
	public List<String> findChildRoleByUserID(String user_id);
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
} 
