package com.amicus.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/request")
public class RequestController {
	
	@GetMapping(value="/requestList")
	public String requestList(Model model) throws Exception {
		return "request/requestList";
	}
	
	@GetMapping(value="/request")
	public String request(Model model) throws Exception {
		return "request/request";
	}
	
	@GetMapping(value="requestSave.json")
	public void requestSave(Model model) throws Exception {
		
	}
	
	
	
}
