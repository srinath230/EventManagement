package com.example.Final_Event;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Event {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private Integer event_id;
	private String event_date;
	private String title;
	public Integer getEvent_id() {
		return event_id;
	}
	public void setEvent_id(Integer event_id) {
		this.event_id = event_id;
	}
	public String getEvent_date() {
		return event_date;
	}
	public void setEvent_date(String event_date) {
		this.event_date = event_date;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((event_date == null) ? 0 : event_date.hashCode());
		result = prime * result + ((event_id == null) ? 0 : event_id.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Event other = (Event) obj;
		if (event_date == null) {
			if (other.event_date != null)
				return false;
		} else if (!event_date.equals(other.event_date))
			return false;
		if (event_id == null) {
			if (other.event_id != null)
				return false;
		} else if (!event_id.equals(other.event_id))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Event [event_id=" + event_id + ", event_date=" + event_date + ", title=" + title + "]";
	}
	public Event() {
		super();
		// TODO Auto-generated constructor stub
	}
	


}
