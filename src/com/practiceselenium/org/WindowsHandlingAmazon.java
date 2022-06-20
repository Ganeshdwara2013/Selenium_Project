package com.practiceselenium.org;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowsHandlingAmazon {

	public static void main(String[] args) throws AWTException, InterruptedException {

		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Karthik\\eclipse-workspace\\SeleniumBasic\\Driver\\cdeem\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		Actions ac = new Actions(driver);
		
		Robot rb = new Robot();
		
		WebElement mobiles = driver.findElement(By.linkText("Mobiles"));
		ac.contextClick(mobiles).build().perform();
		
		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyRelease(KeyEvent.VK_DOWN);

		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);

		WebElement customer = driver.findElement(By.linkText("Customer Service"));
		ac.contextClick(customer).build().perform();
		
		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyRelease(KeyEvent.VK_DOWN);

		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);

		WebElement fashion = driver.findElement(By.linkText("Fashion"));
		ac.contextClick(fashion).build().perform();
		
		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyRelease(KeyEvent.VK_DOWN);

		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);

		Set<String> allWindow = driver.getWindowHandles();
		System.out.println(allWindow);
		
		for (String str : allWindow) {
			String title = driver.switchTo().window(str).getTitle();
			System.out.println(title);
		}
		
// The below Line is taken from the Console after getting title of each windows.		
		
		String newTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		for (String str1: allWindow) {
			if(driver.switchTo().window(str1).getTitle().equals(newTitle)) {
			System.out.println(newTitle);
			break;
		}
	}

		Thread.sleep(4000);
		driver.quit();
	}
}