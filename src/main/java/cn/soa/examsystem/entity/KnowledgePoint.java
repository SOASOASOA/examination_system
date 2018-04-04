
    /**  
    * @Title: KnowledgePoint.java
    * @Package cn.soa.examsystem.entity
    * @Description: TODO(用一句话描述该文件做什么)
    * @author zhugang
    * @date 2018年4月1日
    * @version V1.0  
    */
    
package cn.soa.examsystem.entity;

import java.io.Serializable;
import java.util.Date;

/**
    * @ClassName: KnowledgePoint
    * @Description: 知识点实体咧
    * @author zhugang
    * @date 2018年4月1日
    *
    */

public class KnowledgePoint implements Serializable{

	
	    /**
	    * @Fields serialVersionUID : 序列化
	    */
	    
	private static final long serialVersionUID = 1L;
	
	    /**
	    * @Fields id : 知识点ID
	    */
	    
	private String id;
	
	    /**
	    * @Fields name : 知识点名称
	    */
	    
	private String name;
	
	    /**
	    * @Fields createTime : 知识点创建时间
	    */
	    
	private Date createTime;
	
	    /**
	    * @Fields modifyTime : 知识点修改时间
	    */
	    
	private Date modifyTime;
	
	    /**
	    * @Fields fatherID : 父节点ID
	    */
	    
	private String fatherID;
	
	    /**
	    * @Fields createPerson : 知识点创建人
	    */
	    
	private String createPerson;
	
	    /**
	    * @Fields modifyPerson : 知识点修改人
	    */
	    
	private String modifyPerson;

	
	    /**
	     * 创建一个新的实例 KnowledgePoint.
	     *
	     */
	    
	public KnowledgePoint() {
		super();
		// TODO Auto-generated constructor stub
	}


		
	    /**
	     * 创建一个新的实例 KnowledgePoint.
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



	
	    /* (非 Javadoc)
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
