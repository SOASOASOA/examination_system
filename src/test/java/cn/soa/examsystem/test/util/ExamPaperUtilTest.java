package cn.soa.examsystem.test.util;

import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import cn.soa.examsystem.test.dao.BaseTest;
import cn.soa.examsystem.util.ExamPaperUtils;
import cn.soa.examsystem.util.PropertiesUtils;



public class ExamPaperUtilTest extends BaseTest{	
	
	private PropertiesUtils propertiesUtils;
	private ExamPaperUtils examPaperUtils;
	
	@Before
	public void initUserDao(){
		examPaperUtils = ctx.getBean("examPaperUtils",ExamPaperUtils.class);
		propertiesUtils = ctx.getBean("propertiesUtils",PropertiesUtils.class);
	}
	
	/*
	@Test
	public void transferEntityIntoMap()
	{
		Map<String, String> testMap = new HashMap<String, String>();
		testMap.put("1", "1");
		testMap.put("2", "");
		testMap.put("3", "3");
		Map<String, String> map = ExamPaperUtils.removeValueNullInMap(testMap);
		System.out.println(map);
	}
	
	
	@Test
	public void transferNameMatchSQLInMap()
	{
		Map<String, String> testMap = new HashMap<String, String>();
		testMap.put("1", "1");
		testMap.put("2", "");
		testMap.put("3", "3");
		System.out.println(propertiesUtils.examPaperMap);
		System.out.println(propertiesUtils.s);
		System.out.println(propertiesUtils.examPaperProperties);
	}
	*/
	
	@Test
	public void transferNameMatchSQLInMap()
	{
		Map<String, String> testMap = new HashMap<String, String>();
		testMap.put("id", "1");
		testMap.put("title", "���");
		testMap.put("aaa", "bbb");
		Map<String, String> map = examPaperUtils.transferNameMatchSQLInMap(testMap);
		System.out.println(map);
	}
	
}
