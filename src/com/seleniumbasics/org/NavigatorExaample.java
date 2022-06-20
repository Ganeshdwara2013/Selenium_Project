package com.seleniumbasics.org;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class NavigatorExaample {
	
	// Navigator and Locator Example
	
	// Get()---> it will not save the history
			
	// to()---> it will save the history
			
	// back()----> it will comes back to the page
			
	// forward---> it will goes to the forward page
			
	// refresh---> it will refresh the page.
			
	// threadsleep is used to give waiting time in the same page and  it needs to be given as "Milliseconds".
			
	// Manage Methods is to maximze the web page.

	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				
				"C:\\Users\\Karthik\\eclipse-workspace\\SeleniumBasic\\Driver\\cdeem\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
				
        driver.manage().window().maximize();
        
        Thread.sleep(5000);
        
        driver.navigate().to("https://www.facebook.com/");
        
        Thread.sleep(5000); // throws Exception will be added here by clicking the error message
		
        driver.navigate().back();
        
        Thread.sleep(5000);
        
        driver.navigate().forward();
        
        Thread.sleep(5000);
        
        driver.navigate().refresh();
        
        Thread.sleep(5000);
        
        driver.close();
        
	}

}
