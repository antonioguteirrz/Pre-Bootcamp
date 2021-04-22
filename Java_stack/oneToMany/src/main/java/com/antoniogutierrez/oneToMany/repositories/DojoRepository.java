package com.antoniogutierrez.oneToMany.repositories;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.antoniogutierrez.oneToMany.models.Dojo;

@Repository
public interface DojoRepository extends CrudRepository<Dojo,Long> {
		List <Dojo> findAll();
}
