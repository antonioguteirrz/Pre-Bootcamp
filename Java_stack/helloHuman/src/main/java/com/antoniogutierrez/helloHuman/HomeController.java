package com.antoniogutierrez.helloHuman;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@RequestMapping("/your_server")
	public String index(@RequestParam (defaultValue="human") String name) {
		return "Hello, "+ name ;
	}

}
