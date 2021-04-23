package com.antoniogutierrez.germansTransmission.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.antoniogutierrez.germansTransmission.models.Warranty;
@Repository
public interface WarrantyRepository extends CrudRepository<Warranty,Long>{
		List <Warranty> findAll();

		Warranty findByEmail(String email);
}
