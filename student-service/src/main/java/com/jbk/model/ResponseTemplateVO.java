package com.jbk.model;

import com.jbk.entity.Student;

public class ResponseTemplateVO {
	
	private Student student;
	private Branch branch;
	
	public ResponseTemplateVO() {
		// TODO Auto-generated constructor stub
	}

	public ResponseTemplateVO(Student student, Branch branch) {
		super();
		this.student = student;
		this.branch = branch;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Branch getBranch() {
		return branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}

	@Override
	public String toString() {
		return "ResponseTemplateVO [student=" + student + ", branch=" + branch + "]";
	}
	
	

}
