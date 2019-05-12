package com.Shopcartt.qa.Tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.shopcartt.qa.Base.TestBase;
import com.shopcartt.qa.Pages.Catalog_MonitoringPage;
import com.shopcartt.qa.Pages.DashBoard;
import com.shopcartt.qa.Pages.LoginPage;

public class Catalog_MonitoringTestCases extends TestBase {

	LoginPage loginPage;
	DashBoard dashboard;
	Catalog_MonitoringPage catalog_MonitoringPage;

	public Catalog_MonitoringTestCases() {

		super();
	}

	@BeforeMethod
	public void SetUp() throws InterruptedException {

		Intialization();

		loginPage = new LoginPage();

		dashboard = loginPage.ValidateCorrectLogin(prop.getProperty("username"), prop.getProperty("password"));

		catalog_MonitoringPage = dashboard.ValidateCatalog_MonitoringPageClick();
	}

	@Test(priority = 1)
	public void TestCatalog_MonitoringTitle() {

		String act = catalog_MonitoringPage.ValidateCatalog_MonitoringTitle();

		String exp = "Monitoring • ShopCartt";

		System.out.println("Actual Monitoring Title : " + act);

		System.out.println("Expected Monitoring Title : " + exp);

		System.out.println("-----------------------------------------------------");
	}

	@Test(priority = 2)
	public void TestMonitoring_MonitoringDisplayed() {

		boolean b = catalog_MonitoringPage.ValidateMonitoring_MonitoringDisplayed();

		System.out.println("Monitoring, Monitoring Displayed : " + b);

		System.out.println("-----------------------------------------------------");
	}

	@Test(priority = 3)
	public void TestMonitoring_MonitoringText() {

		String act = catalog_MonitoringPage.ValidateMonitoring_MonitoringText();

		String exp = "Monitoring";

		System.out.println("Monitoring, Monitoring Actual : " + act);

		System.out.println("Monitoring, Monitoring Expected : " + exp);

		System.out.println("-----------------------------------------------------");
	}

	@Test(priority = 3)
	public void TestMonitoring_MonitoringClick() {

		catalog_MonitoringPage.ValidateMonitoring_MonitoringClick();

		System.out.println("-----------------------------------------------------");
	}
	
	@Test(priority = 4)
	public void TestMonitoring_PageTitleDisplayed() {

		boolean b = catalog_MonitoringPage.ValidateMonitoring_PageTitleDisplayed();
		
		System.out.println("Monitoring, Page Title Displayed : " + b);

		System.out.println("-----------------------------------------------------");
	}

	@AfterMethod
	public void Quit() {

		driver.quit();
	}

}
