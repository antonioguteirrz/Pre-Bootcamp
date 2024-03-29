package com.antoniogutierrez.germansTransmission.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "warranties")
public class Warranty {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    
	
    @NotEmpty(message = "First name must not be empty")
    private String firstName;
    
    
    
    @NotEmpty(message = "Last  name must not be empty")
    private String lastName;
    
	@NotEmpty(message = "Email must not be empty")
    private String email;
	
    @NotEmpty
    private String warrantyNumber;
    //need warranty length to specify here. 
    

    
    
    public Warranty() {
    	
    }
 public Warranty(String firstName, String lastName,String email, String warrantyNumber) {
    	this.firstName = firstName;
    	this.lastName= lastName;
    	this.email= email;
    	this.warrantyNumber = warrantyNumber;
    }
    
    
 
    public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getWarrantyNumber() {
		return warrantyNumber;
	}
	public void setWarrantyNumber(String warrantyNumber) {
		this.warrantyNumber = warrantyNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Column(updatable=false)
    private Date createdAt;
	
	
    private Date updatedAt;
    
    @PrePersist
    protected void onCreate(){
        this.createdAt = new Date();
    }
    @PreUpdate
    protected void onUpdate(){
        this.setUpdatedAt(new Date());
    }
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
}
