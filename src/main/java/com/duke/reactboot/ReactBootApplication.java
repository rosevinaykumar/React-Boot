package com.duke.reactboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ReactBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReactBootApplication.class, args);
	}

}
