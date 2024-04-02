package ravikumar;

import java.io.File;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class E_CODERS_D_PROJECT {
	public static void main(String[] args) {
		WebDriver driver;
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		String url="http://127.0.0.1:5000/dashboard";
		
		
		try {
			
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		
		driver.get(url);
		WebElement dboard = driver.findElement(By.xpath("//h3[text()='Dashboard Page']"));
		
		wait.until(ExpectedConditions.visibilityOf(dboard));	
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[text()='Add New Employee']")).click();
		
		WebElement addnewemployee = driver.findElement(By.xpath("//h3[text()='Add New Employee Page']"));
		
		wait.until(ExpectedConditions.visibilityOf(addnewemployee));
		
		String name="Benkinaga";
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Benkinaga");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Bekinaga@gmail.com");
		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("7896547898");
		driver.findElement(By.xpath("//input[@id='address']")).sendKeys("Bekinaga from Benki Bengaluru");
		driver.findElement(By.xpath("//button[text()='Add Employee']")).click();
		
		Thread.sleep(5000);
		
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
		if(pageSource.contains(name))
		{
			System.out.println("Employee Is Added");
		}
		else {
			System.out.println("Employee Is Not Added");

		}
		
//wait.until(ExpectedConditions.vi)
//		driver.findElement(By.xpath(url))
//		wait.until(ExpectedConditions.visibilityOf(addnewemployee))

//		String title = driver.getTitle();
//		Date date = new Date();
//		String datee = date.toString().replaceAll(":", "-");
//
//		TakesScreenshot ts = (TakesScreenshot) driver;
//		File ramlocation = ts.getScreenshotAs(OutputType.FILE);
//
//		File drivelocation = new File("./failed_screenshots/" + title + "-" + datee + "--->EcdrsRkm.Jpg");
//
//		FileHandler.copy(ramlocation, drivelocation);
//
		System.out.println("TestCase Pass");

		driver.quit();
		
		}
		
		catch(Exception e)
		{
			
		}
	}

}
