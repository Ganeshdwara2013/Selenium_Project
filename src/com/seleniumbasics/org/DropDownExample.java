package com.seleniumbasics.org;

import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;

public class DropDownExample {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Karthik\\eclipse-workspace\\SeleniumBasic\\Driver\\cdeem\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://leafground.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
// Totally we need to verify 6 options(methods) below:-
		
// 1) By using Index Value
		
		driver.findElement(By.xpath("//img[@alt='ListBox']")).click();
		
		Thread.sleep(5000);
		
        WebElement firstdropdown = driver.findElement(By.id("dropdown1"));
        
        Select dropdown1 = new Select(firstdropdown); // this line is a method which we will use in DropDown. Because Dropdown will always have select tag in webpage(Inspect Element).
        
        // the above line will call the method line#26.
        
        dropdown1.selectByIndex(4);
        
        Thread.sleep(3000);
        
        dropdown1.selectByIndex(3);
        
        Thread.sleep(3000);

        dropdown1.selectByIndex(2);
        
        Thread.sleep(3000);
        
        dropdown1.selectByIndex(0);
        
        Thread.sleep(3000);

        dropdown1.selectByIndex(1);
        
// 2) By using Visible Text
        
        WebElement seconddropdown  = driver.findElement(By.name("dropdown2"));
        
        Select dropdown2 = new Select(seconddropdown);

        dropdown2.selectByVisibleText("Appium");
        
        Thread.sleep(3000);
        
        dropdown2.selectByVisibleText("UFT/QTP");
        
        Thread.sleep(3000);
        
        dropdown2.selectByVisibleText("Loadrunner");
        
        Thread.sleep(3000);
        
        dropdown2.selectByVisibleText("Select training program using Text");
        
        Thread.sleep(3000);

        dropdown2.selectByVisibleText("Selenium");

        Thread.sleep(3000);
        
// 3) By using Value
        
        WebElement thirddropdown = driver.findElement(By.id("dropdown3"));
        
        Select dropdown3 = new Select(thirddropdown);
        
        dropdown3.selectByValue("4");
        
        Thread.sleep(3000);
        
        dropdown3.selectByValue("2");
        
        Thread.sleep(3000);

        dropdown3.selectByValue("3");
        
        Thread.sleep(3000);
        
        dropdown3.selectByValue("0");

        Thread.sleep(3000);
        
        dropdown3.selectByValue("1");

        Thread.sleep(3000);

// 4) Getting Total No.of Dropdown options in a particular dropdown
        
        // by using method getoptions and size here

       WebElement fourthdropdown = driver.findElement(By.className("dropdown"));
		
       Select dropdown4 = new Select(fourthdropdown);
       
       Thread.sleep(2000);
       
       dropdown4.selectByIndex(1);
       
       Thread.sleep(3000);
       
       //getOptions is the method to access no.of dropdowns in the dropdown list
       
       List<WebElement> totalnumbers = dropdown4.getOptions();  // Used ctrl+2 shortcut in this line.
       
       // the above line declaration is used to find the no.of dropdowns in the list(i.e., usually dropdowns is having lists), so to retrieve the no.of lists, used the list method.
      
       totalnumbers.size();
       
       System.out.println(totalnumbers.size());
       
       Thread.sleep(3000);
       
 // 5) Selecting the dropdown by using sendkeys.
       
       WebElement fifthdropdown1 = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[5]/select"));
       
       fifthdropdown1.sendKeys("Appium");
       
       Thread.sleep(3000);
       
       WebElement fifthdropdown2 = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[5]/select"));
       
       fifthdropdown2.sendKeys("UFT/QTP");
       
       Thread.sleep(3000);
     
       WebElement fifthdropdown3 = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[5]/select"));
              
       fifthdropdown3.sendKeys("You can also use sendKeys to select");
       
       Thread.sleep(3000);
       
       driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[5]/select")).sendKeys("Loadrunner");
      
       Thread.sleep(3000);
       
       driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[5]/select")).sendKeys("Selenium");

       Thread.sleep(3000);
       
       
 //  6) Dropdown with mutiple selection process(Select & Deselect method)
       
       WebElement sixthdropdown = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[6]/select"));
       
       Select dropdown6 = new Select(sixthdropdown);
       
       dropdown6.selectByIndex(1);
       
       Thread.sleep(2000);
       
       dropdown6.selectByVisibleText("Appium");
       
       Thread.sleep(2000);

       dropdown6.selectByValue("3");
       
       Thread.sleep(2000);
       
       dropdown6.deselectByValue("2");
       
       Thread.sleep(2000);

       dropdown6.deselectByIndex(3);
       
       Thread.sleep(2000);
              
       driver.close();
       
	}

}

