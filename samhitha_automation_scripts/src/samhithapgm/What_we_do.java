package samhithapgm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class What_we_do {
	public static void main(String[] args) throws Exception {
		WebDriver driver;

		// 1 open chrome browser.
		driver = new ChromeDriver();

		// 2 go to the webpage
		driver.get("https://www.samhithasoftware.com");
		String homepagenumber = driver.getWindowHandle();
		System.out.println(homepagenumber);

		// make the code sleep for 5 seconds .
		Thread.sleep(3000);

		// 3 . find the about us link/tab.
		WebElement aboutuslink = driver.findElement(By.xpath("(//a[@class='nav-link'])[2]"));
		Thread.sleep(3000);

	}

}
