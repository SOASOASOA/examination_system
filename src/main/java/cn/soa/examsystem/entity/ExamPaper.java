
    /**  
    * @Title: ExamPaper.java
    * @Package cn.soa.examsystem.entity
    * @Description: TODO(��һ�仰�������ļ���ʲô)
    * @author zhugang
    * @date 2018��3��27��
    * @version V1.0  
    */
    
package cn.soa.examsystem.entity;

import java.io.Serializable;
import java.util.Date;

/**
    * @ClassName: ExamPaper
    * @Description: ����ʵ����
    * @author zhugang
    * @date 2018��3��27��
    *
    */

public class ExamPaper implements Serializable{

	
	
	
	    /**
	    * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么)
	    */
	    
	private static final long serialVersionUID = -8111316682063891413L;
	private	String	id;
	private String  qsid;
	private	Date	createTime;
	private	String	createPerson;
	private	Date	modifyTime;
	private	String	name;
	private	String	title;
	private	Integer	difficulty;
	private	Integer	evaluate;
	private	Integer	weight;
	private	Integer	answerTime;
	private	Integer	answerNum;
	private	Integer	type;
	private	String	rightAnswer1;
	private	String	rightAnswer2;
	private	String	rightAnswer3;
	private	String	rightAnswer4;
	private	String	rightAnswer5;
	private	String	wrongAnswer1;
	private	String	wrongAnswer2;
	private	String	wrongAnswer3;
	private	String	wrongAnswer4;
	private	String	wrongAnswer5;
	private	String	wrongAnswer6;
	private	String	wrongAnswer7;
	private	String	wrongAnswer8;
	private	Integer	caseSensitivity;
	private	Integer	allowSpace;
	private	String	analysis;
	private	Integer	share;
	private	Integer	importantLevel;
	
	    /**
	     * ����һ���µ�ʵ�� ExamPaper.
	     *
	     */
	    
	public ExamPaper() {
		super();
		// TODO Auto-generated constructor stub
	}

		
		    /**
		     * ����һ���µ�ʵ�� ExamPaper.
		     *
		     * @param id
		     * @param qsid
		     * @param createTime
		     * @param createPerson
		     * @param modifyTime
		     * @param name
		     * @param title
		     * @param difficuty
		     * @param evaluate
		     * @param weight
		     * @param answerTime
		     * @param answerNum
		     * @param type
		     * @param rightAnswer1
		     * @param rightAnswer2
		     * @param rightAnswer3
		     * @param rightAnswer4
		     * @param rightAnswer5
		     * @param wrongAnswer1
		     * @param wrongAnswer2
		     * @param wrongAnswer3
		     * @param wrongAnswer4
		     * @param wrongAnswer5
		     * @param wrongAnswer6
		     * @param wrongAnswer7
		     * @param wrongAnswer8
		     * @param caseSensitivity
		     * @param allowSpace
		     * @param analysis
		     * @param share
		     * @param importantLevel
		     */
		    
		public ExamPaper(String id, String qsid, Date createTime, String createPerson, Date modifyTime, String name,
				String title, Integer difficulty, Integer evaluate, Integer weight, Integer answerTime,
				Integer answerNum, Integer type, String rightAnswer1, String rightAnswer2, String rightAnswer3,
				String rightAnswer4, String rightAnswer5, String wrongAnswer1, String wrongAnswer2, String wrongAnswer3,
				String wrongAnswer4, String wrongAnswer5, String wrongAnswer6, String wrongAnswer7, String wrongAnswer8,
				Integer caseSensitivity, Integer allowSpace, String analysis, Integer share, Integer importantLevel) {
			super();
			this.id = id;
			this.qsid = qsid;
			this.createTime = createTime;
			this.createPerson = createPerson;
			this.modifyTime = modifyTime;
			this.name = name;
			this.title = title;
			this.difficulty = difficulty;
			this.evaluate = evaluate;
			this.weight = weight;
			this.answerTime = answerTime;
			this.answerNum = answerNum;
			this.type = type;
			this.rightAnswer1 = rightAnswer1;
			this.rightAnswer2 = rightAnswer2;
			this.rightAnswer3 = rightAnswer3;
			this.rightAnswer4 = rightAnswer4;
			this.rightAnswer5 = rightAnswer5;
			this.wrongAnswer1 = wrongAnswer1;
			this.wrongAnswer2 = wrongAnswer2;
			this.wrongAnswer3 = wrongAnswer3;
			this.wrongAnswer4 = wrongAnswer4;
			this.wrongAnswer5 = wrongAnswer5;
			this.wrongAnswer6 = wrongAnswer6;
			this.wrongAnswer7 = wrongAnswer7;
			this.wrongAnswer8 = wrongAnswer8;
			this.caseSensitivity = caseSensitivity;
			this.allowSpace = allowSpace;
			this.analysis = analysis;
			this.share = share;
			this.importantLevel = importantLevel;
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
			* @return qsid
			*/
			
			public String getQsid() {
				return qsid;
			}


			
			/**
			 * @param qsid the qsid to set
			 */
			
			public void setQsid(String qsid) {
				this.qsid = qsid;
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
			* @return title
			*/
			
			public String getTitle() {
				return title;
			}


			
			/**
			 * @param title the title to set
			 */
			
			public void setTitle(String title) {
				this.title = title;
			}


			
			/**
			* @return difficulty
			*/
			
			public Integer getDifficuty() {
				return difficulty;
			}


			
			/**
			 * @param difficuty the difficuty to set
			 */
			
			public void setDifficuty(Integer difficulty) {
				this.difficulty = difficulty;
			}


			
			/**
			* @return evaluate
			*/
			
			public Integer getEvaluate() {
				return evaluate;
			}


			
			/**
			 * @param evaluate the evaluate to set
			 */
			
			public void setEvaluate(Integer evaluate) {
				this.evaluate = evaluate;
			}


			
			/**
			* @return weight
			*/
			
			public Integer getWeight() {
				return weight;
			}


			
			/**
			 * @param weight the weight to set
			 */
			
			public void setWeight(Integer weight) {
				this.weight = weight;
			}


			
			/**
			* @return answerTime
			*/
			
			public Integer getAnswerTime() {
				return answerTime;
			}


			
			/**
			 * @param answerTime the answerTime to set
			 */
			
			public void setAnswerTime(Integer answerTime) {
				this.answerTime = answerTime;
			}


			
			/**
			* @return answerNum
			*/
			
			public Integer getAnswerNum() {
				return answerNum;
			}


			
			/**
			 * @param answerNum the answerNum to set
			 */
			
			public void setAnswerNum(Integer answerNum) {
				this.answerNum = answerNum;
			}


			
			/**
			* @return type
			*/
			
			public Integer getType() {
				return type;
			}


			
			/**
			 * @param type the type to set
			 */
			
			public void setType(Integer type) {
				this.type = type;
			}


			
			/**
			* @return rightAnswer1
			*/
			
			public String getRightAnswer1() {
				return rightAnswer1;
			}


			
			/**
			 * @param rightAnswer1 the rightAnswer1 to set
			 */
			
			public void setRightAnswer1(String rightAnswer1) {
				this.rightAnswer1 = rightAnswer1;
			}


			
			/**
			* @return rightAnswer2
			*/
			
			public String getRightAnswer2() {
				return rightAnswer2;
			}


			
			/**
			 * @param rightAnswer2 the rightAnswer2 to set
			 */
			
			public void setRightAnswer2(String rightAnswer2) {
				this.rightAnswer2 = rightAnswer2;
			}


			
			/**
			* @return rightAnswer3
			*/
			
			public String getRightAnswer3() {
				return rightAnswer3;
			}


			
			/**
			 * @param rightAnswer3 the rightAnswer3 to set
			 */
			
			public void setRightAnswer3(String rightAnswer3) {
				this.rightAnswer3 = rightAnswer3;
			}


			
			/**
			* @return rightAnswer4
			*/
			
			public String getRightAnswer4() {
				return rightAnswer4;
			}


			
			/**
			 * @param rightAnswer4 the rightAnswer4 to set
			 */
			
			public void setRightAnswer4(String rightAnswer4) {
				this.rightAnswer4 = rightAnswer4;
			}


			
			/**
			* @return rightAnswer5
			*/
			
			public String getRightAnswer5() {
				return rightAnswer5;
			}


			
			/**
			 * @param rightAnswer5 the rightAnswer5 to set
			 */
			
			public void setRightAnswer5(String rightAnswer5) {
				this.rightAnswer5 = rightAnswer5;
			}


			
			/**
			* @return wrongAnswer1
			*/
			
			public String getWrongAnswer1() {
				return wrongAnswer1;
			}


			
			/**
			 * @param wrongAnswer1 the wrongAnswer1 to set
			 */
			
			public void setWrongAnswer1(String wrongAnswer1) {
				this.wrongAnswer1 = wrongAnswer1;
			}


			
			/**
			* @return wrongAnswer2
			*/
			
			public String getWrongAnswer2() {
				return wrongAnswer2;
			}


			
			/**
			 * @param wrongAnswer2 the wrongAnswer2 to set
			 */
			
			public void setWrongAnswer2(String wrongAnswer2) {
				this.wrongAnswer2 = wrongAnswer2;
			}


			
			/**
			* @return wrongAnswer3
			*/
			
			public String getWrongAnswer3() {
				return wrongAnswer3;
			}


			
			/**
			 * @param wrongAnswer3 the wrongAnswer3 to set
			 */
			
			public void setWrongAnswer3(String wrongAnswer3) {
				this.wrongAnswer3 = wrongAnswer3;
			}


			
			/**
			* @return wrongAnswer4
			*/
			
			public String getWrongAnswer4() {
				return wrongAnswer4;
			}


			
			/**
			 * @param wrongAnswer4 the wrongAnswer4 to set
			 */
			
			public void setWrongAnswer4(String wrongAnswer4) {
				this.wrongAnswer4 = wrongAnswer4;
			}


			
			/**
			* @return wrongAnswer5
			*/
			
			public String getWrongAnswer5() {
				return wrongAnswer5;
			}


			
			/**
			 * @param wrongAnswer5 the wrongAnswer5 to set
			 */
			
			public void setWrongAnswer5(String wrongAnswer5) {
				this.wrongAnswer5 = wrongAnswer5;
			}


			
			/**
			* @return wrongAnswer6
			*/
			
			public String getWrongAnswer6() {
				return wrongAnswer6;
			}


			
			/**
			 * @param wrongAnswer6 the wrongAnswer6 to set
			 */
			
			public void setWrongAnswer6(String wrongAnswer6) {
				this.wrongAnswer6 = wrongAnswer6;
			}


			
			/**
			* @return wrongAnswer7
			*/
			
			public String getWrongAnswer7() {
				return wrongAnswer7;
			}


			
			/**
			 * @param wrongAnswer7 the wrongAnswer7 to set
			 */
			
			public void setWrongAnswer7(String wrongAnswer7) {
				this.wrongAnswer7 = wrongAnswer7;
			}


			
			/**
			* @return wrongAnswer8
			*/
			
			public String getWrongAnswer8() {
				return wrongAnswer8;
			}


			
			/**
			 * @param wrongAnswer8 the wrongAnswer8 to set
			 */
			
			public void setWrongAnswer8(String wrongAnswer8) {
				this.wrongAnswer8 = wrongAnswer8;
			}


			
			/**
			* @return caseSensitivity
			*/
			
			public Integer getCaseSensitivity() {
				return caseSensitivity;
			}


			
			/**
			 * @param caseSensitivity the caseSensitivity to set
			 */
			
			public void setCaseSensitivity(Integer caseSensitivity) {
				this.caseSensitivity = caseSensitivity;
			}


			
			/**
			* @return allowSpace
			*/
			
			public Integer getAllowSpace() {
				return allowSpace;
			}


			
			/**
			 * @param allowSpace the allowSpace to set
			 */
			
			public void setAllowSpace(Integer allowSpace) {
				this.allowSpace = allowSpace;
			}


			
			/**
			* @return analysis
			*/
			
			public String getAnalysis() {
				return analysis;
			}


			
			/**
			 * @param analysis the analysis to set
			 */
			
			public void setAnalysis(String analysis) {
				this.analysis = analysis;
			}


			
			/**
			* @return share
			*/
			
			public Integer getShare() {
				return share;
			}


			
			/**
			 * @param share the share to set
			 */
			
			public void setShare(Integer share) {
				this.share = share;
			}


			
			/**
			* @return importantLevel
			*/
			
			public Integer getImportantLevel() {
				return importantLevel;
			}


			
			/**
			 * @param importantLevel the importantLevel to set
			 */
			
			public void setImportantLevel(Integer importantLevel) {
				this.importantLevel = importantLevel;
			}


			
			    /* (�� Javadoc)
			    * 
			    * 
			    * @return
			    * @see java.lang.Object#toString()
			    */
			    
			@Override
			public String toString() {
				return "ExamPaper [id=" + id + ", qsid=" + qsid + ", createTime=" + createTime + ", createPerson="
						+ createPerson + ", modifyTime=" + modifyTime + ", name=" + name + ", title=" + title
						+ ", difficulty=" + difficulty + ", evaluate=" + evaluate + ", weight=" + weight + ", answerTime="
						+ answerTime + ", answerNum=" + answerNum + ", type=" + type + ", rightAnswer1=" + rightAnswer1
						+ ", rightAnswer2=" + rightAnswer2 + ", rightAnswer3=" + rightAnswer3 + ", rightAnswer4="
						+ rightAnswer4 + ", rightAnswer5=" + rightAnswer5 + ", wrongAnswer1=" + wrongAnswer1
						+ ", wrongAnswer2=" + wrongAnswer2 + ", wrongAnswer3=" + wrongAnswer3 + ", wrongAnswer4="
						+ wrongAnswer4 + ", wrongAnswer5=" + wrongAnswer5 + ", wrongAnswer6=" + wrongAnswer6
						+ ", wrongAnswer7=" + wrongAnswer7 + ", wrongAnswer8=" + wrongAnswer8 + ", caseSensitivity="
						+ caseSensitivity + ", allowSpace=" + allowSpace + ", analysis=" + analysis + ", share=" + share
						+ ", importantLevel=" + importantLevel + "]";
			}

		
		  
	
}
