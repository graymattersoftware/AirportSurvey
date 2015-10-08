package com.gm.pojo;

public class QuestionGroup {
	private String name;

	private Question[] question;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Question[] getQuestion() {
		return question;
	}

	public void setQuestion(Question[] question) {
		this.question = question;
	}

	@Override
	public String toString() {
		return "ClassPojo [name = " + name + ", question = " + question + "]";
	}
}
