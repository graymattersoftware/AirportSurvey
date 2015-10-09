package com.gm.dao;


import java.io.Serializable;
import java.sql.Date;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.gm.ans.Answer;
import com.gm.ans.QuestionGroup;
import com.gm.ans.Questions;
import com.gm.modal.GmAnswers;
import com.gm.modal.GmCustomers;
import com.gm.modal.GmOptions;
import com.gm.modal.GmQuestions;
import com.gm.modal.GmSurveyMaster;
import com.gm.modal.GmUsers;
import com.gm.util.Util;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.ResultSet;
import com.mysql.jdbc.Statement;

public class Airport {

	public static void main(String[] args) {
		Session session = Util.getFactory().openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
		/*	Answer  answer= new Answer();
			Questions questions= new Questions();
			QuestionGroup group = new QuestionGroup();
			
			GmQuestions gmQuestions= new GmQuestions();
			GmOptions gmOptions =new GmOptions();
			GmSurveyMaster gmSurveyMaster= new GmSurveyMaster();
			  List  gmUserses = new ArrayList();
			  gmUserses.add("rahul");
			  */
			 // GmAnswers gmc= new GmAnswers(4, questions.getQid(),answer.getSid(), questions.getText(), new Date(0));
				
			// GmAnswers gmc= new GmAnswers(gmQuestions.getQuestionId(), gmOptions.getOptionId(), gmSurveyMaster.getSurveyId(), "test", new Date(0));
			 // GmAnswers gmc= new GmAnswers(gmQuestions , gmOptions , gmSurveyMaster , "test", new Date(0));
				 	  
			
	      GmQuestions gmq= new GmQuestions();
			session.get(GmQuestions.class, 1);
		 	session.save(gmq);
			transaction.commit();
			session.close();
		} catch (HibernateException e) {
			if (transaction != null) {
				
			
			transaction.rollback();
			}
			e.printStackTrace();
		} 

 
}
/*	public static List<Object> get(GmOptions cls,Serializable i) {
		List list=null;
		try {
		SessionFactory sessionFactory =Util.getFactory();
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		Query q=session.createQuery("from GM_SURVEY_MASTER where SURVEY_ID="+i);
		list=q.list();
		System.out.println(list);
		transaction.commit();
		session.close();

		} catch (Exception e) {
			e.getMessage();
		}
		
		return list;
		
	}
	*/
	
	
	
} 