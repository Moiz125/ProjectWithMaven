package com.back;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Account {

	@Id
	private int id;
	private String type;
	
	@ManyToOne
	private Person person;

	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Account(int id, String type, Person person) {
		super();
		this.id = id;
		this.type = type;
		this.person = person;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
}
