package com.Shopcartt.qa.Tests;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.shopcartt.qa.Base.TestBase;
import com.shopcartt.qa.Pages.Catalog_ProductsPage;
import com.shopcartt.qa.Pages.DashBoard;
import com.shopcartt.qa.Pages.LoginPage;
import com.shopcartt.qa.Pages.Product_addNewProductPage;

public class Product_addNewProductTestCase extends TestBase {

	LoginPage loginPage;
	DashBoard dashboard;
	Catalog_ProductsPage catalog_ProductsPage;
	Product_addNewProductPage product_addNewProductPage;

	public Product_addNewProductTestCase() {

		super();

	}

	@BeforeMethod
	public void Catalog_ProductsSetUp() throws Exception {

		Intialization();

		loginPage = new LoginPage();

		dashboard = loginPage.ValidateCorrectLogin(prop.getProperty("username"), prop.getProperty("password"));

		catalog_ProductsPage = dashboard.ValidateCatalog_ProductsPageClick();

		product_addNewProductPage = catalog_ProductsPage.ValidateProducts_AddNewProductButtonClick();

	}

	@Test
	public void TestNewProductInformation() throws AWTException, IOException, InterruptedException {

		product_addNewProductPage.NewProductInformation();
	}

	@AfterMethod
	public void Catalog_ProductsQuit() {

		driver.quit();
	}

}
