package com.handler;

import java.util.List;

import org.hibernate.Query;
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
	
	
	public List<ClassEntity> classList() {
		Session session= HibernateUtility.getSession();
		
		Query query = session.createQuery("from ClassEntity");
		
		List<ClassEntity> lst = query.list();
		
		return lst;
	}

	
	
}
