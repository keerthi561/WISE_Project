package com.rest.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Performance {
	@Id@GeneratedValue
	private int perId;
	private int modId;
	private String studentId;
	private int scoremore;
	
	private int attendance;
	private String result;
	private int inClassPerformance;
	private int dailyDose;
	private int projectEuler;
	private int codingPlatforms;
	private int mcqs;
	
	
	@ManyToOne
	private Student student;
	
	@ManyToOne
	private Module module;
	
	public Performance() {
		super();
	}

	



	public Performance(int perId, int modId, String studentId, int scoremore, int attendance, String result,
			int inClassPerformance, int dailyDose, int projectEuler, int codingPlatforms, int mcqs, Student student,
			Module module) {
		super();
		this.perId = perId;
		this.modId = modId;
		this.studentId = studentId;
		this.scoremore = scoremore;
		this.attendance = attendance;
		this.result = result;
		this.inClassPerformance = inClassPerformance;
		this.dailyDose = dailyDose;
		this.projectEuler = projectEuler;
		this.codingPlatforms = codingPlatforms;
		this.mcqs = mcqs;
		this.student = student;
		this.module = module;
	}





	public int getPerId() {
		return perId;
	}

	public void setPerId(int perId) {
		this.perId = perId;
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

	public int getScoremore() {
		return scoremore;
	}

	public void setScoremore(int scoremore) {
		this.scoremore = scoremore;
	}

	
	public int getInClassPerformance() {
		return inClassPerformance;
	}





	public void setInClassPerformance(int inClassPerformance) {
		this.inClassPerformance = inClassPerformance;
	}





	public int getDailyDose() {
		return dailyDose;
	}





	public void setDailyDose(int dailyDose) {
		this.dailyDose = dailyDose;
	}





	public int getProjectEuler() {
		return projectEuler;
	}





	public void setProjectEuler(int projectEuler) {
		this.projectEuler = projectEuler;
	}





	public int getCodingPlatforms() {
		return codingPlatforms;
	}





	public void setCodingPlatforms(int codingPlatforms) {
		this.codingPlatforms = codingPlatforms;
	}





	public int getMcqs() {
		return mcqs;
	}





	public void setMcqs(int mcqs) {
		this.mcqs = mcqs;
	}





	public int getAttendance() {
		return attendance;
	}

	public void setAttendance(int attendance) {
		this.attendance = attendance;
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
	
}
