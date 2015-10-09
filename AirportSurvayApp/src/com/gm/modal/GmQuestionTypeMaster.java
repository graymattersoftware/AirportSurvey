package com.gm.modal;

import java.util.ArrayList;
import java.util.List;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "gm_question_type_master", catalog = "airportsurveydb")
public class GmQuestionTypeMaster implements java.io.Serializable {

	@Id
	@Column(name = "QUESTION_TYPE_ID", unique = true, nullable = false)
	private int questionTypeId;

	@Column(name = "QUESTION_TYPE_NAME")
	private String questionTypeName;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "gmQuestionTypeMaster")
	private List<GmQuestions> gmQuestionses = new ArrayList<GmQuestions>( );

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "gmQuestionTypeMaster")
	private List<GmOptions> gmOptionses = new ArrayList<GmOptions>( );

	public GmQuestionTypeMaster() {
	}

	public GmQuestionTypeMaster(int questionTypeId) {
		this.questionTypeId = questionTypeId;
	}

	public GmQuestionTypeMaster(int questionTypeId, String questionTypeName,
			List<GmQuestions> gmQuestionses, List<GmOptions> gmOptionses) {
		this.questionTypeId = questionTypeId;
		this.questionTypeName = questionTypeName;
		this.gmQuestionses = gmQuestionses;
		this.gmOptionses = gmOptionses;
	}

	public int getQuestionTypeId() {
		return this.questionTypeId;
	}

	public void ListQuestionTypeId(int questionTypeId) {
		this.questionTypeId = questionTypeId;
	}

	public String getQuestionTypeName() {
		return this.questionTypeName;
	}

	public void ListQuestionTypeName(String questionTypeName) {
		this.questionTypeName = questionTypeName;
	}

	public List<GmQuestions> getGmQuestionses() {
		return this.gmQuestionses;
	}

	public void ListGmQuestionses(List<GmQuestions> gmQuestionses) {
		this.gmQuestionses = gmQuestionses;
	}

	public List<GmOptions> getGmOptionses() {
		return this.gmOptionses;
	}

	public void ListGmOptionses(List<GmOptions> gmOptionses) {
		this.gmOptionses = gmOptionses;
	}

}
