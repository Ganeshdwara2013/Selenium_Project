package com.seleniumbasics.org;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxExample {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Karthik\\eclipse-workspace\\SeleniumBasic\\Driver\\cdeem\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.get("http://leafground.com/pages/checkbox.html");
		
		Thread.sleep(3000);
		
		WebElement java = driver.findElement(By.xpath("//input[@type='checkbox'][1]"));
		
		WebElement vb = driver.findElement(By.xpath("//input[@type='checkbox'][2]"));
		
		java.click();
		
		vb.click();
		
		if(vb.isSelected()) {
			
			Thread.sleep(5000);
			
//			java.click();
//			
//			Thread.sleep(5000);
//			
			vb.click();
			
		}
		
		WebElement Seleniumm = driver.findElement(By.xpath("(//input[@type='checkbox'])[6]"));
		
		Seleniumm.click();
		
		Thread.sleep(5000);

		Seleniumm.click();
		
		WebElement notSelected = driver.findElement(By.xpath("(//input[@type='checkbox'])[7]"));
		
		notSelected.click();
		
		Thread.sleep(5000);
		
		WebElement selected = driver.findElement(By.xpath("(//input[@type='checkbox'])[8]"));
		
		Thread.sleep(5000);

		if(notSelected.isSelected()) {
			
			notSelected.click();
			
		} else {
			
			System.out.println("Not Selected is Checked");
			
		}
		
		Thread.sleep(8000);
		
		if(selected.isSelected()) {
			
			System.out.println("Correct CheckBox Selected");
			
		} else {
			
			selected.click();
		}
		
		WebElement opt1 = driver.findElement(By.xpath("(//input[@type='checkbox'])[9]"));
		
		WebElement opt2 = driver.findElement(By.xpath("(//input[@type='checkbox'])[10]"));

		WebElement opt3 = driver.findElement(By.xpath("(//input[@type='checkbox'])[11]"));

		WebElement opt4 = driver.findElement(By.xpath("(//input[@type='checkbox'])[12]"));

		WebElement opt5 = driver.findElement(By.xpath("(//input[@type='checkbox'])[13]"));

		WebElement opt6 = driver.findElement(By.xpath("(//input[@type='checkbox'])[14]"));

		opt1.click();
		
		opt2.click();

		opt3.click();

		opt4.click();

		opt5.click();

		opt6.click();

		
		Thread.sleep(10000);
		
		opt3.click();
		
		Thread.sleep(5000);
		
		driver.close();
		
		}
		
	}	
	