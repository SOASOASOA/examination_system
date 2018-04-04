
    /**  
    * @Title: QuestionType.java
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
    * @ClassName: QuestionType
    * @Description: ��������ʵ����
    * @author zhugang
    * @date 2018��4��1��
    *
    */

public class QuestionType implements Serializable{

	
	    /**
	    * @Fields serialVersionUID : x���л�
	    */
	    
	private static final long serialVersionUID = 1L;
	
	    /**
	    * @Fields id : ��������ID
	    */
	    
	private String id;
	
	    /**
	    * @Fields name : ��������
	    */
	    
	private String name;
	
	    /**
	    * @Fields createTime : ���ⴴ��ʱ��
	    */
	    
	private Date createTime;
	
	    /**
	    * @Fields modifyTime : �����޸�ʱ��
	    */
	    
	private Date modifyTime;
	
	    /**
	    * @Fields createPerson : ���ⴴ����
	    */
	    
	private String createPerson;

		
	    /**
	     * ����һ���µ�ʵ�� QuestionType.
	     *
	     */
	    
	public QuestionType() {
		super();
		// TODO Auto-generated constructor stub
	}

	    /**
	     * ����һ���µ�ʵ�� QuestionType.
	     *
	     * @param id
	     * @param name
	     * @param createTime
	     * @param modifyTime
	     * @param createPerson
	     */
	    
	public QuestionType(String id, String name, Date createTime,
			Date modifyTime, String createPerson) {
		super();
		this.id = id;
		this.name = name;
		this.createTime = createTime;
		this.modifyTime = modifyTime;
		this.createPerson = createPerson;
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
	* @return createPerson
	*/
	
	public String getCreatePerson() {
		return createPerson;
	}

	
	/**
	 * @param createPerson the createPerson to set
	 */
	
	public void setCreatePerson(String createPerson) {
		this.createPerson = createPerson;
	}

	
	    /* (�� Javadoc)
	    * 
	    * 
	    * @return
	    * @see java.lang.Object#toString()
	    */
	    
	@Override
	public String toString() {
		return "QuestionType [id=" + id + ", name=" + name + ", createTime="
				+ createTime + ", modifyTime=" + modifyTime + ", createPerson="
				+ createPerson + "]";
	}

}
