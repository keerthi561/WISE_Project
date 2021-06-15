package com.rest.dto;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class BatchDetails {
	@Id@GeneratedValue
	private int batchId;
	private int batchYear;
	private String status;
	private String college;
	private Date startDate;
	private Date endDate;
	private int modId;
	private int trainerId;
	private String studentId;
	
	@ManyToOne
	private Trainer trainer;
	
	public BatchDetails() {
		super();
	}
	
	

	public BatchDetails(int batchId, int batchYear, String status, String college, Date startDate, Date endDate,
			int modId, int trainerId, String studentId, Trainer trainer) {
		super();
		this.batchId = batchId;
		this.batchYear = batchYear;
		this.status = status;
		this.college = college;
		this.startDate = startDate;
		this.endDate = endDate;
		this.modId = modId;
		this.trainerId = trainerId;
		this.studentId = studentId;
		this.trainer = trainer;
	}



	public int getBatchId() {
		return batchId;
	}

	public void setBatchId(int batchId) {
		this.batchId = batchId;
	}

	public int getBatchYear() {
		return batchYear;
	}

	public void setBatchYear(int batchYear) {
		this.batchYear = batchYear;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public int getModId() {
		return modId;
	}

	public void setModId(int modId) {
		this.modId = modId;
	}

	public int getTrainerId() {
		return trainerId;
	}

	public void setTrainerId(int trainerId) {
		this.trainerId = trainerId;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public Trainer getTrainer() {
		return trainer;
	}

	public void setTrainer(Trainer trainer) {
		this.trainer = trainer;
	}
		

}
