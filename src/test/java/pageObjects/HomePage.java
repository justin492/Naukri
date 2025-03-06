package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
      
	public HomePage(WebDriver driver) {
		super(driver);
		
	}
	//elements
	@FindBy(partialLinkText="View")
	WebElement View_profile_button;
	
	//Action methods
	public void Click_view_profile()
	{
		View_profile_button.click();
	}
}
