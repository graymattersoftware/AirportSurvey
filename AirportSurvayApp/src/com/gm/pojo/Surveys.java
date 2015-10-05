package com.gm.pojo;


public class Surveys
{
private Survey survey;

public Survey getSurvey ()
{
return survey;
}

public void setSurvey (Survey survey)
{
this.survey = survey;
}

@Override
public String toString()
{
return "ClassPojo [survey = "+survey+"]";
}
}
