package week2.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver","C://TestLeaf//chromedriver.exe");
		        ChromeDriver driver = new ChromeDriver();
		        driver.get("http://leafground.com/pages/sortable.html");
		        WebElement drag = driver.findElementByXPath("//li[text()='Item 1']");
		        WebElement drop = driver.findElementByXPath("//li[text()='Item 5']");
		        int y = drop.getLocation().getY();
		        System.out.println(y);
		        Actions builder = new Actions(driver);
		        //builder.dragAndDrop(drag, drop).perform();
		        builder.dragAndDropBy(drag, 0, y).perform();
		       // builder.moveToElement(drag, 0, 4).perform();
	}

}
