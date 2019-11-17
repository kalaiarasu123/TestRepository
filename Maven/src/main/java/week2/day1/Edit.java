package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Edit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C://TestLeaf//chromedriver.exe");
ChromeDriver driver = new ChromeDriver(); 
driver.get("http://leafground.com/pages/Edit.html");
driver.manage().window().maximize(); 
String Title= driver.getTitle();
System.out.println("Title of paga is"+Title);
System.out.println("Current URL is"+driver.getCurrentUrl());
System.out.println("Current Page Source is"+driver.getPageSource());
driver.findElementById("email").sendKeys("kalai@gmail.com");
System.out.println(driver.findElementByXPath("//input/"));

	}

}
