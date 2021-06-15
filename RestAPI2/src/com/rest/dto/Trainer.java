package com.rest.dto;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Trainer {
	@Id@GeneratedValue
	private int trainerId;
	private String trainerName;
	private String trainerDesignation;
	private String trainerUserId;
	private String trainerPassword;
	private String trainerMobile;
	private String homeAddress;
	private String pincode;
	private String city;
	private String district;
	private String state;
	private String country;
	private String trainerGender;
	private String trainerFb;
	private String trainerLinkedIn;
	private String trainerImage;
	private ArrayList<Trainer> experience = new ArrayList<Trainer>();
	private ArrayList<String> expertise = new ArrayList<String>();
	private ArrayList<Trainer> hobbies = new ArrayList<Trainer>();
	
	@OneToMany
	private List<BatchDetails> batchDetails = new ArrayList<BatchDetails>();
	
	public Trainer() {
		super();
	}
	
	
	public Trainer(int trainerId, String trainerName, String trainerDesignation, String trainerUserId,
			String trainerPassword, String trainerMobile, String homeAddress, String pincode, String city,
			String district, String state, String country, String trainerGender, String trainerFb,
			String trainerLinkedIn, String trainerImage, ArrayList<Trainer> experience, ArrayList<String> expertise,
			ArrayList<Trainer> hobbies, List<BatchDetails> batchDetails) {
		super();
		this.trainerId = trainerId;
		this.trainerName = trainerName;
		this.trainerDesignation = trainerDesignation;
		this.trainerUserId = trainerUserId;
		this.trainerPassword = trainerPassword;
		this.trainerMobile = trainerMobile;
		this.homeAddress = homeAddress;
		this.pincode = pincode;
		this.city = city;
		this.district = district;
		this.state = state;
		this.country = country;
		this.trainerGender = trainerGender;
		this.trainerFb = trainerFb;
		this.trainerLinkedIn = trainerLinkedIn;
		this.trainerImage = trainerImage;
		this.experience = experience;
		this.expertise = expertise;
		this.hobbies = hobbies;
		this.batchDetails = batchDetails;
	}


	public String getTrainerFb() {
		return trainerFb;
	}

	public void setTrainerFb(String trainerFb) {
		this.trainerFb = trainerFb;
	}

	public String getTrainerLinkedIn() {
		return trainerLinkedIn;
	}

	public void setTrainerLinkedIn(String trainerLinkedIn) {
		this.trainerLinkedIn = trainerLinkedIn;
	}

	public ArrayList<Trainer> getExperience() {
		return experience;
	}

	public void setExperience(ArrayList<Trainer> experience) {
		this.experience = experience;
	}

	public ArrayList<Trainer> getHobbies() {
		return hobbies;
	}

	public void setHobbies(ArrayList<Trainer> hobbies) {
		this.hobbies = hobbies;
	}

	public int getTrainerId() {
		return trainerId;
	}

	public void setTrainerId(int trainerId) {
		this.trainerId = trainerId;
	}

	public String getTrainerName() {
		return trainerName;
	}

	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}

	public String getTrainerDesignation() {
		return trainerDesignation;
	}

	public void setTrainerDesignation(String trainerDesignation) {
		this.trainerDesignation = trainerDesignation;
	}

	public String getTrainerUserId() {
		return trainerUserId;
	}

	public void setTrainerUserId(String trainerUserId) {
		this.trainerUserId = trainerUserId;
	}

	public String getTrainerPassword() {
		return trainerPassword;
	}

	public void setTrainerPassword(String trainerPassword) {
		this.trainerPassword = trainerPassword;
	}

	public String getTrainerMobile() {
		return trainerMobile;
	}

	public void setTrainerMobile(String trainerMobile) {
		this.trainerMobile = trainerMobile;
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

	public String getTrainerGender() {
		return trainerGender;
	}

	public void setTrainerGender(String trainerGender) {
		this.trainerGender = trainerGender;
	}

	public List<BatchDetails> getBatchDetails() {
		return batchDetails;
	}

	public void setBatchDetails(List<BatchDetails> batchDetails) {
		this.batchDetails = batchDetails;
	}


	public String getTrainerImage() {
		return trainerImage;
	}


	public void setTrainerImage(String trainerImage) {
		this.trainerImage = trainerImage;
	}


	public ArrayList<String> getExpertise() {
		return expertise;
	}


	public void setExpertise(ArrayList<String> expertise) {
		this.expertise = expertise;
	}
	
	
}