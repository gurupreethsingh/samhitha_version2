package rohith_Patil;


import java.util.List;
import java.util.Scanner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Search_for_link {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://samhithasoftware.com");

		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		try {
			List<WebElement> allLinks = driver.findElements(By.tagName("a"));

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the link which you want to search in webpage? ");
			String srclink = sc.next();

			boolean result = false;
			for (WebElement eachlink : allLinks) {

				String link = eachlink.getAttribute("href");

				if (link.equals(srclink)) {

					result = true;
				}
			}

			if (result == true) {
				System.out.println("yes " + srclink + "  link is present in webpage");
			} else {
				System.out.println("yes " + srclink + "  link is  not present in webpage");
			}
		} catch (Exception e) {

			e.printStackTrace();
		}
		driver.quit();
	}
}
