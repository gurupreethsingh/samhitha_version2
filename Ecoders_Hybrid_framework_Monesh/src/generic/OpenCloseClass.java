package generic;

public abstract class OpenCloseClass implements Constants
{
	// two functions one , to open the app, another to close the app. 
	WebDriver driver;
	public void openapplication()
	{
		System.setProperty(chromekey, chromevalue);
		driver = new ChromeDriver();
		driver.get(urlofapplication);
		
		
	}

}
