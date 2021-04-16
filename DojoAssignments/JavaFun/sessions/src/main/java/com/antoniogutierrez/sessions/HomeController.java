package com.antoniogutierrez.sessions;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/your_server")
public class HomeController {

	@RequestMapping("")
    public String index(HttpSession session) {
    	if(session.getAttribute("counter")== null){
    		session.setAttribute("counter",0);
    		}
    	else {
    		Integer sessionCounter =(Integer) session.getAttribute("counter");
    		sessionCounter++;
    		session.setAttribute("counter", sessionCounter);
        
    }
    	return "home.jsp";
    	}
	
    @RequestMapping("/counter")
    public String session(Model model, HttpSession session){
    	Integer counter = (Integer) session.getAttribute("counter");
    	model.addAttribute("visits", counter);
    	return "counter.jsp";

    	}

    }
