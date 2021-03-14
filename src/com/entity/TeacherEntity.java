package com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "teacher")
public class TeacherEntity {
	@Id
	@GeneratedValue
	private int teacherid;
	public int getId() {
		return teacherid;
	}
	public void setId(int id) {
		this.teacherid = id;
	}
	private String teacherName;
	public String getName() {
		return teacherName;
	}
	public void setName(String name) {
		this.teacherName = name;
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
	public TeacherEntity(String name, String email, String city) {
		super();
		this.teacherName = name;
		this.email = email;
		this.city = city;
	}
	private String city;
	public TeacherEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
