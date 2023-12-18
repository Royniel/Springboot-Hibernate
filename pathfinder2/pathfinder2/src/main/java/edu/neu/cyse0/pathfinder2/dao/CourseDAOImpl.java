// CourseDAOImpl.java
package edu.neu.cyse0.pathfinder2.dao;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


import java.util.List;

import edu.neu.cyse0.pathfinder2.config.HibernateConfig;
import edu.neu.cyse0.pathfinder2.model.ExistingCourse;

@Component
public class CourseDAOImpl implements CourseDAO {

	
private SessionFactory sessionFactory = HibernateConfig.buildSessionFactory();
   

 
@Override
public List<Object[]> findByCategory(String category) {
    try (Session session = sessionFactory.openSession()) {
        Query<Object[]> query = session.createQuery(
            "SELECT e.name, e.duration, e.category FROM ExistingCourse e WHERE e.category = :category", Object[].class);
        query.setParameter("category", category);
        return query.list();
    }
}

    // constructor and other methods

	@Override
	public List<ExistingCourse> findAll() {
	    try (Session session = sessionFactory.openSession()) {
	        Query<ExistingCourse> query = session.createQuery("FROM ExistingCourse", ExistingCourse.class);
	        return query.list();
	    }
	}
	
}
