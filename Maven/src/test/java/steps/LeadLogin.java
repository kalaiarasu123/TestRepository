package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class LeadLogin {

	public static ChromeDriver driver;
	public void enterURL() {
		System.setProperty("webdriver.chrome.driver", "C://TestLeaf//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		// Enter UserName
		/*driver.findElementById("username").sendKeys("DemoSalesManager");
		// Enter Password
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();*/
	}
	public void closeBrowser() {
		driver.close();
	}
}
