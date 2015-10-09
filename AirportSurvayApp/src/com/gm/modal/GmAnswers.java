package com.gm.modal;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "GM_ANSWERS")
public class GmAnswers implements java.io.Serializable {

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "RESPONDANT", unique = true, nullable = false)
	private int respondant;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "QUESTION_ID")
	private int gmQuestions;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "OPTION_ID")
	private int gmOptions;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "SURVEY_ID")
	private int gmSurveyMaster;
	
	@Column(name = "VALUE_V" )
	private String valueV;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "DATE_D" )
	private Date dateD;

	public GmAnswers( ) {
	}

	public GmAnswers(int gmQuestions, int gmOptions,
			int gmSurveyMaster, String valueV, Date dateD) {
		this.gmQuestions = gmQuestions;
		this.gmOptions = gmOptions;
		this.gmSurveyMaster = gmSurveyMaster;
		this.valueV = valueV;
		this.dateD = dateD;
	}

	public int getRespondant() {
		return this.respondant;
	}

	public void setRespondant(int respondant) {
		this.respondant = respondant;
	}

	public int getGmQuestions() {
		return this.gmQuestions;
	}

	public void setGmQuestions(int gmQuestions) {
		this.gmQuestions = gmQuestions;
	}

	public int getGmOptions() {
		return this.gmOptions;
	}

	public void setGmOptions(int gmOptions) {
		this.gmOptions = gmOptions;
	}

		public int getGmSurveyMaster() {
		return this.gmSurveyMaster;
	}

	public void setGmSurveyMaster(int gmSurveyMaster) {
		this.gmSurveyMaster = gmSurveyMaster;
	}

	public String getValueV() {
		return this.valueV;
	}

	public void setValueV(String valueV) {
		this.valueV = valueV;
	}

	public Date getDateD() {
		return this.dateD;
	}

	public void setDateD(Date dateD) {
		this.dateD = dateD;
	}

}
