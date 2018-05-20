package com.chrisSpringBoot.firstspringboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class anotherSpringEndPoint {

	@RequestMapping("/another")
	public String index(){
		return "What about this";


	}

}