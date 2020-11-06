package com.cdac.valid;


import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.cdac.dto.Admin;

@Service
public class AdminValidator implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		return clazz.equals(Admin.class);
	}

	@Override
	public void validate(Object target, Errors errors) {
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email", "mailKey", "email Id required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "adPass", "passKey", "password required");
		
		
		Admin admin = (Admin)target;
		if(admin.getAdPass()!=null) {
			if(admin.getAdPass().length()<3) {
				errors.rejectValue("adPass", "passKey", "password should contain more than 2 chars");
			}
		}
	}
	
}
