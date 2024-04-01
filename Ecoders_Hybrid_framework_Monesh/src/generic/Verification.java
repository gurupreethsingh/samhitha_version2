package generic;

public class Verification 
{
	
	public void verifyTitle(String expectedtitle)
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		try {
            wait.until(ExceptedConditions.titleIs(expectedtitle));
            Reporter.log("Test case passed.");
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			// screen shot code. 
			
		}
	}
	
	
	public void verifyUrls(String expectedurl)
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		try {
            wait.until(ExceptedConditions.urlMatches(expectedtitle));
            Reporter.log("Test case passed.");
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			// screen shot code. 
			
		}
	}
	
	
	public void verifyeleementpresent(WebElement element_name)
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		try {
            wait.until(ExceptedConditions.presenceOfElement(element_name));
            Reporter.log("Test case passed.");
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			// screen shot code. 
			
		}
		
		public void verifybacground()
		{
			WebDriverWait wait = new WebDriverWait(driver, 10);
			
			try {
	            wait.until();
	            Reporter.log("Test case passed.");
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
				// screen shot code. 
				
			}
	}

}
