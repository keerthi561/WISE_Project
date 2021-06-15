package com.rest.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity

public class Module {
	@Id@GeneratedValue
	private int modId;
	private String modName;
	private int modDuration;
	private Date modStartDate;
	private Date modEndDate;
	private String projectNum;
	private String projectName;
	
	
	private ArrayList<String> projectLink = new ArrayList<String>();
	
	@OneToMany(mappedBy="module")
	private List<Attendance> attendance = new ArrayList<Attendance>();
	
	@OneToMany(mappedBy="module")
	private List<Performance> performance = new ArrayList<Performance>();
	
	@ManyToMany(cascade = CascadeType.ALL)
	private List<BatchDetails> batchDetails = new ArrayList<BatchDetails>();
	
	public Module() {
		super();
	}


	

	public Module(int modId, String modName, int modDuration, Date modStartDate, Date modEndDate, String projectNum,
			String projectName, ArrayList<String> projectLink, List<Attendance> attendance, List<Performance> performance,
			List<BatchDetails> batchDetails) {
		super();
		this.modId = modId;
		this.modName = modName;
		this.modDuration = modDuration;
		this.modStartDate = modStartDate;
		this.modEndDate = modEndDate;
		this.projectNum = projectNum;
		this.projectName = projectName;
		this.projectLink = projectLink;
		this.attendance = attendance;
		this.performance = performance;
		this.batchDetails = batchDetails;
	}




	public int getModId() {
		return modId;
	}

	public void setModId(int modId) {
		this.modId = modId;
	}

	public String getModName() {
		return modName;
	}

	public void setModName(String modName) {
		this.modName = modName;
	}

	public int getModDuration() {
		return modDuration;
	}

	public void setModDuration(int modDuration) {
		this.modDuration = modDuration;
	}

	


	public String getProjectNum() {
		return projectNum;
	}


	public void setProjectNum(String projectNum) {
		this.projectNum = projectNum;
	}


	public String getProjectName() {
		return projectName;
	}


	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}


	public List<String> getProjectLink() {
		return projectLink;
	}


	public void setProjectLink(ArrayList<String> projectLink) {
		this.projectLink = projectLink;
	}


	public List<Attendance> getAttendance() {
		return attendance;
	}


	public void setAttendance(List<Attendance> attendance) {
		this.attendance = attendance;
	}


	public List<Performance> getPerformance() {
		return performance;
	}


	public void setPerformance(List<Performance> performance) {
		this.performance = performance;
	}


	public List<BatchDetails> getBatchDetails() {
		return batchDetails;
	}


	public void setBatchDetails(List<BatchDetails> batchDetails) {
		this.batchDetails = batchDetails;
	}




	public Date getModStartDate() {
		return modStartDate;
	}




	public void setModStartDate(Date modStartDate) {
		this.modStartDate = modStartDate;
	}




	public Date getModEndDate() {
		return modEndDate;
	}




	public void setModEndDate(Date modEndDate) {
		this.modEndDate = modEndDate;
	}
	
	
		
}
