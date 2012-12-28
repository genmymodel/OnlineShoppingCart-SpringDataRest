package com.genmymodel.shoppingcart.web.validator;

import org.springframework.validation.Errors;
import java.lang.Class;
import java.lang.Object;
import org.springframework.validation.Validator;



public class LineItemValidator implements Validator
{

    

	@Override
	public boolean supports (Class<?> classz) 
	{
		return org.springframework.util.ClassUtils.isAssignable(classz, com.genmymodel.shoppingcart.domain.LineItem.class);	
	}

	@Override
	public void validate (Object target, Errors errors) 
	{
		org.springframework.validation.ValidationUtils.rejectIfEmpty(errors,"sc.id","required");
		org.springframework.validation.ValidationUtils.rejectIfEmpty(errors,"product.id","required");	
	}


}
