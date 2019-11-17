package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class Login extends LeadLogin {	
	/*public ChromeDriver driver;
	@Given("Open the Chrome Browser")
	public ChromeDriver openTheChromeBrowser() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C://TestLeaf//chromedriver.exe");
		driver = new ChromeDriver();    
		return driver;
	}

	@Given("Maximize the Browser")
	public void maximizeTheBrowser() {
	    // Write code here that turns the phrase above into concrete actions
		driver.manage().window().maximize();
	  
	}

	@Given("set the Implicit Timeouts")
	public void setTheImplicitTimeouts() {
	    // Write code here that turns the phrase above into concrete actions
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	    	}

	@Given("Load the Leaftaps URL")
	public void loadTheLeaftapsURL() {
		driver.get("http://leaftaps.com/opentaps");
	    // Write code here that turns the phrase above into concrete actions
	    
	}*/

	@Given("Enter the Username as (.*)")
	public void enterTheUsernameAsDemoSalesManager(String username) {
	    // Write code here that turns the phrase above into concrete actions
		// Enter UserName
		driver.findElementById("username").sendKeys(username);
	}

	@Given("Enter the password as (.*)")
	public void enterThePasswordAsCrmsfa(String passowrd) {
	    // Write code here that turns the phrase above into concrete actions
		// Enter Password
				driver.findElementById("password").sendKeys(passowrd);
	  
	}

	@When("Click on the Login Button")
	public void clickOnTheLoginButton() {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@Then("Verify Login Successfull")
	public void verifyLoginSuccessfull() {
		driver.findElementByClassName("decorativeSubmit").click();
	   
	}

	@Then("Click on the CRM link")
	public void clickOnTheCRMLink() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElementByLinkText("CRM/SFA").click();
	    
	}

	@Then("Verify the Home Page")
	public void verifyHomePage() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElementByLinkText("My Home").click();
	    
	}
}
