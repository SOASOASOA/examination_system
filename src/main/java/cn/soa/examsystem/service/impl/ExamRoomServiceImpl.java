
    /**  
    * @Title: ExamRoomServiceImpl.java
    * @Package cn.soa.examsystem.service.impl
    * @Description: TODO(��һ�仰�������ļ���ʲô)
    * @author zhugang
    * @date 2018��3��24��
    * @version V1.0  
    */
    
package cn.soa.examsystem.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;


import cn.soa.examsystem.dao.ExamRoomDao;
import cn.soa.examsystem.exception.MyException;
import cn.soa.examsystem.service.inter.ExamRoomServiceInter;
import cn.soa.examsystem.util.JsonResult;

/**
 * 考试编排的逻辑层
    * @ClassName: ExamRoomServiceImpl
    * @Description: TODO(这里用一句话描述这个类的作用)
    * @author zhugang
    * @date 2018年4月5日
    *
 */
@Service("examRoomServiceInter")
public class ExamRoomServiceImpl implements ExamRoomServiceInter{

	@Resource
	private ExamRoomDao examRoomDao;
	private Integer start_page;//起始行 
	private Integer end_page;//结束行
	
	/**
	 * 查询所有的考试试卷
	 * @return
	 * @throws MyException 
	 */
	@Override
	public JsonResult<List<Map<String, Object>>> findAllExaminPaper(Integer page, Integer limit) throws MyException {
		if(page==null||limit==null) {
			throw new MyException("分页查询异常");
		}
		start_page=(page-1)*limit+1;//起始行 
		end_page=page*limit;//结束行
		List<Map<String, Object>> findAllExaminPaper = examRoomDao.findAllExaminPaper(start_page, end_page);
		if(findAllExaminPaper==null) {
			throw new MyException("查询考卷信息异常");
		}
		Integer total = examRoomDao.findTotalCount();
		if(total==null) {
			throw new MyException("查询考卷总数异常");
		}
		return new JsonResult<List<Map<String, Object>>>(total,findAllExaminPaper);
	}
}
