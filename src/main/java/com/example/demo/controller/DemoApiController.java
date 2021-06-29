package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Dog;
import com.example.demo.model.Person;
import com.example.demo.repository.DemoRepository;
import com.example.demo.repository.DogRepository;

@RestController
public class DemoApiController {
	
	@Autowired
	DemoRepository demoRepository;
	
	@Autowired
	DogRepository dogRepository;
	
	@GetMapping("/persons")
	public List<Person> getAllPersons() {
		return demoRepository.findAll();
	}
	
	@PostMapping("/person")
	public Person addPerson(@RequestBody Person person) {
		return demoRepository.save(person);
	}
	
	@PostMapping("/dog")
	public Dog addDog(@RequestBody Dog dog) {
		return dogRepository.save(dog);
	}
	
}
