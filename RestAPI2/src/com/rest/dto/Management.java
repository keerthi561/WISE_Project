package com.rest.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Management {
	@Id@GeneratedValue
	private int managementId;
	private String managementName;
	private String managementDesignation;
	private String managementUserId;
	private String managementPassword;
	private String managementMobile;
	private String homeAddress;
	private String pincode;
	private String city;
	private String district;
	private String state;
	private String country;
	private String managementImage;
	private String managementGender;
	private String managementFb;
	private String managementTwitter;
	private String managementLinkedIn;
	public Management() {
		super();
		
	}
	
	public Management(int managementId, String managementName, String managementDesignation, String managementUserId,
			String managementPassword, String managementMobile, String homeAddress, String pincode, String city,
			String district, String state, String country, String managementGender, String managementImage,String managementFb,
			String managementTwitter, String managementLinkedIn) {
		super();
		this.managementImage= managementImage;
		this.managementId = managementId;
		this.managementName = managementName;
		this.managementDesignation = managementDesignation;
		this.managementUserId = managementUserId;
		this.managementPassword = managementPassword;
		this.managementMobile = managementMobile;
		this.homeAddress = homeAddress;
		this.pincode = pincode;
		this.city = city;
		this.district = district;
		this.state = state;
		this.country = country;
		this.managementGender = managementGender;
		this.managementFb = managementFb;
		this.managementTwitter = managementTwitter;
		this.managementLinkedIn = managementLinkedIn;
	}

	public int getManagementId() {
		return managementId;
	}
	public void setManagementId(int managementId) {
		this.managementId = managementId;
	}
	public String getManagementName() {
		return managementName;
	}
	public void setManagementName(String managementName) {
		this.managementName = managementName;
	}
	public String getManagementDesignation() {
		return managementDesignation;
	}
	public void setManagementDesignation(String managementDesignation) {
		this.managementDesignation = managementDesignation;
	}
	public String getManagementUserId() {
		return managementUserId;
	}
	public void setManagementUserId(String managementUserId) {
		this.managementUserId = managementUserId;
	}
	public String getManagementPassword() {
		return managementPassword;
	}
	public void setManagementPassword(String managementPassword) {
		this.managementPassword = managementPassword;
	}
	public String getManagementMobile() {
		return managementMobile;
	}
	public void setManagementMobile(String managementMobile) {
		this.managementMobile = managementMobile;
	}
	public String getHomeAddress() {
		return homeAddress;
	}
	public void setHomeAddress(String homeAddress) {
		this.homeAddress = homeAddress;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getManagementGender() {
		return managementGender;
	}
	public void setManagementGender(String managementGender) {
		this.managementGender = managementGender;
	}

	public String getManagementFb() {
		return managementFb;
	}

	public void setManagementFb(String managementFb) {
		this.managementFb = managementFb;
	}

	public String getManagementTwitter() {
		return managementTwitter;
	}

	public void setManagementTwitter(String managementTwitter) {
		this.managementTwitter = managementTwitter;
	}

	public String getManagementLinkedIn() {
		return managementLinkedIn;
	}

	public void setManagementLinkedIn(String managementLinkedIn) {
		this.managementLinkedIn = managementLinkedIn;
	}

	public String getManagementImage() {
		return managementImage;
	}

	public void setManagementImage(String managementImage) {
		this.managementImage = managementImage;
	}
	
	
	
	
	
	

}
