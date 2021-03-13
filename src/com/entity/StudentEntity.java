package com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class StudentEntity {
	@Id
	@GeneratedValue
	private int studentid;
	public int getId() {
		return studentid;
	}
	public void setId(int id) {
		this.studentid = id;
	}
	private String studentName;
	public String getName() {
		return studentName;
	}
	public void setName(String name) {
		this.studentName = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	private String email;
	public StudentEntity(String name, String email, String city,int fkClassId) {
		super();
		this.studentName = name;
		this.email = email;
		this.city = city;
		this.fkClassId = fkClassId;
	}
	public int getFkClassId() {
		return fkClassId;
	}
	public void setFkClassId(int fkClassId) {
		this.fkClassId = fkClassId;
	}
	private String city;
	private int fkClassId;
	
	public StudentEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
