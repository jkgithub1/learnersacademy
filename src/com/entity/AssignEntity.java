package com.entity;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "assignteacher")

public class AssignEntity {
	@Id
	@GeneratedValue
	private int assignId;
	private int fkClassId,fkSubjectId,fkTeacherId;
	public AssignEntity(int fkClassId, int fkSubjectId, int fkTeacherId) {
		super();
		this.fkClassId = fkClassId;
		this.fkSubjectId = fkSubjectId;
		this.fkTeacherId = fkTeacherId;
	}
	public int getId() {
		return assignId;
	}
	public void setId(int id) {
		this.assignId = id;
	}
	public int getFkClassId() {
		return fkClassId;
	}
	public void setFkClassId(int fkClassId) {
		this.fkClassId = fkClassId;
	}
	public int getFkSubjectId() {
		return fkSubjectId;
	}
	public void setFkSubjectId(int fkSubjectId) {
		this.fkSubjectId = fkSubjectId;
	}
	public int getFkTeacherId() {
		return fkTeacherId;
	}
	public void setFkTeacherId(int fkTeacherId) {
		this.fkTeacherId = fkTeacherId;
	}
	public AssignEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
