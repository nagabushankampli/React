package com.bushan.react.demo.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name ="user_group")

public class Group {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String name;
	
	private String address;
	private String city;
	private String stateOrProvince;
	private String country; 
	private String postalCode;
	
	@ManyToOne(cascade=CascadeType.PERSIST)
	 private User user;

	@OneToMany(fetch = FetchType.EAGER, cascade=CascadeType.ALL)
	private Set<Event> events;
	
	public Group()
	{
		
	}
	
	public Group(String name)
	{
		this.name = name;
	}

	public Group(Long id, String name, String address, String city, String stateOrProvince, String country,
			String postalCode, User user, Set<Event> events) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.city = city;
		this.stateOrProvince = stateOrProvince;
		this.country = country;
		this.postalCode = postalCode;
		this.user = user;
		this.events = events;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStateOrProvince() {
		return stateOrProvince;
	}

	public void setStateOrProvince(String stateOrProvince) {
		this.stateOrProvince = stateOrProvince;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Set<Event> getEvents() {
		return events;
	}

	public void setEvents(Set<Event> events) {
		this.events = events;
	}
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	
	
	

}
