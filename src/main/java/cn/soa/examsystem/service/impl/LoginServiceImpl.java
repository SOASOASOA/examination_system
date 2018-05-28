package cn.soa.examsystem.service.impl;

import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;

import cn.soa.examsystem.dao.LoginDAO;
import cn.soa.examsystem.entity.Admin;
import cn.soa.examsystem.exception.MyException;
import cn.soa.examsystem.service.inter.LoginService;
import cn.soa.examsystem.util.ExaminUtil;
import cn.soa.examsystem.util.JsonResult;



/**
 * Login请求出来的逻辑层
 * 
 * @author hezy
 *
 */
@Service("loginService")
public class LoginServiceImpl implements LoginService {
	@Resource
	private LoginDAO loginDAO;
	/**
	 * 检查登录的用户名和密码是否正确
	 * @return 一个json对象
	 * @throws LoginException 
	 */
	public JsonResult checkLoginUser(HttpServletRequest req,Admin admin) throws MyException {
		String user_account = admin.getUser_account();
		String user_password = admin.getUser_password();
		if(user_account==null) {
			throw new MyException("用户名不能为空值");
		}
		if(user_password==null) {
			throw new MyException("密码不能为空值");
		}
		Map<String, Object> User = loginDAO.findUserIdByName(user_account);
		if(User==null) {
				throw new MyException("用户名不存在,请重新输入");
			}
		String password=(String)User.get("USER_PASSWORD");
		if(!password.equals(ExaminUtil.toMD5(user_password))) {
			throw new MyException("密码错误");
		}
		String user_id=(String)User.get("USER_ID");
		String user_name=(String)User.get("USER_NAME");
		Admin user_admin = new Admin();
		user_admin.setUser_name(user_name);
		user_admin.setUser_id(user_id);
		HttpSession session = req.getSession();
		session.setAttribute("user_id", user_id);
		return new JsonResult(user_admin);
	}
}
