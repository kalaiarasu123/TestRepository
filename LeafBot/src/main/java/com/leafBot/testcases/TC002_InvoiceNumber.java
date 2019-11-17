package com.leafBot.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leafBot.pages.LoginPage;
import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class TC002_InvoiceNumber extends  ProjectSpecificMethods{
	@BeforeTest
	public void setData() {
		excelFileName="TC002";
		testcaseName="Invoice Number(POM)";
		testcaseDec = "Get Invoice Number in ACME";
		author="KALAI";
		category="smoke";
		
	}
	
	@Test(dataProvider="fetchData")
	public void runTC002(String username, String password, String VentorTaxID) {
		new LoginPage()
		.enterUsername(username)
		.enterPassword(password)
		.clickLogin()
		.mousehoverInvoices()
		.clickSearchInvoices()
		.enterVentorTaxID(VentorTaxID)
		.clickSearch()
		.verifyInvoiceNumber();
		
		
		
	}

}
