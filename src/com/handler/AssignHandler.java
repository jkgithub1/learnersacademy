package com.handler;


import org.hibernate.Session;
import org.hibernate.Transaction;

import com.entity.AssignEntity;
import com.utility.HibernateUtility;

public class AssignHandler {
	public void add(AssignEntity class_obj){
		Session session= HibernateUtility.getSession();
		
		Transaction tx= session.beginTransaction();
		
		session.save(class_obj);
		
		tx.commit();
	}
	
	
	public AssignEntity loadSpecific(int id) {
		
		Session session= HibernateUtility.getSession();
		
		AssignEntity c = (AssignEntity)session.get(AssignEntity.class, id);
		
		return c;
	}
	
	public void update(int id,int fkClassId,int fkSubjectId,int fkTeacherId) {
		
		Session session= HibernateUtility.getSession();
		
		Transaction tx = session.beginTransaction();
		
		AssignEntity c = (AssignEntity)session.get(AssignEntity.class, id); 
		
		c.setFkClassId(fkClassId);
		
		c.setFkSubjectId(fkSubjectId);
		
		c.setFkTeacherId(fkTeacherId);
		
		session.update(c);
		
		tx.commit();
	}

	public void delete(int id) {
		
		Session session= HibernateUtility.getSession();
		
		Transaction tx = session.beginTransaction();
		
		AssignEntity c= new AssignEntity();
		
		c.setId(id);
		
		session.delete(c);
		
		tx.commit();
	}
}
