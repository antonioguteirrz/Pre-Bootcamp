package com.antoniogutierrez.gettingFamiliar;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DojoController {
	@RequestMapping("/{dojo}")
	public String showDojo(@PathVariable("dojo") String dojo){
		return "Hi this is the dojo that you were looking for";
	}
	@RequestMapping("/{burbankDojo}/")
	public String burbankDojo(@PathVariable("burbankD") String burbankD) {
		return "This is the Burbank Dojo thing";
	}

}
