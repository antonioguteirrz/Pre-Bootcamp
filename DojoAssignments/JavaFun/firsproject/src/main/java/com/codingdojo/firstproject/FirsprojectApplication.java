package com.codingdojo.firstproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@SpringBootApplication
@RestController
public class FirsprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirsprojectApplication.class, args);
	}
	@RequestMapping("/")
	public String hello() {
		return "Hello world";
	}
}
