
    /**  
    * @Title: ExamPaperServiceImpl.java
    * @Package cn.soa.examsystem.service.impl
    * @Description: TODO(��һ�仰�������ļ���ʲô)
    * @author zhugang
    * @date 2018��3��24��
    * @version V1.0  
    */
    
package cn.soa.examsystem.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.soa.examsystem.dao.ExamPaperDao;
import cn.soa.examsystem.entity.ExamPaper;
import cn.soa.examsystem.entity.KnowledgePoint;
import cn.soa.examsystem.entity.QuestionType;
import cn.soa.examsystem.service.inter.ExamPaperServiceInter;
import cn.soa.examsystem.util.ExamPaperUtils;
import cn.soa.examsystem.util.PropertiesUtils;




    /**
    * @ClassName: ExamPaperServiceImpl
    * @Description: ����ģ��ҵ��������
    * @author zhugang
    * @date 2018��3��29��
    *
    */
    
@Service("examPaperService")
public class ExamPaperServiceImpl implements ExamPaperServiceInter{

	@Autowired
	public ExamPaperDao examPaperDao; 
	
	@Autowired
	public ExamPaperUtils examPaperUtils; 
	
	@Autowired
	public PropertiesUtils propertiesUtils;
	

	
	    /* (�� Javadoc)
	    * 
	    * 
	    * @param paramMap
	    * @return
	    * @see cn.soa.examsystem.service.inter.ExamPaperServiceInter#getExamPaperByLimitCondition(java.util.Map)
	    */
	    
	public List<ExamPaper> getExamPaperByLimitCondition(Map<String, String> paramMap) {
		//�Բ���map��key�滻Ϊ��Ӧ���ݿ��ֶ�
		paramMap = examPaperUtils.transferNameMatchSQLInMap(paramMap);
		
		Map<String, String> tempParamMap = ExamPaperUtils.removeValueNullInMap(paramMap);
		List<ExamPaper> examPaperList = examPaperDao.getExamPaperByLimitContition(tempParamMap);
		return examPaperList; 
	}


	    /* (�� Javadoc)
	    * 
	    * List<KnowledgePoint> list=
	    * @param fatherKnowledgeID
	    * @return
	    * @see cn.soa.examsystem.service.inter.ExamPaperServiceInter#getKnowledgePointByItsFatherID(java.lang.String)
	    */
	    
	public List<String> getKnowledgePointByItsFatherID(String fatherKnowledgeID) {
		//���ز���
		List<String> returnList = new ArrayList<String>();
		
		List<KnowledgePoint> tempList = examPaperDao.getKnowledgePointByItsFatherID(fatherKnowledgeID);
		for(KnowledgePoint k : tempList) {
			returnList.add(k.getName());
		}
		return returnList;
	}
	
	    /* (�� Javadoc)
	    * 
	    * 
	    * @param subjectName
	    * @return
	    * @see cn.soa.examsystem.service.inter.ExamPaperServiceInter#getKnowledgePointBySubject(java.lang.String)
	    */
	    
	public List<String> getKnowledgePointBySubject(String subjectName) {
		//���ز���
		List<String> returnList = new ArrayList<String>();
		
		List<KnowledgePoint> tempList = examPaperDao.getKnowledgePointByItsFatherID(subjectName);
		for(KnowledgePoint k : tempList) {
			returnList.add(k.getName());
		}
		return returnList;
	}


	
	    /* (�� Javadoc)
	    * 
	    * 
	    * @return
	    * @see cn.soa.examsystem.service.inter.ExamPaperServiceInter#getAllExamQuestionType()
	    */
	    
	public List<String> getAllExamQuestionType() {
		//����ֵ
		List<String> returnList = new ArrayList<String>();
		
		List<QuestionType> tempList = examPaperDao.getAllExamQuestionType();
		for(QuestionType q : tempList) {
			returnList.add(q.getName());
		}
		return returnList;
	}


	
	    /* (�� Javadoc)
	    * 
	    * 
	    * @return
	    * @see cn.soa.examsystem.service.inter.ExamPaperServiceInter#getAllExamQuesweight()
	    */
	    
	public List<String> getAllExamQuesweight() {
		List<String> returnList = examPaperDao.getAllExamQuesweight();
		return returnList;
	}


	
	    /* (�� Javadoc)
	    * 
	    * 
	    * @return
	    * @see cn.soa.examsystem.service.inter.ExamPaperServiceInter#getAllExamQuesAnswerTime()
	    */
	    
	public List<String> getAllExamQuesAnswerTime() {
		List<String> returnList = examPaperDao.getAllExamQuesAnswerTime();
		return returnList;
	}


	
	    /* (�� Javadoc)
	    * 
	    * 
	    * @return
	    * @see cn.soa.examsystem.service.inter.ExamPaperServiceInter#getAllExamQuesAnswerNum()
	    */
	    
	public List<String> getAllExamQuesAnswerNum() {
		List<String> returnList = examPaperDao.getAllExamQuesAnswerNum();
		return returnList;
	}


	
	    /* (�� Javadoc)
	    * 
	    * 
	    * @return
	    * @see cn.soa.examsystem.service.inter.ExamPaperServiceInter#getAllExamDiffculty()
	    */
	    
	public List<String> getAllExamDiffculty() {
		List<String> returnList = examPaperDao.getAllExamDiffculty();
		return returnList;
	}


	
	    /* (�� Javadoc)
	    * 
	    * 
	    * @return
	    * @see cn.soa.examsystem.service.inter.ExamPaperServiceInter#getAllExamEvaluate()
	    */
	    
	public List<String> getAllExamEvaluate() {
		List<String> returnList = examPaperDao.getAllExamEvaluate();
		return returnList;
	}


	
	    /* (�� Javadoc)
	    * 
	    * 
	    * @return
	    * @see cn.soa.examsystem.service.inter.ExamPaperServiceInter#getAllExamType()
	    */
	    
	public List<String> getAllExamType() {
		//����ֵ
		List<String> returnList = new ArrayList<String>();
		
		List<String> tempList = examPaperDao.getAllExamType();
		String tempStr = null;
		for(String s : tempList) {
			tempStr = propertiesUtils.examPaperMap.get(s);
			if(tempStr != null ){
				returnList.add(tempStr);	
			}		
		}
		return returnList;
	}


	
	    /* (非 Javadoc)
	    * 
	    * 
	    * @param title
	    * @return
	    * @see cn.soa.examsystem.service.inter.ExamPaperServiceInter#getAllExamQuesByTitle(java.lang.String)
	    */
	    
	public List<ExamPaper> getAllExamQuesByTitle(String title) {
		List<ExamPaper> returnList = examPaperDao.getAllExamQuesByTitle(title);
		return returnList;
	}
	
}
