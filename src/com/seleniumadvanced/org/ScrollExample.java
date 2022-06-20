package com.seleniumadvanced.org;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor; // It is an Interface
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollExample {

	public static void main(String[] args) throws InterruptedException {
// To Use Scroll Up & Down, we need to use an Interface.
// The Interface name is called as JavaScriptExecutor.
// The Syntax is "JavascriptExecutor jse = (JavascriptExecutor)driver;"
// There are three methods to use the JavaScriptexecutor to scrolling Operations.
// They are Below:-
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Karthik\\eclipse-workspace\\SeleniumBasic\\Driver\\cdeem\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		Thread.sleep(3000);

// Method - 1:- By using X axis & Y axis Pixels(Pixels needs to given as Approximate Value). X - Horizontal, Y - Vertical		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,1000)", "");
		Thread.sleep(3000);
		jse.executeScript("window.scrollBy(0,-900)", "");
		Thread.sleep(3000);
		
// Method - 2:- The below method will go the bottom of the page(Scroll down to the last).		
		jse.executeScript("window.scrollTo(0,document.body.scrollHeight)", "");		
		Thread.sleep(3000);
		jse.executeScript("window.scrollTo(0,0)", ""); // it will retrieve to the top of the page.
		Thread.sleep(5000);
		
// Method - 3:- This is the most common method to use. It will locate the exact element(topic) to make operations.
// This method is mostly used in Testing, because it will locate to the exact thing where a tester needs to perform tasks.
		WebElement popular = driver.findElement(By.className("homefeatured"));
		jse.executeScript("arguments[0].scrollIntoView()", popular);
		Thread.sleep(3000);
		jse.executeScript("window.scrollTo(0,0)", ""); // it will retrieve to the top of the page.
		Thread.sleep(3000);
		
		WebElement bestseller = driver.findElement(By.className("blockbestsellers"));
		jse.executeScript("arguments[0].scrollIntoView()", bestseller);
		Thread.sleep(3000);
		bestseller.click();
		Thread.sleep(5000);
		jse.executeScript("window.scrollTo(0,0)", ""); // it will retrieve to the top of the page.
		Thread.sleep(3000);

		driver.close();		
	}

}