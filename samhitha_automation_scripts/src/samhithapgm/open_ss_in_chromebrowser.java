package samhithapgm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class open_ss_in_chromebrowser {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "./Executable_jar_files/chromedriver.exe");
		
				// open chrome browser. 
				WebDriver driver = new ChromeDriver();
				
				// go to the webpage
				driver.get("https://www.samhithasoftware.com/");
				
				//make the code sleep for 5 seconds . 
				Thread.sleep(5000);
				
				// close the browser 
				driver.quit();
			}
		


	}


