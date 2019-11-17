package com.leafBot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.leafBot.selenium.api.base.SeleniumBase;

public class HomePage extends SeleniumBase{
	public HomePage clickLogout() {
		click(locateElement("class","decorativeSubmit"));
		return new HomePage();
	}
	public HomePage mousehoverInvoices() {
		WebElement  element = driver.findElementByXPath("//button[text()[normalize-space()='Invoices']]");
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
		return this;
	}
	public InvoiceSearchPage clickSearchInvoices() {
		click(locateElement("link","Search for Invoice"));
		return new InvoiceSearchPage();
	}

	
}
