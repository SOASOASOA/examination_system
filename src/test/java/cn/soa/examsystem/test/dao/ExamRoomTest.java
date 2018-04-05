package cn.soa.examsystem.test.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import cn.soa.examsystem.dao.ExamPaperDao;
import cn.soa.examsystem.dao.ExamRoomDao;



public class ExamRoomTest extends BaseTest{	
	
	private ExamRoomDao examRoomDao;
	
	@Before
	public void initUserDao(){
		examRoomDao = ctx.getBean("examRoomDao",ExamRoomDao.class);
	}
	
	@Test
	public void findAllExaminPaper()
	{
		List<Map<String, Object>> findAllExaminPaper = examRoomDao.findAllExaminPaper(2, 3);
		for (Map<String, Object> map : findAllExaminPaper) {
			System.out.println(map);
		}
	}
}
