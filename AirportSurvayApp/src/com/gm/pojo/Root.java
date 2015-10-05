package com.gm.pojo;


public class Root
{
private Surveys surveys;

public Surveys getSurveys ()
{
return surveys;
}

public void setSurveys (Surveys surveys)
{
this.surveys = surveys;
}

@Override
public String toString()
{
return "ClassPojo [surveys = "+surveys+"]";
}
}
