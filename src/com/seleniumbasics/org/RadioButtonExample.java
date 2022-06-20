package com.seleniumbasics.org;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonExample {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Karthik\\eclipse-workspace\\SeleniumBasic\\Driver\\cdeem\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://leafground.com/pages/radio.html");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("no")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.id("yes")).click();

		
		WebElement unchecked = driver.findElement(By.xpath("(//input[@type='radio'])[3]"));
		
		WebElement checked = driver.findElement(By.xpath("(//input[@type='radio'])[4]"));

		Thread.sleep(5000);

		if(unchecked.isSelected()) {
		
			System.out.println("UnChecked Button is Selected");
		
	    } else if (checked.isSelected()){
		
		System.out.println("Checked Button is Selected");
		
		unchecked.click();
		
		Thread.sleep(6000);
		
		checked.click();
	    
	    }

		Thread.sleep(5000);
		
		WebElement age1 = driver.findElement(By.xpath("(//input[@type='radio'])[5]"));
		
//		System.out.println("1-20 Years");
		
        WebElement age2 = driver.findElement(By.xpath("(//input[@type='radio'])[6]"));
		
//		System.out.println("21-40 Years");
		
        WebElement age3 = driver.findElement(By.xpath("(//input[@type='radio'])[7]"));
		
//		System.out.println("Above 40 Years");
        
		Thread.sleep(5000);
		
		if(age1.isSelected()) {
		
		System.out.println("1-20 years box checked");
		
		} else if(age2.isSelected()) {
			
	    System.out.println("20-40 years box checked");
	    
		} else if (age3.isSelected()){
			
			System.out.println("Above 40 years selected");
				
		}
	
		age1.click();
		
		Thread.sleep(5000);

		age3.click();
		
		Thread.sleep(5000);
		
		age2.click();

		driver.close();
	}
		
}

