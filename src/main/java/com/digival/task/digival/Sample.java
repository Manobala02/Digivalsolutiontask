package com.digival.task.digival;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\SalesforceEcosystem"
				+ "\\EclipseWorspace\\mano\\digival\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://translate.google.com/");
		
		Thread.sleep(5000);
		
		WebElement srclanguage = driver.
				findElement(By.xpath("((//h1[text()='Text translation']"
						+ "//following::div//div//c-wiz)"
						+ "[position()=1]//child::button)[position()=2]\r\n" + 
						""));
	
		srclanguage.click();
		
		WebElement tarlanguage = driver.
				findElement(By.xpath("((//h1[text()='Text translation']//following::"
						+ "div//div//c-wiz)[position()=1]//child::button)[position()=8]"));
		
		
		tarlanguage.click();
		
	
	}

}
