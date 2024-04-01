package our_achievement_page_ts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Click_FB_Icon {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://samhithasoftware.com/our-achievements/");
		Thread.sleep(2000);
		WebElement FBI = driver.findElement(By.xpath("//a[contains(@href,facebook)]"));
		FBI.click();
		Thread.sleep(1000);
		{
			System.out.println("Facebook should open on new tab");
			
		}
	
			driver.quit();
	}

}
