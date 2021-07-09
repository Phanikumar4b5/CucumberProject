package Hooks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;

import PageObjects.BaseClass;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CucumberHooks extends BaseClass{
	public static WebDriver driver;
@Before
public void beforeRun() {
	System.out.println("Execution started");
	 WebDriverManager.chromedriver().setup();
	 	driver=new ChromeDriver();
	   driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
}

@After
public void tearDOwn(Scenario scenario) {
	System.out.println("Test case status "+scenario.getStatus());
}
}
