package com.antoniogutierrez.languages.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.antoniogutierrez.languages.models.Language;
import com.antoniogutierrez.languages.services.LanguageService;

@Controller
@RequestMapping("/language")
public class MainController {
	@Autowired
	private LanguageService languageServ;
	
	@GetMapping("")
		public String index(@ModelAttribute("language")Language emptyUser) {
			return "home.jsp";
		}
	
	@PostMapping("/add")
	public String register(
			@Valid @ModelAttribute("userObj") Language filledLanguage, BindingResult results,
			HttpSession session
	) {
			Language newUser = languageServ.createLanguage(filledLanguage);
			session.setAttribute("user_id", newUser.getId());
			// RETURN REDIRECT TO HOME
			return "redirect:/testing";
		}
	}


