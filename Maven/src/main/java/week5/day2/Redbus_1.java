package week5.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.interactions.Actions;

public class Redbus_1 {
public static void main(String[] args)  {
	try {
	System.setProperty("webdriver.ie.driver","C:\\Users\\kalai\\Music\\IEDriverServer_Win32_3.14.0\\IEDriverServer.exe");
	InternetExplorerOptions options = new InternetExplorerOptions();
	//options.addArguments("--incognito");
    options.addCommandSwitches("--disable-notifications");
	WebDriver driver = new InternetExplorerDriver(options);
	driver.get("https://www.redbus.in/");
	driver.manage().window().maximize();
	Actions action = new Actions(driver);
	driver.findElement(By.id("src")).sendKeys("Chennai");
	action.sendKeys(Keys.ENTER).build().perform();
	Thread.sleep(3000);
	driver.findElement(By.id("dest")).sendKeys("Trichy");
	action.sendKeys(Keys.ENTER).build().perform();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//label[@for='onward_cal']")).click();
	driver.findElement(By.xpath("(//td[@class='current day'])[2]")).click();
	//action.sendKeys(Keys.ENTER).build().perform();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//label[@for='return_cal']")).click();
	driver.findElement(By.xpath("(//td[text()='31'])[2]")).click();
	Thread.sleep(3000);
	WebElement search = driver.findElement(By.xpath("//button[text()='Search Buses']"));
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].click();", search);
	}catch(Exception e) {
		System.out.println(e.getMessage());
	}
}
}
