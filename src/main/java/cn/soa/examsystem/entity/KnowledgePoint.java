
    /**  
    * @Title: KnowledgePoint.java
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
    * @ClassName: KnowledgePoint
    * @Description: ֪ʶ��ʵ����
    * @author zhugang
    * @date 2018��4��1��
    *
    */

public class KnowledgePoint implements Serializable{

	
	    /**
	    * @Fields serialVersionUID : ���л�
	    */
	    
	private static final long serialVersionUID = 1L;
	
	    /**
	    * @Fields id : ֪ʶ��ID
	    */
	    
	private String id;
	
	    /**
	    * @Fields name : ֪ʶ������
	    */
	    
	private String name;
	
	    /**
	    * @Fields createTime : ֪ʶ�㴴��ʱ��
	    */
	    
	private Date createTime;
	
	    /**
	    * @Fields modifyTime : ֪ʶ���޸�ʱ��
	    */
	    
	private Date modifyTime;
	
	    /**
	    * @Fields fatherID : ���ڵ�ID
	    */
	    
	private String fatherID;
	
	    /**
	    * @Fields createPerson : ֪ʶ�㴴����
	    */
	    
	private String createPerson;
	
	    /**
	    * @Fields modifyPerson : ֪ʶ���޸���
	    */
	    
	private String modifyPerson;

	
	    /**
	     * ����һ���µ�ʵ�� KnowledgePoint.
	     *
	     */
	    
	public KnowledgePoint() {
		super();
		// TODO Auto-generated constructor stub
	}


		
	    /**
	     * ����һ���µ�ʵ�� KnowledgePoint.
	     *
	     * @param id
	     * @param name
	     * @param createTime
	     * @param modifyTime
	     * @param fatherID
	     * @param createPerson
	     * @param modifyPerson
	     */
	    
	public KnowledgePoint(String id, String name, Date createTime,
			Date modifyTime, String fatherID, String createPerson,
			String modifyPerson) {
		super();
		this.id = id;
		this.name = name;
		this.createTime = createTime;
		this.modifyTime = modifyTime;
		this.fatherID = fatherID;
		this.createPerson = createPerson;
		this.modifyPerson = modifyPerson;
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
	* @return fatherID
	*/
	
	public String getFatherID() {
		return fatherID;
	}



	
	/**
	 * @param fatherID the fatherID to set
	 */
	
	public void setFatherID(String fatherID) {
		this.fatherID = fatherID;
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



	
	/**
	* @return modifyPerson
	*/
	
	public String getModifyPerson() {
		return modifyPerson;
	}



	
	/**
	 * @param modifyPerson the modifyPerson to set
	 */
	
	public void setModifyPerson(String modifyPerson) {
		this.modifyPerson = modifyPerson;
	}



	
	/**
	* @return serialversionuid
	*/
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}



	
	    /* (�� Javadoc)
	    * 
	    * 
	    * @return
	    * @see java.lang.Object#toString()
	    */
	    
	@Override
	public String toString() {
		return "KnowledgePoint [id=" + id + ", name=" + name + ", createTime="
				+ createTime + ", modifyTime=" + modifyTime + ", fatherID="
				+ fatherID + ", createPerson=" + createPerson
				+ ", modifyPerson=" + modifyPerson + "]";
	}

}
