package com.codingdojo.controllers;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class UsersController {
	
	@RequestMapping( value = "/login", method = RequestMethod.GET )
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping( value = "/register", method = RequestMethod.GET )
	public String register() {
		return "redirect:/login";
	}
}
