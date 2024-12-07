package Stepdefinition;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
	    features = {"Feature Files"},
		glue={"Stepdefinition"},
        plugin = {"pretty",
                "html:target/report/cucumber.html",
                "json:target/report/cucumber.json"
        }
		//dryRun = false,
		
	    //tags= "@Sanity and not @Regression"

		)
 
public class TestRunner extends AbstractTestNGCucumberTests
{
	
 
}

