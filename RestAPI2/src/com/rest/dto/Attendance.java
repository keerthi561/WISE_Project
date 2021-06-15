package com.rest.dto;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Attendance {
	@Id@GeneratedValue
	private int attendanceId;
	private int modId;
	private String studentId;
	private Date date;
	private String result;
	private Date recoupDate; 
	private boolean recoupStatus;
	
	
	@ManyToOne
	private Student student;
	
	@ManyToOne
	private Module module;
	
	
	
	public Attendance() {
		super();
	}
		

	
	public Attendance(int attendanceId, int modId, String studentId, Date date, String result, Date recoupDate,
			boolean recoupStatus, Student student, Module module) {
		super();
		this.attendanceId = attendanceId;
		this.modId = modId;
		this.studentId = studentId;
		this.date = date;
		this.result = result;
		this.recoupDate = recoupDate;
		this.recoupStatus = recoupStatus;
		this.student = student;
		this.module = module;
	}



	public int getAttendanceId() {
		return attendanceId;
	}

	public void setAttendanceId(int attendanceId) {
		this.attendanceId = attendanceId;
	}

	public int getModId() {
		return modId;
	}

	public void setModId(int modId) {
		this.modId = modId;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}



	public Student getStudent() {
		return student;
	}



	public void setStudent(Student student) {
		this.student = student;
	}



	public Module getModule() {
		return module;
	}



	public void setModule(Module module) {
		this.module = module;
	}



	public Date getRecoupDate() {
		return recoupDate;
	}



	public void setRecoupDate(Date recoupDate) {
		this.recoupDate = recoupDate;
	}



	public boolean isRecoupStatus() {
		return recoupStatus;
	}



	public void setRecoupStatus(boolean recoupStatus) {
		this.recoupStatus = recoupStatus;
	}
	
	
	
	
	
	

}
