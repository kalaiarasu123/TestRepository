package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Contacts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
	        //Contact
	        driver.findElementByLinkText("Contacts").click();
	        driver.findElementByLinkText("Create Contact").click();
	        
	        

	}

}
