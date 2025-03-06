package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver)
	{
		super(driver);
	}
	
	//Elements
	@FindBy(xpath="//input[contains(@placeholder,'Email')]")
	WebElement Email_idField;
	
	@FindBy(xpath="//input[contains(@placeholder,'password')]")
	WebElement PasswordField;
	
	@FindBy(xpath="//button[text()='Login']")
	WebElement Login_btn;
	
	//Action method
	public void txtEmail_id(String Email)
	{
		Email_idField.sendKeys(Email);
	}
	
	public void txtpasswordfield(String password)
	{
		PasswordField.sendKeys(password);
	}
	
	public void ClickLoginbtn()
	{
		Login_btn.click();
	}
}
