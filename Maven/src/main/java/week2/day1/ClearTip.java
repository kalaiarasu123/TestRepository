package week2.day1;



import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class ClearTip {

	public static void main(String[] args) {	
		// This basically sets the system property to value named webdriver.chrome.driver and the path is mentioned to get the chrome driver
        System.setProperty("webdriver.chrome.driver","C://TestLeaf//chromedriver.exe");
        
     // To disable those notification, use the below code:
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://www.cleartrip.com/");
        driver.manage().window().maximize(); 
       
        driver.findElementById("RoundTrip").click();
        driver.findElementById("FromTag").sendKeys("Chennai",Keys.TAB);
        driver.findElementById("ToTag").sendKeys("New York",Keys.TAB);
        driver.findElementById("DepartDate").click();
        driver.findElementByLinkText("29").click();
        driver.findElementById("ReturnDate").click();
        driver.findElementByLinkText("10").click();
        WebElement dropdown1 =  driver.findElementById("Adults");
        Select dd1 = new Select(dropdown1);
        dd1.selectByVisibleText("2");
        WebElement dropdown2 =  driver.findElementById("Childrens");
        Select dd2 = new Select(dropdown2);
        dd2.selectByVisibleText("1");
        WebElement dropdown3 =  driver.findElementById("Infants");
        Select dd3 = new Select(dropdown3);
        dd3.selectByVisibleText("1");
        driver.findElementById("MoreOptionsDiv").click();
        WebElement dropdown4 =  driver.findElementById("Class");
        Select dd4 = new Select(dropdown4);
        dd4.selectByVisibleText("Premium Economy");
        driver.findElementByName("airline").sendKeys("Emirates",Keys.TAB);
        driver.findElementById("SearchBtn").click();
	}
}
