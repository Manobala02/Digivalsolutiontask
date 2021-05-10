package com.digival.task.digival;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TranslatePage extends BaseClass{
	
	
	
	public TranslatePage(){
		
		PageFactory.initElements(driver, this);
		
	}
	
	
     @FindBy(xpath=
      "((//h1[text()='Text translation']//following::div//div//"
       + "c-wiz)[position()=1]//child::button)[position()=2]\r\n" + 
		"")
	private WebElement srclanguage;
     
     @FindBy(xpath="((//h1[text()='Text translation']//following::div//div//c-wiz)[position()=1]"
     		+ "//child::button)[position()=8]")
	private WebElement tarlanguage;
     
     @FindBy(xpath="//textarea[@aria-label='Source text']")
     private WebElement tbsrc;
     
     @FindBy(xpath="//h2[text()='Translation results']//following::span[4]")
     private WebElement textsrcconvlang;
     
     
     @FindBy(xpath="//i[text()='clear']")
     private WebElement clear;
     
	public WebElement getClear() {
		return clear;
	}

	public WebElement getTextsrcconvlang() {
		return textsrcconvlang;
	}

	public WebElement getSrclanguage() {
		return srclanguage;
	}

	public WebElement getTarlanguage() {
		return tarlanguage;
	}

	public WebElement getTbsrc() {
		return tbsrc;
	}
     
     
     
     
	 //  input  - //textarea[@aria-label='Source text']
	
	// search more langugae - //button[@aria-label='More source languages'] -- english language
	
	// search target language -  //button[@aria-label='More target languages'] -- spanish language
	
	// //input[@placeholder='Search languages']
	
//	public static void main(String[] args) throws InterruptedException {
//		
//		
//		System.setProperty("webdriver.chrome.driver", "C:\\SalesforceEcosystem"
//				+ "\\EclipseWorspace\\mano\\digival\\Driver\\chromedriver.exe");
//		
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://translate.google.com/");
//		
//		Thread.sleep(5000);
//		
//		WebElement srclanguage = driver.
//				findElement(By.xpath("((//h1[text()='Text translation']"
//						+ "//following::div//div//c-wiz)"
//						+ "[position()=1]//child::button)[position()=2]\r\n" + 
//						""));
//		
//		srclanguage.click();
//		
//		WebElement tarlanguage = driver.
//				findElement(By.xpath("((//h1[text()='Text translation']//following::"
//						+ "div//div//c-wiz)[position()=1]//child::button)[position()=8]"));
//		
//		
//		tarlanguage.click();
//		
//		
//		
//		
//		
//		
//	}
//	
	

}
