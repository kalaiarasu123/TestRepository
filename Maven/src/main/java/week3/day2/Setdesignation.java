package week3.day2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Setdesignation {
	
	public static void main(String[] args) {	
		   System.setProperty("webdriver.chrome.driver","C://TestLeaf//chromedriver.exe");
	        ChromeDriver driver = new ChromeDriver();
	        driver.get("http://leafground.com/pages/sorttable.html");
	        driver.manage().window().maximize(); 
	     
	        List<WebElement> des = driver.findElementsByXPath("//table[@id='table_id']//tr/td[3]");
	        int empsize = des.size();
	        System.out.println(empsize);
	        ArrayList<String> al = new ArrayList<String>(); 
	        for (WebElement emplid : des) {
	        	String text = emplid.getText();
	            al.add(text);
	            
	            System.out.println(text);
	        	
			}
	     
	        Collections.sort(al);
	        System.out.println(al);
	}

}
