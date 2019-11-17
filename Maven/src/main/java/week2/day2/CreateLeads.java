package week2.day2;



import java.io.IOException;

import org.testleaf.leaftaps.base.ProjectSpecificMethods;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import week5.day2.ReadExcelData;

public class CreateLeads extends ProjectSpecificMethods  {
	@DataProvider(name="fetchdata")
	 public String[][] sendData() throws IOException{
		ReadExcelData data = new ReadExcelData();
		String[][] exdata = data.readExcelData("CreateLead");
		//String[][] data = new String[2][3];
		
		return exdata;
						
		
	}
	@Test(dataProvider="fetchdata")
	public void runCreateLead(String companyName, String firstName, String lastName ) throws InterruptedException {
		// This basically sets the system property to value named webdriver.chrome.driver and the path is mentioned to get the chrome driver
 
      Thread.sleep(3000);
      
        driver.findElementByLinkText("Create Lead").click();
        driver.findElementById("createLeadForm_companyName").sendKeys(companyName);
        driver.findElementById("createLeadForm_firstName").sendKeys(firstName);
        driver.findElementById("createLeadForm_lastName").sendKeys(lastName);
       /* driver.findElementById("createLeadForm_firstNameLocal").sendKeys("scs");
        driver.findElementById("createLeadForm_lastNameLocal").sendKeys("scs");
        driver.findElementById("createLeadForm_personalTitle").sendKeys("sa");
        WebElement dropdown1 = driver.findElementById("createLeadForm_dataSourceId");
        Select dd1 = new Select(dropdown1);
        dd1.selectByVisibleText("Conference");
        Thread.sleep(2000);
        driver.findElementById("createLeadForm_generalProfTitle").sendKeys("Title");
        driver.findElementById("createLeadForm_annualRevenue").sendKeys("23213");
        WebElement dropdown2 = driver.findElementById("createLeadForm_industryEnumId");
        Select dd2 = new Select(dropdown2);
        dd2.selectByValue("IND_SOFTWARE");
        WebElement dropdown3 = driver.findElementById("createLeadForm_ownershipEnumId");
        Select dd3 = new Select(dropdown3);
        dd3.selectByValue("OWN_PROPRIETOR");
        driver.getTitle();
        System.out.println("Titel is:" + driver.getTitle());
        driver.findElementById("createLeadForm_sicCode").sendKeys("2313");
        driver.findElementById("createLeadForm_description").sendKeys("wdwfwdww");
        driver.findElementById("createLeadForm_importantNote").sendKeys("IMP");
        driver.findElementById("createLeadForm_primaryPhoneCountryCode").sendKeys("22");
        driver.findElementById("createLeadForm_primaryPhoneAreaCode").sendKeys("323");
        driver.findElementById("createLeadForm_primaryPhoneExtension").sendKeys("2432");
        driver.findElementById("createLeadForm_departmentName").sendKeys("ECE");
        WebElement dropdown4 = driver.findElementById("createLeadForm_currencyUomId");
        Select dd4 = new Select(dropdown4);
        dd4.selectByValue("AFA");
        driver.findElementById("createLeadForm_numberEmployees").sendKeys("234");
        driver.findElementById("createLeadForm_tickerSymbol").sendKeys("dfs");
        driver.findElementById("createLeadForm_primaryPhoneAskForName").sendKeys("sfs");
        driver.findElementById("createLeadForm_primaryWebUrl").sendKeys("ddwdw");
        driver.findElementById("createLeadForm_generalToName").sendKeys("cs");
        driver.findElementById("createLeadForm_generalAddress1").sendKeys("sds");
        driver.findElementById("createLeadForm_generalAddress2").sendKeys("sc");
        driver.findElementById("createLeadForm_generalCity").sendKeys("scfs");
        WebElement dropdown5 = driver.findElementById("createLeadForm_generalStateProvinceGeoId");
        Select dd5 = new Select(dropdown5);
        dd5.selectByValue("AL");
        WebElement dropdown6 = driver.findElementById("createLeadForm_generalCountryGeoId");
        Select dd6 = new Select(dropdown6);
        dd6.selectByValue("AFG");
        driver.findElementById("createLeadForm_generalPostalCode").sendKeys("24242");
        driver.findElementById("createLeadForm_generalPostalCodeExt").sendKeys("232");
        driver.findElementById("createLeadForm_marketingCampaignId").sendKeys("sd");
        driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("sfsfsfs");
        driver.findElementById("createLeadForm_primaryEmail").sendKeys("adasdc@test.com");*/
        driver.findElementByName("submitButton").click();
        String FN = driver.findElementById("viewLead_firstName_sp").getText();
        System.out.println("FirstName is:" +FN);
        if(FN.equals("SCS")) {
        	System.out.println("Leads Added Successfully");
        }
        //closeBrowser() ;

	}

}
