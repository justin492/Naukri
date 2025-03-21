package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


	@RunWith(Cucumber.class)
	@CucumberOptions(
						//features= {".//Features/"},
						//features= {".//Features/Login.feature"},
						features= {"src/test/resources/Feature/ProfileUpdate.feature"},
			
						//features= {".//Features/LoginDDTExcel.feature"},
						//features= {".//Features/Login.feature",".//Features/Registration.feature"},
						//features= {"@target/rerun.txt"},
						glue={"stepDefinitions","Hooks"}
						//plugin= {
								//	"pretty", "html:reports/myreport.html",   
								//	"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
									//"rerun:target/rerun.txt",
								
								//},
								
						//dryRun=false,    // checks mapping between scenario steps and step definition methods
					//	monochrome=true,    // to avoid junk characters in output
						//publish=true, // to publish report in cucumber server
						//tags="@Master"  // this will execute scenarios tagged with @sanity
						//tags="@functional"
						//tags="@regression"
						//tags="@sanity and @regression" //Scenarios tagged with both @sanity and @regression
						//tags="@sanity and not @regression" //Scenarios tagged with @sanity but not tagged with @regression
						//tags="@sanity or @regression" //Scenarios tagged with either @sanity or @regression
			)
	public class TestRunner {

	}

