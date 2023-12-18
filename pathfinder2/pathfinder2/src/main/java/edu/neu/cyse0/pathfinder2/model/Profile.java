package edu.neu.cyse0.pathfinder2.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.List;

@Entity
@Table(name = "profile")
public class Profile {
    @Id
    private String email;
    public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public List<String> getInterests() {
		return interests;
	}
	public void setInterests(List<String> interests) {
		this.interests = interests;
	}
	public List<String> getCoursesRegistered() {
		return coursesRegistered;
	}
	public void setCoursesRegistered(List<String> coursesRegistered) {
		this.coursesRegistered = coursesRegistered;
	}
	private String name;
    private String phoneNumber;
    private List<String> interests; // Assuming this is a comma-separated string
    private List<String> coursesRegistered;

    // Getters and setters

    // ... Rest of your class ...
}
