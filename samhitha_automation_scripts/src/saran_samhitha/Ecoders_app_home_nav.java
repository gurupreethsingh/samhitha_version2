package saran_samhitha;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ecoders_app_home_nav {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://127.0.0.1:5000");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		Thread.sleep(1000);
		WebElement Home_Tab = driver.findElement(By.id("loginlink"));
		Home_Tab.click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("saranya.pgp2009@gmail.com");
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("saran");
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		//Thread.sleep(2000);
		WebElement add_nw_emp = driver.findElement(By.xpath("//a[@class='nav-link']"));
		add_nw_emp.click();
		//Thread.sleep(1000);
		String Name ="saranya";
		driver.findElement(By.id("name")).sendKeys(Name);
		//Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("saranya@gmail.com");
		driver.findElement(By.id("phone")).sendKeys("134137523562");
		driver.findElement(By.id("address")).sendKeys("bangalore");
		WebElement add_emp = driver.findElement(By.xpath("//button[@type='submit']"));
		add_emp.click();
		WebElement New_Emp = driver.findElement(By.xpath("//td[text()='"+Name+"']"));
		wait.until(ExpectedConditions.invisibilityOf(New_Emp));
		String pagesource = driver.getPageSource();
		System.out.println("get pagesource");
		if (pagesource.contains(Name))
		{
			System.out.println("Employee details is added");
		}
		else
		{
			System.out.println("Employee details not added");
		}
		
		driver.quit();
		
		

		

	}

}
