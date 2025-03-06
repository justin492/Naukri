package stepDefinitions;

import java.io.IOException;
import java.util.Properties;

import org.testng.asserts.SoftAssert;

import factory.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePage;
import pageObjects.Landing_Page;
import pageObjects.LoginPage;
import pageObjects.My_profile;

public class Profile_Update {
	
	Landing_Page landing;
	LoginPage lp;
	Properties p;
	HomePage home;
	My_profile profile;
	@Given("Navigate to Naukri Application")
	public void navigate_to_naukri_application() {
	   landing=new Landing_Page(BaseClass.getDriver());
	   landing.clickLogin_btn();
	}

	@Given("Enter the Credential")
	public void enter_the_credential() throws IOException {
	  lp= new LoginPage(BaseClass.getDriver());
	  p=BaseClass.getProperties();
	  lp.txtEmail_id(p.getProperty("email_id"));
	  lp.txtpasswordfield(p.getProperty("password"));
	}
	
	@Given("Login as user")
	public void Login_as_user() {
	  lp.ClickLoginbtn(); 
	}

	@When("I navigate to My profile")
	public void i_navigate_to_my_profile() {
	    home=new HomePage(BaseClass.getDriver());
	    home.Click_view_profile();
	}

	@When("Click on carrer profile")
	public void click_on_carrer_profile() {
	   profile=new My_profile(BaseClass.getDriver());
	   profile.Click_Carrer_profile_link();
	   profile.Click_Career_profile();
	}

	@When("I click on {string}, select\\/deslect a {string}")
	public void i_click_on_select_deslect_a(String string, String string2) {
	   
		profile.Click_preferred_location();
		Boolean checkLocation_sel=profile.Select_Unselect_location();
		SoftAssert sa=new SoftAssert();
		sa.assertTrue(checkLocation_sel);
	}

	@When("Click on save button")
	public void click_on_save_button() {
	   profile.Click_savebtn();
	}

	@Then("Validate success message should display on carrer profile page")
	public void validate_success_message_should_display_on_carrer_profile_page() {
	    String succesmsg=profile.get_Success_msg();
	    SoftAssert sa=new SoftAssert();
	    sa.assertEquals("Career Profile have been successfully saved.", succesmsg);
	}
}
