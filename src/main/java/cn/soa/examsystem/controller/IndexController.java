package cn.soa.examsystem.controller;

import javax.annotation.Resource;
import javax.security.auth.login.LoginException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.soa.examsystem.exception.ExceptionController;
import cn.soa.examsystem.exception.MyException;
import cn.soa.examsystem.service.inter.IndexService;

import cn.soa.examsystem.util.JsonResult;

import cn.soa.examsystem.util.JsonResult;
@Controller

@RequestMapping("/index")
public class IndexController extends ExceptionController{
	@Resource
	private IndexService indexService;
	
	/**
	 * 鏍规嵁鐢ㄦ埛ID鏌ヨ瀵瑰簲鐨勭敤鎴锋ā鍧�
	 * @param user_id 鐢ㄦ埛ID
	 * @return json瀵硅薄
	 */
	@ResponseBody
	@RequestMapping("/findUserModule.do")
	public JsonResult findUserModule(String user_id) throws MyException {
		return indexService.findUserModule(user_id);
	}
}
