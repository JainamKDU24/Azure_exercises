package com.kdu.exercise2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class Exercise2Application {

	public static void main(String[] args) {
		SpringApplication.run(Exercise2Application.class, args);
	}
	@RestController
	class HelloController {
		@GetMapping("/")
		public String index() {
			return "Hello Jainam,KD-24 batch (Azure)";
		}
	}

}
