package cn.soa.examsystem.service.inter;

import java.util.List;
import java.util.Map;

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
}
