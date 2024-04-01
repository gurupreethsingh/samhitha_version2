package our_achievement_page_ts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Click_Program_link {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://samhithasoftware.com/our-achievements/");
		Thread.sleep(1000);
		WebElement Program_tab = driver.findElement(By.xpath("//a[@title='Programs']"));
		Program_tab.click();
		{
			System.out.println("Programs page is open on new tab sucessfully");
		}
driver.quit();
	}

}
