package com.antoniogutierrez.productsAndCategories.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "categories")
public class Category {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
 
	@NotEmpty
	@Size(min = 2, max = 255)
	private String name;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "products_id") // FOREIGN KEY COLUMN NAME
	private Product categoriesofProducts; 
	    
	public Category() {
		
	}
	public Category(String name) {
		super();
		this.name = name;
		
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Product getCategoriesofProducts() {
		return categoriesofProducts;
	}

	public void setCategoriesofProducts(Product categoriesofProducts) {
		this.categoriesofProducts = categoriesofProducts;
	}

	
	
	@Column(updatable=false)
	@DateTimeFormat(pattern="yyyy/MM/dd")
	private Date createdAt;
	@DateTimeFormat(pattern="yyyy/MM/dd")
	private Date updatedAt;

	@PrePersist
	protected void onCreate(){
	    this.createdAt = new Date();
	}

	@PreUpdate
	protected void onUpdate(){
	    this.updatedAt = new Date();
	}
	

}
