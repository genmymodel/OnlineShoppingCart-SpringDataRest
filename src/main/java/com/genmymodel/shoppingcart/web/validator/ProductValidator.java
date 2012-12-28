package com.genmymodel.shoppingcart.web.validator;

import java.lang.Object;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import java.lang.Class;



public class ProductValidator implements Validator
{

    

	@Override
	public boolean supports (Class<?> classz) 
	{
		return org.springframework.util.ClassUtils.isAssignable(classz, com.genmymodel.shoppingcart.domain.Product.class);	
	}

	@Override
	public void validate (Object target, Errors errors) 
	{
		org.springframework.validation.ValidationUtils.rejectIfEmpty(errors,"item.id","required");	
	}


}
