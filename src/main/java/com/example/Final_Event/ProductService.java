package com.example.Final_Event;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
	@Autowired
	private EventRepository repo;
	@Autowired
	private PersonRepository pero;
	

}

