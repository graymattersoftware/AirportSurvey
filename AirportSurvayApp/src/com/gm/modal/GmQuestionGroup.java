package com.gm.modal;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "gm_question_group", catalog = "airportsurveydb")
public class GmQuestionGroup implements java.io.Serializable {

	@Id
	@Column(name = "QUESTION_GROUP_ID", unique = true, nullable = false)
	private int questionGroupId;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "SURVEY_ID")
	private GmSurveyMaster gmSurveyMaster;

	@Column(name = "GROUP_NAME")
	private String groupName;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "gmQuestionGroup")
	private List<GmQuestions> gmQuestionses = new ArrayList<GmQuestions>();

	public GmQuestionGroup() {
	}

	public GmQuestionGroup(int questionGroupId) {
		this.questionGroupId = questionGroupId;
	}

	public GmQuestionGroup(int questionGroupId, GmSurveyMaster gmSurveyMaster,
			String groupName, List<GmQuestions> gmQuestionses) {
		this.questionGroupId = questionGroupId;
		this.gmSurveyMaster = gmSurveyMaster;
		this.groupName = groupName;
		this.gmQuestionses = gmQuestionses;
	}

	public int getQuestionGroupId() {
		return this.questionGroupId;
	}

	public void ListQuestionGroupId(int questionGroupId) {
		this.questionGroupId = questionGroupId;
	}

	public GmSurveyMaster getGmSurveyMaster() {
		return this.gmSurveyMaster;
	}

	public void ListGmSurveyMaster(GmSurveyMaster gmSurveyMaster) {
		this.gmSurveyMaster = gmSurveyMaster;
	}

	public String getGroupName() {
		return this.groupName;
	}

	public void ListGroupName(String groupName) {
		this.groupName = groupName;
	}

	public List<GmQuestions> getGmQuestionses() {
		return this.gmQuestionses;
	}

	public void ListGmQuestionses(List<GmQuestions> gmQuestionses) {
		this.gmQuestionses = gmQuestionses;
	}

}
