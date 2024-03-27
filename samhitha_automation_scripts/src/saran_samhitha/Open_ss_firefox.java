package saran_samhitha;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Open_ss_firefox {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		driver.get("https://samhithasoftware.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();

		{
			System.out.println("Samhithasoftware page open with firefox browser");
			driver.quit();
		}

	}

}
