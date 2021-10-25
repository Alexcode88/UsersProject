package com.codingdojo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Extra {
	@RequestMapping( value = "/extra", method = RequestMethod.GET )
	public String extra() {
		return "Extra";
	}
}
