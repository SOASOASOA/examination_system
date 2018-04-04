
    /**  
    * @Title: Subject.java
    * @Package cn.soa.examsystem.entity
    * @Description: TODO(��һ�仰�������ļ���ʲô)
    * @author zhugang
    * @date 2018��4��1��
    * @version V1.0  
    */
    
package cn.soa.examsystem.entity;

import java.io.Serializable;
import java.util.Date;

/**
    * @ClassName: Subject
    * @Description: �����Ŀʵ����
    * @author zhugang
    * @date 2018��4��1��
    *
    */

public class Subject implements Serializable{

	
	    /**
	    * @Fields serialVersionUID : ���л�
	    */
	    
	private static final long serialVersionUID = 118L;
	
	    /**
	    * @Fields id : ��ĿΨһ��ʶ
	    */
	    
	private String	id;
	
	    /**
	    * @Fields name : ��Ŀ����
	    */
	    
	private String	name;
	
	    /**
	    * @Fields createTime : ��Ŀ����ʱ��
	    */
	    
	private Date createTime;
	
	    /**
	    * @Fields modifyTime : ��Ŀ�޸�ʱ��
	    */
	    
	private Date	modifyTime;
	
	    /**
	    * @Fields state : ��Ŀ״̬
	    */
	    
	private Integer	state;

		
	    /**
	     * ����һ���µ�ʵ�� Subject.
	     *
	     */
		    
	public Subject() {
		super();
		// TODO Auto-generated constructor stub
	}


		
	    /**
	     * ����һ���µ�ʵ�� Subject.
	     *
	     * @param id
	     * @param name
	     * @param createTime
	     * @param modifyTime
	     * @param state
	     */
	    
	public Subject(String id, String name, Date createTime,
			Date modifyTime, Integer state) {
		super();
		this.id = id;
		this.name = name;
		this.createTime = createTime;
		this.modifyTime = modifyTime;
		this.state = state;
	}



	
	/**
	* @return id
	*/
	
	public String getId() {
		return id;
	}



	
	/**
	 * @param id the id to set
	 */
	
	public void setId(String id) {
		this.id = id;
	}



	
	/**
	* @return name
	*/
	
	public String getName() {
		return name;
	}



	
	/**
	 * @param name the name to set
	 */
	
	public void setName(String name) {
		this.name = name;
	}



	
	/**
	* @return createTime
	*/
	
	public Date getCreateTime() {
		return createTime;
	}



	
	/**
	 * @param createTime the createTime to set
	 */
	
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}



	
	/**
	* @return modifyTime
	*/
	
	public Date getModifyTime() {
		return modifyTime;
	}



	
	/**
	 * @param modifyTime the modifyTime to set
	 */
	
	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}



	
	/**
	* @return state
	*/
	
	public Integer getState() {
		return state;
	}



	
	/**
	 * @param state the state to set
	 */
	
	public void setState(Integer state) {
		this.state = state;
	}



	
	    /* (�� Javadoc)
	    * 
	    * 
	    * @return
	    * @see java.lang.Object#toString()
	    */
	    
	@Override
	public String toString() {
		return "Subject [id=" + id + ", name=" + name + ", createTime="
				+ createTime + ", modifyTime=" + modifyTime + ", state="
				+ state + "]";
	}


}
