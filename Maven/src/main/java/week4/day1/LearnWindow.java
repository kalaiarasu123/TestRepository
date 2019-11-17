package week4.day1;



import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnWindow {

	public static void main(String[] args) throws InterruptedException {	
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
        driver.findElementByLinkText("Leads").click();
        driver.findElementByLinkText("Merge Leads").click();
        driver.findElementByXPath("(//img[@alt='Lookup'])[1]").click();
        Set<String> windowHandles = driver.getWindowHandles();
        List<String> allHandles = new ArrayList<String>(windowHandles);
        String window2 = allHandles.get(1);
        driver.switchTo().window(window2);
        System.out.println(driver.getTitle());
        driver.findElementByName("firstName").sendKeys("a");
        driver.findElementByXPath("//button[text()='Find Leads']").click();
        Thread.sleep(3000);
        driver.findElementByXPath("(//a[@class='linktext'])[1]").click();
        driver.switchTo().window(allHandles.get(0));
        
        driver.findElementByXPath("(//img[@alt='Lookup'])[2]").click();
        Set<String> windowHandles1 = driver.getWindowHandles();
        List<String> allHandles1 = new ArrayList<String>(windowHandles1);
        String window3 = allHandles1.get(1);
        driver.switchTo().window(window3);
        System.out.println(driver.getTitle());
        driver.findElementByName("firstName").sendKeys("a");
        driver.findElementByXPath("//button[text()='Find Leads']").click();
        Thread.sleep(3000);
        driver.findElementByXPath("(//a[@class='linktext'])[1]").click();
        driver.switchTo().window(allHandles.get(0));
        driver.close();
        
        
	}

}
