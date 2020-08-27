package controller;





import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import Model.Article;
import Model.User;

public class MainTest {
/*
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		User user= new User("djdghj","jadhghjav","dj23fghj1911@gmfgail.com","dghjhan jadhav");
		Article article= new Article("dsfdfdjhhgfdfd","adgffdfghjgfdgf");
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		
		Session s = sf.openSession();
		
		Transaction t=null;
		
	
		String queryString = "from User where email = :id";
		 
		Query query = s.createQuery(queryString);
		  query.setParameter("id", "dj231911@gmail.com");
		  Object queryResult = ((org.hibernate.Query) query).uniqueResult();
		  User user = (User)queryResult;session.getTransaction().commit();
	

		
		try {
			t=s.beginTransaction();
		  
			s.saveOrUpdate(user);
	s.saveOrUpdate(article);
			t.commit();
			
			System.out.println("Done");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	*/

}
