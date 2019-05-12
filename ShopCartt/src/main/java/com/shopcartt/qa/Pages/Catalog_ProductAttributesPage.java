package com.shopcartt.qa.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.shopcartt.qa.Base.TestBase;

public class Catalog_ProductAttributesPage extends TestBase {

	//Page Factory
	@FindBy(xpath="//li[@class='breadcrumb-current']//a[contains(text(),'Product Attributes')]")
	WebElement ProductAttributes_ProductAttributes;
	
	@FindBy(xpath="//h2[@class='page-title']")
	WebElement ProductAttributes_PageTitle;
	
	public Catalog_ProductAttributesPage() {
		
		PageFactory.initElements(driver, this);
	}

}
