package cn.soa.examsystem.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.soa.examsystem.entity.Admin;
import cn.soa.examsystem.exception.ExceptionController;
import cn.soa.examsystem.exception.MyException;
import cn.soa.examsystem.service.inter.IndexService;
import cn.soa.examsystem.util.JsonResult;
@Controller

@RequestMapping("/index")
public class IndexController extends ExceptionController{
	@Resource
	private IndexService indexService;
	
	/**
	 * 根据用户ID查询对应的用户模块
	 * @param user_id 用户ID
	 * @return json对象
	 */
	@ResponseBody
	@RequestMapping("/findUserModule.do")
	public JsonResult findUserModule(String user_id) throws MyException {
		return indexService.findUserModule(user_id);
	}
	/**
	 * 根据用户ID查询用户信息
	 * @param user_id 用户ID
	 * @return json对象
	 */
	@ResponseBody
	@RequestMapping("/findUserInfoByUserId.do")
	public JsonResult<List<Map<String,Object>>> findUserInfoByUserId(String user_id) throws MyException {
		return indexService.findUserInfoByUserId(user_id);
	}
	/**
	 * 根据用户ID修改对应的角色信息
	 */
	@ResponseBody
	@RequestMapping("/updateUserInfoByUserId.do")
	public JsonResult<String> updateUserInfoByUserId(Admin admin) throws MyException {
		return indexService.updateUserInfoByUserId(admin);
	}
	/**
	 * 根据用户ID和旧密码修改密码
	 */
	@ResponseBody
	@RequestMapping("/updateUserPassword.do")
	public JsonResult<String> updateUserPassword(String user_id,String new_password,String old_password) throws MyException {
		return indexService.updateUserPassword(user_id, new_password, old_password);
	}
}
