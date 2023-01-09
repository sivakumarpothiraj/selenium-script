package Scripts;

import java.io.IOException;

import org.openqa.selenium.Point;
import org.testng.annotations.Test;

import genericLib.StepGroup;
import pompages.SkillaryLogin;
import pompages.SkillarydemoLogin;
import pompages.Testing;

public class Testcase2 extends StepGroup
{
	@Test
	public void tc2() throws IOException
	{
	SkillaryLogin s=new SkillaryLogin(driver);
	s.gearsButton();
	s.demoskillaryapp();
	
	SkillarydemoLogin sd=new SkillarydemoLogin(driver);
	driverutilies.switchtabs(driver);
	driverutilies.dropdown(sd.getCoursedd(),pdata.getPropertydata("coursedd"));
	
	Testing t=new Testing(driver);
	driverutilies.draganddrop(driver, t.getSelenium(), t.getCart());
	Point loc = t.getFacebook().getLocation();
	int x = loc.getX();
	int y = loc.getY();
	
	driverutilies.scrollbar(driver, x, y);
	t.facebookicon();
	
	}
	
}
	
