package week2.day2;



import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testleaf.leaftaps.base.ProjectSpecificMethods;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import week5.day2.ReadExcelData;

public class MergeLeads extends ProjectSpecificMethods  {
	@DataProvider(name="fetchdata")
	 public String[][] sendData() throws IOException{
		ReadExcelData data = new ReadExcelData();
		String[][] exdata = data.readExcelData("MergeLeads");
		//String[][] data = new String[2][3];
		
		return exdata;
						
		
	}
	@Test(dataProvider="fetchdata")
	public void runMergeLeads(String FirstName) throws InterruptedException {	
        driver.findElementByLinkText("Leads").click();
        driver.findElementByLinkText("Merge Leads").click();
        driver.findElementByXPath("(//img[@alt='Lookup'])[1]").click();
        Set<String> windowHandles = driver.getWindowHandles();
        List<String> allHandles = new ArrayList<String>(windowHandles);
        String window2 = allHandles.get(1);
        driver.switchTo().window(window2);
        System.out.println(driver.getTitle());
        driver.findElementByName("firstName").sendKeys(FirstName);
        driver.findElementByXPath("//button[text()='Find Leads']").click();
        Thread.sleep(3000);
        driver.findElementByXPath("(//a[@class='linktext'])[1]").click();
        driver.switchTo().window(allHandles.get(0));
        
        driver.findElementByXPath("(//img[@alt='Lookup'])[2]").click();
        Set<String> windowHandles1 = driver.getWindowHandles();
        List<String> allHandles1 = new ArrayList<String>(windowHandles1);
        String window3 = allHandles1.get(1);
        driver.switchTo().window(window3);
        System.out.println(driver.getTitle());
        driver.findElementByName("firstName").sendKeys(FirstName);
        driver.findElementByXPath("//button[text()='Find Leads']").click();
        Thread.sleep(3000);
        driver.findElementByXPath("(//a[@class='linktext'])[1]").click();
        driver.switchTo().window(allHandles.get(0));
       
        
        
	}

}
