package week4.day2;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZoomCar {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C://TestLeaf//chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.zoomcar.com/chennai/");
        driver.manage().window().maximize(); 
        driver.findElementByLinkText("Start your wonderful journey").click();
        driver.findElementByXPath("//div[@class='component-popular-locations']/div[2]").click();
        driver.findElementByXPath("//button[text()='Next']").click();
        Date tomorrowdate = new Date();
        Calendar c = Calendar.getInstance();
		c.setTime(tomorrowdate);		
		c.add(Calendar.DATE, 2);              
        driver.findElementByXPath("//button[text()='Next']").click();
        Date todaydate = new Date();
        Calendar ca = Calendar.getInstance();
		ca.setTime(todaydate);
		ca.add(Calendar.DATE, 1); 
        driver.findElementByXPath("//button[text()='Done']").click();
        Thread.sleep(4000);
        List<WebElement> list = driver.findElementsByXPath("//div[@class='price']");      
        System.out.println(list.size());
        int count =0 ;
        for (WebElement price : list) {
        	String str = price.getText().replaceAll("\\D", "");
        	if(count<Integer.parseInt(str)) {
        		count = Integer.parseInt(str);
        	}			
		}
        System.out.println(count);        
       String max1 = NumberFormat.getIntegerInstance(Locale.US).format(count);
     System.out.println(max1);
	}

}
