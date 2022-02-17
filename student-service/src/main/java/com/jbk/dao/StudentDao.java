package com.jbk.dao;

import com.jbk.entity.Student;

public interface StudentDao {
	public Student saveStudent(Student student);
	public Student getStudent(long studentId);
}
