package com.amicus.main.controller;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.amicus.user.model.User;
import com.amicus.user.service.SecurityService;
import com.amicus.user.service.UserService;
import com.amicus.util.common.EmailService;

/**
 * 
 * @author socoolheeya
 * @since 2018.07.20
 */

@Controller
public class MainController {
	
	private static Logger log = LoggerFactory.getLogger(MainController.class);
	
	@Value("${file.path}")
	private String filePath;
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private SecurityService securityService;
	
	@Autowired
	private EmailService emailService;
	
	@GetMapping("/main")
	public String main(Model model) {
		log.debug("***********************************************************************************");
		log.debug("* " + Thread.currentThread().getStackTrace()[1].getMethodName().toString() + "() param: ");
		log.debug("***********************************************************************************");
		
		userService.getUser("lwh0102@naver.com");
		model.addAttribute("filePath", filePath);
		
		return "main/main";
	}
	
	@GetMapping("/login")
	public String login(Model model) {
		log.debug("***********************************************************************************");
		log.debug("* " + Thread.currentThread().getStackTrace()[1].getMethodName().toString() + "() GET: ");
		log.debug("***********************************************************************************");
		model.addAttribute("user", userService.getUser("lwh0102@naver.com"));
		
		return "main/login";
	}
	
	@PostMapping(value="/login", produces="text/html")
	public void login(Model model, @ModelAttribute User user, BindingResult error, HttpSession session) {
		log.debug("***********************************************************************************");
		log.debug("* " + Thread.currentThread().getStackTrace()[1].getMethodName().toString() + "() param: ");
		log.debug("***********************************************************************************");
		if(error.hasErrors()) {
			
		} else {
			securityService.autologin(user, session);
		}
	}
	
	@GetMapping("/logout")
	public String logout(User user, HttpSession session) {
		log.debug("***********************************************************************************");
		log.debug("* " + Thread.currentThread().getStackTrace()[1].getMethodName().toString() + "() param: " + user.toString());
		log.debug("***********************************************************************************");
		session.invalidate();
		
		return "redirect:/login";
	}
	
	@GetMapping("/forgot")
	public String forgot(User user) {
		log.debug("***********************************************************************************");
		log.debug("* " + Thread.currentThread().getStackTrace()[1].getMethodName().toString() + "() param: " + user.toString());
		log.debug("***********************************************************************************");
		return "main/forgot";
	}
	
	@PostMapping("/forgot")
	public void forgot(@RequestParam String email, Model model) {
		log.debug("***********************************************************************************");
		log.debug("* " + Thread.currentThread().getStackTrace()[1].getMethodName().toString() + "() param: " + email);
		log.debug("***********************************************************************************");
		
		emailService.sendMessage("lwh0102@kaiem.co.kr", "테스트 제목", "내용은 없습니다.");
	}
	
	@GetMapping("/access-denied")
    public String accessDenied() {
		log.debug("***********************************************************************************");
		log.debug("* " + Thread.currentThread().getStackTrace()[1].getMethodName().toString() + "() param: ");
		log.debug("***********************************************************************************");
        return "/error/access-denied";
    }
	
}

