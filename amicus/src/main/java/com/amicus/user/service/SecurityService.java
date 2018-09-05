package com.amicus.user.service;

import javax.servlet.http.HttpSession;
import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import com.amicus.user.model.User;

@Service
public class SecurityService {
	
	private static final Logger log = LoggerFactory.getLogger(SecurityService.class);
	
	@Autowired
	private AuthenticationManager providerManager;

	@Autowired
	private UserService userService;
	
	public String findLoggedInUsername() {
		Object userDetails = SecurityContextHolder.getContext().getAuthentication().getDetails();
		if (userDetails instanceof UserDetails) {
			return ((UserDetails) userDetails).getUsername();
		}

		return null;
	}
	
	@Transactional
	public void autologin(User user, HttpSession session) {
		UserDetails userDetails = userService.loadUserByUsername(user.getEmail());
		Authentication request = new UsernamePasswordAuthenticationToken(userDetails, user.getPassword(), userDetails.getAuthorities());
		if (request.isAuthenticated()) {
			SecurityContextHolder.getContext().setAuthentication(request);
			log.debug(String.format("Auto login %s successfully!", user.getEmail()));
			userService.setSession(user, session);
		}
		providerManager.authenticate(request);

	}
}
