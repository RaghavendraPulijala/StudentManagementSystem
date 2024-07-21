package com.example.sms.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="StudentManagementSystem")
public class Student {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="FirstName",nullable = false)
	private String FirstName;
	
	@Column(name="LastName",nullable = false)
	private String LastName;
	
	@Column(name="Emai;l_id",nullable = false)
	private String Email;
	public Student() {
		super();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public Student(String firstName, String lastName, String email) {
		super();
		FirstName = firstName;
		LastName = lastName;
		Email = email;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", FirstName=" + FirstName + ", LastName=" + LastName + ", Email=" + Email + "]";
	}
	
	
	

}
