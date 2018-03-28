package com.ExcelOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingMultipleTestData {

	public static void main(String[] args) throws IOException 
	{
		FileInputStream file = new FileInputStream("C:\\Users\\udaya\\Desktop\\SeleniumTesting\\WebApplicationTesting\\src\\com\\ExcelTestDataFiles\\MultipleTestData.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(file);
		XSSFSheet sheet = workBook.getSheet("Sheet1");
		
		int rowCount=sheet.getLastRowNum(); // identifying the Row Count 
		
		for(int a=0;a<=rowCount;a++) // Running the Loop for the total number of Rows
		{
			Row r=sheet.getRow(a); // going to each Row
			
			int cellCount=r.getLastCellNum(); //  Identifying the Cell Count of each Row
			for(int b=0;b<cellCount;b++) // Running the Loop for the each row of all the cells
			{
				Cell c=r.getCell(b); // going to a row of a cell
				String data=c.getStringCellValue(); // getting the data for the row of Cell
				System.out.print(data+"  "); // printing the data as output
			}
			System.out.println();
		}
	}

}
