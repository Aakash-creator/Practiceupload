package com.TrackMyStudents.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Students 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String fullName;
	private String email;
	
	@OneToOne
	@JoinColumn(name = "Student_info_id",referencedColumnName = "id")
	private StudentCourseInfo info;

	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Students(Long id, String fullName, String email, StudentCourseInfo info) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.email = email;
		this.info = info;
	}

	public Long getId() {
		return id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public StudentCourseInfo getInfo() {
		return info;
	}

	public void setInfo(StudentCourseInfo info) {
		this.info = info;
	}

	@Override
	public String toString() {
		return "Students [id=" + id + ", fullName=" + fullName + ", email=" + email + ", info=" + info + "]";
	}
	
}
