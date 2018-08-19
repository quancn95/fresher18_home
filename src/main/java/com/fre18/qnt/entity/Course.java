package com.fre18.qnt.entity;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="course")
public class Course {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="idcourse")
	private int courseId;
	@Column(name="course_name")
	private String courseName;
	@Column(name="quantity_student")
	private int quantityStudent;
	@Column(name="teacher")
	private String teacher;
	@Column(name="start_course")
	private Date startCourse;
	@Column(name="end_course")
	private Date endCourse;
	
	@ManyToMany
	@JoinTable(name="student_course", 
		joinColumns={@JoinColumn(name="idcourse")},
		inverseJoinColumns={@JoinColumn(name="idstudent")})
	private Set<Student>  students = new HashSet<>();

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getQuantityStudent() {
		return quantityStudent;
	}

	public void setQuantityStudent(int quantityStudent) {
		this.quantityStudent = quantityStudent;
	}

	public String getTeacher() {
		return teacher;
	}

	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}

	public Date getStartCourse() {
		return startCourse;
	}

	public void setStartCourse(Date startCourse) {
		this.startCourse = startCourse;
	}

	public Date getEndCourse() {
		return endCourse;
	}

	public void setEndCourse(Date endCourse) {
		this.endCourse = endCourse;
	}

	public Set<Student> getStudents() {
		return students;
	}

	public void setStudents(Set<Student> students) {
		this.students = students;
	}

	
	public Course() {
		super();
	}

	public Course(String courseName, int quantityStudent) {
		super();
		this.courseName = courseName;
		this.quantityStudent = quantityStudent;
	}
	
	
}
