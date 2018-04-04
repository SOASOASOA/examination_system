package cn.soa.examsystem.service.inter;

import cn.soa.examsystem.exception.MyException;
import cn.soa.examsystem.util.JsonResult;

/**
 * Index鐨凷ervice灞�
 * @author hezhe
 *
 */
public interface IndexService {
	/**
	 * 鏍规嵁鐢ㄦ埛ID鏌ヨ瀵瑰簲鐨勭敤鎴锋ā鍧�
	 * @param user_id 鐢ㄦ埛ID
	 * @return json瀵硅薄
	 */
	public JsonResult findUserModule(String user_id) throws MyException;
}
