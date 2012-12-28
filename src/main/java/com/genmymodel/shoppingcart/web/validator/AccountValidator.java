package com.genmymodel.shoppingcart.web.validator;

import org.springframework.validation.Validator;
import java.lang.Object;
import org.springframework.validation.Errors;
import java.lang.Class;



public class AccountValidator implements Validator
{

    

	@Override
	public boolean supports (Class<?> classz) 
	{
		return org.springframework.util.ClassUtils.isAssignable(classz, com.genmymodel.shoppingcart.domain.Account.class);	
	}

	@Override
	public void validate (Object target, Errors errors) 
	{
		org.springframework.validation.ValidationUtils.rejectIfEmpty(errors,"customer.id","required");	
	}


}
