package com.cognizant.fsd.springboot.student.controller;

import java.util.Hashtable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.fsd.springboot.student.model.Student;
import com.cognizant.fsd.springboot.student.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	StudentService ss;
	
	@RequestMapping("/all")
	public Hashtable<String,Student> getAll(){
		return ss.getAll();
	}
	
	@RequestMapping("{id}")
	public Student getStudent(@PathVariable("id") String id){
		return ss.getStudent(id);
	}
	@RequestMapping(method = RequestMethod.POST, value = "/add")
	public void addStudent(@RequestBody Student student) {
		ss.addUpdateStudent(student);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/Update")
	public void updateStudent(@RequestBody Student student) {
	       ss.addUpdateStudent(student);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/delete/{id}")
	public void removeStudent(@PathVariable("id") String id) {
		ss.removeStudent(id);
	}
}
