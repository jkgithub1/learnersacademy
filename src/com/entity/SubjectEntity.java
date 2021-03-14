package com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "subject")
public class SubjectEntity {
	@Id
	@GeneratedValue
	private int subjectid;
	public int getId() {
		return subjectid;
	}
	public void setId(int id) {
		this.subjectid = id;
	}
	private String subjectName;
	public SubjectEntity(String name) {
		super();
		this.subjectName = name;
	}
	public String getName() {
		return subjectName;
	}
	public void setName(String name) {
		this.subjectName = name;
	}
	public SubjectEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
