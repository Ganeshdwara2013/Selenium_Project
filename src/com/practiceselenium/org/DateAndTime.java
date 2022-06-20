package com.practiceselenium.org;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DateAndTime {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Karthik\\eclipse-workspace\\SeleniumBasic\\Driver\\cdeem\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		driver.navigate().to("https://adactinhotelapp.com/index.php");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("ganeshdwara");
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("April@2022");
		WebElement login = driver.findElement(By.name("login"));
		login.click();
		
		WebElement checkindate = driver.findElement(By.name("datepick_in"));
		checkindate.clear();
		checkindate.click();
		checkindate.sendKeys("29/04/2022");
		
		Thread.sleep(4000);
		driver.close();
	}

}