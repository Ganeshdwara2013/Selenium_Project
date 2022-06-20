package com.seleniumbasics.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicXpath {

	public static void main(String[] args) throws InterruptedException {

// Syntax is--> Relative Xpath(near by element) // Relationship :: tagname[target element xpath]
// Different types below:-
// Following, Preceding, Following sibling, Preceding Sibling, Ancestor - grand parent, Descendant - grand child.
		
		System.setProperty("webdriver.chrome.driver" ,
				"C:\\Users\\Karthik\\eclipse-workspace\\SeleniumBasic\\Driver\\cdeem\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement username = driver.findElement(By.xpath("//input[@type='password']//preceding::input[@type='text']"));
		username.sendKeys("javalogin@gmail.com");
		Thread.sleep(2000);
		
		WebElement password = driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']//following::input[@type='password']"));
		password.sendKeys("ganesh");
		Thread.sleep(2000);
		WebElement eye = driver.findElement(By.className("_9lsa"));
		eye.click();
		Thread.sleep(3000);
		if(eye.isEnabled()) {
			System.out.println("It is NOT disabled");
			eye.click();
		} 
		
		WebElement login = driver.findElement(By.xpath("//input[@type='password']//following::button[@value='1']"));
		login.click();

		Thread.sleep(6000);
		driver.close();
	}
}