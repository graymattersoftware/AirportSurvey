package com.gm.modal;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

 
@Entity
@Table(name = "user_to_survey", catalog = "airportsurveydb")
public class UserToSurvey implements java.io.Serializable {

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "userId", column = @Column(name = "USER_ID")),
			@AttributeOverride(name = "surveyId", column = @Column(name = "SURVEY_ID")) })
	private UserToSurveyId id;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "USER_ID", insertable = false, updatable = false)
	private GmUsers gmUsers;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "SURVEY_ID", insertable = false, updatable = false)
	private GmSurveyMaster gmSurveyMaster;

	public UserToSurvey() {
	}

	public UserToSurvey(UserToSurveyId id) {
		this.id = id;
	}

	public UserToSurvey(UserToSurveyId id, GmUsers gmUsers,
			GmSurveyMaster gmSurveyMaster) {
		this.id = id;
		this.gmUsers = gmUsers;
		this.gmSurveyMaster = gmSurveyMaster;
	}

	public UserToSurveyId getId() {
		return this.id;
	}

	public void ListId(UserToSurveyId id) {
		this.id = id;
	}
public GmUsers getGmUsers() {
		return this.gmUsers;
	}

	public void ListGmUsers(GmUsers gmUsers) {
		this.gmUsers = gmUsers;
	}
public GmSurveyMaster getGmSurveyMaster() {
		return this.gmSurveyMaster;
	}

	public void ListGmSurveyMaster(GmSurveyMaster gmSurveyMaster) {
		this.gmSurveyMaster = gmSurveyMaster;
	}

}
