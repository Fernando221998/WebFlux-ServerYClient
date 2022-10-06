package com.nttdata.webfluxservermicro.service;

import com.nttdata.webfluxservermicro.model.Person;

import reactor.core.publisher.Flux;

public interface PersonServiceI {

	public Flux<Person> personList1();
	
	public Flux<Person> personList2();
	
	public Flux<Person> personList3();
	
	public Flux<Person> personList4();
}
