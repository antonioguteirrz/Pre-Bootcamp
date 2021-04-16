package com.antoniogutierrez.theCode.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class MainController {
	@RequestMapping("")
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping(value = "/process", method = RequestMethod.POST)
	public String process(
			@RequestParam(value="code") String code
			) {
		System.out.println(code);
		String terminal = "bushido";
		System.out.println(terminal);
		if (code.equals(terminal)) {
			System.out.println(code);
			return "redirect:/code";
		}
		else {
		return "redirect:/createError";
		}
		
	}
	@RequestMapping("/createError")
	 public String flashMessages(RedirectAttributes redirectAttributes) {
		redirectAttributes.addFlashAttribute("error", "Not the correct code!Please try again");
	    	return "redirect:/";
	        }
	   
	@RequestMapping("/code")
	public String code() {
		return "Display.jsp";
	}

}