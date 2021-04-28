package com.antoniogutierrez.germansTransmission.controllers;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	
	
	

	
	@GetMapping("/newwarranty")
	public String index() throws IOException {
		
		try  
		{ 
		FileInputStream file = new FileInputStream(new File("C:\\Users\\anton\\OneDrive\\Desktop\\Dojo Assignments\\Pre-Bootcamp\\Java_stack\\germansTransmission/GermansTransmission.xlsx"));
		Workbook workbook = new XSSFWorkbook(file);
		Sheet sheet = workbook.getSheetAt(0);
		Iterator<Row> itr = sheet.iterator();
		while(itr.hasNext()){
		Row row = itr.next();
		Iterator<Cell> cellIterator = row.cellIterator();
		
		System.out.print(cellIterator.next() +" ");
		System.out.print(cellIterator.next() +" ");
		System.out.print(cellIterator.next() +" ");
		System.out.print(cellIterator.next() +" ");

		}
		}
		catch(Exception e)  
		{  
		e.printStackTrace();  
		}  
		  
		  
		return "home.jsp";
			}
	
	
	}


