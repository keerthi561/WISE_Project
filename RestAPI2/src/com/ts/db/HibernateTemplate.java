package com.ts.db;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.rest.dto.CollegeManagement;
import com.rest.dto.Management;
import com.rest.dto.Student;
import com.rest.dto.Trainer;


public class HibernateTemplate {

	private static SessionFactory sessionFactory;
	static
	{
		sessionFactory=new Configuration().configure().buildSessionFactory();
	}
	
	
	public static int addObject(List<Student> student)
	{
		System.out.println("Inside Hibernate...");
		int result=0;
		Transaction tx=null;
		
		try {
			
			Session session=sessionFactory.openSession();
			tx=session.beginTransaction();
			for (Student stud : student) {
				session.save(stud);
			}
			
			
			tx.commit();
			
			result=1;
			
		} catch (Exception e) {
		
			tx.rollback();
			
			e.printStackTrace();
		}
		
		return result;
	}
	
	public static int addTrainerObject(List<Trainer> employee)
	{
		System.out.println("Inside Hibernate...");
		int result=0;
		
		Transaction tx=null;
		
		try {
			
			Session session=sessionFactory.openSession();
			System.out.println(session);
			tx=session.beginTransaction();
			for (Trainer emp : employee) {
				session.save(emp);
			}
			
			
			tx.commit();
			
			result=1;
			
		} catch (Exception e) {
		
			tx.rollback();
			
			e.printStackTrace();
		}
		
		return result;
	}
	public static int addManagementObject(List<Management> management)
	{
		System.out.println("Inside Hibernate...");
		int result=0;
		
		Transaction tx=null;
		
		try {
			
			Session session=sessionFactory.openSession();
			System.out.println(session);
			tx=session.beginTransaction();
			for (Management mana : management) {
				session.save(mana);
			}
			
			
			tx.commit();
			
			result=1;
			
		} catch (Exception e) {
		
			tx.rollback();
			
			e.printStackTrace();
		}
		
		return result;
	}
	public static int addCollegeManagementObject(List<CollegeManagement>collegeManagement)
	{
		System.out.println("Inside Hibernate...");
		int result=0;
		
		Transaction tx=null;
		
		try {
			
			Session session=sessionFactory.openSession();
			tx=session.beginTransaction();
			for (CollegeManagement mana : collegeManagement) {
				session.save(mana);
			}
			
			
			tx.commit();
			
			result=1;
			
		} catch (Exception e) {
		
			tx.rollback();
			
			e.printStackTrace();
		}
		
		return result;
	}
	
	public static Object getObject(Class c,Serializable serializable)
	{
		Object obj=null;
		
		try {			
			return sessionFactory.openSession().get(c,serializable);
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return obj;
	}
	
	public static Object getTrainerObject(Class c,Serializable serializable)
	{
		Object obj=null;
		
		try {			
			return sessionFactory.openSession().get(c,serializable);
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return obj;
	}

	public static Object getObjectByUserId(String userId) {
	String queryString = "from Student where studentUserId = :userId";
	  Query query = sessionFactory.openSession().createQuery(queryString);
	  query.setString("userId", userId);
	  Object queryResult = query.uniqueResult();
	  Student student = (Student)queryResult;
	  return student; 
	}
	public static Object getTrainerByUserId(String userId) {
		String queryString = "from Trainer where trainerUserId = :userId";
		  Query query = sessionFactory.openSession().createQuery(queryString);
		  query.setString("userId", userId);
		  Object queryResult = query.uniqueResult();
		  Trainer trainer = (Trainer)queryResult;
		  return trainer; 
		}
	
	public static Object getManagementByUserId(String userId) {
		String queryString = "from Management where managementUserId = :userId";
		  Query query = sessionFactory.openSession().createQuery(queryString);
		  query.setString("userId", userId);
		  Object queryResult = query.uniqueResult();
		  Management management = (Management)queryResult;
		  System.out.println("hibernate management " + management);
		  return management; 
	}
	public static Object getCollegeManagementByUserId(String id) {
		String queryString = "from CollegeManagement where id = :id";
		  Query query = sessionFactory.openSession().createQuery(queryString);
		  query.setString("id", id);
		  Object queryResult = query.uniqueResult();
		  CollegeManagement collegeManagement = (CollegeManagement)queryResult;
		  System.out.println("hibernate management " + collegeManagement);
		  return collegeManagement; 
	}
	
	
	public static List<Object> getObjectListByQuery(String query)
	{
		return sessionFactory.openSession().createQuery(query).list();
	}
//	
//	public static int updateObject(Object obj)
//	{
//		int result=0;
//		
//		Transaction tx=null;
//		
//		try {
//			
//			Session session=sessionFactory.openSession();
//			tx=session.beginTransaction();
//			
//			session.saveOrUpdate(obj);
//			
//			tx.commit();
//			
//			result=1;
//			
//		} catch (Exception e) {
//		
//			tx.rollback();
//			
//			e.printStackTrace();
//		}
//		
//		return result;
//	}
//	
//	public static int deleteObject(Class c,Serializable serializable)
//	{
//		int result=0;
//		
//		Session session=sessionFactory.openSession();
//		
//		Transaction tx=session.beginTransaction();
//		
//		try {
//			
//			Object obj=session.get(c,serializable);
//			
//			session.delete(obj);
//			
//			tx.commit();
//			
//			result=1;
//						
//		} catch (Exception e) {
//			
//			e.printStackTrace();
//			
//			tx.rollback();
//		}
//		
//		return result;
//	}
	
}
