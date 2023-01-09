package Scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import genericLib.StepGroup;
import pompages.Seleniumpage;
import pompages.SkillaryLogin;
import pompages.Wishlist;

public class Testcase3 extends StepGroup
{
	@Test
	public void tc3() throws IOException, InterruptedException
	{
	SkillaryLogin s=new SkillaryLogin(driver);
	s.searchtextbox(pdata.getPropertydata("coursename"));
	s.searchbutton();
	
	Seleniumpage se=new Seleniumpage(driver);
	se.corejavaselenium();
	
	Wishlist w=new Wishlist(driver);
	w.closepopup();
	driverutilies.switchbackframe(driver);
	w.playbutton();
	Thread.sleep(5000);
	w.pausebutton();
	driverutilies.switchbackframe(driver);
	w.wishlist();
	}
}
