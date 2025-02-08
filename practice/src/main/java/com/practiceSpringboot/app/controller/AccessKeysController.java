package com.practiceSpringboot.app.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/v2/practice/")
public class AccessKeysController {
	
	@Value("${SENDGRID_API_KEY}")
	private String sendgridApi;
	@GetMapping("/health")
	public String getHealth() {
		return "app running ok";
	}
	@GetMapping("get-keys")
	public String getkeys() {
		String apikey= System.getenv("SENDGRID_API_KEY");
		System.out.println("Sendgrid key :"+apikey);
		return "keys are added successfully";
	}
}
