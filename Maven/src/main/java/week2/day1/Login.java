package week2.day1;



import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Login {

	public static void main(String[] args) {	
		// This basically sets the system property to value named webdriver.chrome.driver and the path is mentioned to get the chrome driver
        System.setProperty("webdriver.chrome.driver","C://TestLeaf//chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://leaftaps.com/opentaps");
        driver.manage().window().maximize(); 
        //Enter UserName
        driver.findElementById("username").sendKeys("DemoSalesManager");
        //Enter Password
        driver.findElementById("password").sendKeys("crmsfa");
        driver.findElementByClassName("decorativeSubmit").click();
        driver.findElementByLinkText("CRM/SFA").click();
        driver.findElementByLinkText("Create Lead").click();
        driver.findElementById("createLeadForm_companyName").sendKeys("TestLeaf");
        driver.findElementById("createLeadForm_firstName").sendKeys("Kalai");
        driver.findElementById("createLeadForm_lastName").sendKeys("Arasu");
        WebElement dropdown1 =  driver.findElementById("createLeadForm_industryEnumId");
        Select dd1 = new Select(dropdown1);
        dd1.selectByVisibleText("IND_RETAIL");
        WebElement dropdown2 =  driver.findElementById("createLeadForm_marketingCampaignId");
        Select dd2 = new Select(dropdown2);
        List<WebElement> options = dd2.getOptions();
        int size = options.size();
        dd2.selectByIndex(size-1);
        WebElement dropdown3 =  driver.findElementById("createLeadForm_industryEnumId");
        Select dd3 = new Select(dropdown3);
        dd3.selectByValue("Corporation");
        //driver.findElementByName("submitButton").click();
       // String companyname = driver.findElementById("viewLead_companyName_sp").getText();
       // System.out.println(companyname);
       // driver.close();
	}

}
