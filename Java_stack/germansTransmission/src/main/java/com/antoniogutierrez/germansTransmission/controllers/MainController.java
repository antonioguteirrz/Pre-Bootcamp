package com.antoniogutierrez.germansTransmission.controllers;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.antoniogutierrez.germansTransmission.models.Warranty;
import com.antoniogutierrez.germansTransmission.services.WarrantyService;

@Controller
public class MainController {
	@Autowired
	private WarrantyService warrantyServ;
	
	@GetMapping("")
	public String home() {
		return "home.jsp";
	}

	@GetMapping("/checkwarranty")
	public String checkWarranty(@ModelAttribute("warrantyObj")Warranty warrantyObj) {
		System.out.println(warrantyObj.getWarrantyNumber());
		return "findWarranty.jsp";
	}
	
	
	@PostMapping("/checkWarranty")
	public String checkingWarranty(@ModelAttribute("warrantyObj")Warranty warrantyObj, Model model) throws IOException {
		
		Warranty personFound = warrantyServ.findWarranty(warrantyObj);
		if(personFound==null) {
			
			return "couldNotFind.jsp";
		}
		model.addAttribute("personFound", personFound);
		return "warrantyFound.jsp";
			}
		
		

	
		

	
	
	}


