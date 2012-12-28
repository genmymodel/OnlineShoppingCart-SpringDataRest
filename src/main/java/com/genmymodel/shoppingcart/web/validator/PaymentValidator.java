package com.genmymodel.shoppingcart.web.validator;

import java.lang.Object;
import java.lang.Class;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;



public class PaymentValidator implements Validator
{

    

	@Override
	public boolean supports (Class<?> classz) 
	{
		return org.springframework.util.ClassUtils.isAssignable(classz, com.genmymodel.shoppingcart.domain.Payment.class);	
	}

	@Override
	public void validate (Object target, Errors errors) 
	{
		org.springframework.validation.ValidationUtils.rejectIfEmpty(errors,"account.id","required");	
	}


}
