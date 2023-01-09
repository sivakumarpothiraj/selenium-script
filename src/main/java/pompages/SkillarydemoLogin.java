package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillarydemoLogin 
{
	@FindBy(id="course")
	private WebElement courdetab;
	
	@FindBy(xpath="//a[text()='Selenium Training']")
	private WebElement seleniumtraining;
	
	@FindBy(name="addresstype")
	private WebElement coursedd;
	
	public SkillarydemoLogin(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getCourdetab() {
		return courdetab;
	}
	
	public WebElement getCoursedd() {
		return coursedd;
	}

	public void seleniumtrainingbtn()
	{
		seleniumtraining.click();
	}
}
