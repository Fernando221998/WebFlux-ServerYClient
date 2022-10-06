package com.nttdata.webfluxservermicro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.webfluxservermicro.model.Person;
import com.nttdata.webfluxservermicro.service.PersonServiceI;

import reactor.core.publisher.Flux;

@RestController
public class ControllerPerson {

	@Autowired
	PersonServiceI personService;
	
	@GetMapping("/person-list-1")
	public Flux<Person> personList1(){
		return personService.personList1();
		
	}
	
	@GetMapping("/person-list-2")
	public Flux<Person> personList2(){
		return personService.personList2();
		
	}
	
	@GetMapping("/person-list-3")
	public Flux<Person> personList3(){
		return personService.personList3();
		
	}
	
	@GetMapping("/person-list-4")
	public Flux<Person> personList4(){
		return personService.personList4();
		
	}
}
