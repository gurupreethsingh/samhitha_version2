package SystemTestScript;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;
import java.util.Set;

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

public class O1_SystemTestSctip_Services_PageToHomePage {

	public static void main(String[] args) throws IOException {
		// lunch the browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		try {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			// enter the URL and Checking Title Matches
			driver.get("https://samhithasoftware.com");
			Thread.sleep(2000);
			Actions action = new Actions(driver);
			WebElement Services = driver.findElement(By.xpath("//a[@title='Services']"));

			wait.until(ExpectedConditions.elementToBeClickable(Services));

			action.moveToElement(Services).perform();
			WebElement Capabilities = driver.findElement(By.xpath("//a[@title='Capabilities']"));

			wait.until(ExpectedConditions.elementToBeClickable(Capabilities));

			action.moveToElement(Capabilities);
			action.click().perform();
			String parent_tab = driver.getWindowHandle();
			Set<String> new_tabs = driver.getWindowHandles();

			new_tabs.remove(parent_tab);

			for (String ID : new_tabs) {
				driver.switchTo().window(ID);
			}

			WebElement Home = driver.findElement(By.xpath("//a[@title='Home']"));

			Home.click();

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
