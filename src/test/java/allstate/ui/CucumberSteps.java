package allstate.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.TestCase;

public class CucumberSteps extends TestCase{
	private WebDriver driver;
	@Given("^user open \"([^\"]*)\" and select \"([^\"]*)\"$")
	public void user_open_and_select(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.setProperty("webdriver.gecko.driver", "/Users/naveensingh/Downloads/geckodriver");
		if(arg1.equals("Firefox"))
		{
			driver = new FirefoxDriver();
		}
	    driver.get(arg2);
	}

	@Given("^user enter (\\d+) and (\\d+)$")
	public void user_enter_and(int arg1, int arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		driver.findElement(By.id("ID_nameField1")).clear();
		driver.findElement(By.id("ID_nameField1")).sendKeys(arg1+"");
		driver.findElement(By.id("ID_nameField2")).clear();
		driver.findElement(By.id("ID_nameField2")).sendKeys(arg2+"");
		
	}

	@Given("^Select \"([^\"]*)\"$")
	public void select(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		if(arg1.equals("Add"))
		{
			driver.findElement(By.id("gwt-uid-1")).click();
		}
		else
		{
			driver.findElement(By.id("gwt-uid-2")).click();
		}
	}

	@When("^Click on Calculate$")
	public void click_on_Calculate() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		driver.findElement(By.id("ID_calculator")).click();
	}

	@Then("^Result should be (\\d+)$")
	public void result_should_be(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		int result= Integer.valueOf(driver.findElement(By.id("ID_nameField3")).getAttribute("value"));
		assertEquals(arg1, result);
		driver.quit();
		
	}


}
