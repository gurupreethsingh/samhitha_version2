package our_achievement_page_ts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Click_Awards_Tab {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://samhithasoftware.com/our-achievements/");
		Thread.sleep(2000);
		WebElement Hov_AbtUs= driver.findElement(By.xpath("//a[@title='About Us']"));
		Actions act = new Actions(driver);
		act.moveToElement(Hov_AbtUs).perform();
		Thread.sleep(2000);

		WebElement Click_Awards_Tab = driver.findElement(By.xpath("//a[@title='Awards']"));
		Thread.sleep(1000);
		act.moveToElement(Click_Awards_Tab).click().perform();
		Thread.sleep(2000);
		{
			System.out.println("Awards page is open on new tab");
		}

		driver.quit();

	}

}
