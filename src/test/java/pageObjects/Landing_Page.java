package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Landing_Page extends BasePage {

	public Landing_Page(WebDriver driver) {
		super(driver);
		
	}

	//Elements
	@FindBy(xpath="//a[text()='Login']")
	WebElement Login_btn;
	
	//Action methods
	public void clickLogin_btn()
	{
		Login_btn.click();
	}
	
}
