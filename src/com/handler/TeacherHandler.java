package com.handler;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.entity.TeacherEntity;
import com.utility.HibernateUtility;

public class TeacherHandler {
	public void add(TeacherEntity class_obj){
		Session session= HibernateUtility.getSession();
		
		Transaction tx= session.beginTransaction();
		
		session.save(class_obj);
		
		tx.commit();
	}
	
	
	public List<TeacherEntity> list() {
		Session session= HibernateUtility.getSession();
		
		Query query = session.createQuery("from TeacherEntity");
		
		List<TeacherEntity> lst = query.list();
		
		return lst;
	}
	
	
	public TeacherEntity loadSpecific(int id) {
		
		Session session= HibernateUtility.getSession();
		
		TeacherEntity c = (TeacherEntity)session.get(TeacherEntity.class, id);
		
		return c;
	}
	
	public void update(int id,String name,String email,String city) {
		
		Session session= HibernateUtility.getSession();
		
		Transaction tx = session.beginTransaction();
		
		TeacherEntity c = (TeacherEntity)session.get(TeacherEntity.class, id); 
		
		c.setName(name);

		c.setEmail(email);
		
		c.setCity(city);
		
		session.update(c);
		
		tx.commit();
	}

	public void delete(int id) {
		
		Session session= HibernateUtility.getSession();
		
		Transaction tx = session.beginTransaction();
		
		TeacherEntity c= new TeacherEntity();
		
		c.setId(id);
		
		session.delete(c);
		
		tx.commit();
	}
}
