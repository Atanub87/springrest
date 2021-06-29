package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Dog {
	@Id@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private String breed;
	@OneToOne(mappedBy="dog")
	private Person person;
	
	public Dog() {
		// TODO Auto-generated constructor stub
	}
	
	public Dog(String breed) {
		this.breed = breed;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

}
