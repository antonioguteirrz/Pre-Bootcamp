package com.antoniogutierrez.germansTransmission.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.antoniogutierrez.germansTransmission.models.Warranty;
import com.antoniogutierrez.germansTransmission.services.WarrantyService;

@Controller
public class MainController {
	
	@Autowired 
	private WarrantyService warrantyServ;
	
	
	
	@GetMapping("/newwarranty")
	public String index() {
		return "home.jsp";
	}
	
	@PostMapping("/newWarranty")
	public String newWarranty(	@Valid @ModelAttribute("warrantyObj") Warranty filledWarranty, 
								BindingResult results,
								Model model
			) {
				// IF ERRORS, DISPLAY THE SAME JSP
				if(results.hasErrors()) {
					model.addAttribute("allWarranties", warrantyServ.allWarranties());
					return "home.jsp";
				}
				// IF NO ERRORS CREATE SHOW AND REDIRECT
				else {
					warrantyServ.saveWarranty(filledWarranty);
					return "redirect:/newwarranty";
				}
			}
	}


