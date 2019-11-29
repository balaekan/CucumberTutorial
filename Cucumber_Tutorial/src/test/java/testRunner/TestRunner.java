package testRunner;		

import org.junit.runner.RunWith;		
import cucumber.api.CucumberOptions;		
import cucumber.api.junit.Cucumber;
	
@RunWith(Cucumber.class) 
@CucumberOptions( 
		   features = "G:\\Bala\\Selenium Learning\\CucumberSelenium\\src\\test\\java\\features\\" ,
		   glue =
		{"stepDefinition"} ,
		  monochrome = true,
		plugin = { "pretty", "json:src/test/cucumber-reports.json"})
public class TestRunner 				
{		

}