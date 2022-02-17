package com.jbk.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	private long studentId;
	private String studentName;
	private long branchId;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(long studentId, String studentName, long branchId) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.branchId = branchId;
	}

	public long getStudentId() {
		return studentId;
	}

	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public long getBranchId() {
		return branchId;
	}

	public void setBranchId(long branchId) {
		this.branchId = branchId;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", branchId=" + branchId + "]";
	}
	
	
	
	

}
