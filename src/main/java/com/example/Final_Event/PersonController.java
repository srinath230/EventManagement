package com.example.Final_Event;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
	
	@Autowired
	private PersonRepository pr;
	
	@GetMapping("/and")
	public List<Person> getPersons()
	{
		return pr.findAll();
	}
	
	@PostMapping("/addPerson")
	public Person addEvent(@RequestBody Person person)
	{
		
		return pr.save(person);
		
	}

	@PutMapping("/updateperson")
	public Person updateEvent(@RequestBody Person event)
	{
		
		return pr.save(event);
		
	}
	
	@DeleteMapping("/deleteperson")
	public String deleteEvent(@RequestBody Person event)
	{
		pr.delete(event);
		return "you have successfully delete event";
	}
}

