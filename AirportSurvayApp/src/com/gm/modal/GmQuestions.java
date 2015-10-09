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
@Table(name = "gm_questions", catalog = "airportsurveydb")
public class GmQuestions implements java.io.Serializable {

	@Id
	@Column(name = "QUESTION_ID", unique = true, nullable = false)
	private int questionId;
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "QUESTION_GROUP_ID")
	private GmQuestionGroup gmQuestionGroup;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "QUESTION_TYPE_ID")
	private GmQuestionTypeMaster gmQuestionTypeMaster;
	
	@Column(name = "QUESTION_NAME")
	private String questionName;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "gmQuestions")
	private List<GmAnswers> gmAnswerses = new ArrayList<GmAnswers>();

	public GmQuestions() {
	}

	public GmQuestions(int questionId) {
		this.questionId = questionId;
	}

	public GmQuestions(int questionId, GmQuestionGroup gmQuestionGroup,
			GmQuestionTypeMaster gmQuestionTypeMaster, String questionName,
			List<GmAnswers> gmAnswerses) {
		this.questionId = questionId;
		this.gmQuestionGroup = gmQuestionGroup;
		this.gmQuestionTypeMaster = gmQuestionTypeMaster;
		this.questionName = questionName;
		this.gmAnswerses = gmAnswerses;
	}

	public int getQuestionId() {
		return this.questionId;
	}

	public void ListQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public GmQuestionGroup getGmQuestionGroup() {
		return this.gmQuestionGroup;
	}

	public void ListGmQuestionGroup(GmQuestionGroup gmQuestionGroup) {
		this.gmQuestionGroup = gmQuestionGroup;
	}

	public GmQuestionTypeMaster getGmQuestionTypeMaster() {
		return this.gmQuestionTypeMaster;
	}

	public void ListGmQuestionTypeMaster(
			GmQuestionTypeMaster gmQuestionTypeMaster) {
		this.gmQuestionTypeMaster = gmQuestionTypeMaster;
	}

	public String getQuestionName() {
		return this.questionName;
	}

	public void ListQuestionName(String questionName) {
		this.questionName = questionName;
	}

	public List<GmAnswers> getGmAnswerses() {
		return this.gmAnswerses;
	}

	public void ListGmAnswerses(List<GmAnswers> gmAnswerses) {
		this.gmAnswerses = gmAnswerses;
	}

}
