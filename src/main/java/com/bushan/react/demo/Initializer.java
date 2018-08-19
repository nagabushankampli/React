package com.bushan.react.demo;

import java.time.Instant;
import java.util.Collections;
import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.bushan.react.demo.model.Event;
import com.bushan.react.demo.model.Group;
import com.bushan.react.demo.model.GroupRepository;



@Component
public class Initializer implements CommandLineRunner {
	
	private final GroupRepository repository;
	
	public  Initializer(GroupRepository repository) {
		
		this.repository = repository;
	}


	@Override
	public void run(String... strings) throws Exception {
		
		Stream.of("Bushan JUG","Kampli JUG","Rohin JUG","Raginee JUG").
		forEach(name -> repository.save(new Group(name)));
		
		Group bjug = repository.findByName("Bushan JUG");
		
		Event e = new Event("Full Stack Reactive","Reactive with Spring boot + React",Instant.now());
		bjug.setEvents(Collections.singleton(e));
		repository.save(bjug);
		
		repository.findAll().forEach(group -> System.out.println(group.getName()));
		
	} 
	
	
	
	

}
