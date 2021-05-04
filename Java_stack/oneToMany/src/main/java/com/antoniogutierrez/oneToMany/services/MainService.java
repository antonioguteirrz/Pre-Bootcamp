package com.antoniogutierrez.oneToMany.services;


import java.util.List;

import org.springframework.stereotype.Service;

import com.antoniogutierrez.oneToMany.models.Dojo;
import com.antoniogutierrez.oneToMany.models.Ninja;
import com.antoniogutierrez.oneToMany.repositories.DojoRepository;
import com.antoniogutierrez.oneToMany.repositories.NinjaRepository;

@Service
public class MainService {

	private DojoRepository dojoRepo;
	private NinjaRepository ninjaRepo;
	

	public MainService(DojoRepository dojoRepo, NinjaRepository ninjaRepo) {
		this.dojoRepo=dojoRepo;
		this.ninjaRepo=ninjaRepo;
	}
	
	public Dojo createDojo(Dojo dojo) {
		return dojoRepo.save(dojo);
	}
	public List<Dojo> allDojos() {
        return dojoRepo.findAll();
    }
	public List<Ninja> allNinjas() {
        return ninjaRepo.findAll();
    }
	public Ninja saveNinja(Ninja ninja) {
		return ninjaRepo.save(ninja);
	}


	public Dojo findDojo(Long id) {
		return dojoRepo.findById(id).orElse(null);
	}

	public Ninja createNinja(Ninja ninja) {
		return ninjaRepo.save(ninja);
	}
	public Ninja findNinja(Long id) {
		return ninjaRepo.findById(id).orElse(null);
	}
}
