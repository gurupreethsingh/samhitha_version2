package homepage_functional_tc_scripts;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OpenOurAchivementsPage {

	public static void main(String[] args) throws IOException, InterruptedException
	{
		org.openqa.selenium.WebDriver driver = null;
		
		try {
				
				// 1 open chrome browser. 
				 driver = new ChromeDriver();
				
				// 2 go to the webpage
				driver.get("https://www.samhithasoftware.com");
				String homepagenumber = driver.getWindowHandle();
				System.out.println(homepagenumber);
				
				//make the code sleep for 5 seconds . 
				Thread.sleep(3000);
				
				//3 . find the about us link/tab. 
				WebElement aboutuslink  = driver.findElement(By.xpath("(//a[@class='nav-link'])[2]"));
				Thread.sleep(3000);
				
				// 4. find the our achivements link
				// 4a move on top of about us link 
				Actions a = new Actions(driver);
				a.moveToElement(aboutuslink ).perform();
				Thread.sleep(2000);
				
				// 5. find the our achievements link
				WebElement ourachievementlink  = driver.findElement(By.xpath("//a[@title='Our Achievements']"));
				Thread.sleep(2000);
				
				// 6 move to our acheiement link /tab from about us tab. 
				a.moveToElement(ourachievementlink);
				Thread.sleep(1000);
				
				// 7 click on our achievements link
				ourachievementlink.click();
				Thread.sleep(1000);
				Set<String> allnumbers = driver.getWindowHandles();
				
				int count = allnumbers.size();
				
				// Switch to the new tab
				for (String windowHandle : allnumbers) {
				    if (!windowHandle.equals(homepagenumber)) {
				        driver.switchTo().window(windowHandle);
				        break;
				    }
				}
				
				
				// 8 take and print the title , url of the page. 
				String actualtitle  = driver.getTitle();
				System.out.println(actualtitle);
				
				String actualurl = driver.getCurrentUrl();
				
				String expectedtitle = "Our Achievements – samhithasoftware.com";
						
//				String expectedurl = "https://samhithasoftware.com/our-achievements/";
				
				// im waiting only 10 seconds in order to see if title of our achievements page matches or not.
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
				
				wait.until(ExpectedConditions.titleIs(expectedtitle));
				
//				wait.until(ExpectedConditions.urlMatches(expectedurl));
				
				System.out.println("Test case passed.");
				
				Thread.sleep(2000);
				
				// close the browser 
				driver.quit();	
		}
		
		catch(Exception ex)
		{
			ex.printStackTrace();
			Date d = new Date();
			
			d.toString();
			// take the screen shot if test case fails. 
			TakesScreenshot ts = (TakesScreenshot) driver;
			
			File ramlocation = ts.getScreenshotAs(OutputType.FILE);
			
			File harddisklocation  = new File("D:\\samhitha_software_lastest\\samhithasoftware_testing\\samhitha_software_automation_Scripts\\failed_screenhsots\\hompeage"+d+".png");
			
//			FileUtils.copyFile(ramlocation, harddisklocation);
//			Files.copy(ramlocation, harddisklocation);
			FileHandler.copy(ramlocation, harddisklocation);
			
			System.out.println("test case failed");
			
			
			Thread.sleep(2000);
			// close the browser 
			driver.quit();	
		}
	}
}
