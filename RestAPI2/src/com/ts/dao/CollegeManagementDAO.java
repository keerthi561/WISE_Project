package com.ts.dao;
import java.util.List;
import org.hibernate.SessionFactory;

import com.rest.dto.CollegeManagement;
//import com.rest.dto.Management;
import com.ts.db.HibernateTemplate;
public class CollegeManagementDAO {
private SessionFactory factory = null;
	
	public int register(List<CollegeManagement> collegeManagement) {
		
		System.out.println("Inside DAO.." + collegeManagement);
		//java.util.Date utilDate = new java.sql.Date(student.getJoinDate().getTime()); 
		return HibernateTemplate.addCollegeManagementObject(collegeManagement);
	}
	
	public List<CollegeManagement> getAllCollegeManagement() {
		List<CollegeManagement> collegeManagements = (List)HibernateTemplate.getObjectListByQuery("From CollegeManagement");
		System.out.println("Inside All  ..."+collegeManagements);
		return collegeManagements;	
	}
	
	
	public CollegeManagement getCollegeManagement(String id) {
		return (CollegeManagement)HibernateTemplate.getObject(CollegeManagement.class,id);
	}
	
	public CollegeManagement getCollegeManagementByUserId(String userId) {
		System.out.println("DAO id" + userId);
		System.out.println("DAO college management   " + (CollegeManagement)HibernateTemplate.getCollegeManagementByUserId(userId));
		return (CollegeManagement)HibernateTemplate.getCollegeManagementByUserId(userId);
	}

}
