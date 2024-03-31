package monesh;

import java.io.File;
import java.time.Duration;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Add_new_Employee_page 
{
public static void main(String[] args) 
{
	WebDriver driver=new ChromeDriver();
	try
	{
	driver.get("http://127.0.0.1:5000/dashboard");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement click_on_add=driver.findElement(By.xpath("//a[@href='/addnewemployee']"));
	click_on_add.click();
	WebElement Name=driver.findElement(By.id("name"));
	Name.click();
	Name.sendKeys("Monesh");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement Email=driver.findElement(By.id("email"));
	Email.click();
	Email.sendKeys("moneshsutar0306@gmail.com");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement Phone=driver.findElement(By.id("phone"));
	Phone.click();
	Phone.sendKeys("8806549360");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement Address=driver.findElement(By.id("address"));
	Address.click();
	Address.sendKeys("Solapur 413004");
	WebElement clickon_addbutton=driver.findElement(By.xpath("//button[@class='btn text-light m-3']"));
	clickon_addbutton.click();
//	  Scroll down
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,4000)", "");
	Thread.sleep(50);
//	 take Screenshot
	TakesScreenshot ts =(TakesScreenshot) driver;
	File temp = ts.getScreenshotAs(OutputType.FILE);
	Date  d = new Date();
	System.out.println(d);
	String date = d.toString().replaceAll(":", "_");
	
	File prnmt = new File("./failed_screenshots"+date+"monesh.png");
	FileHandler.copy(temp, prnmt);
	
	System.out.println("Adding new Employee ");
	driver.quit();
		}
		
	catch (Exception e) {
		TakesScreenshot ts =(TakesScreenshot) driver;
	}	
}
}
