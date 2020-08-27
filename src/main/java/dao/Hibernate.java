package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Hibernate {
	
	public void add_bookmarked_article() {
		
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
	
	
	public void remove_bookmarked_article() {
		
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
