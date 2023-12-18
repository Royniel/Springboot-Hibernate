package edu.neu.cyse0.pathfinder2.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import edu.neu.cyse0.pathfinder2.config.HibernateConfig;
import edu.neu.cyse0.pathfinder2.model.Registration;

@Component
public class RegistrationDAOImp implements RegistrationDAO {

	private SessionFactory sessionFactory = HibernateConfig.buildSessionFactory();
  	
    public RegistrationDAOImp(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void save(Registration registration) {
        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            session.saveOrUpdate(registration);
            session.getTransaction().commit();
        }
    }

    // Other methods as needed
}
