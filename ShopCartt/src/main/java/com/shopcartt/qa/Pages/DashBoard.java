package com.shopcartt.qa.Pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.shopcartt.qa.Base.TestBase;

public class DashBoard extends TestBase {

	// PageFactory
	@FindBy(xpath = "//a[@id='header_shopversion']")
	WebElement DashBoardLogo;

	@FindBy(xpath = "//a[@id='header_shopversion']")
	WebElement DashBoardVersion;

	@FindBy(xpath = "//a[@id='header_shopname']")
	WebElement ShopName;

	@FindBy(xpath = "//li[@id='orders_notif']//a//i[@class='icon-shopping-cart']")
	WebElement Cartt;

	@FindBy(xpath = "//li[@id='customers_notif']//a//i[@class='icon-user']")
	WebElement Customers;

	@FindBy(xpath = "//li[@id='customer_messages_notif']//a//i[@class='icon-envelope']")
	WebElement Envelope;

	@FindBy(xpath = "//li[@id='gamification_notif']//a//img")
	WebElement Trophy;

	@FindBy(xpath = "//a[@id='quick_select']")
	WebElement QuickAccess;

	@FindBy(xpath = "//i[@class='icon-chain-broken']")
	WebElement ChainBroken;

	@FindBy(xpath = "//span[contains(text(),'Connect to PrestaShop Marketplace account')]")
	WebElement MarketPlace;

	@FindBy(xpath = "//span[contains(text(),'My shop')]")
	WebElement MyShop;

	@FindBy(xpath = "//span[contains(text(),'Administrator')]")
	WebElement SystemAdministrator;

	@FindBy(xpath = "//span[@class='employee_avatar_small']//img[@class='imgm img-thumbnail']")
	WebElement ProfilePicture;

	@FindBy(xpath = "//a[contains(text(),'Dashboard')]")
	WebElement DashBoardSmallText;

	@FindBy(xpath = "//h2[@class='page-title']")
	WebElement DashBoardPageTitle;

	@FindBy(xpath = "//i[@class='process-icon-toggle-on']")
	WebElement ToggleButton;

	@FindBy(xpath = "//div[contains(text(),'Demo mode')]")
	WebElement DemoMode;

	@FindBy(xpath = "//i[@class='process-icon-help']")
	WebElement HelpLogo;

	@FindBy(xpath = "//div[contains(text(),'Help')]")
	WebElement Help;

	@FindBy(xpath = "//span[contains(text(),'Catalog')]")
	WebElement CatalogTitle;

	@FindBy(xpath = "//span[text()='Orders']")
	WebElement OrdersTitle;

	@FindBy(xpath = "//span[text()='Customers']")
	WebElement CustomersTitle;

	@FindBy(xpath = "//span[text()='Price Rules']")
	WebElement PriceRulesTitle;

	@FindBy(xpath = "//span[text()='Modules and Services']")
	WebElement ModulesAndServicesTitle;

	@FindBy(xpath = "//span[text()='Shipping']")
	WebElement ShippingTitle;

	@FindBy(xpath = "//span[text()='Localization']")
	WebElement LocalizationTitle;

	@FindBy(xpath = "//span[text()='Preferences']")
	WebElement PreferencesTitle;

	@FindBy(xpath = "//span[text()='Advanced Parameters']")
	WebElement AdvancedParametersTitle;

	@FindBy(xpath = "//span[text()='Administration']")
	WebElement AdministrationTitle;

	@FindBy(xpath = "//span[text()='Stats']")
	WebElement StatsTitle;

	@FindBy(xpath = "//input[@name='bo_query']")
	WebElement DashBoardSearchBox;

	@FindBy(xpath = "//button[@class='btn btn-default dropdown-toggle']")
	WebElement DashBoardSearchDropDown;

	@FindBy(xpath = "//li[@id='subtab-AdminProducts']//a[contains(text(),'Products')]")
	WebElement Catalog_Products;

	@FindBy(xpath = "//li[@id='subtab-AdminCategories']//a[contains(text(),'Categories')]")
	WebElement Catalog_Catagories;

	@FindBy(xpath = "//li[@id='subtab-AdminTracking']//a[contains(text(),'Monitoring')]")
	WebElement Catalog_Monitoring;

	@FindBy(xpath = "//a[contains(text(),'Product Attributes')]")
	WebElement Catalog_ProductAttributes;

	@FindBy(xpath = "//a[contains(text(),'Product Features')]")
	WebElement Catalog_ProductFeatures;

	@FindBy(xpath = "//a[contains(text(),'Manufacturers')]")
	WebElement Catalog_Manufacturers;

	@FindBy(xpath = "//a[contains(text(),'Suppliers')]")
	WebElement Catalog_Suppliers;

	@FindBy(xpath = "//a[contains(text(),'Tags')]")
	WebElement Catalog_Tags;

	@FindBy(xpath = "//a[contains(text(),'Attachments')]")
	WebElement Catalog_Attachments;

	public DashBoard() {

		PageFactory.initElements(driver, this);
	}

	public String ValidateDashBoardTitle() {

		return driver.getTitle();
	}

	public boolean ValidateDashBoardLogo() {

		return DashBoardLogo.isDisplayed();
	}

	public boolean ValidateDashBoardVersionDisplayed() {

		return DashBoardVersion.isDisplayed();
	}

	public String ValidateDashBoardVersionText() {

		return DashBoardVersion.getText();
	}

	public String ValidateDashBoardShopNameText() {

		return ShopName.getText();
	}

	public boolean ValidateDashBoardShopNameDisplayed() {

		return ShopName.isDisplayed();
	}

	public boolean ValidateDashBoardCarttLogoDisplayed() {

		return Cartt.isDisplayed();
	}

	public boolean ValidateDashBoardCustomersLogoDisplayed() {

		return Customers.isDisplayed();
	}

	public boolean ValidateDashBoardEnvelopeLogoDisplayed() {

		return Envelope.isDisplayed();
	}

	public boolean ValidateDashBoardTrophyLogoDisplayed() {

		return Trophy.isDisplayed();
	}

	public boolean ValidateDashBoardQuickAccessDisplayed() {

		return QuickAccess.isDisplayed();
	}

	public void ValidateDashBoardQuickAccessClick() throws InterruptedException {

		QuickAccess.click();

		Thread.sleep(2000);
	}

	public boolean ValidateDashBoardChainBrokenLogoDisplayed() {

		return ChainBroken.isDisplayed();
	}

	public String ValidateDashBoardMarketPlaceText() {

		return MarketPlace.getText();
	}

	public boolean ValidateDashBoardMarketPlaceDisplayed() {

		return MarketPlace.isDisplayed();
	}

	public String ValidateDashBoardMyShopText() {

		return MyShop.getText();
	}

	public boolean ValidateDashBoardMyShopDisplayed() {

		return MyShop.isDisplayed();
	}

	public String ValidateDashBoardSystemAdministratorText() {

		return SystemAdministrator.getText();
	}

	public boolean ValidateDashBoardSystemAdministratorDisplayed() {

		return SystemAdministrator.isDisplayed();
	}

	public void ValidateDashBoardSystemAdministratorClick() throws InterruptedException {

		SystemAdministrator.click();

		Thread.sleep(3000);
	}

	public boolean ValidateDashBoardProfilePictureDisplayed() {

		return ProfilePicture.isDisplayed();
	}

	public boolean ValidateDashBoardSmallDisplayed() {

		return DashBoardSmallText.isDisplayed();
	}

	public boolean ValidateDashBoardToggleButtonDisplayed() {

		return ToggleButton.isDisplayed();
	}

	public boolean ValidateDashBoardToggleButtonEnabled() {

		return ToggleButton.isEnabled();
	}

	public void ValidateDashBoardToggleButtonColor() {

		System.out.println("befor mouse over button color is : " + ToggleButton.getCssValue("color"));

		Actions act = new Actions(driver);

		act.moveToElement(ToggleButton).build().perform();

		System.out.println("after mouse over button color is : " + ToggleButton.getCssValue("color"));

	}

	public boolean ValidateDashBoardDemoModeDisplayed() {

		return DemoMode.isDisplayed();
	}

	public String ValidateDashBoardDemoModeText() {

		return DemoMode.getText();
	}

	public boolean ValidateDashBoardHelpLogoDisplayed() {

		return HelpLogo.isDisplayed();
	}

	public void ValidateDashBoardHelpLogoColor() {

		System.out.println("befor mouse over button color is : " + HelpLogo.getCssValue("color"));

		Actions act = new Actions(driver);

		act.moveToElement(HelpLogo).build().perform();

		System.out.println("after mouse over button color is : " + HelpLogo.getCssValue("color"));
	}

	public boolean ValidateDashBoardHelpDisplayed() {

		return Help.isDisplayed();
	}

	public String ValidateDashBoardHelpText() {

		return Help.getText();
	}

	public void ValidateDashBoardLogoClick() {

		DashBoardLogo.click();

	}

	public void ValidateDashBoardVersionClick() {

		DashBoardVersion.click();

	}

	public void ValidateDashBoardShopNameClick() {

		ShopName.click();

	}

	public void ValidateDashBoardCustomersLogoClick() {

		Customers.click();
	}

	public void ValidateDashBoardCarttLogoClick() {

		Cartt.click();

	}

	public void ValidateDashBoardEnvelopeLogoClick() {

		Envelope.click();
	}

	public void ValidateDashBoardTrophyLogoClick() {

		Trophy.click();

	}

	public void ValidateDashBoardMarketPlaceClick() {

		MarketPlace.click();

	}

	public void ValidateDashBoardMyShopClick() {

		MyShop.click();

	}

	public void ValidateDashBoardProfilePictureClick() {

		ProfilePicture.click();

	}

	public void ValidateDashBoardSmallClick() {

		DashBoardSmallText.click();

	}

	public void ValidateDashBoardDemoModeClick() {

		DemoMode.click();
	}

	public void ValidateDashBoardHelpLogoClick() {

		HelpLogo.click();
	}

	public void ValidateDashBoardHelpClick() {

		Help.click();
	}

	public void ValidateCatalogClick() {

		CatalogTitle.click();

	}

	public boolean ValidateCatalogDisplayed() {

		return CatalogTitle.isDisplayed();
	}

	public String ValidateCatalogText() {

		return CatalogTitle.getText();
	}

	public void ValidateOrdersTitleClick() {

		OrdersTitle.click();
	}

	public String ValidateOrdersTitleText() {

		return OrdersTitle.getText();
	}

	public boolean ValidateOrdersTitleDisplayed() {

		return OrdersTitle.isDisplayed();
	}

	public boolean ValidateCustomersTitleDisplayed() {

		return CustomersTitle.isDisplayed();
	}

	public String ValidateCustomersTitleText() {

		return CustomersTitle.getText();
	}

	public void ValidateCustomersTitleClick() {

		CustomersTitle.click();
	}

	public void ValidatePriceRulesTitleClick() {

		PriceRulesTitle.click();
	}

	public String ValidatePriceRulesTitleText() {

		return PriceRulesTitle.getText();
	}

	public boolean ValidatePriceRulesTitleDisplayed() {

		return PriceRulesTitle.isDisplayed();
	}

	public boolean ValidateModulesAndServicesTitleDisplayed() {

		return ModulesAndServicesTitle.isDisplayed();
	}

	public String ValidateModulesAndServicesTitleText() {

		return ModulesAndServicesTitle.getText();
	}

	public void ValidateModulesAndServicesTitleClick() {

		ModulesAndServicesTitle.click();
	}

	public void ValidateShippingTitleClick() {

		ShippingTitle.click();

	}

	public String ValidateShippingTitleDisplayedText() {

		return ShippingTitle.getText();
	}

	public boolean ValidateShippingTitleDisplayed() {

		return ShippingTitle.isDisplayed();
	}

	public boolean ValidateLocalizationTitleDisplayed() {

		return LocalizationTitle.isDisplayed();
	}

	public String ValidateLocalizationTitleText() {

		return LocalizationTitle.getText();
	}

	public void ValidateLocalizationTitleClick() {

		LocalizationTitle.click();
	}

	public String ValidatePreferencesTitleText() {

		return PreferencesTitle.getText();
	}

	public void ValidatePreferencesTitleClick() {

		PreferencesTitle.click();
	}

	public boolean ValidatePreferencesTitleDisplayed() {

		return PreferencesTitle.isDisplayed();
	}

	public boolean ValidateAdvancedParametersTitleDisplayed() {

		return AdvancedParametersTitle.isDisplayed();
	}

	public String ValidateAdvancedParametersTitleText() {

		return AdvancedParametersTitle.getText();
	}

	public void ValidateAdvancedParametersTitleClick() {

		AdvancedParametersTitle.click();

	}

	public boolean ValidateAdministrationTitleDisplayed() {

		return AdministrationTitle.isDisplayed();
	}

	public String ValidateAdministrationTitleText() {

		return AdministrationTitle.getText();
	}

	public void ValidateAdministrationTitleClick() {

		AdministrationTitle.click();

	}

	public void ValidateStatsTitleClick() {

		StatsTitle.click();

	}

	public String ValidateStatsTitleText() {

		return StatsTitle.getText();
	}

	public boolean ValidateStatsTitleDisplayed() {

		return StatsTitle.isDisplayed();
	}

	public Catalog_ProductsPage ValidateCatalog_ProductsPageClick() throws InterruptedException {

		Actions action = new Actions(driver);

		action.moveToElement(CatalogTitle).build().perform();

		Catalog_Products.click();

		Thread.sleep(3000);

		return new Catalog_ProductsPage();

	}

	public void ValidateSearchBoxClick() throws AWTException, InterruptedException {

		DashBoardSearchBox.click();
		
		DashBoardSearchBox.sendKeys("Catalog");
		
		Robot robot = new Robot();
		
		robot.keyPress(KeyEvent.VK_ENTER);
		
		Thread.sleep(3000);

	}

	public String ValidateSearchBoxPlaceHolder() {

		return DashBoardSearchBox.getAttribute("placeholder");

	}

	public void ValidateDashBoardSearchDropDownClick() {

		DashBoardSearchDropDown.click();
	}

	public boolean ValidateSearchBoxDisplayed() {

		return DashBoardSearchBox.isDisplayed();

	}

	public Catalog_CategoriesPage ValidateCatalog_CategoriesPageClick() throws InterruptedException {

		Actions action = new Actions(driver);

		action.moveToElement(CatalogTitle).build().perform();

		Catalog_Catagories.click();

		Thread.sleep(3000);

		return new Catalog_CategoriesPage();

	}

	public Catalog_MonitoringPage ValidateCatalog_MonitoringPageClick() throws InterruptedException {

		Actions action = new Actions(driver);

		action.moveToElement(CatalogTitle).build().perform();

		Catalog_Monitoring.click();

		Thread.sleep(3000);

		return new Catalog_MonitoringPage();

	}

	public Catalog_ProductAttributesPage ValidateCatalog_ProductAttributesPageClick() throws InterruptedException {

		Actions action = new Actions(driver);

		action.moveToElement(CatalogTitle).build().perform();

		Catalog_ProductAttributes.click();

		Thread.sleep(3000);

		return new Catalog_ProductAttributesPage();

	}

	public Catalog_ProductFeaturesPage ValidateCatalog_ProductFeaturesPageClick() throws InterruptedException {

		Actions action = new Actions(driver);

		action.moveToElement(CatalogTitle).build().perform();

		Catalog_ProductAttributes.click();

		Thread.sleep(3000);

		return new Catalog_ProductFeaturesPage();

	}

	public Catalog_manufacturersPage ValidateCatalog_ManufacturersPageClick() throws InterruptedException {

		Actions action = new Actions(driver);

		action.moveToElement(CatalogTitle).build().perform();

		Catalog_Manufacturers.click();

		Thread.sleep(3000);

		return new Catalog_manufacturersPage();

	}

	public Catalog_SuppliersPage ValidateCatalog_SuppliersPageClick() throws InterruptedException {

		Actions action = new Actions(driver);

		action.moveToElement(CatalogTitle).build().perform();

		Catalog_Suppliers.click();

		Thread.sleep(3000);

		return new Catalog_SuppliersPage();
	}

	public Catalog_TagsPage ValidateCatalog_TagsPageClick() throws InterruptedException {

		Actions action = new Actions(driver);

		action.moveToElement(CatalogTitle).build().perform();

		Catalog_Tags.click();

		Thread.sleep(3000);

		return new Catalog_TagsPage();

	}

	public Catalog_AttachmentsPage ValidateCatalog_AttachmentsPageClick() throws InterruptedException {
	
		Actions action = new Actions(driver);

		action.moveToElement(CatalogTitle).build().perform();

		Catalog_Attachments.click();

		Thread.sleep(3000);
		
		return new Catalog_AttachmentsPage();
	}

}
