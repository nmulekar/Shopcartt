package com.shopcartt.qa.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.shopcartt.qa.Base.TestBase;

public class Catalog_ProductsPage extends TestBase {

	// Page Factory
	@FindBy(xpath = "//li[@class='breadcrumb-container']//a[contains(text(),'Catalog')]")
	WebElement Products_Catalog;

	@FindBy(xpath = "//li[@class='breadcrumb-current']//a[contains(text(),'Products')]")
	WebElement Products_Products;

	@FindBy(xpath = "//div//h2[@class='page-title']")
	WebElement Products_PageTitle;

	@FindBy(xpath = "//a[@id='page-header-desc-product-new_product']//i[@class='process-icon-new']")
	WebElement Products_AddNewProductButton;

	@FindBy(xpath = "//div[contains(text(),'Add new product')]")
	WebElement Products_AddNewProductText;

	@FindBy(xpath = "//a//i[@class='process-icon-modules-list']")
	WebElement Products_RecommendedModulesAndServicesButton;

	@FindBy(xpath = "//div[contains(text(),'Recommended Modules and Services')]")
	WebElement Products_RecommendedModulesAndServicesText;

	public Catalog_ProductsPage() {

		PageFactory.initElements(driver, this);
	}

	public String ValidategetProductsTitle() {

		return driver.getTitle();
	}

	public boolean ValidateProducts_CatalogDisplayed() {

		return Products_Catalog.isDisplayed();
	}

	public String ValidateProducts_CatalogText() {

		return Products_Catalog.getText();
	}

	public void ValidateProducts_CatalogClick() {

		Products_Catalog.click();

	}

	public boolean ValidateProducts_ProductsDisplayed() {

		return Products_Products.isDisplayed();
	}

	public String ValidateProducts_ProductsText() {

		return Products_Products.getText();
	}

	public void ValidateProducts_ProductsClick() {

		Products_Products.click();

	}

	public boolean ValidateProducts_AddNewProductButtonDisplayed() {

		return Products_AddNewProductButton.isDisplayed();
	}

	public void ValidateProducts_AddNewProductButtonColor() {

		System.out.println("befor mouse over button color is : " + Products_AddNewProductButton.getCssValue("color"));

		Actions act = new Actions(driver);

		act.moveToElement(Products_AddNewProductButton).build().perform();

		System.out.println("after mouse over button color is : " + Products_AddNewProductButton.getCssValue("color"));

	}

	public String ValidateProducts_AddNewProductText() {

		return Products_AddNewProductText.getText();
	}

	public Product_addNewProductPage ValidateProducts_AddNewProductTextClick() {

		Products_AddNewProductText.click();

		return new Product_addNewProductPage();

	}

	public boolean ValidateProducts_AddNewProductTextDisplayed() {

		return Products_AddNewProductText.isDisplayed();
	}

	public boolean ValidateProducts_RecommendedModulesAndServicesButtonDisplayed() {

		return Products_RecommendedModulesAndServicesButton.isDisplayed();
	}

	public void ValidateProducts_RecommendedModulesAndServicesButtonColor() {

		System.out.println("befor mouse over button color is : "
				+ Products_RecommendedModulesAndServicesButton.getCssValue("color"));

		Actions act = new Actions(driver);

		act.moveToElement(Products_RecommendedModulesAndServicesButton).build().perform();

		System.out.println("after mouse over button color is : "
				+ Products_RecommendedModulesAndServicesButton.getCssValue("color"));

	}

	public boolean ValidateProducts_RecommendedModulesAndServicesTextDisplayed() {

		return Products_RecommendedModulesAndServicesText.isDisplayed();
	}

	public void ValidateProducts_RecommendedModulesAndServicesTextClick() {

		Products_RecommendedModulesAndServicesText.click();
	}

	public String ValidateProducts_RecommendedModulesAndServicesText() {

		return Products_RecommendedModulesAndServicesText.getText();
	}

	public Product_addNewProductPage ValidateProducts_AddNewProductButtonClick() {

		Products_AddNewProductButton.click();

		return new Product_addNewProductPage();
	}

}
