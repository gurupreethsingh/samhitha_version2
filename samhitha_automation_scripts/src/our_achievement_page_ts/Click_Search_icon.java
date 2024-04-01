package our_achievement_page_ts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Click_Search_icon {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.get("https://samhithasoftware.com/our-achievements/");
Thread.sleep(1000);
WebElement Search_icon = driver.findElement(By.xpath("//i[@class='far fa-search']"));
Search_icon.click();
{
	System.out.println("Textfiled should be display");
}

driver.quit();

	}

}
