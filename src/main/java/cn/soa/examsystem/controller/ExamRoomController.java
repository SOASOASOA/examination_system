

    
package cn.soa.examsystem.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.soa.examsystem.entity.Examroom;
import cn.soa.examsystem.exception.ExceptionController;
import cn.soa.examsystem.exception.MyException;
import cn.soa.examsystem.service.inter.ExamRoomServiceInter;
import cn.soa.examsystem.util.JsonResult;

/**
 * 考试编排的控制层
    * @ClassName: ExamRoomController
    * @Description: TODO(这里用一句话描述这个类的作用)
    * @author zhugang
    * @date 2018年4月5日
    *
 */
@Controller
@RequestMapping("/examroom")
public class ExamRoomController extends ExceptionController{
	@Resource
	private ExamRoomServiceInter examRoomServiceInter;
	/**
	 * 查询所有的考试试卷
	 * @return
	 * @throws MyException 
	 */
	@ResponseBody
	@RequestMapping("/findAllExaminPaper.do")
	public JsonResult<List<Map<String,Object>>> findAllExaminPaper(Integer page,Integer limit) throws MyException{
		return examRoomServiceInter.findAllExaminPaper(page, limit);
	}
	/**
	 * 根据模块ID查询对应的功能模块信息
	 */
	@ResponseBody
	@RequestMapping("/findUserFunction.do")
	public JsonResult<List<Map<String,Object>>> findUserFunction(String ua_id) throws MyException{
		return examRoomServiceInter.findUserFunction(ua_id);
	}
	/**
	 * 根据模块ID查询对应的功能模块信息
	 */
	@ResponseBody
	@RequestMapping("/addExamroom.do")
	public JsonResult<String> addExamroom(Examroom examroom) throws MyException{
		return examRoomServiceInter.addExamroom(examroom);
	}
	/**
	 * 查询所有的考场信息
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/findAllExamroomInfo.do")
	public JsonResult<List<Map<String,Object>>> findAllExamroomInfo(Integer page,Integer limit,String exam_id) throws MyException{
		return examRoomServiceInter.findAllExamroomInfo(page, limit,exam_id);
	}
	/**
	 * 根据考场ID删除对应的考场信息
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/deleteExamroomById.do")
	public JsonResult<String> deleteExamroomById(String examroom_id) throws MyException{
		return examRoomServiceInter.deleteExamroomById(examroom_id);
	}
	/**
	 * 根据examroomId,修改对应的考场信息
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/updateExamroomInfoById.do")
	public JsonResult<String> updateExamroomInfoById(Examroom examroom) throws MyException{
		return examRoomServiceInter.updateExamroomInfoById(examroom);
	}
	/**
	 * 根据examroomId,修改对应的考场信息
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/findExamroomByExamId.do")
	public JsonResult<List<Map<String,Object>>> findExamroomByExamId(String exam_id) throws MyException{
		return examRoomServiceInter.findExamroomByExamId(exam_id);
	}
	/**
	 *通过user_id查询对应组织结构根节点uos_id,并查询此根节点组织下的用户信息
	 */
	@ResponseBody
	@RequestMapping("/findUserInfoByUserID.do")
	public JsonResult<List<Map<String,Object>>> findUserInfoByUserID(String user_id,Integer page, Integer limit) throws MyException{
		return examRoomServiceInter.findUserInfoByUserID(user_id, page, limit);
	}
}
