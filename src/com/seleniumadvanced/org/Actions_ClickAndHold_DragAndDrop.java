package com.seleniumadvanced.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

// Actions is used to operate the Mouse Based Actions(Different methods below).
// Click, Double Click, Right Click, Move to Element, Click & Hold, Drag & Drop.
// Actions Class is used to perform this above Actions:---> Syntax //Actions act = new Actions(driver);
// Build & Perform are two eyes to perform actions(Should always be used in  Actions Class).
// If Build & Perform not given, the actions will not perform(run and compile time error will not occur)

public class Actions_ClickAndHold_DragAndDrop {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Karthik\\eclipse-workspace\\SeleniumBasic\\Driver\\cdeem\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/drop.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		
		Actions act1 = new Actions(driver); // Actions class Syntax
		// act1.clickAndHold(drag).release(drop).build().perform(); // CLICK & HOLD
		act1.dragAndDrop(drag, drop).build().perform();  // DRAG & DROP
		Thread.sleep(3000);
		driver.close();
	}

}