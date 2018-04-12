package cn.soa.examsystem.test.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import cn.soa.examsystem.dao.ExamPaperDao;
import cn.soa.examsystem.dao.ExamRoomDao;
import cn.soa.examsystem.entity.Examroom;



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
	@Test
	public void addExamroom()
	{
		Examroom examroom = new Examroom();
		examroom.setExamroom_id("213");
		examroom.setExamroom_create_time("2018-4-12 00:00:00");
		examroom.setExamroom_create_person("张三");
		examroom.setExamroom_begin_time("2018-4-12 00:00:00");
		examroom.setExamroom_end_time("2018-4-12 00:00:00");
		examroom.setExamroom_place("第一考场");
		examroom.setExamroom_max_person(123);
		examroom.setExamroom_name("01考场");
		examroom.setExamroom_lock_status("off");
		Integer num= examRoomDao.addExamroom(examroom);
		System.out.println(num);
	}
}
