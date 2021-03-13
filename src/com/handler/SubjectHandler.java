package com.handler;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.entity.SubjectEntity;
import com.utility.HibernateUtility;

public class SubjectHandler {

	public void add(SubjectEntity class_obj){
		Session session= HibernateUtility.getSession();
		
		Transaction tx= session.beginTransaction();
		
		session.save(class_obj);
		
		tx.commit();
	}
	
	
	public List<SubjectEntity> list() {
		Session session= HibernateUtility.getSession();
		
		Query query = session.createQuery("from SubjectEntity");
		
		List<SubjectEntity> lst = query.list();
		
		return lst;
	}
	
	
	public SubjectEntity loadSpecific(int id) {
		
		Session session= HibernateUtility.getSession();
		
		SubjectEntity c = (SubjectEntity)session.get(SubjectEntity.class, id);
		
		return c;
	}
	
	public void update(int id,String name) {
		
		Session session= HibernateUtility.getSession();
		
		Transaction tx = session.beginTransaction();
		
		SubjectEntity c = (SubjectEntity)session.get(SubjectEntity.class, id); 
		
		c.setName(name);
		
		session.update(c);
		
		tx.commit();
	}

	public void delete(int id) {
		
		Session session= HibernateUtility.getSession();
		
		Transaction tx = session.beginTransaction();
		
		SubjectEntity c= new SubjectEntity();
		
		c.setId(id);
		
		session.delete(c);
		
		tx.commit();
	}
	
	
}
