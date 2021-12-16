package com.AllSecurity.securitydemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController {
	
	@RequestMapping("/home")
	public String getHome(){
			return "<h1>Hello</h1>";
	}

}

