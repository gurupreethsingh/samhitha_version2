package saran_samhitha;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Open_SS_in_edge {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.get("https://samhithasoftware.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		{
			System.out.println("Samhitha Software page is successfully open with Microsoft Edge");
			driver.quit();
		}
		

	}

}
