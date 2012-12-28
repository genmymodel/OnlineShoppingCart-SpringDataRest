package com.genmymodel.shoppingcart.web.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import java.lang.Class;
import java.lang.Object;



public class WebUserValidator implements Validator
{

    

	@Override
	public boolean supports (Class<?> classz) 
	{
		return org.springframework.util.ClassUtils.isAssignable(classz, com.genmymodel.shoppingcart.domain.WebUser.class);	
	}

	@Override
	public void validate (Object target, Errors errors) 
	{
		org.springframework.validation.ValidationUtils.rejectIfEmpty(errors,"customer.id","required");	
	}


}
