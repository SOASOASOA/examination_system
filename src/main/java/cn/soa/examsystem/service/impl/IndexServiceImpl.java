package cn.soa.examsystem.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import cn.soa.examsystem.dao.IndexDAO;
import cn.soa.examsystem.exception.MyException;
import cn.soa.examsystem.service.inter.IndexService;
import cn.soa.examsystem.util.JsonResult;


@Service("indexService")
public class IndexServiceImpl implements IndexService {
	@Resource
	private IndexDAO indexDAO;
	/**
	 * 根据用户ID查询对应的用户模块
	 * @param user_id 用户ID
	 * @return json对象
	 */
	@Cacheable(value = "myCache", key = "#user_id")
	public JsonResult<List<Map<String,Object>>> findUserModule(String user_id) throws MyException {
		if(user_id==null) {
			throw new MyException("用户ID为空,不能获取模板信息");
		}
		  List<Map<String, Object>> modules = indexDAO.findUserModule(user_id);
		if(modules==null) {
			throw new MyException("获取用户模板信息异常");
		}
		return new JsonResult<List<Map<String,Object>>>(modules);
	}
}
