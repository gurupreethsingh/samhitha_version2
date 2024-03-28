package SystemTestScript;

import java.time.Duration;

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
driver.get("https://samhithasoftware.com/our-achievements/");
Thread.sleep(1000);
Actions act = new Actions(driver);
WebElement ourachv = driver.findElement(By.xpath("a//[@title='Our Achievements']"));
wait.until(ExpectedConditions.elementToBeClickable(ourachv));
act.moveToElement(ourachv);

WebElement Home = driver.findElement(By.xpath("//a[@title='Home']"));
Thread.sleep(2000);
act.moveToElement(Home);
act.click().perform();
driver.quit();


}
}