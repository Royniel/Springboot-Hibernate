package edu.neu.cyse0.pathfinder2.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import edu.neu.cyse0.pathfinder2.config.HibernateConfig;
import edu.neu.cyse0.pathfinder2.model.CourseRegistration;
import edu.neu.cyse0.pathfinder2.model.ExistingCourse;
import java.util.List;

@Component
public class CourseRegistrationDAOImp implements CourseRegistrationDAO {

	private SessionFactory sessionFactory = HibernateConfig.buildSessionFactory();

  
    public CourseRegistrationDAOImp(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public List<Object[]> findCoursesByCriteria(String fieldOfEducation, String interests, String duration) {
        try (Session session = sessionFactory.openSession()) {
            String hql = "Select e.name FROM CourseRegistration WHERE fieldOfEducation = :field AND interests = :interests AND duration = :duration";
            Query<Object[]> query = session.createQuery(hql, Object[].class);
            query.setParameter("field", fieldOfEducation);
            query.setParameter("interests", interests);
            query.setParameter("duration", duration);
            return query.list();
        }
    }
}
