package saran_samhitha;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Home_open_in_sameTab {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
	//	System.setProperty("webdriver.chrome.driver","./Executable_jar_files/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		try {
	driver.get("https://samhithasoftware.com/our-achievements/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement Home_Link = driver.findElement(By.xpath("//a[@title='Home']"));
	Thread.sleep(1000);
	Home_Link.click();
//	Actions action =new Actions(driver);
//	action.moveToElement(Home_Link);
//	Thread.sleep(2000);
//	Home_Link.sendKeys(Keys.ENTER);
	Thread.sleep(1000);
	TakesScreenshot ts =(TakesScreenshot) driver;
	File temp = ts.getScreenshotAs(OutputType.FILE);
	Date  d = new Date();
	System.out.println(d);
	String date = d.toString().replaceAll(":", "_");
	
	File prnmt = new File("C:\\Users\\User\\Desktop\\Samhitha Project\\Screenshot\\home_"+date+".png");
	FileHandler.copy(temp, prnmt);
	
	System.out.println("Home page is displayed in same Tab");
	driver.quit();
		}
		
	catch (Exception e) {
		TakesScreenshot ts =(TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		Date  d = new Date();
		System.out.println(d);
		String date = d.toString().replaceAll(":", "_");
		
		File prnmt = new File("D:\\My Projects\\SamhithaSoftware\\samhithasoftware_testing\\samhitha_software_automation_Scripts\\failed_screenshots\\home_"+date+".png");
		FileHandler.copy(temp, prnmt);
		
		System.out.println("tc failed home page not displayed");
		driver.quit();
		
	}
		}
	}
	
		
	

		
		
