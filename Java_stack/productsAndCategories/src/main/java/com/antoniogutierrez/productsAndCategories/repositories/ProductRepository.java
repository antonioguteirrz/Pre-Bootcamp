package com.antoniogutierrez.productsAndCategories.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.antoniogutierrez.productsAndCategories.models.Product;



@Repository
public interface ProductRepository extends CrudRepository<Product, Long>{
	List<Product> findAll();

}
