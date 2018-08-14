package com.amicus.user.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.amicus.user.model.User;
import com.amicus.user.service.UserService;
import com.amicus.util.valid.UserValidator;

/**
 * 
 * @author socoolheeya
 * @since 2018.08.11
 */

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private UserValidator userValidator;
	
	@GetMapping("/userList")
	public String userList(Model model) {
		model.addAttribute("userList", userService.getUserList());
		
		return "user/userList";
	}
	
	@GetMapping("/user")
	public String user(Model model) {
		model.addAttribute("user", userService.getUser("lwh0102@naver.com"));
		
		return "user/user :: #test";
	}
	
	@GetMapping("/userEdit/{email}")
	public String userEdit(@PathVariable("email")String email, Model model) {
		model.addAttribute("user", userService.getUser(email));
		return "user/userEdit";
	}
	
	@GetMapping("/userJoin")
	public String userJoin(Model model) {
		model.addAttribute("user", new User());
		
		return "user/userJoin";
	}
	
	@PostMapping("/userJoin")
	public String userJoin(@ModelAttribute("user") User user, Model model, BindingResult result) {
		userValidator.validate(user, result);
		
		if(result.hasErrors()) {
			return "user/userJoin";
		}
		
		userService.createUser(user);
		//securityService.autologin(user.getEmail(), user.getPassword());
		
		return "redirect:/main";
	}
	
	@PostMapping("/userUpdate")
	public String userSave(@ModelAttribute("user") @Valid User user, BindingResult error) {
		if(error.hasErrors()) {
			return "user/user";
		}
		userService.updateUser(user);
		
		return "redirect:/user/userList";
		
	}
	
}
