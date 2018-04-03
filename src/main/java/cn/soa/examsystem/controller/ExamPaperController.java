
    /**  
    * @Title: ExamPaperController.java
    * @Package cn.soa.examsystem.controller
    * @Description: TODO(用一句话描述该文件做什么)
    * @author zhugang
    * @date 2018年3月24日
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
    * @Description: 试题模块控制层
    * @author zhugang
    * @date 2018年3月24日
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
	    * @Description: 查询所有试题-控制层
	    * @param @param paramMap
	    * @param @return    参数说明
	    * @return JsonResultForTable<List<ExamPaper>>    返回类型
	    * @throws
	    */
	    
	@RequestMapping(value= {"/exampaper/all"})
	//@RequestMapping(value= {"/exampaper/all"},method=RequestMethod.GET)
	public JsonResultForTable<List<ExamPaper>> getExamPaperByLimitCondition(@RequestParam("paramMap") @NotNull(message= "{map.notnull}") Map<String, String> paramMap) 
	{		
		List<ExamPaper> returnExampaperList = examPaperService.getExamPaperByLimitCondition(paramMap);
		//封装返回的json
		String returnCount = ExamPaperUtils.getCountFromList(returnExampaperList);
		return new JsonResultForTable<List<ExamPaper>>("0", "请求成功", returnCount, returnExampaperList);		
	}

	
	    /**
	    * @Title: getKnowledgePointByItsFatherID
	    * @Description: 根据父节点知识点查询子节点知识点-控制层
	    * @param @param fatherKnowledgeID
	    * @param @return    参数说明
	    * @return JsonResult<List<String>>    返回类型
	    * @throws
	    */
	    
	@RequestMapping(value= {"/knowledgePoint/fatherKnowledgeID"})
	//@RequestMapping(value= {"/knowledgePoint/fatherKnowledgeID"},method=RequestMethod.GET)
	public JsonResult<List<String>> getKnowledgePointByItsFatherID(@RequestParam("fatherKnowledgeID") @NotNull(message= "{fatherKnowledgeID.notnull}") String fatherKnowledgeID) {		
		List<String> returnListKnowledge = examPaperService.getKnowledgePointByItsFatherID(fatherKnowledgeID);
		//封装返回的json
		return new JsonResult<List<String>>(returnListKnowledge);	
	}

	
	    /**
	    * @Title: getKnowledgePointBySubject
	    * @Description: 获取指定科目下具有的知识点
	    * @param @param subjectName
	    * @param @return    参数说明
	    * @return JsonResult<List<String>>    返回类型
	    * @throws
	    */
	    
	@RequestMapping(value= {"/knowledgePoint/subjectName"})
	//@RequestMapping(value= {"/knowledgePoint/subjectName"},method=RequestMethod.GET)
	public JsonResult<List<String>> getKnowledgePointBySubject(@RequestParam("subjectName") @NotNull(message= "{subjectName.notnull}") String subjectName) {		
		List<String> returnListKnowledge = examPaperService.getKnowledgePointBySubject(subjectName);
		//封装返回的json
		return new JsonResult<List<String>>(returnListKnowledge);	
	}
	
	
	    /**
	    * @Title: getAllQuestionType
	    * @Description: 查询所有问题的类型
	    * @param @return    参数说明
	    * @return JsonResult<List<String>>    返回类型
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
	    * @Description: 查询所有问题的权重
	    * @param @return    参数说明
	    * @return JsonResult<List<String>>    返回类型
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
	    * @Description: 查询所有问题的限时
	    * @param @return    参数说明
	    * @return JsonResult<List<String>>    返回类型
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
	    * @Description: 查询所有问题的限答
	    * @param @return    参数说明
	    * @return JsonResult<List<String>>    返回类型
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
	    * @Description: 查询所有问题的难度
	    * @param @return    参数说明
	    * @return JsonResult<List<String>>    返回类型
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
	    * @Description: 查询所有问题的评价
	    * @param @return    参数说明
	    * @return JsonResult<List<String>>    返回类型
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
	    * @Description: 查询所有问题的属性
	    * @param @return    参数说明
	    * @return JsonResult<List<String>>    返回类型
	    * @throws
	    */
	    
	@RequestMapping(value= {"/type/all"})
	//@RequestMapping(value= {"/type/all"},method=RequestMethod.GET)
	public JsonResult<List<String>> getAllExamType() {		
		List<String> returnListExamQuesType =examPaperService.getAllExamType();
		return new JsonResult<List<String>>(returnListExamQuesType);	
	}
}
