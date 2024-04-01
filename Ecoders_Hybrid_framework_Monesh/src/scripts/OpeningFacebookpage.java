package scripts;

import generic.Verification;
import pom.Home_page;

public class OpeningFacebookpage
{
	@Test
	public void openfacebook()
	{
		Home_page hp = new Homepage();
		
		hp.clickonfblink();
		
		Verification fc = new Verification();
		fc.verifyTitle("facebook");
	}

}
