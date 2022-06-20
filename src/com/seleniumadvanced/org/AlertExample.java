package com.seleniumadvanced.org;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Karthik\\eclipse-workspace\\SeleniumBasic\\Driver\\cdeem\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Alert.html");
		driver.manage().window().maximize();
// Alert Box is like Confirm Button Option, we can click and get either OK or Cancel.
// Switch method is used here.
// Alert is the return type of Alert Class.
		
// 1) This is a Normal Alert Button:-
		driver.findElement(By.xpath("//button[@onclick='normalAlert()']")).click();
		Thread.sleep(2000);
		Alert alertbox = driver.switchTo().alert();
		alertbox.accept(); //if we use "alertbox.dismiss();" here, it will reflect the exception in Eclipse as "No Alert Present Exception", because there is no dismiss alert in this alert(dialog) box.
		Thread.sleep(2000);
// 2) This is a Alert box like Confirmation either "Ok (or) Cancel".
		driver.findElement(By.xpath("//button[@onclick='confirmAlert()']")).click();
		Thread.sleep(2000);
		Alert confirmbox = driver.switchTo().alert();
		confirmbox.dismiss();
		Thread.sleep(2000);
// 3) This is a Promptbox like scenario, we can sendkeys in this alert box. 		
		driver.findElement(By.xpath("//button[@onclick='confirmPrompt()']")).click();
		Thread.sleep(2000);
        Alert promptbox = driver.switchTo().alert();
        promptbox.sendKeys("ABC");
        promptbox.accept();
		Thread.sleep(5000);
// 4) Line Breaks is an alertbox, we can just say confirm or delete(it is like normal alert box).	
		driver.findElement(By.xpath("//button[@onclick='lineBreaks()']")).click();
		Thread.sleep(2000);
		Alert linebreaks = driver.switchTo().alert();
        linebreaks.accept(); // we can use "linebreaks.dismiss();" either accept or dismiss operation here.
        Thread.sleep(5000);
        
		driver.close();
	}

}