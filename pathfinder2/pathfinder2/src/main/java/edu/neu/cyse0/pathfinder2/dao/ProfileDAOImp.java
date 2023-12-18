package edu.neu.cyse0.pathfinder2.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.springframework.stereotype.Component;


import edu.neu.cyse0.pathfinder2.config.HibernateConfig;
import edu.neu.cyse0.pathfinder2.model.Profile;

@Component
public class ProfileDAOImp implements ProfileDAO {

	private SessionFactory sessionFactory = HibernateConfig.buildSessionFactory();

	 @Override
	    public Profile getProfileByEmail(String email) {
	        try (Session session = sessionFactory.openSession()) {
	            return session.get(Profile.class, email);
	        }
    }
}
