package com.gm.pojo;

public class Survey
{
private String sid;

private String name;

private QuestionGroup[] questionGroup;

public String getSid ()
{
return sid;
}

public void setSid (String sid)
{
this.sid = sid;
}

public String getName ()
{
return name;
}

public void setName (String name)
{
this.name = name;
}

public QuestionGroup[] getQuestionGroup ()
{
return questionGroup;
}

public void setQuestionGroup (QuestionGroup[] questionGroup)
{
this.questionGroup = questionGroup;
}

@Override
public String toString()
{
return "ClassPojo [sid = "+sid+", name = "+name+", questionGroup = "+questionGroup+"]";
}
}
