package com.antoniogutierrez.displayDate;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;




@Controller
public class HomeController {
@RequestMapping("/")
public String index() {
	return "index.jsp";
}

@RequestMapping("/date")
public String date( Model model) {
	Date date = new java.util.Date();
	String formatdate2 = String.format("Current Date: %1$tA, %1$td %1$tB, %1$tY", date);
	model.addAttribute("formatdate2", formatdate2);
	return "date.jsp";
}
@RequestMapping("/time")
public String time( Model model) {
	Date date = new java.util.Date();
	String formatdate2 = String.format("Current Time: %1$tr", date);
	model.addAttribute("formatdate2", formatdate2);
	
	return "time.jsp";
}
}
