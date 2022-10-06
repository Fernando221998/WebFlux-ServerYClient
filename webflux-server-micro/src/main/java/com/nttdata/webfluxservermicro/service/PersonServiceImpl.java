package com.nttdata.webfluxservermicro.service;

import java.time.Duration;

import org.springframework.stereotype.Service;

import com.nttdata.webfluxservermicro.model.Person;

import reactor.core.publisher.Flux;

@Service
public class PersonServiceImpl implements PersonServiceI {

	@Override
	public Flux<Person> personList1() {
		Flux<Person> person = Flux.just(new Person("Fernando", "Cornejo", 24)).delayElements(Duration.ofSeconds(1));
		return person;
	}

	@Override
	public Flux<Person> personList2() {
		Flux<Person> person = Flux.just(new Person("Antonio", "Hernandez", 34)).delayElements(Duration.ofSeconds(3));
		return person;
	}

	@Override
	public Flux<Person> personList3() {
		Flux<Person> person = Flux.just(new Person("Marcos", "Fernandez", 44)).delayElements(Duration.ofSeconds(6));
		return person;
	}

	@Override
	public Flux<Person> personList4() {
		Flux<Person> person = Flux.just(new Person("Maria", "Ignacio", 14)).delayElements(Duration.ofSeconds(8));
		return person;
	}
}
