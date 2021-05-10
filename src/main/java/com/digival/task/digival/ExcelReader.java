package com.digival.task.digival;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

	public static  String path= "C:\\Users\\USER\\Documents\\digival.xlsx";
	public static  File f;
	public static FileInputStream fis = null;
	public FileOutputStream fileOut = null;
	public static   XSSFWorkbook wb = null;
	private static XSSFSheet sheet = null;
	private static XSSFRow row = null;
	private static XSSFCell cell = null;
	public static int headercell;
	public static String value;
	
	
	public  static int getheaderData(String sheetName, String colName) throws Throwable{
	
		 f=new File(path);
		 fis = new FileInputStream(f);
		 wb = new XSSFWorkbook(fis);
		 sheet = wb.getSheet(sheetName);
		    
		 row = sheet.getRow(0);
		 for(int i=0;i<row.getPhysicalNumberOfCells();i++){
			 
			cell = row.getCell(i);
			String value =cell.getStringCellValue().trim();
			
			if(colName.equalsIgnoreCase(value)){
				
				
				headercell =cell.getColumnIndex();
				break;
				
			}
		 
		 }
		return headercell;	
	}
	
	public static String getValue(String sheetName,int col) throws Throwable{
		
		 f=new File(path);
		 fis = new FileInputStream(f);
		 wb = new XSSFWorkbook(fis);
		 sheet = wb.getSheet(sheetName);
		
		for(int i=1;i<sheet.getPhysicalNumberOfRows();i++){
			
			
			value= sheet.getRow(i).getCell(getheaderData(sheetName,"actualresult")).
					getStringCellValue();
			System.out.println(value);
		}
		
		return value;
	}
	
	
	
	
	public static int rowsize(String sheetName) throws Throwable{
		 f=new File(path);
		 fis = new FileInputStream(f);
		 wb = new XSSFWorkbook(fis);
		 sheet = wb.getSheet(sheetName);
		 
		 
		return sheet.getPhysicalNumberOfRows();
		 
		 
	}
	
	
	public static void main(String[] args) throws Throwable {
		
		//System.out.println(ExcelReader.getheaderData("Sheet1", "status"));
		System.out.println(rowsize("Sheet1"));
	 getValue("Sheet1",getheaderData("Sheet1","actualresult"));
	}
	
	
}
