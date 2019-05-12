package com.Shopcartt.qa.Tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.shopcartt.qa.Base.TestBase;
import com.shopcartt.qa.Pages.Catalog_ProductsPage;
import com.shopcartt.qa.Pages.DashBoard;
import com.shopcartt.qa.Pages.LoginPage;
import com.shopcartt.qa.Pages.Product_addNewProductPage;

public class Catalog_ProductsTestCases extends TestBase {

	LoginPage loginPage;
	DashBoard dashboard;
	Catalog_ProductsPage catalog_ProductsPage;
	Product_addNewProductPage product_addNewProductPage;

	public Catalog_ProductsTestCases() {

		super();

	}

	@BeforeMethod
	public void Catalog_ProductsSetUp() throws Exception {

		Intialization();

		loginPage = new LoginPage();

		dashboard = loginPage.ValidateCorrectLogin(prop.getProperty("username"), prop.getProperty("password"));

		catalog_ProductsPage = dashboard.ValidateCatalog_ProductsPageClick();

	}

	@Test(priority = 1)
	public void TestProductsTitle() {

		String title = catalog_ProductsPage.ValidategetProductsTitle();

		System.out.println("Products Page Title : " + title);
	}

	@Test(priority = 2)
	public void TestProducts_CatalogDisplayed() {

		boolean bb = catalog_ProductsPage.ValidateProducts_CatalogDisplayed();

		System.out.println("Products Catalog Displayed : " + bb);

		System.out.println("---------------------------------------------------");
	}

	@Test(priority = 3)
	public void TestProducts_CatalogText() {

		String act = catalog_ProductsPage.ValidateProducts_CatalogText();

		String exp = "Catalog";

		System.out.println("Products Catalog Actual : " + act);

		System.out.println("Products Catalog Expected : " + exp);

		System.out.println("---------------------------------------------------");
	}

	@Test(priority = 4)
	public void TestProducts_CatalogClick() {

		catalog_ProductsPage.ValidateProducts_CatalogClick();

		System.out.println("---------------------------------------------------");
	}

	@Test(priority = 5)
	public void TestProducts_ProductsDisplayed() {

		boolean bb = catalog_ProductsPage.ValidateProducts_ProductsDisplayed();

		System.out.println("Products in Products Displayed : " + bb);

		System.out.println("---------------------------------------------------");
	}

	@Test(priority = 6)
	public void TestProducts_ProductsText() {

		String act = catalog_ProductsPage.ValidateProducts_ProductsText();

		String exp = "Products";

		System.out.println("Products Catalog Actual : " + act);

		System.out.println("Products Catalog Expected : " + exp);

		System.out.println("---------------------------------------------------");
	}

	@Test(priority = 7)
	public void TestProducts_ProductsClick() {

		catalog_ProductsPage.ValidateProducts_ProductsClick();

		System.out.println("---------------------------------------------------");
	}

	@Test(priority = 8)
	public void TestProducts_PageTitleDisplayed() {

		boolean bb = catalog_ProductsPage.ValidateProducts_ProductsDisplayed();

		System.out.println("Products in Products Title Displayed : " + bb);

		System.out.println("---------------------------------------------------");
	}

	@Test(priority = 9)
	public void TestProducts_AddNewProductButtonDisplayed() {

		boolean bb = catalog_ProductsPage.ValidateProducts_AddNewProductButtonDisplayed();

		System.out.println("Products, Add New Product Button Displayed : " + bb);

		System.out.println("---------------------------------------------------");
	}

	@Test(priority = 10)
	public void TestProducts_AddNewProductButtonColor() {

		catalog_ProductsPage.ValidateProducts_AddNewProductButtonColor();

		System.out.println("---------------------------------------------------");
	}
	
	@Test(priority = 11)
	public void TestProducts_AddNewProductButtonClick() throws InterruptedException {

		product_addNewProductPage = catalog_ProductsPage.ValidateProducts_AddNewProductButtonClick();
		
		Thread.sleep(3000);

		System.out.println("---------------------------------------------------");
	}
	
	
	@Test(priority = 12)
	public void TestProducts_AddNewProductText() {

		String act = catalog_ProductsPage.ValidateProducts_AddNewProductText();

		String exp = "Add new Product";

		System.out.println("Products, Add New Product Displayed Actual : " + act);

		System.out.println("Products, Add New Product Displayed Expected : " + exp);

		System.out.println("---------------------------------------------------");
	}

	@Test(priority = 13)
	public void TestProducts_AddNewProductTextClick() throws InterruptedException {

		product_addNewProductPage = catalog_ProductsPage.ValidateProducts_AddNewProductTextClick();
		
		Thread.sleep(3000);

		System.out.println("---------------------------------------------------");
	}

	@Test(priority = 14)
	public void TestProducts_AddNewProductTextDisplayed() {

		boolean bb = catalog_ProductsPage.ValidateProducts_AddNewProductTextDisplayed();

		System.out.println("Products, Add New Product Text Displayed : " + bb);

		System.out.println("---------------------------------------------------");
	}
	
	@Test(priority = 15)
	public void TestProducts_RecommendedModulesAndServicesButtonDisplayed() {

		boolean bb = catalog_ProductsPage.ValidateProducts_RecommendedModulesAndServicesButtonDisplayed();

		System.out.println("Products, Recommended Modules And Services Button Displayed: " + bb);

		System.out.println("---------------------------------------------------");
	}

	@Test(priority = 16)
	public void TestProducts_RecommendedModulesAndServicesButtonColor() {

		catalog_ProductsPage.ValidateProducts_RecommendedModulesAndServicesButtonColor();

		System.out.println("---------------------------------------------------");
	}
	
	@Test(priority = 17)
	public void TestProducts_RecommendedModulesAndServicesText() {

		String act = catalog_ProductsPage.ValidateProducts_RecommendedModulesAndServicesText();

		String exp = "Recommended Modules and Services";

		System.out.println("Products, Add New Product Displayed Actual : " + act);

		System.out.println("Products, Add New Product Displayed Expected : " + exp);

		System.out.println("---------------------------------------------------");
	}

	@Test(priority = 18)
	public void TestProducts_RecommendedModulesAndServicesTextClick() {

		catalog_ProductsPage.ValidateProducts_RecommendedModulesAndServicesTextClick();

		System.out.println("---------------------------------------------------");
	}

	@Test(priority = 19)
	public void TestProducts_RecommendedModulesAndServicesTextDisplayed() {

		boolean bb = catalog_ProductsPage.ValidateProducts_RecommendedModulesAndServicesTextDisplayed();

		System.out.println("Products, Recommended Modules And Services Text Displayed : " + bb);

		System.out.println("---------------------------------------------------");
	}

	@AfterMethod
	public void Catalog_ProductsQuit() {

		driver.quit();
	}

}
