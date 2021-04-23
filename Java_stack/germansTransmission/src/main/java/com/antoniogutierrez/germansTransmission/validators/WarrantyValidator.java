package com.antoniogutierrez.germansTransmission.validators;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;

import com.antoniogutierrez.germansTransmission.models.Warranty;
import com.antoniogutierrez.germansTransmission.services.WarrantyService;

@Component
public class WarrantyValidator implements Validator{
	
	
	@Autowired 
	private WarrantyService warrantyServ;

	@Override
	public boolean supports(Class<?> clazz) {
		return Warranty.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		// CONVERT INCOMING TARGET FROM OBJECT TO USER
		Warranty warranty = (Warranty) target;

		if(warrantyServ.findByEmail(warranty.getEmail()) != null) {
			errors.rejectValue("duplicate", "Duplicate");
		}
	}

}
