package com.ts.dao;
import java.util.List;
import org.hibernate.SessionFactory;
import com.rest.dto.Management;
import com.ts.db.HibernateTemplate;
public class ManagementDAO {
private SessionFactory factory = null;
	
	public int register(List<Management> management) {
		
		System.out.println("Inside DAO.." + management);
		//java.util.Date utilDate = new java.sql.Date(student.getJoinDate().getTime()); 
		return HibernateTemplate.addManagementObject(management);
	}
	
	public List<Management> getAllManagement() {
		List<Management> managements = (List)HibernateTemplate.getObjectListByQuery("From Management");
		System.out.println("Inside All  ..."+managements);
		return managements;	
	}
	
	
	public Management getManagement(String id) {
		return (Management)HibernateTemplate.getObject(Management.class,id);
	}
	
	public Management getManagementByUserId(String userId) {
		System.out.println("DAO id" + userId);
		System.out.println("DAO mananagement   " + (Management)HibernateTemplate.getManagementByUserId(userId));
		return (Management)HibernateTemplate.getManagementByUserId(userId);
	}

}
