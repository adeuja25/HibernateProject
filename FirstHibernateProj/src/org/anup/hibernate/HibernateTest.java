package org.anup.hibernate;

import java.util.List;

import org.anup.javabrains.dto.UserDetails;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateTest {

	public static void main(String[] args) {
		
		/*UserDetails user = new UserDetails();
		user.setUserName("Test User");*/
		
		//asks hibernate for configuration file
		// session factory always created once in an application
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession(); // opens new session
		session.beginTransaction(); // creates new transaction
		
		Query query = session.getNamedQuery("UserDetails.byId");
		query.setInteger(0, 2);
		
		
	//	Query query = session.createQuery("select userName from UserDetails"); //hql
	//	query.setFirstResult(3); // set the start of the resultset, starts from 4th to 5th
	//	query.setMaxResults(4); //starts from 3 and gets 4 results , also known as pagination
	//	List<UserDetails> users = (List<UserDetails>)query.list();// returns the list of all the table
		
//		List<String> userNames = (List<String>)query.list();
		/*for(int i = 0;i<10;i++){
			UserDetails user = new UserDetails();
			user.setUserName("User " + i);
			session.save(user); // inserting 10 values from a for loop
		}*/
		
		// UserDetails user = (UserDetails) session.get(UserDetails.class,1);
		
		// once you pass an object to a save any actions even after save will be updated
		// last update before save will go into the database
		//session.save(user); // persistence object, user.setUsername is transient object
		
		//session.update(user);
		//session.delete(user); // delete a record that corresponds to user object
		// session.persist(user); // persist means @cascade needs to happen
		session.getTransaction().commit(); // commits transaction
	
		session.close(); // closes the session, usually on finally block, once session is closed object becomes detached object

//		for(String u : userNames)
//			System.out.println(u);
	
		/* // put object into model object we do the casting
		user = (UserDetails) session.get(UserDetails.class, 1); // 1 is primary key userId 1 to fetch*/
		//sessionFactory.close();
	}

}
