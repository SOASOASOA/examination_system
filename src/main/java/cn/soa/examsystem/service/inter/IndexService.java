package cn.soa.examsystem.service.inter;

import java.util.List;
import java.util.Map;

import cn.soa.examsystem.exception.MyException;
import cn.soa.examsystem.util.JsonResult;

/**
 * Index的Service层
 * @author hezhe
 *
 */
public interface IndexService {
	/**
	 * 根据用户ID查询对应的用户模块
	 * @param user_id 用户ID
	 * @return json对象
	 */
	public JsonResult<List<Map<String,Object>>> findUserModule(String user_id) throws MyException;
}
