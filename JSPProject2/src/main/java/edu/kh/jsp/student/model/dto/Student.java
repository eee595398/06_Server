package edu.kh.jsp.student.model.dto;

public class Student {

	private String studentNO;
	private String studentName;
	private String studentAdress;
	private String departmentName;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String studentNO, String studentName, String studentAdress, String departmentName) {
		super();
		this.studentNO = studentNO;
		this.studentName = studentName;
		this.studentAdress = studentAdress;
		this.departmentName = departmentName;
	}

	public String getStudentNO() {
		return studentNO;
	}

	public void setStudentNO(String studentNO) {
		this.studentNO = studentNO;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentAdress() {
		return studentAdress;
	}

	public void setStudentAdress(String studentAdress) {
		this.studentAdress = studentAdress;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
}
