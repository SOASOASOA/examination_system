
    /**  
    * @Title: ExamPaperDao.java
    * @Package cn.soa.examsystem.dao
    * @Description: 锟斤拷锟斤拷系统锟斤拷锟狡诧拷
    * @author zhugang
    * @date 2018锟斤拷3锟斤拷24锟斤拷
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
    * @Description: 璇曢鏌ヨdao灞�
    * @author zhugang
    * @date 2018锟斤拷3锟斤拷24锟斤拷
    *
    */
@Repository
public interface ExamPaperDao {
	
	
	    /**
	    * @Title: getExamPaperByLimitContition
	    * @Description: TODO(锟斤拷锟斤拷锟斤拷一锟戒话锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟�)
	    * @param @param paramMap
	    * @param @return    锟斤拷锟斤拷说锟斤拷
	    * @return List<ExamPaper>    锟斤拷锟斤拷锟斤拷锟斤拷
	    * @throws
	    */
	    
	public List<ExamPaper> getExamPaperByLimitContition(@Param("paramMap") Map<String, String> paramMap);
		
	    /**
	    * @Title: getAllSubject
	    * @Description: 锟斤拷取锟斤拷锟叫的匡拷目
	    * @param @return    锟斤拷锟斤拷说锟斤拷
	    * @return List<Subject>    锟斤拷锟斤拷锟斤拷锟斤拷
	    * @throws
	    */
	    
	public List<Subject> getAllSubject();
	
	    /**
	    * @Title: getKnowledgePointBySubject
	    * @Description: 锟斤拷取锟斤拷锟斤拷锟斤拷目锟铰撅拷锟叫碉拷知识锟斤拷
	    * @param @param subject
	    * @param @return    锟斤拷锟斤拷说锟斤拷
	    * @return List<KnowledgePoint>    锟斤拷锟斤拷锟斤拷锟斤拷
	    * @throws
	    */
	    
	public List<KnowledgePoint> getKnowledgePointBySubject(String subjectName);
	
	
	    /**
	    * @Title: getKnowledgePointByItsFather
	    * @Description: 锟斤拷锟捷革拷锟节碉拷知识锟斤拷锟窖拷锟街讹拷锟�
	    * @param @param subject
	    * @param @return    锟斤拷锟斤拷说锟斤拷
	    * @return List<KnowledgePoint>    锟斤拷锟斤拷锟斤拷锟斤拷
	    * @throws
	    */
	    
	public List<KnowledgePoint> getKnowledgePointByItsFatherID(String fatherKnowledgeID);
	
	    /**
	    * @Title: getAllQuestionType
	    * @Description: 锟斤拷取锟斤拷锟叫的匡拷锟斤拷锟斤拷锟斤拷
	    * @param @return    锟斤拷锟斤拷说锟斤拷
	    * @return List<QuestionType>    锟斤拷锟斤拷锟斤拷锟斤拷
	    * @throws
	    */
	    
	public List<QuestionType> getAllExamQuestionType();
	
	    /**
	    * @Title: getAllweight
	    * @Description: 锟斤拷取锟斤拷锟叫的匡拷锟斤拷权锟斤拷
	    * @param @return    锟斤拷锟斤拷说锟斤拷
	    * @return List<String>    锟斤拷锟斤拷锟斤拷锟斤拷
	    * @throws
	    */
	    
	public List<String> getAllExamQuesweight();
	
	    /**
	    * @Title: getAllExamQuesAnswerTime
	    * @Description: 锟斤拷取锟斤拷锟叫的匡拷锟斤拷锟斤拷时
	    * @param @return    锟斤拷锟斤拷说锟斤拷
	    * @return List<String>    锟斤拷锟斤拷锟斤拷锟斤拷
	    * @throws
	    */
	    
	public List<String> getAllExamQuesAnswerTime();
	
	    /**
	    * @Title: getAllExamQuesAnswerNum
	    * @Description: 锟斤拷取锟斤拷锟叫的匡拷锟斤拷锟斤拷锟�
	    * @param @return    锟斤拷锟斤拷说锟斤拷
	    * @return List<String>    锟斤拷锟斤拷锟斤拷锟斤拷
	    * @throws
	    */
	    
	public List<String> getAllExamQuesAnswerNum();
	
	    /**
	    * @Title: getAllExamDiffculty
	    * @Description: 锟斤拷取锟斤拷锟叫的匡拷锟斤拷锟窖讹拷
	    * @param @return    锟斤拷锟斤拷说锟斤拷
	    * @return List<String>    锟斤拷锟斤拷锟斤拷锟斤拷
	    * @throws
	    */
	    
	public List<String> getAllExamDiffculty();
	
	    /**
	    * @Title: getAllExamEvaluate
	    * @Description: 锟斤拷取锟斤拷锟叫的匡拷锟斤拷锟斤拷锟斤拷
	    * @param @return    锟斤拷锟斤拷说锟斤拷
	    * @return List<String>    锟斤拷锟斤拷锟斤拷锟斤拷
	    * @throws
	    */
	    
	public List<String> getAllExamEvaluate();
	
	    /**
	    * @Title: getAllExamType
	    * @Description: 鏌ヨ璇曢绫诲瀷
	    * @param @return    锟斤拷锟斤拷说锟斤拷
	    * @return List<String>    锟斤拷锟斤拷锟斤拷锟斤拷
	    * @throws
	    */
	    
	public List<String> getAllExamType();
	
	    /**
	    * @Title: getAllExamQuesByTitle
	    * @Description: 鏍规嵁棰樼洰鏌ヨ璇曢
	    * @param @param title
	    * @param @return    鍙傛暟璇存槑
	    * @return List<ExamPaper>    杩斿洖绫诲瀷
	    * @throws
	    */
	    
	public List<ExamPaper> getAllExamQuesByTitle(String title);
	
	
	
	    /**
	    * @Title: getAllExamQuesByTitle
	    * @Description: 鏍规嵁鏉′欢淇敼鏁版嵁搴撳��
	    * @param @param id
	    * @param @param map
	    * @param @return    鍙傛暟璇存槑
	    * @return int    杩斿洖绫诲瀷
	    * @throws
	    */
	    
	public int changeExamQuesValue(@Param("paramID") String id,@Param("paramMap") Map<String, String> map);
}
