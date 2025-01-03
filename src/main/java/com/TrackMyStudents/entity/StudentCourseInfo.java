package com.TrackMyStudents.entity;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class StudentCourseInfo 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String courseName;
	private String feesStatus;
	
	
	public StudentCourseInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudentCourseInfo(Long id, String courseName, String feesStatus) {
		super();
		this.id = id;
		this.courseName = courseName;
		this.feesStatus = feesStatus;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getFeesStatus() {
		return feesStatus;
	}
	public void setFeesStatus(String feesStatus) {
		this.feesStatus = feesStatus;
	}
	public Long getId() {
		return id;
	}
	@Override
	public String toString() {
		return "StudentCourseInfo [id=" + id + ", courseName=" + courseName + ", feesStatus=" + feesStatus + "]";
	}
	
	
	
}
