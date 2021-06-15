//package com.rest.dto;
//
//import org.hibernate.*;
//import org.hibernate.cfg.*;
//import java.util.*;
//
//
//public class TestClient {
//	public static void main(String args[])
//	{
//		Configuration cfg=new AnnotationConfiguration();
//
//		cfg=cfg.configure("hibernate.cfg.xml");
//
//		SessionFactory factory=cfg.buildSessionFactory();
//
//		Session session=factory.openSession();
//
//		Transaction tx = session.beginTransaction();
//
//		Student student = new Student();
//		Date date = new Date();
//		student.setStudentId("17wh1a0561");
//		student.setStudentName("Keerthi");
//		student.setStudentDOB(date);
//		student.setStudentGender("Female");
//		student.setStudentDept("Cse");
//		student.setStudentMobile("9963605948");
//		student.setStudentUserId("palireddy.keerthi@gmail.com");
//		student.setStudentPassword("password");
//		student.setStudentClg("BVRITH");
//		student.setStudentSection("B");
//		student.setHomeAddress("7-662-4A-I");
//		student.setPincode("523316");
//		student.setCity("Markapur");
//		student.setDistrict("Prakasam");
//		student.setCountry("India");
//		
//		Attendance attendance1 = new Attendance();
//		attendance1.setAttendanceId(1);
//		attendance1.setStudentId("17wh1a0562");
//		attendance1.setModId(5);
//		attendance1.setDate(date);
//		attendance1.setResult("Pass");
//		
//		Attendance attendance2 = new Attendance();
//		attendance2.setAttendanceId(2);
//		attendance2.setStudentId("17wh1a0561");
//		attendance2.setModId(4);
//		attendance2.setDate(date);
//		attendance2.setResult("Pass");
//		
//		
//		student.getAttendance().add(attendance1);
//		student.getAttendance().add(attendance2);
//		
//		session.save(student);
//		session.save(attendance1);
//		session.save(attendance2);
//
//		tx.commit();
//		session.close();
//		System.out.println("Objects saved successfully...");
//
//
//
//	} 
//}
