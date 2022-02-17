package com.jbk.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.jbk.dao.StudentDao;
import com.jbk.entity.Student;
import com.jbk.model.Branch;
import com.jbk.model.ResponseTemplateVO;

@Service
public class StudentService_impl implements StudentService {

	@Autowired
	private StudentDao dao;
	
	@Autowired
	private RestTemplate restTemplate;

	@Override
	public Student saveStudent(Student student) {
		return dao.saveStudent(student);
	}

	@Override
	public Student getStudent(long studentId) {
		
		return dao.getStudent(studentId);
	}

	@Override
	public ResponseTemplateVO getStudentWithBranch(long studentId) {
		
	ResponseTemplateVO vo=new ResponseTemplateVO();
	Student student=	dao.getStudent(studentId);
		
	Branch branch=	restTemplate.getForObject("http://BRANCH-SERVICE/branch/getBranch/"+student.getBranchId(), Branch.class);
	vo.setStudent(student);
	vo.setBranch(branch);
	return vo;
	}

}
