package com.seleniumadvanced.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.ProtocolHandshake;

//Actions is used to operate the Mouse Based Actions(Different methods below).
//Click, Double Click, Right Click, Move to Element, Click & Hold, Drag & Drop.
//Actions Class is used to perform this above Actions:---> Syntax //Actions act = new Actions(driver);
//Build & Perform are two eyes to perform actions(Should always be used in  Actions Class).
//If Build & Perform not given, the actions will not perform(run and compile time error will not occur)

public class Actions_MovetoElement_DoubleClick_RightClick {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Karthik\\eclipse-workspace\\SeleniumBasic\\Driver\\cdeem\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		Actions act2 = new Actions(driver);
		WebElement dress = driver.findElement(By.xpath("(//a[@title='Dresses'])[2]"));
		act2.moveToElement(dress).build().perform(); // Selecting which part Mouse to Perform
		Thread.sleep(3000);
		act2.contextClick().build().perform();// RIGHT CLICK
		Thread.sleep(3000);
		WebElement tshirt = driver.findElement(By.xpath("(//a[@title='T-shirts'])[2]"));
		act2.doubleClick(tshirt).build().perform(); //DOUBLE CLICK
		Thread.sleep(3000);

		driver.close();
	}

}