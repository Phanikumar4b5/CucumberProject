package StepDefinition;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class HomePage {
	WebDriver driver;
	@Given("^customer is on login page$")
	public void customer_is_on_login_page() throws Throwable {
	   WebDriverManager.chromedriver().setup();
	   driver=new ChromeDriver();
	   driver.get("http://demo.guru99.com/test/newtours/index.php");
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@When("^customer enters valid username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void customer_enters_valid_username_and_password(String arg1, String arg2) throws Throwable {
		driver.findElement(By.name("userName")).sendKeys(arg1);
		driver.findElement(By.name("password")).sendKeys(arg2);
	}

	@Then("^login successful$")
	public void login_successful() throws Throwable {
		driver.findElement(By.name("submit")).click();
		Thread.sleep(5000);
	}

	@Then("^home page is displayed$")
	public void home_page_is_displayed() throws Throwable {
	String actualText=driver.findElement(By.tagName("h3")).getText();
	Assert.assertEquals("Login Successfully",actualText);
	}
}
