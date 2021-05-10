package com.digival.task.digival;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;

	
	public static void  browserConfig(){
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	public static void lanuchUrl(String url){
		
		driver.get(url);
		
	}
	
	public static void max(){
		driver.manage().window().maximize();
	}
	
	public static WebElement locatorXpath(String xpath){
		
		WebElement ref =driver.findElement(By.xpath(xpath));
		
		return ref;
	}
	
	public static void sleep(long time) throws InterruptedException{
		Thread.sleep(time);
	}
	
	public static void close(){
		driver.close();
	}
	
	public static void quit(){
		driver.quit();
	}
	
	public static void skeys(WebElement ref,String value){
		ref.sendKeys(value);
	}
	
	public static String text(WebElement ref){
		
		return ref.getText();
	}
	
	public static void clk(WebElement ref){
		ref.click();
	}
	
	public static void clr(WebElement ref){
		ref.clear();
	}
	
	
	
	
}
