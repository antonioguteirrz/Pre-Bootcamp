package com.antoniogutierrez.germansTransmission.services;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Service;

import com.antoniogutierrez.germansTransmission.models.Warranty;
import com.antoniogutierrez.germansTransmission.repositories.WarrantyRepository;


@Service
public class WarrantyService {
private WarrantyRepository warrantyRepo;
	
	public Warranty saveWarranty(Warranty warranty) {
		return warrantyRepo.save(warranty);
	}
	public Warranty findUser(Long id) {
		return warrantyRepo.findById(id).orElse(null);
	}
	public void deleteUser(Long id) {
		warrantyRepo.deleteById(id);
	}
	public Object findByEmail(String email) {
		// TODO Auto-generated method stub
		return warrantyRepo.findByEmail(email);
	}
	public List<Warranty> allWarranties(){
		return warrantyRepo.findAll();
	}
public Warranty findWarranty(String warranty) throws IOException {
		
		try  
		{ 
		FileInputStream file = new FileInputStream(new File("C:\\Users\\anton\\OneDrive\\Desktop\\Dojo Assignments\\Pre-Bootcamp\\Java_stack\\germansTransmission/GermansTransmission.xlsx"));
		Workbook workbook = new XSSFWorkbook(file);
		Sheet sheet = workbook.getSheetAt(0);
		Iterator<Row> itr = sheet.iterator();
		Row row = itr.next();
		ArrayList<Cell>  myFNamesArray = new ArrayList<Cell>();
		ArrayList<Cell>  myLNamesArray = new ArrayList<Cell>();
		ArrayList<Object>  myWarrantyArray = new ArrayList<Object>();
		
		int i = 0;
		while(itr.hasNext()){
			row = itr.next();
		Iterator<Cell> cell = row.cellIterator();
		myFNamesArray.add(cell.next());
		myLNamesArray.add(cell.next());
		myWarrantyArray.add(cell.next());
		
		i++;
		

		
		}
		System.out.println(myWarrantyArray);
		System.out.println(warranty);
		if(myWarrantyArray.get(0).contains(" Warratny number 3")) {
			System.out.println("there is a match!");
			
		}
		}
		
		
		catch(Exception e) 
		{  
		e.printStackTrace();  
		}
		return null;
		  
	
}
}
