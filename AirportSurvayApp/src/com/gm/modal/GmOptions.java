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
@Table(name = "gm_options", catalog = "airportsurveydb")
public class GmOptions implements java.io.Serializable {

	@Id
	@Column(name = "OPTION_ID", unique = true, nullable = false)
	private int optionId;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "QUESTION_TYPE_ID")
	private GmQuestionTypeMaster gmQuestionTypeMaster;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "gmOptions")
	private List<GmAnswers> gmAnswerses = new ArrayList<GmAnswers>();

	public GmOptions() {
	}

	public GmOptions(int optionId) {
		this.optionId = optionId;
	}

	public GmOptions(int optionId, GmQuestionTypeMaster gmQuestionTypeMaster,
			List<GmAnswers> gmAnswerses) {
		this.optionId = optionId;
		this.gmQuestionTypeMaster = gmQuestionTypeMaster;
		this.gmAnswerses = gmAnswerses;
	}

	public int getOptionId() {
		return this.optionId;
	}

	public void ListOptionId(int optionId) {
		this.optionId = optionId;
	}

	public GmQuestionTypeMaster getGmQuestionTypeMaster() {
		return this.gmQuestionTypeMaster;
	}

	public void ListGmQuestionTypeMaster(
			GmQuestionTypeMaster gmQuestionTypeMaster) {
		this.gmQuestionTypeMaster = gmQuestionTypeMaster;
	}

	public List<GmAnswers> getGmAnswerses() {
		return this.gmAnswerses;
	}

	public void ListGmAnswerses(List<GmAnswers> gmAnswerses) {
		this.gmAnswerses = gmAnswerses;
	}

}
