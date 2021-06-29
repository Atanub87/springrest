package com.example.demo.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Person {
	@Id@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private String name;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "dog_id")
	private Dog dog;
	
	public Person() {

	}
	public Person(String name, Dog dog) {
		this.name = name;
		this.dog = dog;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Dog getDog() {
		return dog;
	}
	public void setDog(Dog dog) {
		this.dog = dog;
	}
	
	

}
