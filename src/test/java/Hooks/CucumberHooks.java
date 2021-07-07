package Hooks;

import org.testng.ITestResult;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class CucumberHooks {
@Before
public void beforeRun() {
	System.out.println("Execution started");
}

@After
public void tearDOwn(Scenario scenario) {
	System.out.println("Test case status is "+scenario.getStatus());
}
}
