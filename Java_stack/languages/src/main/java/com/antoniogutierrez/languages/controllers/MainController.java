package com.antoniogutierrez.languages.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.antoniogutierrez.languages.models.Language;
import com.antoniogutierrez.languages.services.LanguageService;

@Controller
public class MainController {
	@Autowired
	private LanguageService languageServ;
	
	
	
	@GetMapping("language")
		public String index(@ModelAttribute("languageObj")Language emptyUser, 
							Model model,
							HttpSession session) {
		
		Long user_id = (Long) session.getAttribute("user_id");
		model.addAttribute("user_id", user_id);
		model.addAttribute("allLanguages", languageServ.allLanguages());
		
			return "home.jsp";
		}
	
	@PostMapping("language/add")
	public String register(
			@Valid @ModelAttribute("languageObj") Language filledLanguage, BindingResult results,
			HttpSession session, Model model
	) {
		

		if(results.hasErrors()) {
			model.addAttribute("allLanguages", languageServ.allLanguages());
			return "home.jsp";
		}
		else {
			Language newUser = languageServ.createLanguage(filledLanguage);
			session.setAttribute("user_id", newUser.getId());
			// RETURN REDIRECT TO HOME
			return "redirect:/language";}
		}
	@GetMapping("language/{id}/edit")
	public String edit(@PathVariable ("id") Long id, 
						Model model,
						HttpSession session){
		Language editLanguage = languageServ.findLanguage(id);
		
		model.addAttribute("languageObj", editLanguage);
		Long language_id = (Long) session.getAttribute("language_id");
		model.addAttribute("language_id", language_id);
		
		return "edit.jsp";
	}
	@PostMapping("language/{id}/edit")
	public String update(
			@PathVariable("id") Long id,
			@RequestParam(value="name") String name, 
			@RequestParam(value="creator") String creator, 
			@RequestParam(value="version") Integer version
		) {  
			
		languageServ.updateLanguage(id, name, creator, version);
		
		return "redirect:/language";
		}
	@GetMapping("language/{id}/show")
	public String show(@PathVariable("id") Long id,
						Model model,
						HttpSession session) {
		Language editLanguage = languageServ.findLanguage(id);
		
		model.addAttribute("languageObj", editLanguage);
		Long language_id = (Long) session.getAttribute("language_id");
		model.addAttribute("language_id", language_id);
		return "show.jsp";
	}
	
	}



