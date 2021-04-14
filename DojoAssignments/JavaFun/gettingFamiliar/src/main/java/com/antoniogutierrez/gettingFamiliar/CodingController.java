package com.antoniogutierrez.gettingFamiliar;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/coding")
public class CodingController {
	
	@RequestMapping("")
	public String codingI() {
		return "Hello Coding Dojo";
	}
	public String java() {
		return "Python/Django is great";
	}
	

}
