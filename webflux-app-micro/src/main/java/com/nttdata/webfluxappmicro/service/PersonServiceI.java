package com.nttdata.webfluxappmicro.service;

import com.nttdata.webfluxappmicro.model.Person;

import reactor.core.publisher.Flux;

public interface PersonServiceI {

	public Flux<Person> personas();
}
