
    /**  
    * @Title: ExamRoomServiceImpl.java
    * @Package cn.soa.examsystem.service.impl
    * @Description: TODO(��һ�仰�������ļ���ʲô)
    * @author zhugang
    * @date 2018��3��24��
    * @version V1.0  
    */
    
package cn.soa.examsystem.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;


import cn.soa.examsystem.dao.ExamRoomDao;
import cn.soa.examsystem.entity.Examroom;
import cn.soa.examsystem.exception.MyException;
import cn.soa.examsystem.service.inter.ExamRoomServiceInter;
import cn.soa.examsystem.util.ExaminUtil;
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

	
	/**
	 * 根据模块ID查询对应的功能模块信息
	 */
	@Override
	public JsonResult<List<Map<String, Object>>> findUserFunction(String ua_id) throws MyException {
		if(ua_id==null) {
			throw new MyException("模板ID异常");
		}
		List<Map<String, Object>> findUserFunction = examRoomDao.findUserFunction(ua_id);
		if(findUserFunction==null||findUserFunction.size()<0) {
			throw new MyException("功能模块查询异常");
		}
		
		return new JsonResult<List<Map<String, Object>>>(findUserFunction);
	}
	
	/**
	 * 增加考场
	 * @throws MyException 
	 */
	@Override
	public JsonResult<String> addExamroom(Examroom examroom) throws MyException {
		
		if(examroom==null) {
			throw new MyException("添加考场异常");
		}
		List<String> findExamroomByName = examRoomDao.findExamroomByName(examroom.getExamroom_name());
		if(findExamroomByName.size()>0) {
			throw new MyException("考场名称已存在请重新输入");
		}
		//设置考场的创建时间
		Date date = new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		examroom.setExamroom_create_time(sdf.format(date));
		//设置考场锁定的状态
		if(examroom.getExamroom_lock_status()==null) {
			examroom.setExamroom_lock_status("off");
		}
		//设置考场ID
		examroom.setExamroom_id(ExaminUtil.getUUID());
		Integer num = examRoomDao.addExamroom(examroom);
		String str="考场添加成功";
		if(num!=1) {
			str="考场信息添加失败";
		}
		return new JsonResult<String>(str);
	}
	/**
	 * 查询所有的考场信息
	 * @return
	 */
	@Override
	public JsonResult<List<Map<String, Object>>> findAllExamroomInfo(Integer page, Integer limit,String exam_id) throws MyException {
		if(page==null||limit==null) {
			throw new MyException("考场分页查询异常");
		}
		start_page=(page-1)*limit+1;//起始行 
		end_page=page*limit;//结束行
		List<Map<String, Object>> findAllExamroomInfo = examRoomDao.findAllExamroomInfo(start_page, end_page,exam_id);
		if(findAllExamroomInfo==null) {
			throw new MyException("查询考场信息异常");
		}
		Integer total = examRoomDao.findExamroomTotalCount(exam_id);
		if(total==null) {
			throw new MyException("查询考场总数异常");
		}
		return new JsonResult<List<Map<String, Object>>>(total,findAllExamroomInfo);
	}
	/**
	 *根据考场ID删除对应的考场信息
	 * @throws MyException 
	 */
	@Override
	public JsonResult<String> deleteExamroomById(String examroom_id) throws MyException {
		if(examroom_id==null) {
			throw new MyException("删除考场ID异常");
		}
		Integer num = examRoomDao.deleteExamroomById(examroom_id);
		String str="删除考场成功";
		if(num!=1) {
			str="删除考场失败";
		}
		return new JsonResult<String>(str);
	}

	/**
	 * 根据examroomId,修改对应的考场信息
	 * @throws MyException 
	 */
	@Override
	public JsonResult<String> updateExamroomInfoById(Examroom examroom) throws MyException {
		if(examroom==null) {
			throw new MyException("修改考场数据异常");
		}
		//设置考场锁定的状态
		if(examroom.getExamroom_lock_status()==null) {
					examroom.setExamroom_lock_status("off");
				}
		Integer num = examRoomDao.updateExamroomInfoById(examroom);
		String str="修改考场成功";
		if(num!=1) {
			str="修改考场失败";
		}
		return new JsonResult<String>(str);
	}
	/**
	 * @Description: 根据考卷ID查询对应的考场ID和名称
	 */
	@Override
	public JsonResult<List<Map<String, Object>>> findExamroomByExamId(String exam_id) throws MyException {
		if(exam_id==null) {
			throw new MyException("考卷ID数据异常");
		}
		List<Map<String, Object>> findExamroomByExamId = examRoomDao.findExamroomByExamId(exam_id);
		if(findExamroomByExamId==null) {
			throw new MyException("根据考卷ID查询考场数据异常");
		}
		return new JsonResult<List<Map<String, Object>>>(findExamroomByExamId);
	}
}
