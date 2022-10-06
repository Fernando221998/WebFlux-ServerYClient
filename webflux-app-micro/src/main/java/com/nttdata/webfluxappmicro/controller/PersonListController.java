package com.nttdata.webfluxappmicro.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.nttdata.webfluxappmicro.model.Person;
import com.nttdata.webfluxappmicro.service.PersonServiceI;

import reactor.core.publisher.Flux;

@Controller
public class PersonListController {
	
	@Autowired
	PersonServiceI personServiceI;
	
	@GetMapping("/person-list")
	public String personList(Model model){
		Flux<Person> personlist = personServiceI.personas();
		model.addAttribute("personlist", personlist);
		return "personList";
	}

}
