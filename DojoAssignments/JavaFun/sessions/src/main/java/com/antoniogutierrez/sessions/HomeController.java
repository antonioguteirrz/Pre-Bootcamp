package com.antoniogutierrez.sessions;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/your_server")
public class HomeController {

	@RequestMapping("")
    public String index(HttpSession session) {
    	session.setAttribute("count", +1);
        return "home.jsp";
    }
	public void testing(HttpSession session) {
		
		session.setAttribute("count", +1);
	}
    @RequestMapping("/counter")
    public String session(HttpSession session){
        return "counter.jsp";
    }
}