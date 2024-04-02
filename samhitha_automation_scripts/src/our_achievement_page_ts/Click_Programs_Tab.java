package our_achievement_page_ts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Click_Programs_Tab {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://samhithasoftware.com/our-achievements/");
		Thread.sleep(2000);
		WebElement Click_Prgs_Tab= driver.findElement(By.xpath("//a[@title='Programs']"));
		Actions act = new Actions(driver);
		act.moveToElement(Click_Prgs_Tab).click().perform();
		Thread.sleep(2000);

			{
			System.out.println("Programs page is open on new tab");
		}

		driver.quit();

	}

}
