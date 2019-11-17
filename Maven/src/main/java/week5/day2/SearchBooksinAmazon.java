package week5.day2;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchBooksinAmazon {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C://TestLeaf//chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize(); 
        driver.findElementById("twotabsearchtextbox").sendKeys("Books");
        driver.findElementByXPath("(//input[@class='nav-input'])[1]").click();
        List<WebElement> list = driver.findElementsByXPath("//span[@class='a-price-whole']");
        int totalBooks = list.size();
        
        System.out.println("Total Bookd are:" +totalBooks);
        int count = 0; 
        for (WebElement price : list) {
        	String str = price.getText().replaceAll(",", "");
        	if(count<Integer.parseInt(str)) {
        		count = Integer.parseInt(str);
        	} 
		}
        
        System.out.println("Highest Book price is "+count);	
        int count1 = 150; 
        for (int i=0;i<=list.size()-1;i++) {
        	String str =((WebElement) list).getText().replaceAll(",", "");
        	System.out.println("Books are : " + str.replaceAll(",", ""));
        	if(count1>Integer.parseInt(str)) {
        		count1 = Integer.parseInt(str);
        		 System.out.println("Book price less than 150 is "+count1);	
        	}
        	
			 
		}
       
       driver.close();
	}

}
