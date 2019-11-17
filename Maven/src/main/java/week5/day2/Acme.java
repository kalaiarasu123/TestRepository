package week5.day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Acme {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://acme-test.uipath.com/account/login");
		driver.findElementById("email").sendKeys("kumar.testleaf@gmail.com");
		driver.findElementById("password").sendKeys("leaf@12");
		driver.findElementById("buttonLogin").click();
		
		WebElement  element = driver.findElementByXPath("//button[text()[normalize-space()='Invoices']]");
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
		
		driver.findElementByLinkText("Search for Invoice").click();
		driver.findElementById("vendorTaxID").sendKeys("RO094782");
		driver.findElementById("buttonSearch").click();
		
	List<WebElement> rows = driver.findElementsByXPath("//table[@class='table']//tr");
		int rowssize = rows.size();
		for(int i=2;i<rowssize;i++) {
	     String str = driver.findElementByXPath("//table[@class='table']//tr["+i+"]//td[3]").getText();
	     if(str.equals("IT Support")) {
	    	 String str1 =  driver.findElementByXPath("//table[@class='table']//tr["+i+"]//td[1]").getText();
	    	 System.out.println("Invoices number is:" +str1);
	     }
	     else {
	    	 //System.out.println("Invoice number not displayed");
	     }
		}
	}

}
