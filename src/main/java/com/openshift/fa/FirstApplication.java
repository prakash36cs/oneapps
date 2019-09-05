package com.openshift.fa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class FirstApplication {

		
	@GetMapping("/")
	public String welcome() {
		return "Hi Hello Bye";
	}
	
	@GetMapping("/{input}")
	public String welcome(@PathVariable String input ) {
		return "Hello "+input;
	}
	public static void main(String[] args) {
		SpringApplication.run(FirstApplication.class, args);
	}

}
