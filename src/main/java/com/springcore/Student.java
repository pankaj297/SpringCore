package com.springcore;

/**
 * 
 */
public class Student {

	private int studentId;
	private String StudentName;
	private String studentAddres;
	
	 //Getter and Setter Injection
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		System.out.println("Student Id..!");
		this.studentId = studentId;
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		System.out.println("Student Name...!");
		StudentName = studentName;
	}
	public String getStudentAddres() {
		return studentAddres;
	}
	public void setStudentAddres(String studentAddres) {
		System.out.println("Student Address...!");
		this.studentAddres = studentAddres;
	}
	
	// Constructor Injection
	public Student(int studentId, String studentName, String studentAddres) {
		super();
		this.studentId = studentId;
		StudentName = studentName;
		this.studentAddres = studentAddres;
	}
	
	// Empty Constructor Injection
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", StudentName=" + StudentName + ", studentAddres=" + studentAddres
				+ "]";
	}
	
	
	
}
