package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class My_profile extends BasePage {
	JavascriptExecutor js;
	public My_profile(WebDriver driver)
	{
		super(driver);
		this.js=(JavascriptExecutor)driver;
	}
	
	//Elements
	@FindBy(xpath="//div[contains(@class,\"quickLink \")]//span[contains(.,\"Career profile\")]")	
	WebElement	carrer_profile_link;
	@FindBy(xpath="//div[@class='desiredProfile']//div[@class='card']//div//span[@class='edit icon'][normalize-space()='editOneTheme']")
	WebElement Career_profile_form;
	
	@FindBy(id="locationSugg")
	WebElement Preferred_location;
	
	@FindBy(xpath="//*[text()=\"Chennai\"]/i")
	WebElement location_select;
	
	@FindBy(id="saveDesiredProfile")
	WebElement Save_btn;
	
	@FindBy(xpath="//p[text()='Career Profile have been successfully saved.']")
	WebElement Success_msg_text;
	
	//Action methods
	public void Click_Carrer_profile_link()
	{
		carrer_profile_link.click();
	}
	public void Click_Career_profile()
	{
		//Career_profile_form.click();
		js.executeScript("arguments[0].click();",Career_profile_form);
	}
	
	public void Click_preferred_location()
	{
		Preferred_location.click();
	}
	
	
	
	public boolean Select_Unselect_location()
	{
		try {
		return location_select.isSelected();
		}catch(Exception e)
		{
			return false;
		}
		
	}
	
	public void Click_savebtn()
	{
		//Save_btn.click();
		js.executeScript("arguments[0].click();",Save_btn);
	}
	
	public String get_Success_msg()
	{
		try {
			return Success_msg_text.getText();
		}
	
		catch(Exception e)
		{
			return(e.getMessage());
		}
	}
}
