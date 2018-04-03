
    /**  
    * @Title: ExamPaperDao.java
    * @Package cn.soa.examsystem.dao
    * @Description: ����ϵͳ���Ʋ�
    * @author zhugang
    * @date 2018��3��24��
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
    * @Description: ����ģ��dao��
    * @author zhugang
    * @date 2018��3��24��
    *
    */
@Repository
public interface ExamPaperDao {
	
	
	    /**
	    * @Title: getExamPaperByLimitContition
	    * @Description: TODO(������һ�仰�����������������)
	    * @param @param paramMap
	    * @param @return    ����˵��
	    * @return List<ExamPaper>    ��������
	    * @throws
	    */
	    
	public List<ExamPaper> getExamPaperByLimitContition(@Param("paramMap") Map<String, String> paramMap);
		
	    /**
	    * @Title: getAllSubject
	    * @Description: ��ȡ���еĿ�Ŀ
	    * @param @return    ����˵��
	    * @return List<Subject>    ��������
	    * @throws
	    */
	    
	public List<Subject> getAllSubject();
	
	    /**
	    * @Title: getKnowledgePointBySubject
	    * @Description: ��ȡ������Ŀ�¾��е�֪ʶ��
	    * @param @param subject
	    * @param @return    ����˵��
	    * @return List<KnowledgePoint>    ��������
	    * @throws
	    */
	    
	public List<KnowledgePoint> getKnowledgePointBySubject(String subjectName);
	
	
	    /**
	    * @Title: getKnowledgePointByItsFather
	    * @Description: ���ݸ��ڵ�֪ʶ���ѯ��֪ʶ��
	    * @param @param subject
	    * @param @return    ����˵��
	    * @return List<KnowledgePoint>    ��������
	    * @throws
	    */
	    
	public List<KnowledgePoint> getKnowledgePointByItsFatherID(String fatherKnowledgeID);
	
	    /**
	    * @Title: getAllQuestionType
	    * @Description: ��ȡ���еĿ�������
	    * @param @return    ����˵��
	    * @return List<QuestionType>    ��������
	    * @throws
	    */
	    
	public List<QuestionType> getAllExamQuestionType();
	
	    /**
	    * @Title: getAllweight
	    * @Description: ��ȡ���еĿ���Ȩ��
	    * @param @return    ����˵��
	    * @return List<String>    ��������
	    * @throws
	    */
	    
	public List<String> getAllExamQuesweight();
	
	    /**
	    * @Title: getAllExamQuesAnswerTime
	    * @Description: ��ȡ���еĿ�����ʱ
	    * @param @return    ����˵��
	    * @return List<String>    ��������
	    * @throws
	    */
	    
	public List<String> getAllExamQuesAnswerTime();
	
	    /**
	    * @Title: getAllExamQuesAnswerNum
	    * @Description: ��ȡ���еĿ������
	    * @param @return    ����˵��
	    * @return List<String>    ��������
	    * @throws
	    */
	    
	public List<String> getAllExamQuesAnswerNum();
	
	    /**
	    * @Title: getAllExamDiffculty
	    * @Description: ��ȡ���еĿ����Ѷ�
	    * @param @return    ����˵��
	    * @return List<String>    ��������
	    * @throws
	    */
	    
	public List<String> getAllExamDiffculty();
	
	    /**
	    * @Title: getAllExamEvaluate
	    * @Description: ��ȡ���еĿ�������
	    * @param @return    ����˵��
	    * @return List<String>    ��������
	    * @throws
	    */
	    
	public List<String> getAllExamEvaluate();
	
	    /**
	    * @Title: getAllExamType
	    * @Description: ��ȡ���еĿ�������
	    * @param @return    ����˵��
	    * @return List<String>    ��������
	    * @throws
	    */
	    
	public List<String> getAllExamType();
}
