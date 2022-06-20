package com.practiceselenium.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider_DragAndDrop {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Karthik\\eclipse-workspace\\SeleniumBasic\\Driver\\cdeem\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		Actions ac = new Actions(driver);
		
		WebElement src = driver.findElement(By.xpath("//span[@tabindex='0']"));
	    ac.dragAndDropBy(src, 200, 0).build().perform();
	
	    Thread.sleep(3000);
	    driver.close();
	}

}