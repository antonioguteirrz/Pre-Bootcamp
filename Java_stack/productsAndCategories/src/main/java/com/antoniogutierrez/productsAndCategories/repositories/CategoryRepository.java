package com.antoniogutierrez.productsAndCategories.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.antoniogutierrez.productsAndCategories.models.Category;


@Repository
public interface CategoryRepository extends CrudRepository<Category,Long>{
	List<Category> findAll();

}
