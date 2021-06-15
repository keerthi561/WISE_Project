package com.rest.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
//import javax.xml.bind.annotation.XmlRootElement;


//@XmlRootElement

@Entity

public class Student {
	@Id
	private String studentId;
	@Column
	private String studentName;
	@Column
	private String studentUserId;
	@Column
	private String studentPassword;
	@Column
	private String studentDOB;
	@Column
	private String studentDept;
	@Column
	private String studentMobile;
	@Column
	private String studentClg;
	@Column
	private String studentSection;
	@Column
	private String homeAddress;
	@Column
	private String pincode;
	@Column
	private String city;
	@Column
	private String district;
	@Column
	private String state;
	@Column
	private String country;
	@Column
	private String studentFb;
	@Column
	private String studentLinkedIn;
	@Column
	private String studentGit;
	
	
	/*@OneToMany(mappedBy="student")
	private List<Attendance> attendance = new ArrayList<Attendance>();
	
	@OneToMany(mappedBy="student")
	private List<Performance> performance = new ArrayList<Performance>();
	
	@ManyToMany(cascade = CascadeType.ALL)
	private List<BatchDetails> batchDetails = new ArrayList<BatchDetails>();
	*/
	
	public Student() {
		super();
	}

	

	
	public Student(String studentId, String studentName, String studentUserId, String studentPassword,
			String studentDOB, String studentDept, String studentMobile, String studentClg, String studentSection,
			String homeAddress, String pincode, String city, String district, String state, String country,
			String studentFb, String studentLinkedIn, String studentGit) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentUserId = studentUserId;
		this.studentPassword = studentPassword;
		this.studentDOB = studentDOB;
		this.studentDept = studentDept;
		this.studentMobile = studentMobile;
		this.studentClg = studentClg;
		this.studentSection = studentSection;
		this.homeAddress = homeAddress;
		this.pincode = pincode;
		this.city = city;
		this.district = district;
		this.state = state;
		this.country = country;
		this.studentFb = studentFb;
		this.studentLinkedIn = studentLinkedIn;
		this.studentGit = studentGit;
	}




	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentUserId() {
		return studentUserId;
	}

	public void setStudentUserId(String studentUserId) {
		this.studentUserId = studentUserId;
	}

	public String getStudentPassword() {
		return studentPassword;
	}

	public void setStudentPassword(String studentPassword) {
		this.studentPassword = studentPassword;
	}

	public String getStudentDept() {
		return studentDept;
	}

	public void setStudentDept(String studentDept) {
		this.studentDept = studentDept;
	}

	public String getStudentMobile() {
		return studentMobile;
	}

	public void setStudentMobile(String studentMobile) {
		this.studentMobile = studentMobile;
	}

	public String getStudentClg() {
		return studentClg;
	}

	public void setStudentClg(String studentClg) {
		this.studentClg = studentClg;
	}

	public String getStudentSection() {
		return studentSection;
	}

	public void setStudentSection(String studentSection) {
		this.studentSection = studentSection;
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



	public String getStudentDOB() {
		return studentDOB;
	}



	public void setStudentDOB(String studentDOB) {
		this.studentDOB = studentDOB;
	}



	public String getStudentFb() {
		return studentFb;
	}




	public void setStudentFb(String studentFb) {
		this.studentFb = studentFb;
	}




	public String getStudentLinkedIn() {
		return studentLinkedIn;
	}




	public void setStudentLinkedIn(String studentLinkedIn) {
		this.studentLinkedIn = studentLinkedIn;
	}




	public String getStudentGit() {
		return studentGit;
	}




	public void setStudentGit(String studentGit) {
		this.studentGit = studentGit;
	}




	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentUserId=" + studentUserId
				+ ", studentPassword=" + studentPassword + ", studentDOB=" + studentDOB + ", studentDept=" + studentDept
				+ ", studentMobile=" + studentMobile + ", studentClg=" + studentClg + ", studentSection="
				+ studentSection + ", homeAddress=" + homeAddress + ", pincode=" + pincode + ", city=" + city
				+ ", district=" + district + ", state=" + state + ", country=" + country + ", studentFb=" + studentFb
				+ ", studentLinkedIn=" + studentLinkedIn + ", studentGit=" + studentGit + "]";
	}





	
	
	
}
