package week2.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MultiselectValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://TestLeaf//chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://leafground.com/pages/selectable.html");
        WebElement item1 = driver.findElementByXPath("//li[text()='Item 1']");
        WebElement item4 = driver.findElementByXPath("//li[text()='Item 4']");
        Actions builder = new Actions(driver);
        builder.clickAndHold(item1)
        .clickAndHold(item4)
        .release()
        .perform();
        
        
	}

}
