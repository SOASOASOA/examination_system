
package cn.soa.examsystem.dao;

import java.util.List;
import java.util.Map;

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
}
