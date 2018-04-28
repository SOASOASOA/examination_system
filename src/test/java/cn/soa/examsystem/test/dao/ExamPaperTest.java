package cn.soa.examsystem.test.dao;

import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import cn.soa.examsystem.dao.ExamPaperDao;



public class ExamPaperTest extends BaseTest{	
	
	private ExamPaperDao examPaperDao;
	
	@Before
	public void initUserDao(){
		examPaperDao = ctx.getBean("examPaperDao",ExamPaperDao.class);
	}
	/*
	@Test
	public void getUserAllOWnedExamPaper()
	{
		String userAccount = "����";
		String dBFieldName = "EXAMQUES_CREATE_PERSON";
		List<ExamPaper> list = examPaperDao.getUserAllOWnedExamPaper(userAccount, dBFieldName);
		System.out.println(list);
	}
	
	@Test
	public void getUserAllOWnedExamPaper()
	{
		Map<String, String> map = new HashMap<String, String>();
		map.put("EXAMQUES_NAME", "������");
		map.put("EXAMQUES_CREATE_PERSON", "����");
		List<ExamPaper> list = examPaperDao.getExamPaperByLimitContition(map);
		System.out.println(list);
	}
	
	
	@Test
	public void getAllSubject()
	{
		List<Subject> list = examPaperDao.getAllSubject();
		System.out.println(list);
	}
	
	
	@Test
	public void getKnowledgePointBySubject()
	{
		String subject = "��������";
		List<KnowledgePoint> list = examPaperDao.getKnowledgePointBySubject(subject);
		System.out.println(list);
	}
	
	@Test
	public void getKnowledgePointBySubject()
	{
		String fatherKnowledgeID = "02d72193-ef0a-7027-b709-543d6c95ce63";
		List<KnowledgePoint> list = examPaperDao.getKnowledgePointByItsFatherID(fatherKnowledgeID);
		System.out.println(list);
	}
	

	@Test
	public void getAllExamQuestionType()
	{
		List<QuestionType> list = examPaperDao.getAllExamQuestionType();
		System.out.println(list);
	}
	
	
	@Test
	public void getAllExamQuesweight()
	{
		List<String> list = examPaperDao.getAllExamQuesweight();
		System.out.println(list);
	}
	
	
	@Test
	public void getAllExamQuesAnswerTime()
	{
		List<String> list = examPaperDao.getAllExamQuesAnswerTime();
		System.out.println(list);
	}
	
	
	@Test
	public void getAllExamQuesAnswerNum()
	{
		List<String> list = examPaperDao.getAllExamQuesAnswerNum();
		System.out.println(list);
	}

	
	@Test
	public void getAllExamDiffculty()
	{
		List<String> list = examPaperDao.getAllExamDiffculty();
		System.out.println(list);
	}
	
	
	@Test
	public void getAllExamEvaluate()
	{
		List<String> list = examPaperDao.getAllExamEvaluate();
		System.out.println(list);
	}
	
	
	@Test
	public void getAllExamEvaluate()
	{
		List<String> list = examPaperDao.getAllExamType();
		System.out.println(list);
	}
	
	
	@Test
	public void getAllExamQuesByTitle()
	{
		String title = "111迪";
		List<ExamPaper> list = examPaperDao.getAllExamQuesByTitle(title);
		for(ExamPaper e: list) {
			System.out.println(e);
		}
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println(list);
	}*/
	
	@Test
	public void changeExamQuesValue()
	{
		String id="30023f08-611c-5533-cb09-d14d7ea5d85f";
		Map<String, String> map = new HashMap<String, String>();
		map.put("EXAMQUES_NAME", "智力题");
		int i = examPaperDao.changeExamQuesValue(id, map);
		System.out.println(i);
	}
}
