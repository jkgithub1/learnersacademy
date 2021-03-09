package com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "class")
public class ClassEntity {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	public ClassEntity(String name) {
		super();
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public ClassEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "ClassEntity [id=" + id + ", name=" + name + "]";
	}
	
}
