package our_achievement_page_ts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Click_Iinkedin_Icon {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://samhithasoftware.com/our-achievements/");
		Thread.sleep(1000);
		WebElement linkedin_icon = driver.findElement(By.xpath("//i[@class='fab fa-linkedin']"));
		linkedin_icon.click();
		{
			System.out.println("Linkedin application open on new tab");
		}
		driver.quit();
		
		
		

	}

}
