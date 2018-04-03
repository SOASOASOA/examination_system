
    /**  
    * @Title: ExamPaperDao.java
    * @Package cn.soa.examsystem.dao
    * @Description: 考试系统控制层
    * @author zhugang
    * @date 2018年3月24日
    * @version V1.0  
    */
    
package cn.soa.examsystem.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import cn.soa.examsystem.entity.ExamPaper;
import cn.soa.examsystem.entity.KnowledgePoint;
import cn.soa.examsystem.entity.QuestionType;
import cn.soa.examsystem.entity.Subject;

/**
    * @ClassName: ExamPaperDao
    * @Description: 试题模块dao层
    * @author zhugang
    * @date 2018年3月24日
    *
    */
@Repository
public interface ExamPaperDao {
	
	
	    /**
	    * @Title: getExamPaperByLimitContition
	    * @Description: TODO(这里用一句话描述这个方法的作用)
	    * @param @param paramMap
	    * @param @return    参数说明
	    * @return List<ExamPaper>    返回类型
	    * @throws
	    */
	    
	public List<ExamPaper> getExamPaperByLimitContition(@Param("paramMap") Map<String, String> paramMap);
		
	    /**
	    * @Title: getAllSubject
	    * @Description: 获取所有的科目
	    * @param @return    参数说明
	    * @return List<Subject>    返回类型
	    * @throws
	    */
	    
	public List<Subject> getAllSubject();
	
	    /**
	    * @Title: getKnowledgePointBySubject
	    * @Description: 获取给定科目下具有的知识点
	    * @param @param subject
	    * @param @return    参数说明
	    * @return List<KnowledgePoint>    返回类型
	    * @throws
	    */
	    
	public List<KnowledgePoint> getKnowledgePointBySubject(String subjectName);
	
	
	    /**
	    * @Title: getKnowledgePointByItsFather
	    * @Description: 根据父节点知识点查询子知识点
	    * @param @param subject
	    * @param @return    参数说明
	    * @return List<KnowledgePoint>    返回类型
	    * @throws
	    */
	    
	public List<KnowledgePoint> getKnowledgePointByItsFatherID(String fatherKnowledgeID);
	
	    /**
	    * @Title: getAllQuestionType
	    * @Description: 获取所有的考题题型
	    * @param @return    参数说明
	    * @return List<QuestionType>    返回类型
	    * @throws
	    */
	    
	public List<QuestionType> getAllExamQuestionType();
	
	    /**
	    * @Title: getAllweight
	    * @Description: 获取所有的考题权重
	    * @param @return    参数说明
	    * @return List<String>    返回类型
	    * @throws
	    */
	    
	public List<String> getAllExamQuesweight();
	
	    /**
	    * @Title: getAllExamQuesAnswerTime
	    * @Description: 获取所有的考题限时
	    * @param @return    参数说明
	    * @return List<String>    返回类型
	    * @throws
	    */
	    
	public List<String> getAllExamQuesAnswerTime();
	
	    /**
	    * @Title: getAllExamQuesAnswerNum
	    * @Description: 获取所有的考题次数
	    * @param @return    参数说明
	    * @return List<String>    返回类型
	    * @throws
	    */
	    
	public List<String> getAllExamQuesAnswerNum();
	
	    /**
	    * @Title: getAllExamDiffculty
	    * @Description: 获取所有的考题难度
	    * @param @return    参数说明
	    * @return List<String>    返回类型
	    * @throws
	    */
	    
	public List<String> getAllExamDiffculty();
	
	    /**
	    * @Title: getAllExamEvaluate
	    * @Description: 获取所有的考题评价
	    * @param @return    参数说明
	    * @return List<String>    返回类型
	    * @throws
	    */
	    
	public List<String> getAllExamEvaluate();
	
	    /**
	    * @Title: getAllExamType
	    * @Description: 获取所有的考题类型
	    * @param @return    参数说明
	    * @return List<String>    返回类型
	    * @throws
	    */
	    
	public List<String> getAllExamType();
}
