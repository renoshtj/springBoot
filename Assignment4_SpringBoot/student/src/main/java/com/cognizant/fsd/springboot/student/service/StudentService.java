package com.cognizant.fsd.springboot.student.service;

import java.util.Hashtable;

import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.cognizant.fsd.springboot.student.model.Student;

@Service
public class StudentService {
	Hashtable<String, Student> students = new Hashtable<String,Student>(){/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

	{put("1", new Student("1","Tom","m","Jerry"));}};
	
	public Student getStudent(String id){
		if(students.containsKey(id)){
			return students.get(id);
		}
		else
			return null;
	}
	
	public Hashtable<String,Student> getAll(){
		return students;
	}
	
	
	public void addUpdateStudent(Student student){
		if(null!= student && !StringUtils.isEmpty(student.getId())) {
			students.put(student.getId(), student);
		}
	}
	
	public void removeStudent(String id){
		if(students.containsKey(id)){
			students.remove(id);
		}
	}
}
