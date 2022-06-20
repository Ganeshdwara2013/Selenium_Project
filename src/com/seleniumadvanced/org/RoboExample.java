package com.seleniumadvanced.org;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RoboExample {
	
	public static void main(String[] args) throws AWTException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Karthik\\eclipse-workspace\\SeleniumBasic\\Driver\\cdeem\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		Actions ac = new Actions(driver);
		Robot rb = new Robot();
		
		WebElement fashion = driver.findElement(By.linkText("Fashion"));
		ac.moveToElement(fashion).build().perform();
		Thread.sleep(3000);
		
		WebElement mobile = driver.findElement(By.linkText("Mobiles"));
		ac.contextClick(mobile).build().perform();
		
		// keyPress -->Robot, keyRelease --->Robot
		
		rb.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		rb.keyRelease(KeyEvent.VK_DOWN);
		
		rb.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		rb.keyRelease(KeyEvent.VK_DOWN);
		
		rb.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		driver.quit();
				
	}

}