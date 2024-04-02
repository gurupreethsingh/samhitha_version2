package samhithapgm;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class dammy_page {

	public static void main(String[] args) throws Exception {
	  WebDriver  driver;
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  String url="http://127.0.0.1:5000/dashboard";
	  
	 // try {
		  WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		  
		  driver.get(url);
		           WebElement dboard = driver.findElement(By.xpath("//h3[text()='Dashboard Page']"));  
		  
		  wait.until(ExpectedConditions.visibilityOf(dboard));
		  
		  Thread.sleep(5000);
		  
		//driver.findElement(By.xpath(""))
		  
		  
	}
	  

	}


