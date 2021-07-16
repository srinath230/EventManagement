package com.example.Final_Event;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
@Entity
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer person_id;
	private Integer age;
	String first_name;
	String last_name;
	@OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name="persont_id")
    private Set<Person_Event> person_events;
    
    
	public Set<Person_Event> getPerson_events() {
		return person_events;
	}
	public void setPerson_events(Set<Person_Event> person_events) {
		this.person_events = person_events;
	}
	public Integer getPerson_id() {
		return person_id;
	}
	public void setPerson_id(Integer person_id) {
		this.person_id = person_id;
	}
	
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	

}
