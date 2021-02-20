package com.recruitment.feedback.feedbackservice.models;

import java.util.UUID;

public class Hotels {

	String name;
	String category;
	String location;
	UUID id;
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
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public Hotels(String name, String category, String location, UUID id) {
		super();
		this.name = name;
		this.category = category;
		this.location = location;
		this.id = id;
	}
	public Hotels() {
		super();
	}
	@Override
	public String toString() {
		return "Hotels [name=" + name + ", category=" + category + ", location=" + location + ", id=" + id + "]";
	}
	
	
	
	
	
}
