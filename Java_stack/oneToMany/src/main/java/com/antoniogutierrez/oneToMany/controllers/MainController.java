package com.antoniogutierrez.oneToMany.controllers;


import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.antoniogutierrez.oneToMany.models.Dojo;
import com.antoniogutierrez.oneToMany.models.Ninja;
import com.antoniogutierrez.oneToMany.services.MainService;

@Controller
public class MainController {
	
	
	public final MainService mainServ;
	
	public MainController(MainService mainServ) {
		this.mainServ = mainServ;
	}
	
	
	@GetMapping("/home")
	public String home() {
		return "home.jsp";
	}
	@GetMapping("/dojos/{id}")
	public String display(@PathVariable("id") Long id,  Model model, HttpSession session) {
		Dojo displayDojo = mainServ.findDojo(id);
		
		Long dojo_id = displayDojo.getId();
		String dojo_name = displayDojo.getName();
		session.setAttribute("dojo_id", dojo_id) ;
		session.setAttribute("dojo_name", dojo_name);
		List <Ninja> allNinjas = mainServ.allNinjas();
		List <Dojo> allDojos = mainServ.allDojos();
		model.addAttribute("allNinjas", mainServ.allNinjas());
		
		
		return "display.jsp";
	}
	@GetMapping("/newDojo")
	public String dojo(@ModelAttribute("dojoObj")Dojo emptyobj, 
					 	Model model,
					 	HttpSession session) {
		
				model.addAttribute("allDojos", mainServ.allDojos());
		
		
		
		return "newDojo.jsp";
	}
	@PostMapping("/newDojo")
	public String newDojo(@Valid @ModelAttribute("dojoObj")Dojo filledObj,
							BindingResult results
							) {
		
		if(results.hasErrors()) {
			return "newDojo.jsp";
		}
		else {
			mainServ.createDojo(filledObj);
			return "redirect:/home";
		}
	}
	
	@GetMapping("/newNinja")
	public String ninja(@ModelAttribute("ninjaObj")Ninja emptyobj, 
		 	Model model,
		 	HttpSession session) {
	List <Dojo> allDojos = mainServ.allDojos();
	model.addAttribute("allDojos", mainServ.allDojos());

return "newNinja.jsp";
		
	}
	
		@PostMapping("/newNinja")
		public String createNinja(@Valid @ModelAttribute("ninjaObj")Ninja filledObj,
				BindingResult results, HttpSession session,RedirectAttributes redirectAttributes
				) {

			if(results.hasErrors()) {
				return "newNinja.jsp";
				}
			else {
				Ninja newNinja = mainServ.createNinja(filledObj);
						Long dojo_id = newNinja.getDojo().getId();
						String dojo_name = newNinja.getDojo().getName();
				session.setAttribute("dojo_id", dojo_id) ;
				session.setAttribute("dojo_name", dojo_name);
				
				
			return "redirect:/dojos/"+ dojo_id;
		}
			}
	
}
