package com.gm.modal;
import javax.persistence.Column;
import javax.persistence.Embeddable;

 
@Embeddable
public class UserToSurveyId implements java.io.Serializable {

	private int userId;
	private int surveyId;

	public UserToSurveyId() {
	}

	public UserToSurveyId(int userId, int surveyId) {
		this.userId = userId;
		this.surveyId = surveyId;
	}

	@Column(name = "USER_ID")
	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	@Column(name = "SURVEY_ID")
	public int getSurveyId() {
		return this.surveyId;
	}

	public void setSurveyId(int surveyId) {
		this.surveyId = surveyId;
	}

	

	 

}
