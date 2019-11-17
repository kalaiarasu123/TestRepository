package week3.day2;

import java.util.HashSet;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Set {
	
	public static void main(String[] args) {	
		   System.setProperty("webdriver.chrome.driver","C://TestLeaf//chromedriver.exe");
	        ChromeDriver driver = new ChromeDriver();
	        driver.get("http://leafground.com/pages/sorttable.html");
	        driver.manage().window().maximize(); 
	        List<WebElement> emp = driver.findElementsByXPath("//tr[@role=\"row\"]/td[1]");
	        int empsize = emp.size();
	        System.out.println(empsize);
	        java.util.Set<String> set = new HashSet<String>();
	        for (WebElement emplid : emp) {
	        	String text = emplid.getText();
	        	set.add(text);
			}
	      int setsize = set.size(); 
	      System.out.println(setsize);
	        if(empsize==setsize) {
	        	System.out.println("Count is equal");
	        }
	        
        
	}

}
