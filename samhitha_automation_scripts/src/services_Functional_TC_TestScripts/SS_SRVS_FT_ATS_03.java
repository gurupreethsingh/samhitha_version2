package services_Functional_TC_TestScripts;

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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//When user click Samhitha Software LOGO in Services page then Home page should be displayed in same page

public class SS_SRVS_FT_ATS_03 {

	public static void main(String[] args) throws IOException {
		// lunch the browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		try {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			// enter the URL and Checking Title Matches
			driver.get("https://samhithasoftware.com/services-2/");
			Thread.sleep(2000);
			//click on Samhitha Software LOGO
			WebElement LOGo = driver.findElement(By.xpath("(//img[@class='custom-logo'])[1]"));
			
			wait.until(ExpectedConditions.elementToBeClickable(LOGo));

			LOGo.click();

			wait.until(ExpectedConditions.titleIs("samhithasoftware.com"));
			Thread.sleep(2000);
			driver.quit();

			System.out.println("Testcase passed");

		} catch (Exception e) {
			String title = driver.getTitle();
			Date date = new Date();
			String datee = date.toString().replaceAll(":", "-");

			TakesScreenshot ts = (TakesScreenshot) driver;
			File ramlocation = ts.getScreenshotAs(OutputType.FILE);

			File drivelocation = new File("./failed_screenshots/" + title + "-" + datee + ".png");

			FileHandler.copy(ramlocation, drivelocation);

			System.out.println("TestCase Failed");
			
			driver.quit();
		}

	}
}
