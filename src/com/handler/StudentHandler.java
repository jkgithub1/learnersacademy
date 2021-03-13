package com.handler;


import org.hibernate.Session;
import org.hibernate.Transaction;

import com.entity.StudentEntity;
import com.utility.HibernateUtility;

public class StudentHandler {
	public void add(StudentEntity class_obj){
		Session session= HibernateUtility.getSession();
		
		Transaction tx= session.beginTransaction();
		
		session.save(class_obj);
		
		tx.commit();
	}
	
	
//	public Query list() {
//		Session session= HibernateUtility.getSession();
//		
//		Query query = session.createQuery("SELECT s.*,c.id as classid,c.name FROM student s,class c WHERE s.fkClassId=c.id");
//		
//		return query;
//	}
	
	
	public StudentEntity loadSpecific(int id) {
		
		Session session= HibernateUtility.getSession();
		
		StudentEntity c = (StudentEntity)session.get(StudentEntity.class, id);
		
		return c;
	}
	
	public void update(int id,String name,String email,String city,int fkClassId) {
		
		Session session= HibernateUtility.getSession();
		
		Transaction tx = session.beginTransaction();
		
		StudentEntity c = (StudentEntity)session.get(StudentEntity.class, id); 
		
		c.setName(name);

		c.setEmail(email);
		
		c.setCity(city);
		
		c.setFkClassId(fkClassId);
		
		session.update(c);
		
		tx.commit();
	}

	public void delete(int id) {
		
		Session session= HibernateUtility.getSession();
		
		Transaction tx = session.beginTransaction();
		
		StudentEntity c= new StudentEntity();
		
		c.setId(id);
		
		session.delete(c);
		
		tx.commit();
	}
}
