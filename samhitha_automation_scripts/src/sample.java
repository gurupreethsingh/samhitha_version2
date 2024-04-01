


import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class sample {

	public static void main(String[] args) throws IOException {
		//System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		//open the browser
		WebDriver driver = new ChromeDriver();
		//open the webpage
		try
		{
		driver.get("https://samhithasoftware.com/our-achievements/");
		driver.navigate().to("https://samhithasoftware.com/");
		Thread.sleep(1000);
		String expectedtitle = "Oru Achievements samhitha";
		String actualtitle = driver.getTitle();
		System.out.println("Actual Title");
		//WebDriverWait wait = new WebDriverWait(driver, 10);
		//wait.until(ExpectedConditions.titleContains(expectedtitle));
		{
		System.out.println("Tc passed,titlematched");
	}
		}
	catch (Exception e) {
		e.printStackTrace();
		TakesScreenshot ts	=(TakesScreenshot) driver; 
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File prnmt = new File("C:\\Users\\User\\Desktop\\Samhitha Project\\Screenshot\\ourachievement.png");
		FileHandler.copy(temp, prnmt);
		System.out.println("Tc failed,title not matched");
			driver.quit();
	}
	}



	}
