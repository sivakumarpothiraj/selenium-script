package Scripts;

import org.testng.annotations.Test;

import genericLib.StepGroup;
import pompages.Addtocart;
import pompages.SkillaryLogin;
import pompages.SkillarydemoLogin;

public class Testcase1 extends StepGroup
{
	@Test
	public void tc1() throws InterruptedException
	{
		SkillaryLogin l=new SkillaryLogin(driver);
		l.gearsButton();
		l.demoskillaryapp();
		
		SkillarydemoLogin sd=new SkillarydemoLogin(driver);
		driverutilies.switchtabs(driver);
		driverutilies.mousehover(driver, sd.getCourdetab());
		sd.seleniumtrainingbtn();
		
		Addtocart ad=new Addtocart(driver);
		driverutilies.doubleclick(driver, ad.getAddbtn());
		ad.addtocartbutton();
		driverutilies.alertpopup(driver);
	
	}
}
