package com.genmymodel.shoppingcart.web.validator;

import java.lang.Class;
import org.springframework.validation.Validator;
import org.springframework.validation.Errors;
import java.lang.Object;



public class ShoppinCartValidator implements Validator
{

    

	@Override
	public boolean supports (Class<?> classz) 
	{
		return org.springframework.util.ClassUtils.isAssignable(classz, com.genmymodel.shoppingcart.domain.ShoppinCart.class);	
	}

	@Override
	public void validate (Object target, Errors errors) 
	{
		org.springframework.validation.ValidationUtils.rejectIfEmpty(errors,"webuser.id","required");	
	}


}
