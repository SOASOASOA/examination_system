package cn.soa.examsystem.service.inter;

import javax.security.auth.login.LoginException;
import javax.servlet.http.HttpServletRequest;

import cn.soa.examsystem.entity.Admin;
import cn.soa.examsystem.exception.MyException;
import cn.soa.examsystem.util.JsonResult;

/**
 * LOGIN的Service层
 * @author hezhe
 *
 */
public interface LoginService {
	/**
	 * 检查登录用户
	 * @return 一个json对象
	 * @throws LoginException 
	 * @throws MyException 
	 */
	public JsonResult checkLoginUser(HttpServletRequest req,Admin admin) throws MyException;
}
