

    
package cn.soa.examsystem.service.inter;

import java.util.List;
import java.util.Map;

import cn.soa.examsystem.entity.Examroom;
import cn.soa.examsystem.exception.MyException;
import cn.soa.examsystem.util.JsonResult;



public interface ExamRoomServiceInter {
	/**
	 * 查询所有的考试试卷
	 * @return
	 * @throws MyException 
	 */
	public JsonResult<List<Map<String,Object>>> findAllExaminPaper(Integer page,Integer limit) throws MyException;
	/**
	 * 根据模块ID查询对应的功能模块信息
	 */
	public JsonResult<List<Map<String,Object>>> findUserFunction(String ua_id) throws MyException;
	/**
	 * 增加考场
	 * @throws MyException 
	 */
	public JsonResult<String> addExamroom(Examroom examroom) throws MyException;
	/**
	 * 查询所有的考场信息
	 * @return
	 */
	public JsonResult<List<Map<String, Object>>> findAllExamroomInfo(Integer page,Integer limit,String exam_id) throws MyException;
	/**
	 * 根据考场ID删除对应的考场信息
	 * @throws MyException 
	 */
	public JsonResult<String> deleteExamroomById(String examroom_id) throws MyException;
	/**
	 * 根据examroomId,修改对应的考场信息
	 * @throws MyException 
	 */
	public JsonResult<String> updateExamroomInfoById(Examroom examroom) throws MyException;
	/**
	 * @Description: 根据考卷ID查询对应的考场ID和名称
	 * @throws MyException 
	 */
	public JsonResult<List<Map<String,Object>>> findExamroomByExamId(String exam_id) throws MyException;
	/**
	 *通过user_id查询对应组织结构根节点uos_id,并查询此根节点组织下的用户信息
	 */
	public JsonResult<List<Map<String,Object>>> findUserInfoByUserID(String user_id,Integer page, Integer limit) throws MyException;
}
