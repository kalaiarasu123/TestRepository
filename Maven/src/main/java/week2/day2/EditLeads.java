package week2.day2;



import java.io.IOException;

import org.testleaf.leaftaps.base.ProjectSpecificMethods;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import week5.day2.ReadExcelData;

public class EditLeads extends ProjectSpecificMethods {
	@DataProvider(name="fetchdata")
	 public String[][] sendData() throws IOException{
		ReadExcelData data = new ReadExcelData();
		String[][] exdata = data.readExcelData("EditLead");
		//String[][] data = new String[2][3];
		
		return exdata;
						
		
	}
	@Test(dataProvider="fetchdata")
	public void runEditLeads(String FirstName,String CompanyName) throws InterruptedException {	
		
		  Thread.sleep(3000);
      //  driver.findElementByLinkText("CRM/SFA").click();
        driver.findElementByLinkText("Leads").click();
        driver.findElementByLinkText("Find Leads").click();
        //Thread.sleep(2000);
        driver.findElementByXPath("((//label[text()='First name:'])[3]/following::input)[1]").sendKeys(FirstName);
        driver.findElementByXPath("//button[text()='Find Leads']").click();
        Thread.sleep(2000);
        //List<WebElement> rows = driver.findElementsByXPath("//table[@class='x-grid3-row-table']//tr[1]");
       // System.out.println(rows.size());
    
        	driver.findElementByXPath("//table[@class=\"x-grid3-row-table\"]//tr[1]/td[1]/div[1]/a").click();
        	
        	driver.findElementByLinkText("Edit").click();
        	driver.findElementById("updateLeadForm_companyName").clear();
        	driver.findElementById("updateLeadForm_companyName").sendKeys(CompanyName);
        	driver.findElementByName("submitButton").click();
        	String company = driver.findElementById("viewLead_companyName_sp").getText();
        	if(company.equals("MMM (10023)")) {
        		System.out.println("Company Name Verified" +company);
        	}
        	else {
        		System.out.println("Company Name not updated" +company);
        	}
        	//closeBrowser();
        	}
	
     
}
