package com.handler;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.entity.ClassEntity;
import com.utility.HibernateUtility;

public class ClassHandler {

	public void addClass(ClassEntity class_obj){
		Session session= HibernateUtility.getSession();
		
		Transaction tx= session.beginTransaction();
		
		session.save(class_obj);
		
		tx.commit();
	}

	
	
}
