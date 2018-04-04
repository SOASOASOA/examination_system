
    /**  
    * @Title: ExamPaperServiceInter.java
    * @Package cn.soa.examsystem.service.inter
    * @Description: TODO(��һ�仰�������ļ���ʲô)
    * @author zhugang
    * @date 2018��3��24��
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
    * @Description: ����ҵ���ӿ�
    * @author zhugang
    * @date 2018��3��24��
    *
    */

public interface ExamPaperServiceInter {

	    /**
	    * @Title: getExamPaperByLimitCondition
	    * @Description: ���ݲ���������ѯ��������
	    * @param @param paramMap
	    * @param @return    ����˵��
	    * @return List<ExamPaper>    ��������
	    * @throws
	    */
	    
	public List<ExamPaper> getExamPaperByLimitCondition(Map<String, String> paramMap);
	
	    /**
	    * @Title: getKnowledgePointByItsFatherID
	    * @Description: ���ݲ������ڵ�ID��ѯ��Ӧ��֪ʶ��
	    * @param @param fatherKnowledgeID
	    * @param @return    ����˵��
	    * @return List<String>    ��������
	    * @throws
	    */
	    
	public List<String> getKnowledgePointByItsFatherID(String fatherKnowledgeID);
	
	    /**
	    * @Title: getKnowledgePointBySubject
	    * @Description: ���ݿ�Ŀ���Ʋ�ѯ֪ʶ��
	    * @param @param subjectName
	    * @param @return    ����˵��
	    * @return List<String>    ��������
	    * @throws
	    */
	    
	public List<String> getKnowledgePointBySubject(String subjectName);
	
	    /**
	    * @Title: getAllExamQuestionType
	    * @Description: ��ȡ���еĿ�������
	    * @param @return    ����˵��
	    * @return List<String>    ��������
	    * @throws
	    */
	    
	public List<String> getAllExamQuestionType();
	
	    /**
	    * @Title: getAllExamQuesweight
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
	    * @Title: getAllExamEvaluate
	    * @Description: ��ȡ���еĿ�������
	    * @param @return    ����˵��
	    * @return List<String>    ��������
	    * @throws
	    */
	    
	public List<String> getAllExamType();	
	
	    /**
	    * @Title: getAllExamQuesByTitle
	    * @Description: 根据题目查询试题
	    * @param @param title
	    * @param @return    参数说明
	    * @return List<ExamPaper>    返回类型
	    * @throws
	    */
	    
	public  List<ExamPaper> getAllExamQuesByTitle(String title);
}
