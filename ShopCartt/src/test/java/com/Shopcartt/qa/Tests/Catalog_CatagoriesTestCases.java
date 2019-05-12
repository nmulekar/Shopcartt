package com.Shopcartt.qa.Tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.shopcartt.qa.Base.TestBase;
import com.shopcartt.qa.Pages.Catagory_AddNewCatagoryPage;
import com.shopcartt.qa.Pages.Catalog_CategoriesPage;
import com.shopcartt.qa.Pages.DashBoard;
import com.shopcartt.qa.Pages.LoginPage;

public class Catalog_CatagoriesTestCases extends TestBase {

	LoginPage loginPage;
	DashBoard dashboard;
	Catalog_CategoriesPage catalog_CategoriesPage;
	Catagory_AddNewCatagoryPage catagory_AddNewCatagoryPage;

	public Catalog_CatagoriesTestCases() {

		super();
	}

	@BeforeMethod
	public void Catalog_CategoriesSetup() throws InterruptedException {

		Intialization();

		loginPage = new LoginPage();

		dashboard = loginPage.ValidateCorrectLogin(prop.getProperty("username"), prop.getProperty("password"));
		
		catalog_CategoriesPage = dashboard.ValidateCatalog_CategoriesPageClick();

	}
	
	@Test(priority = 1)
	public void TestgetCatagoriesTitle() {

		String act = catalog_CategoriesPage.ValidategetCatagoriesTitle();
		
		String exp = "Categories • ShopCartt";
		
		System.out.println("Actual Catagories Title : " + act );
		
		System.out.println("Expected Catagories Title : " + exp );
		
		System.out.println("-----------------------------------------------------");
	}

	@Test(priority = 2)
	public void TestCategories_CategoriesDisplayed() {

		boolean b = catalog_CategoriesPage.ValidateCategories_CategoriesDisplayed();
		
		System.out.println("-----------------------------------------------------");
	}
	
	@Test(priority = 3)
	public void TestCategories_CategoriesText() {

		String act = catalog_CategoriesPage.ValidateCategories_CategoriesText();
		
		String exp = "Categories";
		
		System.out.println("Actual Catagories Title : " + act );
		
		System.out.println("Expected Catagories Title : " + exp );
		
		System.out.println("-----------------------------------------------------");
	}
	
	@Test(priority = 4)
	public void TestCategories_CategoriesTitleDisplayed() {

		boolean b = catalog_CategoriesPage.ValidateCategories_CategoriesTitleDisplayed();
		
		System.out.println("-----------------------------------------------------");
	}
	
	@Test(priority = 5)
	public void TestCategories_AddNewCategoryButtonDisplayed() {

		boolean b = catalog_CategoriesPage.ValidateCategories_AddNewCategoryButtonDisplayed();
		
		System.out.println("-----------------------------------------------------");
	}
	
	@Test(priority = 6)
	public void TestCategories_AddNewCategoryButtonColor() {

		catalog_CategoriesPage.ValidateCategories_AddNewCategoryButtonColor();
		
		System.out.println("-----------------------------------------------------");
	}
	
	@Test(priority = 6)
	public void TestCategories_AddNewCategoryButtonClick() throws InterruptedException {

		catalog_CategoriesPage.ValidateCategories_AddNewCategoryButtonClick();
		
		Thread.sleep(3000);
		
		System.out.println("-----------------------------------------------------");
	}
	
	@Test(priority = 7)
	public void TestCategories_AddNewCategoryTextDisplayed() {

		boolean b = catalog_CategoriesPage.ValidateCategories_AddNewCategoryTextDisplayed();
		
		System.out.println("Categories Add New Category Text Displayed : " + b);
		
		System.out.println("-----------------------------------------------------");
	}
	
	@Test(priority = 8)
	public void TestCategories_AddNewCategoryText() {

		String act = catalog_CategoriesPage.ValidateCategories_AddNewCategoryText();
		
		String exp = "Add new category";
		
		Assert.assertEquals(act, exp);
		
		System.out.println("Categories Add New Category Text Actual : " + act);
		
		System.out.println("Categories Add New Category Text Expected : " + exp);
		
		System.out.println("-----------------------------------------------------");
	}
	
	@Test(priority = 9)
	public void TestCategories_AddNewCategoryTextClick() throws InterruptedException {

		catagory_AddNewCatagoryPage = catalog_CategoriesPage.ValidateCategories_AddNewCategoryTextClick();
		
		Thread.sleep(3000);
		
		System.out.println("-----------------------------------------------------");
	}

	@AfterMethod
	public void Quit() {

		driver.quit();
		System.out.println("**************************");
	}

}
