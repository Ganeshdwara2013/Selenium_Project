package com.seleniumadvanced.org;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Karthik\\eclipse-workspace\\SeleniumBasic\\Driver\\cdeem\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Window.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);

        String parentwindow = driver.getWindowHandle(); // this is a parent window, "getwindowhandle" is the method to store the current window.
        driver.findElement(By.id("home")).click();	
        
		Thread.sleep(3000);

        Set<String> childwindow = driver.getWindowHandles();// "getwindowhandles" is used to store multiple windows.
        
        for (String multi : childwindow) { // For Each Loop used to store the childwindow(Which means it will store a window which is inside the window of a particular window).
        	driver.switchTo().window(multi);
        }
        
		Thread.sleep(3000);
        
		driver.findElement(By.xpath("(//h5[@class='wp-categories-title'])[1]")).click();
		driver.close();
		Thread.sleep(3000);
		driver.switchTo().window(parentwindow);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@onclick='openWindows()']")).click();
		Thread.sleep(3000);
		driver.quit(); // this method will close all the windows which is opened inside the driver.
		
	}

}