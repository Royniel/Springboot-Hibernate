package edu.neu.cyse0.pathfinder2.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


import edu.neu.cyse0.pathfinder2.config.HibernateConfig;
import edu.neu.cyse0.pathfinder2.model.LoginForm;

@Component
public class LoginDAOImp implements LoginDAO{
	
	private SessionFactory sessionFactory = HibernateConfig.buildSessionFactory();
	  	
	
	  public LoginDAOImp(SessionFactory sessionFactory) {
	        this.sessionFactory = sessionFactory;
	    }

	    @Override
	    public LoginForm findByUsername(String username) {
	        try (Session session = sessionFactory.openSession()) {
	            Query<LoginForm> query = session.createQuery(
	                "FROM LoginForm l WHERE l.username = :username", LoginForm.class);
	            query.setParameter("username", username);
	            return query.uniqueResult(); // Assuming username is unique
	        }
	    }

}
