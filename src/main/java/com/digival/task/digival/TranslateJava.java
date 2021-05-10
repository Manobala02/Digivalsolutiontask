package com.digival.task.digival;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TranslateJava extends BaseClass{
	
	
	
	@Test
	public void test() throws Exception{
		String excelactualvalue,actualresult,expectedresult;
		browserConfig();
		lanuchUrl("https://translate.google.com/");
		TranslatePage tp=new TranslatePage();
		File f =new File("C:\\Users\\USER\\Documents\\digival.xlsx");
		FileInputStream fis =new FileInputStream(f);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		Sheet sheet = wb.getSheet("Sheet1");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			for(int i=1;i<sheet.getPhysicalNumberOfRows();i++)
			{
				
				clk(tp.getSrclanguage());
				Thread.sleep(2000);
				clk(tp.getTarlanguage());
				excelactualvalue = sheet.getRow(i).getCell(0).getStringCellValue();
				skeys(tp.getTbsrc(),excelactualvalue);
			
				Thread.sleep(5000);
				
				expectedresult=sheet.getRow(i).getCell(1).getStringCellValue();
				actualresult = text(tp.getTextsrcconvlang());
				
				System.out.println(actualresult);
				System.out.println(expectedresult);
				
				// actualresult.contains(expectedresult);
				 boolean res= expectedresult.contains(actualresult);
				
				if(res){
					sheet.getRow(i).createCell(2).setCellValue("PASS");
				}else{
					sheet.getRow(i).createCell(2).setCellValue("Fail");
				}
				
				//Assert.assertEquals(actualresult,expectedresult);
				FileOutputStream fos =new FileOutputStream(f);
				wb.write(fos);
				
				clk(tp.getClear());
				
				System.out.println("Done");
			}
		
			
	
			
		
	}
	
	@AfterMethod
	public void amethod(){
		
		
		
		
		driver.close();
	}
	

}
