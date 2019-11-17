package com.leafBot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.leafBot.selenium.api.base.SeleniumBase;

public class InvoiceSearchPage extends SeleniumBase{
	public InvoiceSearchPage enterVentorTaxID(String VentorTaxID) {
		clearAndType(locateElement("id","vendorTaxID"), VentorTaxID);
		return this;
	}
	public InvoiceSearchResultsPages clickSearch() {
		click(locateElement("id","buttonSearch"));
		return new InvoiceSearchResultsPages();
	}
	
}
