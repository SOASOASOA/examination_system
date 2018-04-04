package cn.soa.examsystem.service.inter;

import javax.servlet.http.HttpServletRequest;

import cn.soa.examsystem.entity.Admin;
import cn.soa.examsystem.exception.MyException;
import cn.soa.examsystem.util.JsonResult;

/**
 * LOGIN鐨凷ervice灞�
 * @author hezhe
 *
 */
public interface LoginService {
	/**
	 * 妫�鏌ョ櫥褰曠敤鎴�
	 * @return 涓�涓猨son瀵硅薄
	 * @throws LoginException 
	 * @throws MyException 
	 */
	public JsonResult checkLoginUser(HttpServletRequest req,Admin admin) throws MyException;
}
