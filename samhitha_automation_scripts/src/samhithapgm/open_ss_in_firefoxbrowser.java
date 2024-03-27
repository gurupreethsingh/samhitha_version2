package samhithapgm;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class open_ss_in_firefoxbrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\samhitha v\\samhithasoftware_testing\\samhitha_software_automation_Scripts\\Executable_jar_files\\chromedriver.exe");
		
		// open chrome browser. 
		WebDriver driver=new ChromeDriver();
		driver.get("https://samhithasoftware.com/seminars__workshops_slides/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();driver.quit();
		driver.quit();



	}

}
