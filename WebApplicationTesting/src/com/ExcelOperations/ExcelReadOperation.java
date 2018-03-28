 package com.ExcelOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadOperation {

	public static void main(String[] args) throws IOException 
	{
		// Identifying the file on the System 
		FileInputStream file = new FileInputStream("C:\\Users\\udaya\\Desktop\\SeleniumTesting\\WebApplicationTesting\\src\\com\\ExcelTestDataFiles\\TestData.xlsx");
		// Identifying the WorkBook in the file
		XSSFWorkbook workBook = new XSSFWorkbook(file);
		// Identifying a sheet in the workBook
		XSSFSheet sheet = workBook.getSheet("Sheet1");
		
		//Identofying a row in the Sheet
		Row r=sheet.getRow(0);
		// identifying a Cell in the Row
		Cell c=r.getCell(0);
		
		//Getting the Row of the Cell Value
		String data=c.getStringCellValue();
				System.out.println(data);
				
		Row r1=sheet.getRow(5);
		Cell c1=r1.getCell(2);
		
		System.out.println(c1.getStringCellValue());
		
		
		
	}

}
