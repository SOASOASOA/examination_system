
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
	 * 更加user_id查询对应组织结构
	 */
	public List<Tree> findOrganizationStructureByUserId(String user_id);
}
