package com.seleniumbasics.org;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {

	public static void main(String[] args) {

// SetProperty method is to call the browser
		
// get is the method to call the method in selenium.
		
// close is the method to close the opened webpage.
		
System.setProperty("webdriver.chrome.driver",
		
		"C:\\Users\\Karthik\\eclipse-workspace\\SeleniumBasic\\Driver\\cdeem\\chromedriver.exe");

// in the above line, the key + value pair concept is used. so, value taken by right clicking the chromedriver here  and right click --->Properties----> Location of the driver.

// we can use either of the below.

// ChromeDriver driver = new ChromeDriver();

 WebDriver driver = new ChromeDriver(); // this line will launch the chromdriver with message simply as data.
 
 driver.get("https://www.google.com/"); // this line opens google chrome google website
 
 driver.close();

	}

}
