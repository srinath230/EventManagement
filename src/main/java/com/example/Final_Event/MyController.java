package com.example.Final_Event;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@Autowired
	private EventRepository rp;
	
	@GetMapping("/")
	public String getEvents()
	{
		return "hello";
	}
	
	@GetMapping("/an")
	public List<Event> getEvent()
	{
		return rp.findAll();
	}
	
	@PostMapping("/addevent")
	public Event addEvent(@RequestBody Event event)
	{
		
		return rp.save(event);
		
	}
	
	@PutMapping("/updateevent")
	public Event updateEvent(@RequestBody Event event)
	{
		
		return rp.save(event);
		
	}
	
	@DeleteMapping("/deleteevent")
	public String deleteEvent(@RequestBody Event event)
	{
		rp.delete(event);
		return "you have successfully delete event";
	}

	
	
	
	

}
