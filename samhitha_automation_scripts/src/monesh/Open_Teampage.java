package monesh;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Open_Teampage 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver","D:\\Samhitha_Software_Testing_project\\samhithasoftware_testing\\samhitha_software_automation_Scripts\\Executable_jar_files\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	// open team page 
	driver.get("https://samhithasoftware.com/team-2/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	// click on Home tab
	WebElement home_tab=driver.findElement(By.xpath("(//a[@href='https://samhithasoftware.com/'])[3]\r\n"
			+ ""));
	home_tab.click();
	Thread.sleep(2000);
	driver.quit();
	// add screenshot code
	
}
}
