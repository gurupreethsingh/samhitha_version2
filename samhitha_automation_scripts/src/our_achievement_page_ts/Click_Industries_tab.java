package our_achievement_page_ts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Click_Industries_tab {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.get("https://samhithasoftware.com/our-achievements/");
Thread.sleep(1000);
WebElement industries_tab = driver.findElement(By.xpath("//a[@title='Industries']"));
industries_tab.click();
{
	System.out.println("Industries page is open on new tab sucessfully");
}
driver.quit();
	}

}
