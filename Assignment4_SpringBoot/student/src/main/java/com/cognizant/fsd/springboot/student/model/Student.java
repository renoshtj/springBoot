package com.cognizant.fsd.springboot.student.model;

public class Student {

	String id;
	String firstName;
	String middleName;
	String lastName;
	
	public Student() {
		super();
	}
	public Student(String id,String firstName,String middleName,String lastname) {
		this.id=id;
		this.firstName=firstName;
		this.middleName=middleName;
		this.lastName=lastname;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
}
