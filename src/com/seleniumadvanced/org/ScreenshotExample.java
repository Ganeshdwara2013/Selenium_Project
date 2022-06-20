package com.seleniumadvanced.org;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;
import org.openqa.selenium.remote.ProtocolHandshake;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotExample {

	public static void main(String[] args) throws IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Karthik\\eclipse-workspace\\SeleniumBasic\\Driver\\cdeem\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		TakesScreenshot ss = (TakesScreenshot) driver;
		
		File srcfile = ss.getScreenshotAs(OutputType.FILE);
		File destfile = new File("C:\\Users\\Karthik\\eclipse-workspace\\SeleniumBasic\\Screenshots\\fb.png");
		Thread.sleep(10000);
		
        FileUtils.copyFile(srcfile,destfile);
        
        driver.close();
	}

}
