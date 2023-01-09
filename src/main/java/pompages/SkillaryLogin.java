package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillaryLogin 
{
	@FindBy(xpath="//a[text()=' GEARS ']")
	private WebElement gearstab;
	
	@FindBy(xpath="(//a[text()=' SkillRary Demo APP'])[2]")
	private WebElement demoapp;
	
	@FindBy(name="q")
	private WebElement searchtb;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement gobtn;
	
	public SkillaryLogin(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void gearsButton()
	{
		gearstab.click();
	}
	public void demoskillaryapp()
	{
		demoapp.click();
	}
	public void searchtextbox(String course) 
	{
		searchtb.sendKeys(course);
	}
	public void searchbutton()
	{
		gobtn.click();
	}
}
