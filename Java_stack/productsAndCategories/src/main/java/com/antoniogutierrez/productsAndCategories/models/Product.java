package com.antoniogutierrez.productsAndCategories.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "products")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotEmpty
	@Size(min = 2, max = 255)
	private String name;
	
	@NotEmpty
	@Size(min = 2)
	private String description;
	
	@NotNull
	@Min(1)
	private double price;
	 
    @OneToMany(mappedBy = "categoriesofProducts", fetch = FetchType.LAZY)
    private List<Category> productInCategory;
	
	public Product() {
		 
	 }
	public Product(String name,String description, double price) {
		this.name =name;
		 this.description = description;
		 this.price= price;
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
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
