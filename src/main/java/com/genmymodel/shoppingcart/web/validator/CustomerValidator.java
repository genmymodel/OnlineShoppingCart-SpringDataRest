package com.genmymodel.shoppingcart.web.validator;

import org.springframework.validation.Errors;
import java.lang.Object;
import java.lang.Class;
import org.springframework.validation.Validator;



public class CustomerValidator implements Validator
{

    

	@Override
	public boolean supports (Class<?> classz) 
	{
		return org.springframework.util.ClassUtils.isAssignable(classz, com.genmymodel.shoppingcart.domain.Customer.class);	
	}

	@Override
	public void validate (Object target, Errors errors) 
	{
		org.springframework.validation.ValidationUtils.rejectIfEmpty(errors,"webuser.id","required");
		org.springframework.validation.ValidationUtils.rejectIfEmpty(errors,"acc.id","required");	
	}


}
