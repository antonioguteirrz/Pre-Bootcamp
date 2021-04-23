package com.antoniogutierrez.productsAndCategories.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.antoniogutierrez.productsAndCategories.models.Category;
import com.antoniogutierrez.productsAndCategories.repositories.CategoryRepository;



@Service
public class CategoryService {

	@Autowired
	private CategoryRepository categoryRepo;
	
	public Category saveCategory(Category category) {
		return categoryRepo.save(category);
	}
	
	public List<Category> allProduct(){
		return categoryRepo.findAll();
	}
	
	public Category findCategory(Long id) {
		return categoryRepo.findById(id).orElse(null);
	}

	public void deleteShow(Long id) {
		categoryRepo.deleteById(id);
	}
}
