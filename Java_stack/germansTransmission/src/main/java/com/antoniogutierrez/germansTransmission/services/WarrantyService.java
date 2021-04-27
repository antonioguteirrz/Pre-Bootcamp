package com.antoniogutierrez.germansTransmission.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.antoniogutierrez.germansTransmission.models.Warranty;
import com.antoniogutierrez.germansTransmission.repositories.WarrantyRepository;


@Service
public class WarrantyService {
private WarrantyRepository warrantyRepo;
	
	public Warranty saveWarranty(Warranty warranty) {
		return warrantyRepo.save(warranty);
	}
	public Warranty findUser(Long id) {
		return warrantyRepo.findById(id).orElse(null);
	}
	public void deleteUser(Long id) {
		warrantyRepo.deleteById(id);
	}
	public Object findByEmail(String email) {
		// TODO Auto-generated method stub
		return warrantyRepo.findByEmail(email);
	}
	public List<Warranty> allWarranties(){
		return warrantyRepo.findAll();
	}
}
