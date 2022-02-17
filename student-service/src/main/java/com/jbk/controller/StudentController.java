package com.jbk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jbk.entity.Student;
import com.jbk.model.ResponseTemplateVO;
import com.jbk.service.StudentService;

@RestController
@RequestMapping(value = "/student")
public class StudentController {
	
	@Autowired
	private StudentService service;
	
	@PostMapping(value = "/saveStudent")
	public Student saveStudent(@RequestBody Student student)
	{
		return service.saveStudent(student);
	}
	
	@GetMapping(value = "/getStudent/{studentId}")
	public Student getStudent(@PathVariable long studentId) {
		return service.getStudent(studentId);
	}
	

	@GetMapping(value = "/getStudentWithBranch/{studentId}")
	public ResponseTemplateVO getStudentWithBranch(@PathVariable long studentId) {
		return service.getStudentWithBranch(studentId);
	}

}
