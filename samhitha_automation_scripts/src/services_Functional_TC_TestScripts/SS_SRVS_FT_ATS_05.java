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
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//when user hovers or takes the mouse pointer on 'Programs' link / tab in Services page should display sub menus
public class SS_SRVS_FT_ATS_05 {

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
			Actions action = new Actions(driver);
			WebElement Programs = driver.findElement(By.xpath("//a[@title='Programs']"));

			wait.until(ExpectedConditions.elementToBeClickable(Programs));

			action.moveToElement(Programs).perform();
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
