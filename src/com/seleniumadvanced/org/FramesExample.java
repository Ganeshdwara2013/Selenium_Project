package com.seleniumadvanced.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
// import org.openqa.selenium.remote.ProtocolHandshake; // we can use this if needed.
// import org.openqa.selenium.Dimension; // we can use this if needed.

public class FramesExample {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Karthik\\eclipse-workspace\\SeleniumBasic\\Driver\\cdeem\\chromedriver.exe");
		
       WebDriver driver = new ChromeDriver();
       driver.get("http://leafground.com/pages/frame.html");
       driver.manage().window().maximize();
// Frames is a concept like ad's(advertisement) page in normal web page.
// "SwitchTo" Method is used in frames topic(frames was found inside the method called "SwitchTo").
// we can find the frames by using inspect element--> then will check the tag name as "iframe".
// Also, if we right click the web page, if we dont have frames, it will not show option as frame source
// But, if frames has been used in web page means, if we right click in the webpage, we will get "view frame source" & "Reload frame" option.
// For Additional Information, Refer to Notes in the topic called "Frames".
       
// 1) General Frame inside the button click:-
	   driver.switchTo().frame(0); // frames topic will use SwitchTo method to identify and click.
	   Thread.sleep(3000);
	   driver.findElement(By.id("Click")).click();
	   driver.switchTo().defaultContent(); // this method is used to go back to normal page
// 2) Below is the example for Nested Frame:-
	   driver.switchTo().frame(1);
	   driver.switchTo().frame("frame2"); // we can use this line by another using another switchTo method inside the frame.
	   Thread.sleep(3000);
	   driver.findElement(By.id("Click1")).click();
	   driver.switchTo().defaultContent();
// 3) To find total number of frames in a page, below example:-
	   int totalnumberofframes = driver.findElements(By.tagName("iframe")).size();
	   System.out.println(totalnumberofframes);
	   Thread.sleep(3000);
	   
	   driver.close();  
	}
}