package com.gm.modal;
import java.util.ArrayList;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

 
@Entity
@Table(name = "gm_survey_master", catalog = "airportsurveydb")
public class GmSurveyMaster implements java.io.Serializable {

	@Id
	@Column(name = "SURVEY_ID", unique = true, nullable = false)
	private int surveyId;

	@Column(name = "SURVEY_NAME" )
	private String surveyName;

	@Column(name = "SURVEY_DESCRIPTION" )
	private String surveyDescription;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "VALID_FRM" )
	private Date validFrm;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "VALID_TO" )
	private Date validTo;
	

	@Column(name = "SURVEY_TYPE" )
	private String surveyType;
	
	@Column(name = "IS_ACTIVE" )
	private String isActive;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "gmSurveyMaster")
	private List<UserToSurvey> userToSurveies = new ArrayList<UserToSurvey>( );

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "gmSurveyMaster")
	private List<GmAnswers> gmAnswerses = new ArrayList<GmAnswers>( );

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "gmSurveyMaster")
	private List<GmQuestionGroup> gmQuestionGroups = new ArrayList<GmQuestionGroup>();

	public GmSurveyMaster() {
	}

	public GmSurveyMaster(int surveyId, String surveyName,
			String surveyDescription, Date validFrm, Date validTo,
			String surveyType, String isActive,
			List<UserToSurvey> userToSurveies, List<GmAnswers> gmAnswerses,
			List<GmQuestionGroup> gmQuestionGroups) {
		this.surveyId = surveyId;
		this.surveyName = surveyName;
		this.surveyDescription = surveyDescription;
		this.validFrm = validFrm;
		this.validTo = validTo;
		this.surveyType = surveyType;
		this.isActive = isActive;
		this.userToSurveies = userToSurveies;
		this.gmAnswerses = gmAnswerses;
		this.gmQuestionGroups = gmQuestionGroups;
	}

	public int getSurveyId() {
		return surveyId;
	}

	public void setSurveyId(int surveyId) {
		this.surveyId = surveyId;
	}

	public String getSurveyName() {
		return surveyName;
	}

	public void setSurveyName(String surveyName) {
		this.surveyName = surveyName;
	}

	public String getSurveyDescription() {
		return surveyDescription;
	}

	public void setSurveyDescription(String surveyDescription) {
		this.surveyDescription = surveyDescription;
	}

	public Date getValidFrm() {
		return validFrm;
	}

	public void setValidFrm(Date validFrm) {
		this.validFrm = validFrm;
	}

	public Date getValidTo() {
		return validTo;
	}

	public void setValidTo(Date validTo) {
		this.validTo = validTo;
	}

	public String getSurveyType() {
		return surveyType;
	}

	public void setSurveyType(String surveyType) {
		this.surveyType = surveyType;
	}

	public String getIsActive() {
		return isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	public List<UserToSurvey> getUserToSurveies() {
		return userToSurveies;
	}

	public void setUserToSurveies(List<UserToSurvey> userToSurveies) {
		this.userToSurveies = userToSurveies;
	}

	public List<GmAnswers> getGmAnswerses() {
		return gmAnswerses;
	}

	public void setGmAnswerses(List<GmAnswers> gmAnswerses) {
		this.gmAnswerses = gmAnswerses;
	}

	public List<GmQuestionGroup> getGmQuestionGroups() {
		return gmQuestionGroups;
	}

	public void setGmQuestionGroups(List<GmQuestionGroup> gmQuestionGroups) {
		this.gmQuestionGroups = gmQuestionGroups;
	}

	
	 
}
