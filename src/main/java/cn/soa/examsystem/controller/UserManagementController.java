package cn.soa.examsystem.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.soa.examsystem.entity.Tree;
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
public class UserManagementController {
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
}
