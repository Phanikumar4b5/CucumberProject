package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(
 features = "Features"
		 ,glue={"StepDefinition"},
				 monochrome = true,
		 dryRun=false
		 //strict=false,
		 //tags= {"@FunctionalTest","~@SmokeTest","~@RegrssionTest"},
		//format= {"pretty"},
		// plugin= {"usage"}
		 /*plugin = { "pretty", "json:target/cucumber-reports/Cucumber.json",
				 "junit:target/cucumber-reports/Cucumber.xml",
				 "html:target/cucumber-reports"}*/
				 //plugin = {"html:target/cucumber-reports"}
 		//format= {"json:C:\\\\Users\\\\791733\\\\Documents"}
 )

public class TestRunnerForTestng extends AbstractTestNGCucumberTests {
}
