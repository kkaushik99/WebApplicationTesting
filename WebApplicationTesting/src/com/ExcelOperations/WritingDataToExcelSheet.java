package com.ExcelOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDataToExcelSheet {

	public static void main(String[] args) throws IOException 
	{
		// Identifying the file on the System 
				FileInputStream file = new FileInputStream("C:\\Users\\udaya\\Desktop\\SeleniumTesting\\WebApplicationTesting\\src\\com\\ExcelTestDataFiles\\TestData.xlsx");
				// Identifying the WorkBook in the file
				XSSFWorkbook workBook = new XSSFWorkbook(file);
				// Identifying a sheet in the workBook
				XSSFSheet sheet = workBook.getSheet("Sheet1");
				
				Row r=sheet.createRow(5);
				Cell c=r.createCell(2);
				
				c.setCellValue("Hello");
				
				FileOutputStream file1 = new FileOutputStream("C:\\Users\\udaya\\Desktop\\SeleniumTesting\\WebApplicationTesting\\src\\com\\ExcelTestDataFiles\\TestData1.xlsx");
				workBook.write(file1);

	}

}
