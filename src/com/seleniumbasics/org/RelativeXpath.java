package com.seleniumbasics.org;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.remote.ProtocolHandshake;

import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpath {
	
// Xpath to locate the particular field.
	
// Relative & Absolute xpath
	
// Relative Xpath-->it starts with double slash//
	
// Relative Xpath---> it will search the middle of DOM Page
	
// there are 5 syntax for relative path// all were used below.
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				
				"C:\\Users\\Karthik\\eclipse-workspace\\SeleniumBasic\\Driver\\cdeem\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.xpath("//input[@type='text']"));
		
		// Webelement is like to use like creating a method and after that we need to call it.
		
		username.sendKeys("abcd@gmail.com");
		
		Thread.sleep(5000);
		
		WebElement password = driver.findElement(By.xpath("//input[contains(@type,'password')]"));

		password.sendKeys("asdfg");
		
		Thread.sleep(5000);
		
//		WebElement login = driver.findElement(By.xpath("//button[text()='Log In']"));
		
//		login.click();
		
//		Thread.sleep(5000);
		
// Remove the Commands code in the above 3 lines to click the Login Page.

//	    WebElement forgotpassword = driver.findElement(By.xpath("//a[contains(text(),'Forgotten')]"));	

//	    forgotpassword.click();
    
//		Thread.sleep(5000);

// Remove the Commands code in the above 3 lines to click the Forgot Password.
       
		WebElement createNewAccount = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		
		createNewAccount.click();
		
		Thread.sleep(3000);
		
		driver.close();
		
	}

}
