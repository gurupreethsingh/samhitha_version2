package monesh;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SanAshwa_add_to_cart
{
public static void main(String[] args) throws InterruptedException
{
    WebDriver driver=new ChromeDriver();
driver.get("https://sanashwa.com/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.manage().window().maximize();
driver.findElement(By.className("button"));
Thread.sleep(3000);
}
}
