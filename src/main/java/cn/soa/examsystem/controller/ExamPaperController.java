
    /**  
    * @Title: ExamPaperController.java
    * @Package cn.soa.examsystem.controller
    * @Description: TODO(锟斤拷一锟戒话锟斤拷锟斤拷锟斤拷锟侥硷拷锟斤拷什么)
    * @author zhugang
    * @date 2018锟斤拷3锟斤拷24锟斤拷
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
    * @Description: 锟斤拷锟斤拷模锟斤拷锟斤拷撇锟�
    * @author zhugang
    * @date 2018锟斤拷3锟斤拷24锟斤拷
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
	    * @Description: 锟斤拷询锟斤拷锟斤拷锟斤拷锟斤拷-锟斤拷锟狡诧拷
	    * @param @param paramMap
	    * @param @return    锟斤拷锟斤拷说锟斤拷
	    * @return JsonResultForTable<List<ExamPaper>>    锟斤拷锟斤拷锟斤拷锟斤拷
	    * @throws
	    */
	    
	@RequestMapping(value= {"/exampaper/all"})
	//@RequestMapping(value= {"/exampaper/all"},method=RequestMethod.GET)
	public JsonResult<List<ExamPaper>> getExamPaperByLimitCondition(@RequestParam("paramMap") @NotNull(message= "{map.notnull}") Map<String, String> paramMap) 
	{		
		List<ExamPaper> returnExampaperList = examPaperService.getExamPaperByLimitCondition(paramMap);
		//灏佽Json
		Integer returnCount =ExamPaperUtils.getCountFromList(returnExampaperList);
		return new JsonResult<List<ExamPaper>>(returnCount, returnExampaperList);		
	}

	
	    /**
	    * @Title: getKnowledgePointByItsFatherID
	    * @Description: 锟斤拷锟捷革拷锟节碉拷知识锟斤拷锟窖拷咏诘锟街讹拷锟�-锟斤拷锟狡诧拷
	    * @param @param fatherKnowledgeID
	    * @param @return    锟斤拷锟斤拷说锟斤拷
	    * @return JsonResult<List<String>>    锟斤拷锟斤拷锟斤拷锟斤拷
	    * @throws
	    */
	    
	@RequestMapping(value= {"/knowledgePoint/fatherKnowledgeID"})
	//@RequestMapping(value= {"/knowledgePoint/fatherKnowledgeID"},method=RequestMethod.GET)
	public JsonResult<List<String>> getKnowledgePointByItsFatherID(@RequestParam("fatherKnowledgeID") @NotNull(message= "{fatherKnowledgeID.notnull}") String fatherKnowledgeID) {		
		List<String> returnListKnowledge = examPaperService.getKnowledgePointByItsFatherID(fatherKnowledgeID);
		//锟斤拷装锟斤拷锟截碉拷json
		return new JsonResult<List<String>>(returnListKnowledge);	
	}

	
	    /**
	    * @Title: getKnowledgePointBySubject
	    * @Description: 锟斤拷取指锟斤拷锟斤拷目锟铰撅拷锟叫碉拷知识锟斤拷
	    * @param @param subjectName
	    * @param @return    锟斤拷锟斤拷说锟斤拷
	    * @return JsonResult<List<String>>    锟斤拷锟斤拷锟斤拷锟斤拷
	    * @throws
	    */
	    
	@RequestMapping(value= {"/knowledgePoint/subjectName"})
	//@RequestMapping(value= {"/knowledgePoint/subjectName"},method=RequestMethod.GET)
	public JsonResult<List<String>> getKnowledgePointBySubject(@RequestParam("subjectName") @NotNull(message= "{subjectName.notnull}") String subjectName) {		
		List<String> returnListKnowledge = examPaperService.getKnowledgePointBySubject(subjectName);
		//锟斤拷装锟斤拷锟截碉拷json
		return new JsonResult<List<String>>(returnListKnowledge);	
	}
	
	
	    /**
	    * @Title: getAllQuestionType
	    * @Description: 锟斤拷询锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟�
	    * @param @return    锟斤拷锟斤拷说锟斤拷
	    * @return JsonResult<List<String>>    锟斤拷锟斤拷锟斤拷锟斤拷
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
	    * @Description: 锟斤拷询锟斤拷锟斤拷锟斤拷锟斤拷锟饺拷锟�
	    * @param @return    锟斤拷锟斤拷说锟斤拷
	    * @return JsonResult<List<String>>    锟斤拷锟斤拷锟斤拷锟斤拷
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
	    * @Description: 锟斤拷询锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟绞�
	    * @param @return    锟斤拷锟斤拷说锟斤拷
	    * @return JsonResult<List<String>>    锟斤拷锟斤拷锟斤拷锟斤拷
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
	    * @Description: 锟斤拷询锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷薮锟�
	    * @param @return    锟斤拷锟斤拷说锟斤拷
	    * @return JsonResult<List<String>>    锟斤拷锟斤拷锟斤拷锟斤拷
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
	    * @Description: 锟斤拷询锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷讯锟�
	    * @param @return    锟斤拷锟斤拷说锟斤拷
	    * @return JsonResult<List<String>>    锟斤拷锟斤拷锟斤拷锟斤拷
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
	    * @Description: 锟斤拷询锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟�
	    * @param @return    锟斤拷锟斤拷说锟斤拷
	    * @return JsonResult<List<String>>    锟斤拷锟斤拷锟斤拷锟斤拷
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
	    * @Description: 锟斤拷询锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟�
	    * @param @return    锟斤拷锟斤拷说锟斤拷
	    * @return JsonResult<List<String>>    锟斤拷锟斤拷锟斤拷锟斤拷
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
	    * @Description: 鏍规嵁棰樼洰鑾峰彇璇曢
	    * @param @param title
	    * @param @return    鍙傛暟璇存槑
	    * @return JsonResult<List<ExamPaper>>    杩斿洖绫诲瀷
	    * @throws
	    */
	    
	@RequestMapping(value= {"/exampaper/title"})
	//@RequestMapping(value= {"/exampaper/title"},method=RequestMethod.GET)
	public JsonResult<List<ExamPaper>> getAllExamQuesByTitle(@RequestParam("title") @NotNull(message= "{examques.title.notnull}") String title) {		
		List<ExamPaper> returnListExam =examPaperService.getAllExamQuesByTitle(title);
		Integer returnCount = ExamPaperUtils.getCountFromList(returnListExam);
		return new JsonResult<List<ExamPaper>>(returnCount, returnListExam);	
	}
	
	
}
