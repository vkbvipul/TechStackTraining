package com.techstacktraining.Greeting;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Greetings {
	@Id
	private long id;
	private String message;
	private String name;
	
	public Greetings() {
	}
	
	public Greetings(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		this.message = "Hello " + name + " !!!";
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String name) {
		this.message = "Hello " + name + " !!!";
	}

}
