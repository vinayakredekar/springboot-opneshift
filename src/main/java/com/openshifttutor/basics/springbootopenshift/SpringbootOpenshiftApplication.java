package com.openshifttutor.basics.springbootopenshift;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringbootOpenshiftApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootOpenshiftApplication.class, args);
	}
	
	@GetMapping(path = "/hello")
	public String welcomeOpenshit() {
		return "Welcome to OpenShift!";
	}

}
