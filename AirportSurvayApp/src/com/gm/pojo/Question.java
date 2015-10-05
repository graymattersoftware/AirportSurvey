package com.gm.pojo;


public class Question
{
private String text;

private String qid;

private String qtype;

private Option[] option;

public String getText ()
{
return text;
}

public void setText (String text)
{
this.text = text;
}

public String getQid ()
{
return qid;
}

public void setQid (String qid)
{
this.qid = qid;
}

public String getQtype ()
{
return qtype;
}

public void setQtype (String qtype)
{
this.qtype = qtype;
}

public Option[] getOption ()
{
return option;
}

public void setOption (Option[] option)
{
this.option = option;
}

@Override
public String toString()
{
return "ClassPojo [text = "+text+", qid = "+qid+", qtype = "+qtype+", option = "+option+"]";
}
}

