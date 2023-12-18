package edu.neu.cyse0.pathfinder2.model;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "courses")
public class ExistingCourse {
    @Id
    @GeneratedValue
	private Long id;
    private String name;
    private String category;
    private String duration;
    
    public ExistingCourse() {
        // Default constructor
    }

    
    public ExistingCourse(String name, String duration, String category) {
        this.name = name;
        this.duration = duration;
        this.category = category;
    }
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	

    // Constructors, getters, setters
}
