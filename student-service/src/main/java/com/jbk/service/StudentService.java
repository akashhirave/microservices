package com.jbk.service;

import com.jbk.entity.Student;
import com.jbk.model.ResponseTemplateVO;


public interface StudentService {
	public Student saveStudent(Student student);
	public Student getStudent(long studentId);
	public ResponseTemplateVO getStudentWithBranch(long studentId);
	

}
