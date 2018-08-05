package com.bushan.react.demo.model;

import java.time.Instant;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;


@Entity
public class Event {

    @Id
    @GeneratedValue
    private Long id;
    private Instant date;
    private String title;
    private String description;
    @ManyToMany
    private Set<User> attendees;
    
   public Event()
   {
	   
   }
    
   public Event(String title,String desc,Instant date) {
	   this.title = title;
	   this.description = desc;
	   this.date = date;
    	
    }



public Instant getDate() {
	return date;
}



public void setDate(Instant date) {
	this.date = date;
}



public String getTitle() {
	return title;
}



public void setTitle(String title) {
	this.title = title;
}



public String getDescription() {
	return description;
}



public void setDescription(String description) {
	this.description = description;
}



public Set<User> getAttendees() {
	return attendees;
}



public void setAttendees(Set<User> attendees) {
	this.attendees = attendees;
}
   
	
}