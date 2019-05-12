package com.shopcartt.qa.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.shopcartt.qa.Base.TestBase;

public class Catalog_CategoriesPage extends TestBase {

	// Page Factory
	@FindBy(xpath = "//ul[@class='breadcrumb page-breadcrumb']//a[contains(text(),'Categories')]")
	WebElement Categories_Categories;

	@FindBy(xpath = "//div[@class='page-head']//h2[@class='page-title']")
	WebElement Categories_CategoriesTitle;

	@FindBy(xpath = "//a[@class='toolbar_btn  pointer']")
	WebElement Categories_AddNewCategoryButton;

	@FindBy(xpath = "//div[contains(text(),'Add new category')]")
	WebElement Categories_AddNewCategoryText;

	public Catalog_CategoriesPage() {

		PageFactory.initElements(driver, this);
	}
	
	public String ValidategetCatagoriesTitle() {
		
		return driver.getTitle();
	}

	public boolean ValidateCategories_CategoriesDisplayed() {
		
		return Categories_Categories.isDisplayed();
	}

	public String ValidateCategories_CategoriesText() {

		return Categories_Categories.getText();
	}

	public boolean ValidateCategories_CategoriesTitleDisplayed() {
	
		return Categories_CategoriesTitle.isDisplayed();
	}

	public boolean ValidateCategories_AddNewCategoryButtonDisplayed() {
		
		return Categories_AddNewCategoryButton.isDisplayed();
	}

	public void ValidateCategories_AddNewCategoryButtonColor() {
		
		System.out.println("Before Add new Catagory Button : " + Categories_AddNewCategoryButton.getCssValue("color"));
		
		Actions action = new Actions(driver);
		
		action.moveToElement(Categories_AddNewCategoryButton).build().perform();
		
		System.out.println("After Add new Catagory Button : " + Categories_AddNewCategoryButton.getCssValue("color"));
	}

	public Catagory_AddNewCatagoryPage ValidateCategories_AddNewCategoryButtonClick() {
		
		Categories_AddNewCategoryButton.click();
		
		return new Catagory_AddNewCatagoryPage();
		
	}

	public boolean ValidateCategories_AddNewCategoryTextDisplayed() {
	
		return Categories_AddNewCategoryText.isDisplayed();
	}

	public String ValidateCategories_AddNewCategoryText() {
	
		return Categories_AddNewCategoryText.getText();
	}

	public Catagory_AddNewCatagoryPage ValidateCategories_AddNewCategoryTextClick() {
		
		Categories_AddNewCategoryText.click();
		
		return new Catagory_AddNewCatagoryPage();
		
	}

}
