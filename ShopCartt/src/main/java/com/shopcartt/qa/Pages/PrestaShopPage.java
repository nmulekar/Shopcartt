package com.shopcartt.qa.Pages;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.shopcartt.qa.Base.TestBase;

public class PrestaShopPage extends TestBase {
	
	PrestaShopPage prestaShopPage;
	
	@BeforeMethod
	public void setUp() {

		Intialization();
		
	
		prestaShopPage = new PrestaShopPage();

	}
	
	@Test
	public void run() {
		
		System.out.println("Running");
	}

	@AfterMethod
	public void CloseSetUp() {

		driver.close();

		System.out.println("*******Closing*********");
	}

}
