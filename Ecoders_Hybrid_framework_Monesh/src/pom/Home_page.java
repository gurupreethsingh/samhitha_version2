package pom;

public class Home_page 
{
   @FindBy(xapth="(//a[@href='#'])[1]")
   private WebElement Facebook_link;
   
   @FindBy(xapth="(//a[@href='#'])[2]")
   private WebElement linkedin_link;
   
   @FindBy(xapth="(//a[@href='#'])[3]")
   private WebElement searchfield;
   
   Home_page()
   {
	   PageFactory.initElements(this, driver);
   }
   
   
   // action which i am suppose to do on the facebooklink. 
   
   public void clickonfblink()
   {
	   Facebook_link.click();
   }
   
   public void hoveronfblink()
   {
	   // move to fb link
   }
   
   public void clickonlinkedinlink()
   {
	   linkedin_link.click();
   }
   
   public void enterintosearchfield()
   {
	   searchfield.sendKeys("ecoders");
   }
}
