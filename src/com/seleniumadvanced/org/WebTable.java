package com.seleniumadvanced.org;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

// WebTable is the method to access the Table in the webPage by using data's in the DOM Structure.
// Below are the Methods to retrieve the table.
// All Data :--> //table/tbody/tr/td
// Row Data:---> //table/tbody/tr[rowIndex]/td
// Column Data:---> //table/tbody/tr/td[columnIndex]
// Particular Data:---> //table/tbody/tr[rowIndex]/td[columnIndex]
// Header:---> By.tagName("th")
// Where tr --> table row, td-->table data --> tbody-->table body, th-->table head
	
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Karthik\\eclipse-workspace\\SeleniumBasic\\Driver\\cdeem\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/");
		driver.findElement(By.linkText("Table")).click();
		
		System.out.println("<-------------All Data------------->");
		List<WebElement> allData = driver.findElements(By.xpath("//table/tbody/tr/td"));
		for (WebElement all : allData) {
			System.out.println(all.getText());
		}
		
		
		System.out.println("<-------------Row Data------------->");
		List<WebElement> rowData = driver.findElements(By.xpath("//table/tbody/tr[6]//td"));
		for (WebElement row : rowData) {
			System.out.println(row.getText());
		}
		
		System.out.println("<-------------Column Data------------->");
		List<WebElement> columnData = driver.findElements(By.xpath("//table/tbody/tr/td[2]"));
		for (WebElement column : columnData) {
			System.out.println(column.getText());
		}
		
		System.out.println("<-----Single Element(Particular Data)----->");
		WebElement particularData = driver.findElement(By.xpath("//table/tbody/tr[4]/td[2]"));
		System.out.println(particularData.getText());
		
		Thread.sleep(3000);
		driver.close();
	}
}