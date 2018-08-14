package com.amicus.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/project")
public class ProjectController {
	
	@GetMapping(value = "/projectList")
	public String projectList(Model model) throws Exception {
		return "project/projectList";
	}
	
	public void projectSave() throws Exception {
		
	}
}
