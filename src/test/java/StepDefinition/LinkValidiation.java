package StepDefinition;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import Hooks.CucumberHooks;
import cucumber.api.java.en.*;


public class LinkValidiation{
	static WebDriver driver;
	int countOfLinks;
	List<WebElement> links;
	List<String> titles=new ArrayList<String>();
	@Given("^user is on practice page$")
	public void user_is_on_practice_page() throws Throwable {
		   this.driver=CucumberHooks.driver;
	}

	@When("^user clicks on any link$")
	public void user_clicks_on_any_link() throws Throwable {
		WebElement table=driver.findElement(By.cssSelector("div[id='gf-BIG']"));
		links=table.findElements(By.cssSelector("table>tbody>tr>td:nth-child(1)>ul>li>a"));
	   countOfLinks= links.size();
	  System.out.println(countOfLinks);
	}

	@Then("^link should open in seperate tab$")
	public void link_should_open_in_seperate_tab() throws Throwable {
		for(int i=0;i<countOfLinks;i++) {
			Thread.sleep(2000);
		//	String keys=Keys.chord(Keys.CONTROL,Keys.ENTER);
			links.get(i).sendKeys(Keys.CONTROL,Keys.ENTER);
		}
	}

	@Then("^no link should be broken$")
	public void no_link_should_be_broken() throws Throwable {
		this.driver=CucumberHooks.driver;
		user_clicks_on_any_link();
		link_should_open_in_seperate_tab();
		Set<String> allWindows=driver.getWindowHandles();
		Iterator<String> iterator=allWindows.iterator();
		while(iterator.hasNext()) {
			driver.switchTo().window(iterator.next());
			titles.add(driver.getTitle());
		}
	}

	@Then("^verify the link title$")
	public void verify_the_link_title() throws Throwable {
		System.out.println(titles);
	}
}
