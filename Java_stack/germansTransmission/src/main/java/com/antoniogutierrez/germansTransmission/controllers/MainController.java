package com.antoniogutierrez.germansTransmission.controllers;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.antoniogutierrez.germansTransmission.services.WarrantyService;

@Controller
public class MainController {
	@Autowired
	private WarrantyService warrantyServ;
	

	
	@GetMapping("/newwarranty")
	public String index() throws IOException {
		
		String warranty = " Warratny number 3";
		warrantyServ.findWarranty(warranty);
		return "home.jsp";
			}
	
	
	}


