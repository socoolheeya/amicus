package com.amicus.util.valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.amicus.user.model.User;
import com.amicus.user.service.UserService;

@Component
public class UserValidator implements Validator {
	
	@Autowired
	private UserService userService;

	@Override
	public boolean supports(Class<?> clazz) {
		return false;
	}

	@Override
	public void validate(Object o, Errors errors) {
		User user = (User)o;
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email", "NotEmpty");
		if(user.getEmail().length() < 6 || user.getEmail().length() > 32) {
			errors.rejectValue("email", "Size.userForm.email");
		}
		
		if(userService.getUser(user.getEmail()) != null) {
			errors.rejectValue("email", "Duplicate.userForm.email");
		}
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "NotEmpty");
		if(user.getPassword().length() < 8 || user.getPassword().length() > 15) {
			errors.rejectValue("password", "Size.userForm.password");
		}
		
		if(userService.getUser(user.getPassword()) != null) {
			errors.rejectValue("password", "Duplicate.userForm.password");
		}
		
	}
	

}
