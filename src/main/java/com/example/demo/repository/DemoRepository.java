package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Person;

public interface DemoRepository extends JpaRepository<Person, Long> {
	
	

}
