package com.antoniogutierrez.productsAndCategories.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.antoniogutierrez.productsAndCategories.models.Product;
import com.antoniogutierrez.productsAndCategories.repositories.ProductRepository;

@Service
public class ProductService {
	@Autowired
	private ProductRepository productRepo;
	
	public Product saveProduct(Product product) {
		return productRepo.save(product);
	}
	
	public List<Product> allProduct(){
		return productRepo.findAll();
	}
	
	public Product findShow(Long id) {
		return productRepo.findById(id).orElse(null);
	}

	public void deleteShow(Long id) {
		productRepo.deleteById(id);
	}
}
