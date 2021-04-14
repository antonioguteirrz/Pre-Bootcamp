package com.codingdojo.firstproject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




@RestController
@RequestMapping("/hello")
public class HomeController {

	
	@RequestMapping("")
	public String hello() {
		return "Hello Wold";
	}
	@RequestMapping("/fun")
	public String fun() {
		return "Hello fun times at spring boot things";
	}
}
