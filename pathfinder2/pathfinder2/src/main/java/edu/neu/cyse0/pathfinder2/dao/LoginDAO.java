package edu.neu.cyse0.pathfinder2.dao;



import org.springframework.stereotype.Repository;

import edu.neu.cyse0.pathfinder2.model.LoginForm;

@Repository
public interface LoginDAO {
	LoginForm findByUsername(String username);
}
