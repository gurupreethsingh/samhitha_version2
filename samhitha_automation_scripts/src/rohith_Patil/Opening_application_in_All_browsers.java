package rohith_Patil;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;



public class Opening_application_in_All_browsers {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = null;
		
		
		try {	
			
			
			driver =new ChromeDriver();	
			//WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(10));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://samhithasoftware.com");
			driver.quit();
			
			driver =new EdgeDriver();			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://samhithasoftware.com");
			Thread.sleep(3000);
			driver.quit();
			
			driver =new FirefoxDriver();			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://samhithasoftware.com");
			
			Thread.sleep(3000);
			driver.quit();
			System.out.println("The Application is opening in All browsers");
			
		} catch (Exception e) {
			
			
			Date D = new Date();
			D.toString();
			TakesScreenshot ts = (TakesScreenshot) driver;
			File temp = ts.getScreenshotAs(OutputType.FILE);
			File prnmt = new File("./failed_screenshots/home"+D+".png");
			FileHandler.copy(temp, prnmt);
			System.out.println("Facebook Icon is Highlighted");
			
		}
	}
}
