
    /**  
    * @Title: Tree.java
    * @Package cn.soa.examsystem.entity
    * @Description: TODO(用一句话描述该文件做什么)
    * @author zhugang
    * @date 2018年4月28日
    * @version V1.0  
    */
    
package cn.soa.examsystem.entity;

import java.io.Serializable;

/**
    * @ClassName: Tree
    * @Description: 树的实体类
    * @author hezy
    * @date 2018年4月28日
    *
    */

public class Tree implements Serializable {
	    /**
	    * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么)
	    */
	    
	private static final long serialVersionUID = -3323701056266223507L;
	
	private String id;
	private String pid;
	private String name;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((pid == null) ? 0 : pid.hashCode());
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
		Tree other = (Tree) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (pid == null) {
			if (other.pid != null)
				return false;
		} else if (!pid.equals(other.pid))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Tree [id=" + id + ", pid=" + pid + ", name=" + name + "]";
	}
	
	
}
