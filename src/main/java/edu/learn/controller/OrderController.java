package edu.learn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.learn.service.OrderService;

@Controller
public class OrderController {
	
	@Autowired
	private OrderService orderService;
	
	@RequestMapping(value= {"/","/home"},method=RequestMethod.GET)
	public String showHome(Model model) {
		model.addAttribute("message", "Spring MVC Test Page");
		return "welcome";
	}
	
	@RequestMapping(value="/orders",method=RequestMethod.GET)
	public String showOrders(Model model) {
		
		model.addAttribute("orderList", orderService.getOrders());
		return "orders-form";
	}
	
	

}
