package week2.day2;



import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testleaf.leaftaps.base.ProjectSpecificMethods;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import week5.day2.ReadExcelData;

public class DuplicateLead extends ProjectSpecificMethods  {

	@DataProvider(name="fetchdata")
	 public String[][] sendData() throws IOException{
		ReadExcelData data = new ReadExcelData();
		String[][] exdata = data.readExcelData("DuplicateLead");
		//String[][] data = new String[2][3];
		
		return exdata;
						
		
	}
	@Test(dataProvider="fetchdata")
	public  void runDuplicateLead(String Email) throws InterruptedException {	

	    Thread.sleep(3000);
   
        driver.findElementByLinkText("Leads").click();
        driver.findElementByLinkText("Find Leads").click();
        Thread.sleep(2000);
    
        driver.findElementByXPath("//span[text()='Email']").click();

        driver.findElementByName("emailAddress").sendKeys(Email);
       driver.findElementByXPath("//button[text()='Find Leads']").click();
        Thread.sleep(2000);
        //List<WebElement> rows = driver.findElementsByXPath("//table[@class='x-grid3-row-table']//tr[1]");
       // System.out.println(rows.size());
       
        	List<WebElement> rows = driver.findElementsByXPath("//div[@class='x-panel-body xedit-grid']");
       String id =  driver.findElementByXPath("(//td[contains(@class,'x-grid3-col x-grid3-cell')]//div)[1]").getText();
       System.out.println(id);
       Thread.sleep(2000);
       driver.findElementByXPath("(//td[contains(@class,'x-grid3-col x-grid3-cell')]//div)[1]/a").click();
       driver.findElementByLinkText("Delete").click();
        	//driver.findElementByName("id").cligetck();
        	
       driver.findElementByLinkText("Find Leads").click();
       driver.findElementByName("id").sendKeys(id);
       driver.findElementByXPath("//button[text()='Find Leads']").click();
       Thread.sleep(2000);
       String text  = driver.findElementByXPath("//div[text()='No records to display']").getText();
       System.out.println(text);
       //closeBrowser();
        	/*driver.findElementByLinkText("Edit").click();
        	driver.findElementById("updateLeadForm_companyName").clear();
        	driver.findElementById("updateLeadForm_companyName").sendKeys("MMM");
        	driver.findElementByName("submitButton").click();
        	String company = driver.findElementById("viewLead_companyName_sp").getText();
        	if(company.equals("MMM (10023)")) {
        		System.out.println("Company Name Verified" +company);
        	}
        	else {
        		System.out.println("Company Name not updated" +company);
        	}
        	}*/
       // driver.close();

	}
}
