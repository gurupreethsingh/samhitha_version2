package our_achievement_page_ts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Click_Email_id_tab {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.get("https://samhithasoftware.com/our-achievements/");
Thread.sleep(1000);
WebElement email_id = driver.findElement(By.xpath("//i[@class='fal fa-envelope']"));
email_id.click();
{
	System.out.println("Modal should be display");
}
driver.quit();
	}

}
