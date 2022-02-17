package com.jbk.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jbk.entity.Student;

@Repository
public class StudentDao_impl implements StudentDao {

	@Autowired
	private SessionFactory sf;

	@Override
	public Student saveStudent(Student student) {
		try {
		Session session=	sf.openSession();
	Transaction transaction=	session.beginTransaction();
		session.save(student);
		transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return student;
	}

	@Override
	public Student getStudent(long studentId) {
		Session session=	sf.openSession();
	Student student=	session.get(Student.class, studentId);
		return student;
	}

}
