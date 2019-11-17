package week2.day1;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://TestLeaf//chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://erail.in");
        driver.findElementById("txtStationFrom").clear();
        driver.findElementById("txtStationFrom").sendKeys("MAS",Keys.TAB);
        driver.findElementById("txtStationTo").clear();
        driver.findElementById("txtStationTo").sendKeys("NMKL",Keys.TAB);
        driver.findElementById("chkSelectDateOnly").click();
        Thread.sleep(4000);
        List<WebElement> rows = driver.findElementsByXPath("//table[@class='DataTable TrainList TrainListHeader']//tr/td[2]");
        System.out.println(rows.size());
        
	}

}
