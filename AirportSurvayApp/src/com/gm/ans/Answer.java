 
 

package com.gm.ans;

import org.codehaus.jackson.annotate.JsonProperty;

public class Answer {

	@JsonProperty("sid")
	private java.lang.String sid;

	@JsonProperty("name")
	private java.lang.String name;
	
	@JsonProperty("qid")
	private java.lang.String qid;


	@JsonProperty("questionGroup")
	private QuestionGroup [] questiongroup;

	public void setSid(java.lang.String sid) {
		this.sid = sid;
	}

	public java.lang.String getSid() {
		return sid;
	}

	public void setName(java.lang.String name) {
		this.name = name;
	}

	public java.lang.String getName() {
		return name;
	}

	public void setQuestiongroup(QuestionGroup[] questiongroup) {
		this.questiongroup = questiongroup;
	}

	public QuestionGroup[] getQuestiongroup() {
		return questiongroup;
	}

}