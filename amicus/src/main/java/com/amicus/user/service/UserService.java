package com.amicus.user.service;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;
import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.amicus.user.model.Role;
import com.amicus.user.model.User;
import com.amicus.user.repository.UserRepository;

@Service
public class UserService implements UserDetailsService {
	
	private Logger log = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	@Override
	@Transactional
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		User user = userRepository.findByEmail(email);
		List<GrantedAuthority> list = new ArrayList<>();
		List<Role> roles = user.getRoles();
		
		GrantedAuthority authority = null;
		for(Role role : roles) {
			authority = new SimpleGrantedAuthority(role.getName());
			list.add(authority);
		}
		UserDetails detail = new org.springframework.security.core.userdetails.User(user.getEmail(), user.getPassword(), list);
		return detail;
	}

	public List<User> getUserList() {
		return userRepository.findAll();
	}
	
	public User getUser(String email) {
		return userRepository.findByEmail(email);
	}
	
	public void createUser(User user) {
		user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
		userRepository.save(user);
	}
	
	public void updateUser(User user) {
		userRepository.save(user);
	}
	
	public void deleteUser(User user) {
		userRepository.delete(user);
	}
	
	public void setSession(User user, HttpSession session) {
		User dbUser = getUser(user.getEmail());
		log.debug("dbUser : "  + dbUser.toString());
		int i = 1;
		for(Role role: dbUser.getRoles()) {
			i++;
			session.setAttribute("role" + i, role.getName());
		}
		session.setAttribute("email", dbUser.getEmail());
		session.setAttribute("name", dbUser.getName());
	}

}
