package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class Lead extends LeadLogin{		

	//Login lg = new Login();
	
	@And("click on the Lead Button")
	public void clickOnTheLeadButton() throws InterruptedException {
		Thread.sleep(3000);
		
		driver.findElementByLinkText("Leads").click();
	 
	 
	}
	@And("click on the Create Lead Button")
	public void clickOnTheCreateLeadButton() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElementByLinkText("Create Lead").click();
	 
	 
	}

	@Then("Enter the Company Name (.*)")
	public void enterTheCompanyName(String companyName) {
		   driver.findElementById("createLeadForm_companyName").sendKeys(companyName);
	   
	}

	@Then("Enter the First Name (.*)")
	public void enterTheFirstName(String firstName) {

	       driver.findElementById("createLeadForm_firstName").sendKeys(firstName);
	  
	}

	@Then("Enter the Last Name (.*)")
	public void enterTheLastName(String lastName) {
	  
		  driver.findElementById("createLeadForm_lastName").sendKeys(lastName);
	   
	}

	@When("Click on the CreateLead Button")
	public void clickOnTheCreateLeadButton1() {
	 
		 driver.findElementByName("submitButton").click();
	   
	}

	@Then("Verify Lead is created Successfull")
	public void verifyLeadIsCreatedSuccessfull() {
	
		String FN = driver.findElementById("viewLead_firstName_sp").getText();
        System.out.println("FirstName is:" +FN);
        if(FN.equals("GCIT")) {
        	System.out.println("Leads Added Successfully");
        }
	    
	}

}
