package SystemTestScript;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class systemts_OurAchievementsPage_HomePage {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		// enter the URL and Checking Title Matches
		driver.get("https://samhithasoftware.com/our-achievements/");
		Thread.sleep(2000);
		
		WebElement About_Us = driver.findElement(By.xpath("//a[@title='About Us']"));

		wait.until(ExpectedConditions.elementToBeClickable(About_Us));

		About_Us.click();

		String parent_tab = driver.getWindowHandle();
		Set<String> new_tabs = driver.getWindowHandles();

		new_tabs.remove(parent_tab);

		for (String ID : new_tabs) {
			driver.switchTo().window(ID);
		}
		wait.until(ExpectedConditions.titleIs("About Us – samhithasoftware.com"));
		
		WebElement our_achv = driver.findElement(By.xpath("//a[@title='About Us']"));
		//wait.until(ExpectedConditions.elementToBeClickable(our_achv));
		Actions act = new Actions(driver);
		act.moveToElement(our_achv).click();
		//driver.quit();

		Thread.sleep(2000);
		

		Thread.sleep(2000);
		driver.quit();

		System.out.println("Testcase passed");
	}
}

