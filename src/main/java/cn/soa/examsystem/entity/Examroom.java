
    /**  
    * @Title: Examroom.java
    * @Package cn.soa.examsystem.entity
    * @Description: TODO(用一句话描述该文件做什么)
    * @author zhugang
    * @date 2018年4月11日
    * @version V1.0  
    */
    
package cn.soa.examsystem.entity;

import java.io.Serializable;
import java.util.Date;

/**
    * @ClassName: Examroom
    * @Description: TODO(这里用一句话描述这个类的作用)
    * @author zhugang
    * @date 2018年4月11日
    *
    */

public class Examroom implements Serializable {
	    /**
	    * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么)
	    */
	private static final long serialVersionUID = -7445778764167492316L;
	//考场ID
	private String examroom_id;  
	//考卷ID
	private String exam_id;
	//考场创建时间
	private String examroom_create_time; 
	//创建人
	private String examroom_create_person;
	//修改时间
	private String examroom_midify_time;
	//开考时间
	private String examroom_begin_time; 
	//结束时间
	private String examroom_end_time;
	//考场地点
	private String examroom_place;
	//最大容纳考生数量
	private Integer examroom_max_person;
	//考场名称
	private String examroom_name;
	//是否锁定考场
	private String examroom_lock_status;
	public String getExamroom_id() {
		return examroom_id;
	}
	public void setExamroom_id(String examroom_id) {
		this.examroom_id = examroom_id;
	}
	public String getExam_id() {
		return exam_id;
	}
	public void setExam_id(String exam_id) {
		this.exam_id = exam_id;
	}
	public String getExamroom_create_time() {
		return examroom_create_time;
	}
	public void setExamroom_create_time(String examroom_create_time) {
		this.examroom_create_time = examroom_create_time;
	}
	public String getExamroom_create_person() {
		return examroom_create_person;
	}
	public void setExamroom_create_person(String examroom_create_person) {
		this.examroom_create_person = examroom_create_person;
	}
	public String getExamroom_midify_time() {
		return examroom_midify_time;
	}
	public void setExamroom_midify_time(String examroom_midify_time) {
		this.examroom_midify_time = examroom_midify_time;
	}
	public String getExamroom_begin_time() {
		return examroom_begin_time;
	}
	public void setExamroom_begin_time(String examroom_begin_time) {
		this.examroom_begin_time = examroom_begin_time;
	}
	public String getExamroom_end_time() {
		return examroom_end_time;
	}
	public void setExamroom_end_time(String examroom_end_time) {
		this.examroom_end_time = examroom_end_time;
	}
	public String getExamroom_place() {
		return examroom_place;
	}
	public void setExamroom_place(String examroom_place) {
		this.examroom_place = examroom_place;
	}
	public Integer getExamroom_max_person() {
		return examroom_max_person;
	}
	public void setExamroom_max_person(Integer examroom_max_person) {
		this.examroom_max_person = examroom_max_person;
	}
	public String getExamroom_name() {
		return examroom_name;
	}
	public void setExamroom_name(String examroom_name) {
		this.examroom_name = examroom_name;
	}
	public String getExamroom_lock_status() {
		return examroom_lock_status;
	}
	public void setExamroom_lock_status(String examroom_lock_status) {
		this.examroom_lock_status = examroom_lock_status;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((exam_id == null) ? 0 : exam_id.hashCode());
		result = prime * result + ((examroom_begin_time == null) ? 0 : examroom_begin_time.hashCode());
		result = prime * result + ((examroom_create_person == null) ? 0 : examroom_create_person.hashCode());
		result = prime * result + ((examroom_create_time == null) ? 0 : examroom_create_time.hashCode());
		result = prime * result + ((examroom_end_time == null) ? 0 : examroom_end_time.hashCode());
		result = prime * result + ((examroom_id == null) ? 0 : examroom_id.hashCode());
		result = prime * result + ((examroom_lock_status == null) ? 0 : examroom_lock_status.hashCode());
		result = prime * result + ((examroom_max_person == null) ? 0 : examroom_max_person.hashCode());
		result = prime * result + ((examroom_midify_time == null) ? 0 : examroom_midify_time.hashCode());
		result = prime * result + ((examroom_name == null) ? 0 : examroom_name.hashCode());
		result = prime * result + ((examroom_place == null) ? 0 : examroom_place.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Examroom other = (Examroom) obj;
		if (exam_id == null) {
			if (other.exam_id != null)
				return false;
		} else if (!exam_id.equals(other.exam_id))
			return false;
		if (examroom_begin_time == null) {
			if (other.examroom_begin_time != null)
				return false;
		} else if (!examroom_begin_time.equals(other.examroom_begin_time))
			return false;
		if (examroom_create_person == null) {
			if (other.examroom_create_person != null)
				return false;
		} else if (!examroom_create_person.equals(other.examroom_create_person))
			return false;
		if (examroom_create_time == null) {
			if (other.examroom_create_time != null)
				return false;
		} else if (!examroom_create_time.equals(other.examroom_create_time))
			return false;
		if (examroom_end_time == null) {
			if (other.examroom_end_time != null)
				return false;
		} else if (!examroom_end_time.equals(other.examroom_end_time))
			return false;
		if (examroom_id == null) {
			if (other.examroom_id != null)
				return false;
		} else if (!examroom_id.equals(other.examroom_id))
			return false;
		if (examroom_lock_status == null) {
			if (other.examroom_lock_status != null)
				return false;
		} else if (!examroom_lock_status.equals(other.examroom_lock_status))
			return false;
		if (examroom_max_person == null) {
			if (other.examroom_max_person != null)
				return false;
		} else if (!examroom_max_person.equals(other.examroom_max_person))
			return false;
		if (examroom_midify_time == null) {
			if (other.examroom_midify_time != null)
				return false;
		} else if (!examroom_midify_time.equals(other.examroom_midify_time))
			return false;
		if (examroom_name == null) {
			if (other.examroom_name != null)
				return false;
		} else if (!examroom_name.equals(other.examroom_name))
			return false;
		if (examroom_place == null) {
			if (other.examroom_place != null)
				return false;
		} else if (!examroom_place.equals(other.examroom_place))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Examroom [examroom_id=" + examroom_id + ", exam_id=" + exam_id + ", examroom_create_time="
				+ examroom_create_time + ", examroom_create_person=" + examroom_create_person
				+ ", examroom_midify_time=" + examroom_midify_time + ", examroom_begin_time=" + examroom_begin_time
				+ ", examroom_end_time=" + examroom_end_time + ", examroom_place=" + examroom_place
				+ ", examroom_max_person=" + examroom_max_person + ", examroom_name=" + examroom_name
				+ ", examroom_lock_status=" + examroom_lock_status + "]";
	}
}
