package com.gm.dao;


import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.gm.modal.GmAnswers;
import com.gm.modal.GmQuestions;
import com.gm.util.Util;

public class Airport {

	public static void main(String[] args) {
		Session session = Util.getFactory().openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			        Query query = session.createQuery("insert into gm_answers(1,1,'dev',1,new Date())" );
			        int result = query.executeUpdate();
			        System.out.println("Rows affected: " + result);
			        session.getTransaction().commit();
			 
	
			List question = new ArrayList();
			question.add(new GmQuestions());
			
			GmAnswers student = new GmAnswers( );
			session.save(student);
			
			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
 
}
	
	
}