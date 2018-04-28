
package cn.soa.examsystem.dao;

import java.util.List;
import java.util.Map;

import cn.soa.examsystem.entity.Examroom;

/**
 * 考试编排的DAO层
    * @ClassName: ExamRoomDao
    * @Description: TODO(这里用一句话描述这个类的作用)
    * @author zhugang
    * @date 2018年4月5日
    *
 */
public interface ExamRoomDao {
	/**
	 * 查询所有的考试试卷
	 * @return
	 */
	public List<Map<String,Object>> findAllExaminPaper(Integer start_page,Integer end_page);
	/**
	 * 查询试卷结果集的总行数
	 * @return
	 */
	public Integer findTotalCount();
	/**
	 * 根据模块ID查询对应的功能模块信息
	 */
	public List<Map<String,Object>> findUserFunction(String ua_id);
	/**
	 * 增加考场
	 */
	public int addExamroom(Examroom examroom);
	/**
	 * 
	    * @Title: findExamroomByName
	    * @Description: 根据考场名称查询是否存在相同名称的考场，如果存在则不能添加考场
	    * @param @param examroom_name 考场名称
	    * @param @return    参数说明
	    * @return String    返回类型
	    * @throws
	 */
	public List<String> findExamroomByName(String examroom_name);
	/**
	 * 查询所有的考场信息
	 * @return
	 */
	public List<Map<String,Object>> findAllExamroomInfo(Integer start_page,Integer end_page,String exam_id);
	/**
	 * 查询考场总行数
	 * @return
	 */
	public Integer findExamroomTotalCount(String exam_id);
	/**
	 * 
	    * @Title: deleteExamroomById
	    * @Description: 根据考场ID删除对应的考场信息
	    * @param @param examroom_id
	    * @param @return    参数说明
	    * @return Integer    返回类型
	    * @throws
	 */
	public Integer deleteExamroomById(String examroom_id);
	/**
	 * 根据examroomId,修改对应的考场信息
	    * @Title: updateExamroomInfoById
	    * @Description: TODO(这里用一句话描述这个方法的作用)
	    * @param @param examroom
	    * @param @return    参数说明
	    * @return Integer    返回类型
	    * @throws
	 */
	public Integer updateExamroomInfoById(Examroom examroom);
	/**
	 * 
	    * @Title: findExamroomByExamId
	    * @Description: 根据考卷ID查询对应的考场
	    * @param @param exam_id
	    * @param @return    参数说明
	    * @return List<Map<String,Object>>    返回类型
	    * @throws
	 */
	public List<Map<String,Object>> findExamroomByExamId(String exam_id);

}
