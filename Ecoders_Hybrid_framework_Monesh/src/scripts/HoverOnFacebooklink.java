package scripts;

import generic.Verification;
import pom.Home_page;

public class HoverOnFacebooklink {
	
	@Test
	public void openfacebook()
	{
		Home_page hp = new Homepage();
		
		hp.hoveronfblink();
		
		Verification fc = new Verification();
		fc.verifybacground();
	}
}
