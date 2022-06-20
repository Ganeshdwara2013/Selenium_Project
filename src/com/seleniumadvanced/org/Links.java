package com.seleniumadvanced.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Karthik\\eclipse-workspace\\SeleniumBasic\\Driver\\cdeem\\chromedriver.exe");
// if a webpage contains link we need to use Linktext and PartialLinkText to get the element.
// LinkeText & Partial Linktext was used to get the link.
// "href" present in the Inspect element, will have the "Destination Link".
// Links are always saved in tagName called "a".
// getTitle method used to get the title of the Webpage.
// getUrl is used to get the URL of the webpage.
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Link.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
// Below method is used to click a link by using "LinkText":-
		WebElement home = driver.findElement(By.linkText("Go to Home Page"));
		home.click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		
// In the Below Method "partial Linktext" is used and finding which hyperlink present in the particular link
// "href" will have the particular link destination.
		WebElement finding = driver.findElement(By.partialLinkText("Find where am"));
		String destination = finding.getAttribute("href"); // GetAttribute return type is String.
		System.out.println("href contains this link--> " + destination);
		Thread.sleep(3000);

// To verify the page is broken or not, need to use like below:-	
		WebElement broken = driver.findElement(By.linkText("Verify am I broken?"));
		broken.click();
		String title = driver.getTitle(); // get Title will retrieve the Title of the webpage.
		System.out.println(title);
		if(title.contains("404")) { // this line will verify whether 404 is there or not (Contains method)
			System.out.println("Page is Broken");
		} else {
			System.out.println("Page is NOT broken");
		}
		Thread.sleep(3000);
		driver.navigate().back();
// To Find number of links in a web page, need to use like below:-
// Usually, the next line will be given then in sysout size will be given, there we gave directly.
		driver.findElements(By.tagName("a")).size(); // Just to find this line
		System.out.println(driver.findElements(By.tagName("a")).size());
		Thread.sleep(3000);

		driver.close();
	}

}