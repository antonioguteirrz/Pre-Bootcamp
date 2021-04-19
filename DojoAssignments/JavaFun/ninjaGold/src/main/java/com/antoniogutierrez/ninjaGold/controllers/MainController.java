package com.antoniogutierrez.ninjaGold.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/gold")
public class MainController {
	 List<String> str_list = new ArrayList<String>();
	@GetMapping("")
	public String index(HttpSession session) {

		
		 
		

		if(session.getAttribute("number").equals( "farm")) {
			Integer gold = (Integer) session.getAttribute("gold");
			Random r = new Random();
			int low = 10;
			int high = 20;
			int result = r.nextInt(high-low) + low;
			gold = gold + result;
			session.setAttribute("gold", gold);
			str_list.add("Added " +result + " gold");
		}
		if(session.getAttribute("number").equals( "cave")) {
			Integer gold = (Integer) session.getAttribute("gold");
			Random r = new Random();
			int low = 5;
			int high = 10;
			int result = r.nextInt(high-low) + low;
			gold = gold + result;
			session.setAttribute("gold", gold);
			str_list.add("Added " +result + " gold");
		}
		if(session.getAttribute("number").equals( "house")) {
			Integer gold = (Integer) session.getAttribute("gold");
			Random r = new Random();
			int low = 2;
			int high = 5;
			int result = r.nextInt(high-low) + low;
			gold = gold + result;
			session.setAttribute("gold", gold);
			str_list.add("Added " +result + " gold");
		}
		if(session.getAttribute("number").equals( "casino")) {
			Integer gold = (Integer) session.getAttribute("gold");
			Random r = new Random();
			int low = -50;
			int high = 50;
			int result = r.nextInt(high-low) + low;
			gold = gold + result;
			session.setAttribute("gold", gold);
			str_list.add("Added " +result + " gold");
		}
		if(session.getAttribute("number").equals( "reset")) {
			str_list.clear();
			session.setAttribute("gold", 0);
		}
		 session.setAttribute("added_list", str_list);
		return "index.jsp";
	}
	
	@PostMapping("/process")
	public String process(
		@RequestParam(value = "which_form") String e, HttpSession session
	
	) {
		
		session.setAttribute("number",e);
		
	return "redirect:/gold";
	}

}
