package com.Shopcartt.qa.Tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.shopcartt.qa.Base.TestBase;
import com.shopcartt.qa.Pages.Catalog_ProductAttributesPage;
import com.shopcartt.qa.Pages.DashBoard;
import com.shopcartt.qa.Pages.LoginPage;

public class Catalog_ProductAttributesTestCases extends TestBase {
	
	LoginPage loginPage;
	DashBoard dashboard;
	Catalog_ProductAttributesPage catalog_ProductAttributesPage;
	
	public Catalog_ProductAttributesTestCases() {

		super();
	}

	@BeforeMethod
	public void SetUp() throws InterruptedException {

		Intialization();

		loginPage = new LoginPage();

		dashboard = loginPage.ValidateCorrectLogin(prop.getProperty("username"), prop.getProperty("password"));

		catalog_ProductAttributesPage = dashboard.ValidateCatalog_ProductAttributesPageClick();
	}
	
	@AfterMethod
	public void Quit() {
		
		driver.quit();
		System.out.println("*************************");
	}
	

}
