package com.practiceselenium.org;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandlingPract {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Karthik\\eclipse-workspace\\SeleniumBasic\\Driver\\cdeem\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Window.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		String parentwindow = driver.getWindowHandle();
		driver.findElement(By.id("home")).click();
		Thread.sleep(3000);
		
		Set<String> childwindow = driver.getWindowHandles();
		
		for (String multiple : childwindow) {
			driver.switchTo().window(multiple);
		}
		
        driver.findElement(By.xpath("//img[@alt='Buttons']")).click();
        Thread.sleep(3000);
        driver.close();
        driver.switchTo().window(parentwindow);
        Thread.sleep(5000);
		driver.findElement(By.id("home")).click();
        Thread.sleep(5000);
        driver.quit();
		
	}

}