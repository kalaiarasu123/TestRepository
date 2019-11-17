package week4.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlertFrame {

	public static void main(String[] args) {
		  System.setProperty("webdriver.chrome.driver","C://TestLeaf//chromedriver.exe");
	        ChromeDriver driver = new ChromeDriver();
	        driver.get("https://tinyurl.com/SeleniumAlert");
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.switchTo().frame("iframeResult");         
            driver.findElementByXPath("//button[text()='Try it']").click();
            Alert alert = driver.switchTo().alert();
           String text = alert.getText();
           System.out.println(text);
           alert.sendKeys("Testleaf");
           alert.accept();
          String name = driver.findElementById("demo").getText();
          System.out.println(name);
          }

}
