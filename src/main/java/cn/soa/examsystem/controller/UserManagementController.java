package cn.soa.examsystem.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.soa.examsystem.controller.form.UserFrom;
import cn.soa.examsystem.entity.Admin;
import cn.soa.examsystem.entity.Tree;
import cn.soa.examsystem.exception.ExceptionController;
import cn.soa.examsystem.exception.MyException;
import cn.soa.examsystem.service.inter.UserManagementServiceInter;
import cn.soa.examsystem.util.JsonResult;

/**
 * 
    * @ClassName: UserManagementController
    * @Description: 用户管理controller层
    * @author hezy
    * @date 2018年4月27日
    *
 */
@Controller

@RequestMapping("/UserManagement")
public class UserManagementController  extends ExceptionController{
	@Resource
	private UserManagementServiceInter userManagementServiceInter;
	
	/**
	 * 根据用户ID查询对应的用户模块
	 * @param user_id 用户ID
	 * @return json对象
	 */
	@ResponseBody
	@RequestMapping("/findUserFunctionlByID.do")
	public JsonResult<List<Map<String, Object>>> findUserFunctionlByID(String ua_id) throws MyException {
		return userManagementServiceInter.findUserFunctionlByID(ua_id);
	}
	/**
	 * 更加user_id查询对应组织结构
	 * @throws MyException 
	 */
	@ResponseBody
	@RequestMapping("/findOrganizationStructureByUserId.do")
	public JsonResult<List<Tree>> findOrganizationStructureByUserId(String user_id) throws MyException {
		return userManagementServiceInter.findOrganizationStructureByUserId(user_id);
	}
	/**
	 * 根据uos_id查询对应的节点组织
	 * @throws MyException 
	 */
	@ResponseBody
	@RequestMapping("/findNodeOrganizationByUosId.do")
	public JsonResult<List<Map<String, Object>>> findNodeOrganizationByUosId(String uos_id) throws MyException {
		return userManagementServiceInter.findNodeOrganizationByUosId(uos_id);
	}
	/**
	 * 根据uos_id修改对应的节点名称
	 * @throws MyException 
	 */
	@ResponseBody
	@RequestMapping("/updateNodeNameByUosId.do")
	public JsonResult<String>  updateNodeNameByUosId(String uos_id,String user_name) throws MyException {
		return userManagementServiceInter.updateNodeNameByUosId(uos_id, user_name);
	}
	/**
	 * 增加新的子节点
	 */
	@ResponseBody
	@RequestMapping("/addNode.do")
	public JsonResult<String> addNode(String user_father_id, String user_name) throws MyException {
		return userManagementServiceInter.addNode(user_father_id, user_name);
	}
	/**
	 * 通过user_id查询对应组织结构根节点uos_id,并查询相同组织结构根uos_id相同的用户信息
	 */
	@ResponseBody
	@RequestMapping("/findUserInfoByUserID.do")
	public JsonResult<List<Map<String, Object>>> findUserInfoByUserID(String user_id,Integer page, Integer limit) throws MyException {
		return userManagementServiceInter.findUserInfoByUserID(user_id, page, limit);
	}
	/**
	 * 根据uos_id查询用户信息
	 */
	@ResponseBody
	@RequestMapping("/findUserInfoByUosID.do")
	public JsonResult<List<Map<String, Object>>> findUserInfoByUosID(String user_id,String uos_id,Integer page, Integer limit) throws MyException {
		return userManagementServiceInter.findUserInfoByUosID(user_id, uos_id, page, limit);
	}
	/**
	 * 根据USER_ID查询后代节点
	 */
	@ResponseBody
	@RequestMapping("/findChildRoleByUserID.do")
	public JsonResult<List<Map<String, Object>>> findChildRoleByUserID(String user_id) throws MyException {
		return userManagementServiceInter.findChildRoleByUserID(user_id);
	}
	/**
	 * 根据USER_ID查询后代节点
	 */
	@ResponseBody
	@RequestMapping("/addNewUser.do")
	public JsonResult<String> addNewUser(UserFrom userFrom) throws MyException {
		return userManagementServiceInter.addNewUser(userFrom);
	}
	/**
	 * 修改用户信息
	 */ 
	@ResponseBody
	@RequestMapping("/updateUser.do")
	public JsonResult<String> updateUser(Admin admin) throws MyException {
		return userManagementServiceInter.updateUser(admin);
	}
	/**
	 * 初始化所有用户密码
	 */
	@ResponseBody
	@RequestMapping("/updatePasswordOfAllUser.do")
	public JsonResult<String> updatePasswordOfAllUser() throws MyException {
		return userManagementServiceInter.updatePasswordOfAllUser();
	}
	/**
	 * 初始化所有用户密码
	 */
	@ResponseBody
	@RequestMapping("/updatePasswordByID.do")
	public JsonResult<String> updatePasswordByID(@RequestParam(value = "user_ids[]", required=false)List<String> lists) throws MyException {
		return userManagementServiceInter.updatePasswordByID(lists);
	}
}
