

    
package cn.soa.examsystem.service.inter;

import java.util.List;
import java.util.Map;

import cn.soa.examsystem.exception.MyException;
import cn.soa.examsystem.util.JsonResult;



public interface ExamRoomServiceInter {
	/**
	 * 查询所有的考试试卷
	 * @return
	 * @throws MyException 
	 */
	public JsonResult<List<Map<String,Object>>> findAllExaminPaper(Integer page,Integer limit) throws MyException;
}
