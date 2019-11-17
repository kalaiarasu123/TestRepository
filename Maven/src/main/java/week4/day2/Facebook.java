package week4.day2;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Facebook {


	public static void main(String[] args) throws InterruptedException {
		    System.setProperty("webdriver.chrome.driver","C://TestLeaf//chromedriver.exe");	     
	        ChromeOptions options = new ChromeOptions();
	        options.addArguments("--disable-notifications");
	        ChromeDriver driver = new ChromeDriver(options);
	        driver.get("https://www.facebook.com");
	        driver.manage().window().maximize(); 
	        driver.findElementByName("email").sendKeys("kalaiarasu_ece@yahoo.co.in");
	        driver.findElementByName("pass").sendKeys("Test123#");
	        driver.findElementById("loginbutton").click();
	        driver.findElementByName("q").sendKeys("TestLeaf solutions", Keys.ENTER);
	        Thread.sleep(4000);
	        driver.findElementByLinkText("TestLeaf").click();
	        String text = driver.findElementByXPath("//button[text()='Like']").getText();
	        System.out.println("Text is" +text);
	        String name = "Like";
	        if(text.equals(name)) {
	        	driver.findElementByXPath("//button[text()='Like']").click();
	        	
	        }
	        else {
	        	System.out.println("Already Liked");

	        }
	        
	      
	        
	}

}
