package com.seleniumbasics.org;

import org.openqa.selenium.By; // abstract method to call the element

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorExample {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				
				"C:\\Users\\Karthik\\eclipse-workspace\\SeleniumBasic\\Driver\\cdeem\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		
		Thread.sleep(5000);
		
		driver.findElement(By.name("pass")).sendKeys("12345");
		
		Thread.sleep(5000);
		
		driver.findElement(By.name("login")).click();
		
		Thread.sleep(5000);
		
		driver.close();
		
	}


}
