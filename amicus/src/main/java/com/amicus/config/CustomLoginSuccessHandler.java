package com.amicus.config;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

@Component
public class CustomLoginSuccessHandler implements AuthenticationSuccessHandler {

	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws ServletException, IOException {
		HttpSession session = request.getSession();
		User authUser = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		
		session.setAttribute("username", authUser.getUsername());
		session.setAttribute("authorities", authentication.getAuthorities());
		session.setAttribute("email", request.getParameter("email"));
		session.setAttribute("name", request.getParameter("name"));
	 
		response.setStatus(HttpServletResponse.SC_OK);
		response.sendRedirect("/");
		
	}
}
