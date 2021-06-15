package com.ts.dao;

import java.util.List;

import org.hibernate.SessionFactory;

import com.rest.dto.Student;
import com.ts.db.HibernateTemplate;

public class StudentDAO {
	
	private SessionFactory factory = null;
	
	public int register(List<Student> student) {
		
		System.out.println("Inside DAO.." + student);
		//java.util.Date utilDate = new java.sql.Date(student.getJoinDate().getTime()); 
		return HibernateTemplate.addObject(student);
	}
	
	public List<Student> getAllStudents() {
		List<Student> students = (List)HibernateTemplate.getObjectListByQuery("From Student");
		System.out.println("Inside All Employees ..."+students);
		return students;	
	}
	
	
	public Student getStudent(String id) {
		return (Student)HibernateTemplate.getObject(Student.class,id);
	}
	
	public Student getStudByUserId(String userid) {
		return (Student)HibernateTemplate.getObjectByUserId(userid);
	}
	
}
