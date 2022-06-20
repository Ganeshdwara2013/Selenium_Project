package com.practiceselenium.org;

import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MiniProject {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Karthik\\eclipse-workspace\\SeleniumBasic\\Driver\\cdeem\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.className("login")).click();
		driver.findElement(By.id("email")).sendKeys("ganesh12345@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("Apr@2022");
		driver.findElement(By.id("SubmitLogin")).click();
		driver.findElement(By.xpath("(//a[@title='Dresses'])[2]")).click();
		driver.findElement(By.linkText("Evening Dresses")).click();
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,1000)", "");
		
		WebElement pink = driver.findElement(By.id("color_43"));
		pink.click();
		if(pink.isSelected()) {
		  System.out.println("OK");
		}else {
			System.out.println("Not selected");
			pink.click();
		}
		Thread.sleep(2000);
		
		WebElement quantity = driver.findElement(By.className("icon-plus"));
		for (int qty1=0; qty1<=3; ++qty1) {
			quantity.click();
		}
		
		Thread.sleep(3000);
		WebElement size = driver.findElement(By.name("group_1"));
		Select dropdown = new Select(size);
		dropdown.selectByIndex(2);
		
		driver.findElement(By.className("icon-plus")).click();
		jse.executeScript("window.scrollBy(0,500)", "");
		
		driver.findElement(By.name("Submit")).click();
		WebElement proceed = driver.findElement(By.xpath("(//i[@class='icon-chevron-right right'])[2]"));
		Thread.sleep(10000);
		proceed.click();
		
		WebElement summary = driver.findElement(By.xpath("//li[@class='step_current  first']"));
		WebDriverWait w = new WebDriverWait(driver, 20);
		w.until(ExpectedConditions.visibilityOf(summary));
		jse.executeScript("arguments[0].scrollIntoView()", summary);
		
		TakesScreenshot ss = (TakesScreenshot) driver;
		File source = ss.getScreenshotAs(OutputType.FILE);
		File desti = new File("C:\\Users\\Karthik\\eclipse-workspace\\SeleniumBasic\\Screenshots\\summary.png");
		FileHandler.copy(source, desti);
		
		jse.executeScript("window.scrollTo(0,document.body.scrollHeight)", "");		
		driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]")).click();
		
	    WebElement deladdres = driver.findElement(By.xpath("//label[@for='id_address_delivery']"));	
		jse.executeScript("arguments[0].scrollIntoView()", deladdres);
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		
		WebElement myaddress = driver.findElement(By.xpath("(//p[@class='carrier_title'])[1]"));
		jse.executeScript("arguments[0].scrollIntoView()", myaddress);
		
		TakesScreenshot ss1 = (TakesScreenshot) driver;
		File source1 = ss1.getScreenshotAs(OutputType.FILE);
		File desti1 = new File("C:\\Users\\Karthik\\eclipse-workspace\\SeleniumBasic\\Screenshots\\shipping.png");
		FileHandler.copy(source1, desti1);

		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		
		WebElement product = driver.findElement(By.xpath("//th[@class='cart_product first_item']"));
		jse.executeScript("arguments[0].scrollIntoView()", product);

		File source2 = ss1.getScreenshotAs(OutputType.FILE);
		File desti2 = new File("C:\\Users\\Karthik\\eclipse-workspace\\SeleniumBasic\\Screenshots\\payment.png");
		FileHandler.copy(source2, desti2);
		
		jse.executeScript("window.scrollTo(0,document.body.scrollHeight)", "");		

		driver.close();
	}

}