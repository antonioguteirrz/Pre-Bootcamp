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
	ArrayList<Object>  myFNamesArray = new ArrayList<Object>();
	ArrayList<Object>  myLNamesArray = new ArrayList<Object>();
	ArrayList<Object>  myWarrantyArray = new ArrayList<Object>();
	ArrayList<Object>  myEmailArray = new ArrayList<Object>();
		try  
		{ 
			
		FileInputStream file = new FileInputStream(new File("C:\\Users\\anton\\OneDrive\\Desktop\\Dojo Assignments\\Pre-Bootcamp\\Java_stack\\germansTransmission/GermansTransmission.xlsx"));
		Workbook workbook = new XSSFWorkbook(file);
		Sheet sheet = workbook.getSheetAt(0);
		Iterator<Row> itr = sheet.iterator();
		Row row = itr.next();

		
		int i = 0;
		while(itr.hasNext()){
			row = itr.next();
		Iterator<Cell> cell = row.cellIterator();
		myFNamesArray.add(cell.next());
		myLNamesArray.add(cell.next());
		myWarrantyArray.add(cell.next());
		myEmailArray.add(cell.next());
		
		i++;
		
		}
		}

		catch(Exception e) 
		{  
		e.printStackTrace();  
		}
		
		int indexFound = 0;
		for(int i=0;i<myWarrantyArray.size();i++) {
			String checkWarr=myWarrantyArray.get(i).toString();
			if(checkWarr.equalsIgnoreCase(warranty)) {
				indexFound = i;

				String firstNameFound = myFNamesArray.get(indexFound).toString();
				String lastNameFound = myLNamesArray.get(indexFound).toString();
				String warrantyFound = myWarrantyArray.get(indexFound).toString();
				String emailFound = myEmailArray.get(indexFound).toString();
				Warranty personID = new Warranty(firstNameFound,
									lastNameFound,
									warrantyFound,
									emailFound); 
				return  personID;
			}
		}
		
		
		return null;
		  
}
}
