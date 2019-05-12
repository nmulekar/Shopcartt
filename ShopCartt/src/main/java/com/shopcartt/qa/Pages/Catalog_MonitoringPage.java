package com.shopcartt.qa.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.shopcartt.qa.Base.TestBase;

public class Catalog_MonitoringPage extends TestBase {

	// Page Factory
	@FindBy(xpath = "//li[@class='breadcrumb-current']//a[contains(text(),'Monitoring')]")
	WebElement Monitoring_Monitoring;
	
	@FindBy(xpath = "//h2[contains(text(),'Monitoring')]")
	WebElement Monitoring_PageTitle;

	public Catalog_MonitoringPage() {

		PageFactory.initElements(driver, this);
	}

	public String ValidateCatalog_MonitoringTitle() {

		return driver.getTitle();
	}

	public boolean ValidateMonitoring_MonitoringDisplayed() {

		return Monitoring_Monitoring.isDisplayed();
	}

	public String ValidateMonitoring_MonitoringText() {

		return Monitoring_Monitoring.getText();
	}

	public void ValidateMonitoring_MonitoringClick() {

		Monitoring_Monitoring.click();

	}

	public boolean ValidateMonitoring_PageTitleDisplayed() {
	
		return Monitoring_PageTitle.isDisplayed();
	}

}
