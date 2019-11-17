package steps;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	   LeadLogin log = new LeadLogin();
	   LeadLogin log1 = new LeadLogin();
	
	@Before
	public void prescenario(Scenario sc) {
     System.out.println("TestCase name:" +sc.getName());
     System.out.println("Testcase ID" +sc.getId());
  
     log.enterURL();
		
	}
	@After
	public void postscenario(Scenario sc) {
		 System.out.println("Testcase Status" +sc.getStatus());
		 log.closeBrowser();
		 }

}
