package com.shopcartt.qa.Pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.shopcartt.qa.Base.TestBase;

public class Product_addNewProductPage extends TestBase {

	// Page Factory
	@FindBy(xpath = "//div[@class='radio']//label[@for='simple_product']")
	WebElement NewProduct_StandardProductRadioButton;

	@FindBy(xpath = "//input[@id='name_1']")
	WebElement NewProduct_Name;

	@FindBy(xpath = "//input[@id='reference']")
	WebElement NewProduct_ReferenceCode;

	@FindBy(xpath = "//input[@id='ean13']")
	WebElement NewProduct_EAN13BarCode;

	@FindBy(xpath = "//input[@id='upc']")
	WebElement NewProduct_UPCBarCode;

	@FindBy(xpath = "//label[@for='active_on']")
	WebElement NewProduct_Enabled_Yes;

	@FindBy(xpath = "//label[@for='active_off']")
	WebElement NewProduct_Enabled_No;

	@FindBy(xpath = "//select[@id='visibility']")
	WebElement NewProduct_Visibility;

	@FindBy(xpath = "//div[@class='checkbox']//label[@for='available_for_order']")
	WebElement NewProduct_Options;

	@FindBy(xpath = "//select[@id='condition']")
	WebElement NewProduct_Condition;

	@FindBy(xpath = "//div[@id='mce_97']//span[contains(text(),'Insert image')]")
	WebElement NewProduct_InsertImage;

	@FindBy(xpath = "//i[@class='mce-ico mce-i-browse']")
	WebElement NewProduct_InsertImageBrowse;

	@FindBy(xpath = "//input[@id='mce_312-inp']")
	WebElement NewProduct_InsertImageSource;

	@FindBy(xpath = "//input[@id='mce_249']")
	WebElement NewProduct_InsertImageDiscription;

	@FindBy(xpath = "//div[@id='mce_256']//button[@role='presentation']")
	WebElement NewProduct_InsertImageOKButton;

	@FindBy(xpath = "//div[@id=\"product-tab-content-Informations\"]//button[@name=\"submitAddproduct\"]")
	WebElement NewProduct_InsertImageSave;

	public Product_addNewProductPage() {

		PageFactory.initElements(driver, this);
	}

	public void NewProductInformation() throws AWTException, IOException, InterruptedException {

		NewProduct_StandardProductRadioButton.click();

		NewProduct_Name.sendKeys("Nike Jacket");

		NewProduct_ReferenceCode.sendKeys("Nike111");

		NewProduct_EAN13BarCode.sendKeys("22992299");

		NewProduct_UPCBarCode.sendKeys("101010");
		
		Thread.sleep(3000);

		NewProduct_Enabled_Yes.click();

		Select select = new Select(NewProduct_Visibility);

		select.selectByVisibleText("Everywhere");

		NewProduct_Options.isEnabled();
		
		Thread.sleep(3000);

		Select select1 = new Select(NewProduct_Condition);

		select1.selectByVisibleText("Used");
		
		Thread.sleep(3000);

		/*Robot robot = new Robot();

		 robot.mousePress(InputEvent.BUTTON3_DOWN_MASK);
		
		Thread.sleep(3000);

		Actions action = new Actions(driver);

		action.moveToElement(NewProduct_InsertImage).build().perform();

		NewProduct_InsertImage.click();
		
		Thread.sleep(3000);

		NewProduct_InsertImageSource.sendKeys("https://javaclassesinpune.com/projects/shopcart/img/cms/cms-img.jpg");

		NewProduct_InsertImageDiscription.sendKeys("Home Image");
		
		Thread.sleep(3000);

		NewProduct_InsertImageOKButton.click();*/
		
		NewProduct_InsertImageSave.click();

	}

}
