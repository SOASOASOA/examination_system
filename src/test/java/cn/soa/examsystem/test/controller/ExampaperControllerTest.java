
    /**  
    * @Title: MainTest.java
    * @Package cn.soa.examsystem.test.service
    * @Description: TODO(��һ�仰�������ļ���ʲô)
    * @author zhugang
    * @date 2018��3��24��
    * @version V1.0  
    */
    
package cn.soa.examsystem.test.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import cn.soa.examsystem.controller.ExamPaperController;
import cn.soa.examsystem.entity.ExamPaper;
import cn.soa.examsystem.entity.User;
import cn.soa.examsystem.service.impl.ExamPaperServiceImpl;
import cn.soa.examsystem.service.impl.MainService;
import cn.soa.examsystem.test.dao.BaseTest;
import cn.soa.examsystem.util.JsonResult;

/**
    * @ClassName: MainTest
    * @Description: service�������
    * @author zhugang
    * @date 2018��3��24��
    *
    */

public class ExampaperControllerTest extends BaseTest {
	
	private ExamPaperServiceImpl examPaperService;
	
	private ExamPaperController examPaperController;
	
	@Before
	public void initUserDao(){
		examPaperService = ctx.getBean("examPaperService",ExamPaperServiceImpl.class);
		examPaperController = ctx.getBean("examPaperController",ExamPaperController.class);
	}
	
	/*
	@Test
	public void getExamPaperByLimitConditionTest()
	{
		Map<String, String> testMap = new HashMap<String, String>();
		testMap.put("createPerson", "����");
		testMap.put("name", "������");
		List<ExamPaper> returnExampaperList = examPaperService.getExamPaperByLimitCondition(testMap);
		System.out.println(returnExampaperList);
	}
	
	@Test
	public void getKnowledgePointByItsFatherID()
	{
		String fatherID="29b673d1-f342-6a12-e2d2-0ba2886bb3b8";
		JsonResult<List<String>> json = examPaperController.getKnowledgePointByItsFatherID(fatherID);
		System.out.println(json);
	}
	
	
	@Test
	public void getKnowledgePointByItsFatherID()
	{
		String fatherKnowledgeID="29b673d1-f342-6a12-e2d2-0ba2886bb3b8";
		JsonResult<List<String>> json = examPaperController.getKnowledgePointByItsFatherID(fatherKnowledgeID);
		System.out.println(json);
	}

	
	@Test
	public void getAllExamType()
	{
		JsonResult<List<String>> json = examPaperController.getAllExamType();
		System.out.println(json);
	}
	
	
	@Test
	public void getAllExamEvaluate()
	{
		JsonResult<List<String>> json = examPaperController.getAllExamEvaluate();
		System.out.println(json);
	}

	
	@Test
	public void getAllExamDiffculty()
	{
		JsonResult<List<String>> json = examPaperController.getAllExamDiffculty();
		System.out.println(json);
	}
		
	
	@Test
	public void getAllExamQuesAnswerNum()
	{
		JsonResult<List<String>> json = examPaperController.getAllExamQuesAnswerNum();
		System.out.println(json);
	}
	
	
	@Test
	public void getAllExamQuesAnswerTime()
	{
		JsonResult<List<String>> json = examPaperController.getAllExamQuesAnswerTime();
		System.out.println(json);
	}

	
	@Test
	public void getAllExamQuesWeight()
	{
		JsonResult<List<String>> json = examPaperController.getAllExamQuesWeight();
		System.out.println(json);
	}

	
	@Test
	public void getAllQuestionType()
	{
		JsonResult<List<String>> json = examPaperController.getAllQuestionType();
		System.out.println(json);
	}
	*/
	
	@Test
	public void getAllExamQuesByTitle()
	{
		//String title = "泰迪";
		String title = "111";
		JsonResult<List<ExamPaper>> returnListExam  = examPaperController.getAllExamQuesByTitle(title);
		System.out.println(returnListExam);
	}
}
