package com.nttdata.webfluxappmicro.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.nttdata.webfluxappmicro.model.Person;

import reactor.core.publisher.Flux;

@Service
public class PersonServiceImpl implements PersonServiceI {

	@Override
	public Flux<Person> personas() {
		
		WebClient webClient = WebClient.create("http://localhost:8080");
		Flux<Person> personas1 = webClient.get()
		        .uri("/person-list-1")
		        .retrieve()
		        .bodyToFlux(Person.class);
		
		Flux<Person> personas2 = webClient.get()
		        .uri("/person-list-2")
		        .retrieve()
		        .bodyToFlux(Person.class);
		
		Flux<Person> personas3 = webClient.get()
		        .uri("/person-list-3")
		        .retrieve()
		        .bodyToFlux(Person.class);
		
		Flux<Person> personas4 = webClient.get()
		        .uri("/person-list-4")
		        .retrieve()
		        .bodyToFlux(Person.class);
		
		Flux<Person> lista = Flux.concat(personas1,personas2, personas3, personas4);

		lista.filter(porA -> porA.getFirstName().startsWith("A")).subscribe(person->System.out.println(person.getLastName()+", "+person.getFirstName()+" tiene " + person.getAge()+" de edad."));
		
		return lista;
	}

}
