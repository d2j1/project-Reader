package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import Model.User;

public class HibernateUser {
	
	
	public void add_user(User user) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session s = sf.openSession();
		
		Transaction t=null;
		
		try {
			t=s.beginTransaction();
		
			s.saveOrUpdate(user);
	
			t.commit();
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	
	
	public void retrive_user() {
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session s = sf.openSession();
		
		Transaction t=null;
		
		try {
			t=s.beginTransaction();
		
			s.saveOrUpdate(user);
	
			t.commit();
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	 public void reset_password() {
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session s = sf.openSession();
		
		Transaction t=null;
		
		try {
			t=s.beginTransaction();
		
			s.saveOrUpdate(user);
	
			t.commit();
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	 
	 
	 
	 
	 
}
