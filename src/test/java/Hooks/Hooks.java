package Hooks;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import factory.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;


public class Hooks {

	  WebDriver driver;
	  Properties p;
     
	@Before
    public void setup() throws IOException, InterruptedException
    {
    	driver=BaseClass.initilizeBrowser();
    	    	
    	p=BaseClass.getProperties();
    	driver.get(p.getProperty("appurl"));
    	driver.manage().window().maximize();
    			
	}
		
    
   // @After
   // public void tearDown() throws IOException, InterruptedException {
        		
     //  driver.quit();
       //Runtime.getRuntime().exec("cmd /c start Stop_dockergrid.bat");
      //Thread.sleep(15000);
   // }
    

    @AfterStep
    public void addScreenshot(Scenario scenario) {
        
    	// this is for cucumber junit report
        if(scenario.isFailed()) {
        	
        	TakesScreenshot ts=(TakesScreenshot) driver;
        	byte[] screenshot=ts.getScreenshotAs(OutputType.BYTES);
        	scenario.attach(screenshot, "image/png",scenario.getName());
        	            
        }
      
    }
   
}
