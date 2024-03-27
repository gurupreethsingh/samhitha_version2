package rohith_Patil;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Open_home_Page_from_AboutUsPage {

	public static void main(String[] args) {

		WebDriver driver;
		try {

			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://samhithasoftware.com/about-us/");			
			WebElement Home_Link = driver.findElement(By.xpath("//a[text()='Home']"));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			Home_Link.click();
			Thread.sleep(2000);
			driver.quit();
			

		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}

}
