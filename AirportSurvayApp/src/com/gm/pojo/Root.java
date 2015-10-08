package com.gm.pojo;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

 
@Entity
@Table(name = "root")

public class Root {
	private Surveys surveys;

	public Surveys getSurveys() {
		return surveys;
	}

	public void setSurveys(Surveys surveys) {
		this.surveys = surveys;
	}

	@Override
	public String toString() {
		return "ClassPojo [surveys = " + surveys + "]";
	}
}
