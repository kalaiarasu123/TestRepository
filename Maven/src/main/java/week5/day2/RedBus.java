package week5.day2;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class RedBus {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        ChromeDriver driver = new ChromeDriver(options);      
        driver.get("https://www.redbus.in/");
        driver.manage().window().maximize(); 
        driver.findElementById("src").sendKeys("Chennai");
        driver.findElementById("dest").sendKeys("Trichy");
        Thread.sleep(2000);
        driver.findElementByXPath("(//span[contains(@class,'fl icon-calendar_icon-new')])[1]").click();
        driver.findElementByXPath("(//td[@class='current day'])[2]").click();
        driver.findElementByXPath("(//span[contains(@class,'fl icon-calendar_icon-new')])[2]").click();
        driver.findElementByXPath("(//td[@class='current day'])[2]").click();
        Thread.sleep(2000);
        driver.findElementByXPath("//li[text()='Chennai (All Locations)']").click();
        Thread.sleep(2000);
        driver.findElementById("search_btn").click();
    /*    Actions actions = new Actions(driver);
        actions.sendKeys(Keys.ENTER).build().perform();
        Thread.sleep(2000);    */
        Thread.sleep(2000);
        driver.findElementByXPath("(//label[@for='dtAfter 6 pm'])[1]").click();
        driver.findElementByXPath("(//label[@for='bt_AC'])[1]").click();
        List<WebElement> list =  driver.findElementsByXPath("//li[@class='row-sec clearfix']");
        int buses =  list.size();
        System.out.println("No of Buses:" +buses);
   
	}
}
