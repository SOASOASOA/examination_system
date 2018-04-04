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
	 * 鏍规嵁鐢ㄦ埛ID鏌ヨ瀵瑰簲鐨勭敤鎴锋ā鍧�
	 * @param user_id 鐢ㄦ埛ID
	 * @return json瀵硅薄
	 */
	@Cacheable(value = "myCache", key = "#user_id")
	public JsonResult findUserModule(String user_id) throws MyException {
		System.out.println(user_id);
		if(user_id==null) {
			throw new MyException("鐢ㄦ埛ID涓虹┖,涓嶈兘鑾峰彇妯℃澘淇℃伅");
		}
		  List<Map<String, Object>> modules = indexDAO.findUserModule(user_id);
		if(modules==null) {
			throw new MyException("鑾峰彇鐢ㄦ埛妯℃澘淇℃伅寮傚父");
		}
		System.out.println(modules);
		return new JsonResult(modules);
	}
}
