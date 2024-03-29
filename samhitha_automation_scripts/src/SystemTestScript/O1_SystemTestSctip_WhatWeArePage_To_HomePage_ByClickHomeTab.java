package SystemTestScript;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;
import java.util.Set;

import org.apache.log4j.chainsaw.Main;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class O1_SystemTestSctip_WhatWeArePage_To_HomePage_ByClickHomeTab {
	public static void main(String[] args) throws IOException {
		// declare driver
		WebDriver driver;
		// launch chrome empty chrome browser
		driver=new ChromeDriver();
		// maximize the browser
		driver.manage().window().maximize();
		// declare url
		String url="https://samhithasoftware.com/what-we-are/";
		try
		{
			// declare wait
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			
			// launch WhatWeAre page
			driver.get(url);
			
			// declare what-we-are page url
			String title="What We Are &#8211; samhithasoftware.com";
			
			
			// wait until title matches
			wait.until(ExpectedConditions.urlMatches("https://samhithasoftware.com/what-we-are/"));
			
			// find contact us tab location
			WebElement contactus = driver.findElement(By.xpath("//a[@title='Contact Us']"));
			Thread.sleep(5000);

			// declare actions class to do mouse actions
			Actions act=new Actions(driver);
			
			// mouse hover on contactus link
			act.moveToElement(contactus).perform();
			
			
			
			// click on contactus tab/link
			act.click().perform();
			
			// wait until url matches
			String contactusurl="https://samhithasoftware.com/contact-us/";
			
			// switch from main tab to another tab
			String parent_tab = driver.getWindowHandle();
			
			Set<String> new_tabs = driver.getWindowHandles();

			new_tabs.remove(parent_tab);

			for (String ID : new_tabs) {
				
				driver.switchTo().window(ID);
			}
			
			// find address of home page
			WebElement hometab = driver.findElement(By.xpath("//a[text()='Home']"));
			
			Thread.sleep(5000);

			// click on home tab tab/link
			hometab.click();
			
			// declare home page url
			String urlofhomepage="https://samhithasoftware.com/";
			
			// wait until url of home page to be
			wait.until(ExpectedConditions.urlToBe(urlofhomepage));
			
			// to print test case is pass
			System.out.println("Test Case Is Passed ");
			
			//
			Thread.sleep(5000);
			// to quit the browser

			driver.quit();
			
			
		}
		catch(Exception e)
		{
			// to get title
			String title = driver.getTitle();
			// declare date
			Date Date = new Date();
			// to replace in date format 
			String date = Date.toString().replaceAll(":", "-");
			// to take screen shot
			TakesScreenshot ts = (TakesScreenshot) driver;
			// to save ram location
			File ramlocation = ts.getScreenshotAs(OutputType.FILE);
			// to give path of user defined location
			File drivelocation = new File("./failed_screenshots/" + title + "-" + date + "--->RKM.jpg");
			// to copy from ram location to user defined location
			FileHandler.copy(ramlocation, drivelocation);
			// to print test case is failed
			System.out.println("Test Case Is Failed");
			// to quit the browser
			driver.quit();
		}
	}
}
