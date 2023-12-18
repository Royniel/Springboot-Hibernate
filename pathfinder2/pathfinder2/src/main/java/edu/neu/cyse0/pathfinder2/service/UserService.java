package edu.neu.cyse0.pathfinder2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.neu.cyse0.pathfinder2.dao.LoginDAO;
import edu.neu.cyse0.pathfinder2.model.LoginForm;

@Service
public class UserService {

    @Autowired
    private LoginDAO loginDAO; // Injecting the DAO

    /**
     * Authenticates a user based on username and password.
     *
     * @param username The username of the user.
     * @param password The password of the user.
     * @return true if authentication is successful, false otherwise.
     */
    public boolean authenticate(String username, String password) {
        LoginForm user = loginDAO.findByUsername(username);
        if (user != null && user.getPassword().equals(password)) {
            System.out.println(password);
            System.out.println(username);
        	return true; // User is authenticated
        }
        return false; // Authentication failed
    }
}
