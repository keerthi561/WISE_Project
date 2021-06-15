package com.rest.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class CollegeManagement {
	@Id@GeneratedValue
	private int Id;
	private String name;
	private String designation;
	
	private String userId;
	private String password;
	private String mobile;
	private String homeAddress;
	private String pincode;
	private String city;
	private String district;
	private String state;
	private String country;
	private String image;
	private String gender;
	private String fb;
	private String twitter;
	private String linkedIn;
	private String college;
	
	public CollegeManagement() {
		super();
	}
	
	public CollegeManagement(int id, String name, String designation, String userId, String password,
			String mobile, String homeAddress, String pincode, String city, String district, String state,
			String country, String image, String gender, String fb, String twitter, String linkedIn, String college) {
		super();
		Id = id;
		this.name = name;
		this.designation = designation;
		this.college = college;
		this.userId = userId;
		this.password = password;
		this.mobile = mobile;
		this.homeAddress = homeAddress;
		this.pincode = pincode;
		this.city = city;
		this.district = district;
		this.state = state;
		this.country = country;
		this.image = image;
		this.gender = gender;
		this.fb = fb;
		this.twitter = twitter;
		this.linkedIn = linkedIn;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getUniversity() {
		return college;
	}

	public void setUniversity(String college) {
		this.college = college;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
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

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getFb() {
		return fb;
	}

	public void setFb(String fb) {
		this.fb = fb;
	}

	public String getTwitter() {
		return twitter;
	}

	public void setTwitter(String twitter) {
		this.twitter = twitter;
	}

	public String getLinkedIn() {
		return linkedIn;
	}

	public void setLinkedIn(String linkedIn) {
		this.linkedIn = linkedIn;
	}
	
	

}
