package com.leafBot.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.leafBot.selenium.api.base.SeleniumBase;

public class InvoiceSearchResultsPages extends SeleniumBase{
	public InvoiceSearchResultsPages enterVentorTaxID() {
		getElementText(locateElement("xpath","(//td[text()='IT Support'])[1]"));
		return this;
	}

	public void verifyInvoiceNumber() {
		List<WebElement> rows = driver.findElementsByXPath("//table[@class='table']//tr");
		int rowssize = rows.size();
		for(int i=2;i<rowssize;i++) {
	     String str = driver.findElementByXPath("//table[@class='table']//tr["+i+"]//td[3]").getText();
	     if(str.equals("IT Support")) {
	    	 String str1 =  driver.findElementByXPath("//table[@class='table']//tr["+i+"]//td[1]").getText();
	    	 System.out.println("Invoices number is:" +str1);
	     }
		return;
		}
	
	}
}
