package week4.day2;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SearchVendor {


	public static void main(String[] args) throws InterruptedException {
		    System.setProperty("webdriver.chrome.driver","C://TestLeaf//chromedriver.exe");
	        ChromeDriver driver = new ChromeDriver();
	        driver.get("https://acme-test.uipath.com/");
	        driver.manage().window().maximize(); 
	        driver.findElementById("email").sendKeys("kumar.testleaf@gmail.com");
	        driver.findElementById("password").sendKeys("leaf@12");
	        driver.findElementById("buttonLogin").click();
	        Thread.sleep(2000);
	        WebElement element = driver.findElementByXPath("//button[text()=' Vendors']");
	        Actions builder = new Actions(driver);
	        builder.moveToElement(element).perform();
	        driver.findElementByLinkText("Search for Vendor").click();
	        driver.findElementByName("vendorName").sendKeys("Blue Lagoon");
	        driver.findElementById("buttonSearch").click();
	        List<WebElement> rows = driver.findElementsByXPath("//table[@class='table']/tbody/tr");
	        System.out.println("No.of.Rows in table:"+rows.size());
	        String col = driver.findElementByXPath("//table[@class='table']/tbody/tr/td[1]").getText();
	        System.out.println(col);
	        if(col.equals("Blue Lagoon")) {
	        	String country = driver.findElementByXPath("//table[@class='table']/tbody/tr/td[5]").getText();
	        	System.out.println("Country Name:" +country);
	        }
	        driver.close();

	}

}
