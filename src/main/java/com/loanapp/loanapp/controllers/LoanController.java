package com.loanapp.loanapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoanController {

	

	@GetMapping("/")
	public String getHomePage() {
	return "index";
	}
	 
}