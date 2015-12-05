package com.contribute.india.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
	
	@RequestMapping(value="/register" ,method=RequestMethod.GET)
	public String register(){
		return "Hello world";
	}
	
	@RequestMapping(value="/login" ,method=RequestMethod.POST)
	public void login(){
		
	}
	
}
