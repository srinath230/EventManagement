package com.example.Final_Event;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name = "person")
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer person_id;
	private Integer age;
	String first_name;
	String last_name;
	@ManyToMany(fetch = FetchType.LAZY,
            cascade = {
                CascadeType.DETACH
            })
    @JoinTable(name = "person_event",
            joinColumns = { @JoinColumn(name = "person_id") },
            inverseJoinColumns = { @JoinColumn(name = "event_id") })
    private Set<Event> event;
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
	public Set<Event> getEvent() {
		return event;
	}
	public void setEvent(Set<Event> event) {
		this.event = event;
	}
	
	
    


}
