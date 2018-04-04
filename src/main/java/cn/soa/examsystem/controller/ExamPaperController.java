
    /**  
    * @Title: ExamPaperController.java
    * @Package cn.soa.examsystem.controller
    * @Description: TODO(��һ�仰�������ļ���ʲô)
    * @author zhugang
    * @date 2018��3��24��
    * @version V1.0  
    */
    
package cn.soa.examsystem.controller;

import java.util.List;
import java.util.Map;
import java.util.Properties;

import javax.annotation.Resource;
import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cn.soa.examsystem.entity.ExamPaper;
import cn.soa.examsystem.service.impl.ExamPaperServiceImpl;
import cn.soa.examsystem.service.inter.ExamPaperServiceInter;
import cn.soa.examsystem.util.ExamPaperUtils;
import cn.soa.examsystem.util.JsonResult;
import cn.soa.examsystem.util.JsonResultForTable;

/**
    * @ClassName: ExamPaperController
    * @Description: ����ģ����Ʋ�
    * @author zhugang
    * @date 2018��3��24��
    *
    */
@Validated
@RestController
@RequestMapping("/exampaperModule")
public class ExamPaperController {
	@Autowired
	private  ExamPaperServiceInter  examPaperService;
	
	
	    /**
	    * @Title: getExamPaperByLimitCondition
	    * @Description: ��ѯ��������-���Ʋ�
	    * @param @param paramMap
	    * @param @return    ����˵��
	    * @return JsonResultForTable<List<ExamPaper>>    ��������
	    * @throws
	    */
	    
	@RequestMapping(value= {"/exampaper/all"})
	//@RequestMapping(value= {"/exampaper/all"},method=RequestMethod.GET)
	public JsonResult<List<ExamPaper>> getExamPaperByLimitCondition(@RequestParam("paramMap") @NotNull(message= "{map.notnull}") Map<String, String> paramMap) 
	{		
		List<ExamPaper> returnExampaperList = examPaperService.getExamPaperByLimitCondition(paramMap);
		//封装Json
		String returnCount = ExamPaperUtils.getCountFromList(returnExampaperList);
		return new JsonResult<List<ExamPaper>>(returnCount, returnExampaperList);		
	}

	
	    /**
	    * @Title: getKnowledgePointByItsFatherID
	    * @Description: ���ݸ��ڵ�֪ʶ���ѯ�ӽڵ�֪ʶ��-���Ʋ�
	    * @param @param fatherKnowledgeID
	    * @param @return    ����˵��
	    * @return JsonResult<List<String>>    ��������
	    * @throws
	    */
	    
	@RequestMapping(value= {"/knowledgePoint/fatherKnowledgeID"})
	//@RequestMapping(value= {"/knowledgePoint/fatherKnowledgeID"},method=RequestMethod.GET)
	public JsonResult<List<String>> getKnowledgePointByItsFatherID(@RequestParam("fatherKnowledgeID") @NotNull(message= "{fatherKnowledgeID.notnull}") String fatherKnowledgeID) {		
		List<String> returnListKnowledge = examPaperService.getKnowledgePointByItsFatherID(fatherKnowledgeID);
		//��װ���ص�json
		return new JsonResult<List<String>>(returnListKnowledge);	
	}

	
	    /**
	    * @Title: getKnowledgePointBySubject
	    * @Description: ��ȡָ����Ŀ�¾��е�֪ʶ��
	    * @param @param subjectName
	    * @param @return    ����˵��
	    * @return JsonResult<List<String>>    ��������
	    * @throws
	    */
	    
	@RequestMapping(value= {"/knowledgePoint/subjectName"})
	//@RequestMapping(value= {"/knowledgePoint/subjectName"},method=RequestMethod.GET)
	public JsonResult<List<String>> getKnowledgePointBySubject(@RequestParam("subjectName") @NotNull(message= "{subjectName.notnull}") String subjectName) {		
		List<String> returnListKnowledge = examPaperService.getKnowledgePointBySubject(subjectName);
		//��װ���ص�json
		return new JsonResult<List<String>>(returnListKnowledge);	
	}
	
	
	    /**
	    * @Title: getAllQuestionType
	    * @Description: ��ѯ�������������
	    * @param @return    ����˵��
	    * @return JsonResult<List<String>>    ��������
	    * @throws
	    */
	    
	@RequestMapping(value= {"/questionType/all"})
	//@RequestMapping(value= {"/questionType/all"},method=RequestMethod.GET)
	public JsonResult<List<String>> getAllQuestionType() {		
		List<String> returnListExamQuesType =examPaperService.getAllExamQuestionType();
		return new JsonResult<List<String>>(returnListExamQuesType);	
	}
	
	    /**
	    * @Title: getAllExamQuesWeight
	    * @Description: ��ѯ���������Ȩ��
	    * @param @return    ����˵��
	    * @return JsonResult<List<String>>    ��������
	    * @throws
	    */
	    
	@RequestMapping(value= {"/quesWeight/all"})
	//@RequestMapping(value= {"/quesWeight/all"},method=RequestMethod.GET)
	public JsonResult<List<String>> getAllExamQuesWeight() {		
		List<String> returnListExamQuesWeight =examPaperService.getAllExamQuesweight();
		return new JsonResult<List<String>>(returnListExamQuesWeight);	
	}
	
	    /**
	    * @Title: getAllExamQuesAnswerTime
	    * @Description: ��ѯ�����������ʱ
	    * @param @return    ����˵��
	    * @return JsonResult<List<String>>    ��������
	    * @throws
	    */
	    
	@RequestMapping(value= {"/answerTime/all"})
	//@RequestMapping(value= {"/answerTime/all"},method=RequestMethod.GET)
	public JsonResult<List<String>> getAllExamQuesAnswerTime() {		
		List<String> returnListExamQuesAnswerTime =examPaperService.getAllExamQuesAnswerTime();
		return new JsonResult<List<String>>(returnListExamQuesAnswerTime);	
	}
	
	    /**
	    * @Title: getAllExamQuesAnswerNum
	    * @Description: ��ѯ����������޴�
	    * @param @return    ����˵��
	    * @return JsonResult<List<String>>    ��������
	    * @throws
	    */
	    
	@RequestMapping(value= {"/answerNum/all"})
	//@RequestMapping(value= {"/answerNum/all"},method=RequestMethod.GET)
	public JsonResult<List<String>> getAllExamQuesAnswerNum() {		
		List<String> returnListExamQuesAnswerNum =examPaperService.getAllExamQuesAnswerNum();
		return new JsonResult<List<String>>(returnListExamQuesAnswerNum);	
	}
	
	    /**
	    * @Title: getAllExamDiffculty
	    * @Description: ��ѯ����������Ѷ�
	    * @param @return    ����˵��
	    * @return JsonResult<List<String>>    ��������
	    * @throws
	    */
	    
	@RequestMapping(value= {"/diffculty/all"})
	//@RequestMapping(value= {"/diffculty/all"},method=RequestMethod.GET)
	public JsonResult<List<String>> getAllExamDiffculty() {		
		List<String> returnListExamQuesDiffculty =examPaperService.getAllExamDiffculty();
		return new JsonResult<List<String>>(returnListExamQuesDiffculty);	
	}
	
	    /**
	    * @Title: getAllExamEvaluate
	    * @Description: ��ѯ�������������
	    * @param @return    ����˵��
	    * @return JsonResult<List<String>>    ��������
	    * @throws
	    */
	    
	@RequestMapping(value= {"/evaluate/all"})
	//@RequestMapping(value= {"/evaluate/all"},method=RequestMethod.GET)
	public JsonResult<List<String>> getAllExamEvaluate() {		
		List<String> returnListExamQuesDiffculty =examPaperService.getAllExamEvaluate();
		return new JsonResult<List<String>>(returnListExamQuesDiffculty);	
	}
	
	    /**
	    * @Title: getAllExamType
	    * @Description: ��ѯ�������������
	    * @param @return    ����˵��
	    * @return JsonResult<List<String>>    ��������
	    * @throws
	    */
	    
	@RequestMapping(value= {"/type/all"})
	//@RequestMapping(value= {"/type/all"},method=RequestMethod.GET)
	public JsonResult<List<String>> getAllExamType() {		
		List<String> returnListExamQuesType =examPaperService.getAllExamType();
		return new JsonResult<List<String>>(returnListExamQuesType);	
	}
	
	
	    /**
	    * @Title: getAllExamQuesByTitle
	    * @Description: 根据题目获取试题
	    * @param @param title
	    * @param @return    参数说明
	    * @return JsonResult<List<ExamPaper>>    返回类型
	    * @throws
	    */
	    
	@RequestMapping(value= {"/exampaper/title"})
	//@RequestMapping(value= {"/exampaper/title"},method=RequestMethod.GET)
	public JsonResult<List<ExamPaper>> getAllExamQuesByTitle(@RequestParam("title") @NotNull(message= "{examques.title.notnull}") String title) {		
		List<ExamPaper> returnListExam =examPaperService.getAllExamQuesByTitle(title);
		String returnCount = ExamPaperUtils.getCountFromList(returnListExam);
		return new JsonResult<List<ExamPaper>>(returnCount, returnListExam);	
	}
	
	
}
