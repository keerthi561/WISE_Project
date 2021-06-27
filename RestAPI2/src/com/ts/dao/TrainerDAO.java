
package com.ts.dao;
import java.util.List;
import org.hibernate.SessionFactory;
import com.rest.dto.Trainer;
import com.ts.db.HibernateTemplate;
public class TrainerDAO {
private SessionFactory factory = null;
	
	public int register(List<Trainer> trainer) {
		
		System.out.println("Inside DAO.." + trainer);
		//java.util.Date utilDate = new java.sql.Date(student.getJoinDate().getTime()); 
		return HibernateTemplate.addTrainerObject(trainer);
	}
	
	public List<Trainer> getAllTrainer() {
		List<Trainer> trainers = (List)HibernateTemplate.getObjectListByQuery("From Trainer");
		System.out.println("Inside All  ..."+trainers);
		return trainers;	
	}
	
	
	public Trainer getTrainer(String id) {
		return (Trainer)HibernateTemplate.getTrainerObject(Trainer.class,id);
	}
	
	public Trainer getTrainerByUserId(String userId) {
		System.out.println("DAO id" + userId);
		System.out.println("DAO trainer   " + (Trainer)HibernateTemplate.getTrainerByUserId(userId));
		return (Trainer)HibernateTemplate.getTrainerByUserId(userId);
	}

}
