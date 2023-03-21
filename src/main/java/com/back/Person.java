package com.back;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Person {
	
	@Id
	private int age;
	private String name;
	
	@OneToMany(mappedBy="person")
	private List<Account> accs;
	
	public List<Account> getAccs() {
		return accs;
	}
	public void setAccs(List<Account> accs) {
		this.accs = accs;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(int age, String name, List<Account> accs) {
		super();
		this.age = age;
		this.name = name;
		this.accs = accs;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
