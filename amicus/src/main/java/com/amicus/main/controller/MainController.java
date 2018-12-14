package com.amicus.main.controller;

import javax.servlet.http.HttpServletRequest;
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
 * 메인 컨트롤러
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
	
	@GetMapping(value= {"/", "/main", "/home"})
	public String main(Model model, User user) {
		log.debug("===================================================================================");
		log.debug("[METHDO] : " + Thread.currentThread().getStackTrace()[1].getMethodName().toString() + "()");
		log.debug("[PARAM] : " + user.toString());
		log.debug("===================================================================================");
		
		model.addAttribute("user", user);
		
		return "main/main";
	}
	
	@GetMapping("/login")
	public String login(HttpServletRequest request, Model model) {
		log.debug("===================================================================================");
		log.debug("[METHOD] : " + Thread.currentThread().getStackTrace()[1].getMethodName().toString() + "() GET");
		log.debug("===================================================================================");
		
		String referer = request.getHeader("Referer");
		request.getSession().setAttribute("prePage", referer);
		
		return "main/login";
	}
	
	@PostMapping(value="/loginProc")
	public void login(HttpServletRequest request, HttpSession session, Model model, @ModelAttribute User user, BindingResult error) {
		log.debug("===================================================================================");
		log.debug("[METHOD] : " + Thread.currentThread().getStackTrace()[1].getMethodName().toString() + "() POST");
		log.debug("[PARAM] : " + request.getParameterMap().toString());
		log.debug("===================================================================================");
		
		if(!error.hasErrors()) {
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
		log.debug("===================================================================================");
		log.debug("[METHOD] : " + Thread.currentThread().getStackTrace()[1].getMethodName().toString() + "()");
		log.debug("[PARAM] : " + user.toString());
		log.debug("===================================================================================");
		return "main/forgot";
	}
	
	@PostMapping("/forgot")
	public void forgot(@RequestParam String email, Model model) {
		log.debug("===================================================================================");
		log.debug("[METHOD] : " + Thread.currentThread().getStackTrace()[1].getMethodName().toString() + "()");
		log.debug("[PARAM] : " + email);
		log.debug("===================================================================================");
		
		emailService.sendMessage("lwh0102@kaiem.co.kr", "테스트 제목", "내용은 없습니다.");
	}
	
	@GetMapping("/access-denied")
    public String accessDenied() {
		log.debug("===================================================================================");
		log.debug("[METHOD]" + Thread.currentThread().getStackTrace()[1].getMethodName().toString() + "()");
		log.debug("===================================================================================");
        return "/error/access-denied";
    }
	
}

