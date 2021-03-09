package com.handler;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.entity.SubjectEntity;
import com.utility.HibernateUtility;

public class SubjectHandler {

	public void addSubject(SubjectEntity obj){
		Session session= HibernateUtility.getSession();
		
		Transaction tx= session.beginTransaction();
		
		session.save(obj);
		
		tx.commit();
	}

	
	
}
