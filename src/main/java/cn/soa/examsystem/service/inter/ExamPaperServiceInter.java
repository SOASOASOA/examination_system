
    /**  
    * @Title: ExamPaperServiceInter.java
    * @Package cn.soa.examsystem.service.inter
    * @Description: TODO(用一句话描述该文件做什么)
    * @author zhugang
    * @date 2018年3月24日
    * @version V1.0  
    */
    
package cn.soa.examsystem.service.inter;

import java.util.List;
import java.util.Map;

import cn.soa.examsystem.entity.ExamPaper;
import cn.soa.examsystem.entity.KnowledgePoint;
import cn.soa.examsystem.entity.QuestionType;

/**
    * @ClassName: ExamPaperServiceInter
    * @Description: 试题业务层接口
    * @author zhugang
    * @date 2018年3月24日
    *
    */

public interface ExamPaperServiceInter {

	    /**
	    * @Title: getExamPaperByLimitCondition
	    * @Description: 根据参数条件查询所有试题
	    * @param @param paramMap
	    * @param @return    参数说明
	    * @return List<ExamPaper>    返回类型
	    * @throws
	    */
	    
	public List<ExamPaper> getExamPaperByLimitCondition(Map<String, String> paramMap);
	
	    /**
	    * @Title: getKnowledgePointByItsFatherID
	    * @Description: 根据参数父节点ID查询对应的知识点
	    * @param @param fatherKnowledgeID
	    * @param @return    参数说明
	    * @return List<String>    返回类型
	    * @throws
	    */
	    
	public List<String> getKnowledgePointByItsFatherID(String fatherKnowledgeID);
	
	    /**
	    * @Title: getKnowledgePointBySubject
	    * @Description: 根据科目名称查询知识点
	    * @param @param subjectName
	    * @param @return    参数说明
	    * @return List<String>    返回类型
	    * @throws
	    */
	    
	public List<String> getKnowledgePointBySubject(String subjectName);
	
	    /**
	    * @Title: getAllExamQuestionType
	    * @Description: 获取所有的考题题型
	    * @param @return    参数说明
	    * @return List<String>    返回类型
	    * @throws
	    */
	    
	public List<String> getAllExamQuestionType();
	
	    /**
	    * @Title: getAllExamQuesweight
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
	    * @Title: getAllExamEvaluate
	    * @Description: 获取所有的考题类型
	    * @param @return    参数说明
	    * @return List<String>    返回类型
	    * @throws
	    */
	    
	public List<String> getAllExamType();
	
	
}
