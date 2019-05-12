package com.Shopcartt.qa.Tests;

import java.awt.AWTException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.shopcartt.qa.Base.TestBase;
import com.shopcartt.qa.Pages.DashBoard;
import com.shopcartt.qa.Pages.LoginPage;

public class DashBoardTestCases extends TestBase {

	LoginPage loginPage;
	DashBoard dashboard;

	public DashBoardTestCases() {

		super();
	}

	@BeforeMethod
	public void DashBoardSetUp() {

		Intialization();

		loginPage = new LoginPage();

		dashboard = loginPage.ValidateCorrectLogin(prop.getProperty("username"), prop.getProperty("password"));

	}

	/*
	 * @Test(priority = 1) public void TestDashBoardTitle() {
	 * 
	 * String titleExp = dashboard.ValidateDashBoardTitle();
	 * 
	 * String titleAct = "Dashboard • ShopCartt";
	 * 
	 * System.out.println("Tital Actual : " + titleAct);
	 * 
	 * System.out.println("Tital Expected : " + titleExp);
	 * 
	 * Assert.assertEquals(titleExp, titleAct);
	 * 
	 * }
	 */

	@Test(priority = 2)
	public void TestDashBoardLogo() {

		boolean b = dashboard.ValidateDashBoardLogo();

		System.out.println("--------------------------------------");

	}

	@Test(priority = 3)
	public void TestDashBoardLogoClick() {

		dashboard.ValidateDashBoardLogoClick();

		System.out.println("--------------------------------------");

	}

	@Test(priority = 4)
	public void TestDashBoardVersionDisplayed() {

		boolean b = dashboard.ValidateDashBoardVersionDisplayed();

		System.out.println("DashBoard Version Displayed : " + b);

		System.out.println("--------------------------------------");

	}

	@Test(priority = 5)
	public void TestDashBoardVersionText() {

		String act = dashboard.ValidateDashBoardVersionText();

		String exp = "1.6.1.23";

		System.out.println("Actual Dashboard Name : " + act);

		System.out.println("Expected Dashboard Name : " + exp);

		System.out.println("--------------------------------------");

	}

	@Test(priority = 6)
	public void TestDashBoardVersionClick() {

		dashboard.ValidateDashBoardVersionClick();

		System.out.println("--------------------------------------");

	}

	@Test(priority = 7)
	public void TestDashBoardShopNameText() {

		String act = dashboard.ValidateDashBoardShopNameText();

		String exp = "ShopCartt";

		System.out.println("Actual Dashboard Name : " + act);

		System.out.println("Expected Dashboard Name : " + exp);

		System.out.println("--------------------------------------");

	}

	@Test(priority = 8)
	public void TestDashBoardShopNameDisplayed() {

		boolean b = dashboard.ValidateDashBoardShopNameDisplayed();

		System.out.println("DashBoard ShopName Displayed : " + b);

		System.out.println("--------------------------------------");

	}

	@Test(priority = 9)
	public void TestDashBoardShopNameClick() {

		dashboard.ValidateDashBoardShopNameClick();

		System.out.println("--------------------------------------");

	}

	@Test(priority = 10)
	public void TestDashBoardCarttLogoDisplayed() {

		boolean b = dashboard.ValidateDashBoardCarttLogoDisplayed();

		System.out.println("DashBoard Version Displayed : " + b);

		System.out.println("--------------------------------------");

	}

	@Test(priority = 11)
	public void TestDashBoardCarttLogoClick() {

		dashboard.ValidateDashBoardCarttLogoClick();

		System.out.println("--------------------------------------");

	}

	@Test(priority = 12)
	public void TestDashBoardCustomersLogoClick() {

		dashboard.ValidateDashBoardCustomersLogoClick();

		System.out.println("--------------------------------------");

	}

	@Test(priority = 13)
	public void TestDashBoardCustomersLogoDisplayed() {

		boolean b = dashboard.ValidateDashBoardCustomersLogoDisplayed();

		System.out.println("DashBoard Customer Logo Displayed : " + b);

		System.out.println("--------------------------------------");

	}

	@Test(priority = 14)
	public void TestDashBoardEnvelopeLogoDisplayed() {

		boolean b = dashboard.ValidateDashBoardEnvelopeLogoDisplayed();

		System.out.println("DashBoard Customer Logo Displayed : " + b);

		System.out.println("--------------------------------------");

	}

	@Test(priority = 15)
	public void TestDashBoardEnvelopeLogoClick() {

		dashboard.ValidateDashBoardEnvelopeLogoClick();

		System.out.println("--------------------------------------");

	}

	@Test(priority = 16)
	public void TestDashBoardTrophyLogoDisplayed() {

		boolean b = dashboard.ValidateDashBoardTrophyLogoDisplayed();

		System.out.println("DashBoard Customer Logo Displayed : " + b);

		System.out.println("--------------------------------------");

	}

	@Test(priority = 17)
	public void TestDashBoardTrophyLogoClick() {

		dashboard.ValidateDashBoardTrophyLogoClick();

		System.out.println("--------------------------------------");

	}

	@Test(priority = 18)
	public void TestDashBoardQuickAccessDisplayed() {

		boolean b = dashboard.ValidateDashBoardQuickAccessDisplayed();

		System.out.println("DashBoard Quick Access Displayed : " + b);

		System.out.println("--------------------------------------");

	}

	@Test(priority = 19)
	public void TestDashBoardQuickAccessClick() throws InterruptedException {

		dashboard.ValidateDashBoardQuickAccessClick();

		System.out.println("--------------------------------------");

	}

	@Test(priority = 20)
	public void TestDashBoardChainBrokenLogoDisplayed() {

		boolean b = dashboard.ValidateDashBoardChainBrokenLogoDisplayed();

		System.out.println("DashBoard Chain Broken Displayed : " + b);

		System.out.println("--------------------------------------");

	}

	@Test(priority = 21)
	public void TestDashBoardMarketPlaceText() {

		String act = dashboard.ValidateDashBoardMarketPlaceText();

		String exp = "Connect to PrestaShop Marketplace account";

		System.out.println("DashBoard Marketplace Actual : " + act);

		System.out.println("DashBoard Marketplace Expected : " + exp);

		Assert.assertEquals(act, exp);

		System.out.println("--------------------------------------");

	}

	@Test(priority = 22)
	public void TestDashBoardMarketPlaceDisplayed() {

		boolean b = dashboard.ValidateDashBoardMarketPlaceDisplayed();

		System.out.println("DashBoard Chain Broken Displayed : " + b);

		System.out.println("--------------------------------------");

	}

	@Test(priority = 23)
	public void TestDashBoardMarketPlaceClick() {

		dashboard.ValidateDashBoardMarketPlaceClick();

		System.out.println("--------------------------------------");

	}

	@Test(priority = 24)
	public void TestDashBoardMyShopDisplayed() {

		boolean b = dashboard.ValidateDashBoardMyShopDisplayed();

		System.out.println("DashBoard Chain Broken Displayed : " + b);

		System.out.println("--------------------------------------");

	}

	@Test(priority = 25)
	public void TestDashBoardMyShopText() {

		String act = dashboard.ValidateDashBoardMyShopText();

		String exp = "My shop";

		System.out.println("DashBoard MyShop Actual : " + act);

		System.out.println("DashBoard MyShop Expected : " + exp);

		Assert.assertEquals(act, exp);

		System.out.println("--------------------------------------");

	}

	@Test(priority = 26)
	public void TestDashBoardMyShopClick() {

		dashboard.ValidateDashBoardMyShopClick();

		System.out.println("--------------------------------------");

	}

	@Test(priority = 27)
	public void TestDashBoardSystemAdministratorText() {

		String act = dashboard.ValidateDashBoardSystemAdministratorText();

		String exp = "System Administrator";

		System.out.println("DashBoard System Administrator Actual : " + act);

		System.out.println("DashBoard System Administrator Expected : " + exp);

		Assert.assertEquals(act, exp);

		System.out.println("--------------------------------------");

	}

	@Test(priority = 28)
	public void TestDashBoardSystemAdministratorDisplayed() {

		boolean b = dashboard.ValidateDashBoardSystemAdministratorDisplayed();

		System.out.println("DashBoard System Administrator Displayed : " + b);

		System.out.println("--------------------------------------");

	}

	@Test(priority = 29)
	public void TestDashBoardSystemAdministratorClick() throws InterruptedException {

		dashboard.ValidateDashBoardSystemAdministratorClick();

		System.out.println("--------------------------------------");

	}

	@Test(priority = 30)
	public void TestDashBoardProfilePictureDisplayed() {

		boolean b = dashboard.ValidateDashBoardProfilePictureDisplayed();

		System.out.println("DashBoard System Administrator Displayed : " + b);

		System.out.println("--------------------------------------");

	}

	@Test(priority = 31)
	public void TestDashBoardProfilePictureClick() throws InterruptedException {

		dashboard.ValidateDashBoardProfilePictureClick();

		Thread.sleep(2000);

		System.out.println("--------------------------------------");

	}

	@Test(priority = 32)
	public void TestDashBoardSmallDisplayed() {

		boolean b = dashboard.ValidateDashBoardSmallDisplayed();

		System.out.println("DashBoard in Small Text Displayed : " + b);

		System.out.println("--------------------------------------");

	}

	@Test(priority = 33)
	public void TestDashBoardSmallTextClick() {

		dashboard.ValidateDashBoardSmallClick();

		System.out.println("--------------------------------------");

	}

	@Test(priority = 34)
	public void TestDashBoardPageTitleDisplayed() {

		boolean b = dashboard.ValidateDashBoardSmallDisplayed();

		System.out.println("DashBoard Page Title Displayed : " + b);

		System.out.println("--------------------------------------");

	}

	@Test(priority = 35)
	public void TestDashBoardToggleButtonEnabled() {

		boolean b = dashboard.ValidateDashBoardToggleButtonEnabled();

		System.out.println("DashBoard Toggle Button Enabled : " + b);

		System.out.println("--------------------------------------");

	}

	@Test(priority = 36)
	public void TestDashBoardToggleButtonColor() {

		dashboard.ValidateDashBoardToggleButtonColor();

		System.out.println("--------------------------------------");

	}

	@Test(priority = 37)
	public void TestDashBoardDemoModeDisplayed() {

		boolean b = dashboard.ValidateDashBoardDemoModeDisplayed();

		System.out.println("DashBoard Demo Mode Displayed : " + b);

		System.out.println("--------------------------------------");

	}

	@Test(priority = 38)
	public void TestDashBoardDemoModeText() {

		String act = dashboard.ValidateDashBoardDemoModeText();

		String exp = "Demo mode";

		System.out.println("DashBoard Demo Mode Actual : " + act);

		System.out.println("DashBoard Demo Mode Expected : " + exp);

		System.out.println("--------------------------------------");

	}

	@Test(priority = 39)
	public void TestDashBoardDemoModeClick() {

		dashboard.ValidateDashBoardDemoModeClick();

		System.out.println("--------------------------------------");

	}

	@Test(priority = 40)
	public void TestDashBoardHelpLogoDisplayed() {

		boolean b = dashboard.ValidateDashBoardHelpLogoDisplayed();

		System.out.println("DashBoard Help Logo Displayed : " + b);

		System.out.println("--------------------------------------");

	}

	@Test(priority = 41)
	public void TestDashBoardHelpLogoColor() {

		dashboard.ValidateDashBoardHelpLogoColor();

		System.out.println("--------------------------------------");

	}

	@Test(priority = 42)
	public void TestDashBoardHelpLogoClick() {

		dashboard.ValidateDashBoardHelpLogoClick();

		System.out.println("--------------------------------------");

	}

	@Test(priority = 43)
	public void TestDashBoardHelpDisplayed() {

		boolean b = dashboard.ValidateDashBoardHelpDisplayed();

		System.out.println("DashBoard Help Logo Displayed : " + b);

		System.out.println("--------------------------------------");

	}

	@Test(priority = 44)
	public void TestDashBoardHelpText() {

		String act = dashboard.ValidateDashBoardHelpText();

		String exp = "Help";

		System.out.println("DashBoard Help Actual : " + act);

		System.out.println("DashBoard Help Expected : " + exp);

		System.out.println("--------------------------------------");

	}

	@Test(priority = 45)
	public void TestDashBoardHelpClick() {

		dashboard.ValidateDashBoardHelpClick();

		System.out.println("-------------------------------------");

	}

	@Test(priority = 46)
	public void TestCatalogDisplayed() {

		boolean b = dashboard.ValidateCatalogDisplayed();

		System.out.println("Catalog Displayed : " + b);

		System.out.println("-------------------------------------");

	}

	@Test(priority = 47)
	public void TestCatalogText() {

		String act = dashboard.ValidateCatalogText();

		String exp = "Catalog";

		Assert.assertEquals(act, exp);

		System.out.println("Actual Catalog : " + act);

		System.out.println("Expected Catalog : " + exp);

		System.out.println("-------------------------------------");

	}

	@Test(priority = 48)
	public void TestCatalogClick() throws InterruptedException {

		dashboard.ValidateCatalogClick();

		Thread.sleep(3000);

		System.out.println("-------------------------------------");

	}

	@Test(priority = 49)
	public void TestOrdersTitleDisplayed() {

		boolean b = dashboard.ValidateOrdersTitleDisplayed();

		System.out.println("Orders Displayed : " + b);

		System.out.println("-------------------------------------");

	}

	@Test(priority = 50)
	public void TestOrdersTitleText() {

		String act = dashboard.ValidateOrdersTitleText();

		String exp = "Orders";

		Assert.assertEquals(act, exp);

		System.out.println("Actual Orders : " + act);

		System.out.println("Expected Orders : " + exp);

		System.out.println("-------------------------------------");

	}

	@Test(priority = 51)
	public void TestOrdersTitleClick() throws InterruptedException {

		dashboard.ValidateOrdersTitleClick();

		Thread.sleep(3000);

		System.out.println("-------------------------------------");

	}

	@Test(priority = 52)
	public void TestCustomersTitleDisplayed() {

		boolean b = dashboard.ValidateCustomersTitleDisplayed();

		System.out.println("Customers Displayed : " + b);

		System.out.println("-------------------------------------");

	}

	@Test(priority = 53)
	public void TestCustomersTitleText() {

		String act = dashboard.ValidateCustomersTitleText();

		String exp = "Customers";

		Assert.assertEquals(act, exp);

		System.out.println("Actual Customers : " + act);

		System.out.println("Expected Customers : " + exp);

		System.out.println("-------------------------------------");

	}

	@Test(priority = 54)
	public void TestCustomersTitleClick() throws InterruptedException {

		dashboard.ValidateCustomersTitleClick();

		Thread.sleep(3000);

		System.out.println("-------------------------------------");

	}

	@Test(priority = 55)
	public void TestPriceRulesTitleDisplayed() {

		boolean b = dashboard.ValidatePriceRulesTitleDisplayed();

		System.out.println("Price Rules Displayed : " + b);

		System.out.println("-------------------------------------");

	}

	@Test(priority = 56)
	public void TestPriceRulesTitleText() {

		String act = dashboard.ValidatePriceRulesTitleText();

		String exp = "Price Rules";

		Assert.assertEquals(act, exp);

		System.out.println("Actual Price Rules : " + act);

		System.out.println("Expected Price Rules : " + exp);

		System.out.println("-------------------------------------");

	}

	@Test(priority = 57)
	public void TestPriceRulesTitleClick() throws InterruptedException {

		dashboard.ValidatePriceRulesTitleClick();

		Thread.sleep(3000);

		System.out.println("-------------------------------------");

	}

	@Test(priority = 58)
	public void TestModulesAndServicesTitleDisplayed() {

		boolean b = dashboard.ValidateModulesAndServicesTitleDisplayed();

		System.out.println("Modules And Services Displayed : " + b);

		System.out.println("-------------------------------------");

	}

	@Test(priority = 59)
	public void TestModulesAndServicesTitleText() {

		String act = dashboard.ValidateModulesAndServicesTitleText();

		String exp = "Modules and Services";

		Assert.assertEquals(act, exp);

		System.out.println("Actual Modules And Services : " + act);

		System.out.println("Expected Modules And Services : " + exp);

		System.out.println("-------------------------------------");

	}

	@Test(priority = 60)
	public void TestModulesAndServicesTitleClick() throws InterruptedException {

		dashboard.ValidateModulesAndServicesTitleClick();

		Thread.sleep(3000);

		System.out.println("-------------------------------------");

	}

	@Test(priority = 61)
	public void TestShippingTitleDisplayed() {

		boolean b = dashboard.ValidateShippingTitleDisplayed();

		System.out.println("Shipping Displayed : " + b);

		System.out.println("-------------------------------------");

	}

	@Test(priority = 62)
	public void TestShippingTitleText() {

		String act = dashboard.ValidateShippingTitleDisplayedText();

		String exp = "Shipping";

		Assert.assertEquals(act, exp);

		System.out.println("Actual Shipping : " + act);

		System.out.println("Expected Shipping : " + exp);

		System.out.println("-------------------------------------");

	}

	@Test(priority = 63)
	public void TestShippingTitleClick() throws InterruptedException {

		dashboard.ValidateShippingTitleClick();

		Thread.sleep(3000);

		System.out.println("-------------------------------------");

	}

	@Test(priority = 64)
	public void TestLocalizationTitleDisplayed() {

		boolean b = dashboard.ValidateLocalizationTitleDisplayed();

		System.out.println("Localization Displayed : " + b);

		System.out.println("-------------------------------------");

	}

	@Test(priority = 65)
	public void TestLocalizationTitleText() {

		String act = dashboard.ValidateLocalizationTitleText();

		String exp = "Localization";

		Assert.assertEquals(act, exp);

		System.out.println("Actual Localization : " + act);

		System.out.println("Expected Localization : " + exp);

		System.out.println("-------------------------------------");

	}

	@Test(priority = 66)
	public void TestLocalizationTitleClick() throws InterruptedException {

		dashboard.ValidateLocalizationTitleClick();

		Thread.sleep(3000);

		System.out.println("-------------------------------------");

	}

	@Test(priority = 67)
	public void TestPreferencesTitleDisplayed() {

		boolean b = dashboard.ValidatePreferencesTitleDisplayed();

		System.out.println("Preferences Displayed : " + b);

		System.out.println("-------------------------------------");

	}

	@Test(priority = 68)
	public void TestPreferencesTitleText() {

		String act = dashboard.ValidatePreferencesTitleText();

		String exp = "Preferences";

		Assert.assertEquals(act, exp);

		System.out.println("Actual Preferences : " + act);

		System.out.println("Expected Preferences : " + exp);

		System.out.println("-------------------------------------");

	}

	@Test(priority = 69)
	public void TestPreferencesTitleClick() throws InterruptedException {

		dashboard.ValidatePreferencesTitleClick();

		Thread.sleep(3000);

		System.out.println("-------------------------------------");

	}

	@Test(priority = 70)
	public void TestAdvancedParametersTitleDisplayed() {

		boolean b = dashboard.ValidateAdvancedParametersTitleDisplayed();

		System.out.println("Advanced Parameters Displayed : " + b);

		System.out.println("-------------------------------------");

	}

	@Test(priority = 71)
	public void TestAdvancedParametersTitleText() {

		String act = dashboard.ValidateAdvancedParametersTitleText();

		String exp = "Advanced Parameters";

		Assert.assertEquals(act, exp);

		System.out.println("Actual Advanced Parameters : " + act);

		System.out.println("Expected Advanced Parameters : " + exp);

		System.out.println("-------------------------------------");

	}

	@Test(priority = 72)
	public void TestAdvancedParametersTitleClick() throws InterruptedException {

		dashboard.ValidateAdvancedParametersTitleClick();

		Thread.sleep(3000);

		System.out.println("-------------------------------------");

	}

	@Test(priority = 73)
	public void TestAdministrationTitleDisplayed() {

		boolean b = dashboard.ValidateAdministrationTitleDisplayed();

		System.out.println("Administration Displayed : " + b);

		System.out.println("-------------------------------------");

	}

	@Test(priority = 74)
	public void TestAdministrationTitleText() {

		String act = dashboard.ValidateAdministrationTitleText();

		String exp = "Administration";

		Assert.assertEquals(act, exp);

		System.out.println("Actual Administration : " + act);

		System.out.println("Expected Administration : " + exp);

		System.out.println("-------------------------------------");

	}

	@Test(priority = 75)
	public void TestAdministrationTitleClick() throws InterruptedException {

		dashboard.ValidateAdministrationTitleClick();

		Thread.sleep(3000);

		System.out.println("-------------------------------------");

	}

	@Test(priority = 76)
	public void TestStatsTitleDisplayed() {

		boolean b = dashboard.ValidateStatsTitleDisplayed();

		System.out.println("Administration Displayed : " + b);

		System.out.println("-------------------------------------");

	}

	@Test(priority = 77)
	public void TestStatsTitleText() {

		String act = dashboard.ValidateStatsTitleText();

		String exp = "Stats";

		Assert.assertEquals(act, exp);

		System.out.println("Actual Administration : " + act);

		System.out.println("Expected Administration : " + exp);

		System.out.println("-------------------------------------");

	}

	@Test(priority = 78)
	public void TestStatsTitleClick() throws InterruptedException {

		dashboard.ValidateStatsTitleClick();

		Thread.sleep(3000);

		System.out.println("-------------------------------------");

	}

	@Test(priority = 79)
	public void TestSearchBoxClick() throws InterruptedException, AWTException {
		
		dashboard.ValidateSearchBoxClick();

		Thread.sleep(3000);

	}

	@Test(priority = 80)
	public void TestSearchBoxDisplayed() throws InterruptedException {

		boolean bb = dashboard.ValidateSearchBoxDisplayed();

		System.out.println("DashBoard Search Box is Displayed : " + bb);

		Thread.sleep(3000);

	}

	@Test(priority = 81)
	public void TestSearchBoxPlaceHolder() throws InterruptedException {

		String act = dashboard.ValidateSearchBoxPlaceHolder();

		String exp = "Search";

		Assert.assertEquals(act, exp);

		System.out.println("SearchBox PlaceHolder Actual : " + act);

		System.out.println("SearchBox PlaceHolder Expected : " + exp);

		Thread.sleep(3000);

	}

	@Test(priority = 82)
	public void TestDashBoardSearchDropDownClick() throws InterruptedException {

		dashboard.ValidateDashBoardSearchDropDownClick();

		Thread.sleep(3000);

	}

	@Test(priority = 83)
	public void TestCatalog_ProductsPageClick() throws InterruptedException {

		dashboard.ValidateCatalog_ProductsPageClick();

		Thread.sleep(3000);

		System.out.println("-------------------------------------");

	}

	@Test(priority = 84)
	public void TestCatalog_CategoriesPageClick() throws InterruptedException {

		dashboard.ValidateCatalog_CategoriesPageClick();

		Thread.sleep(3000);

		System.out.println("-------------------------------------");

	}

	@Test(priority = 85)
	public void TestCatalog_MonitoringPageClick() throws InterruptedException {

		dashboard.ValidateCatalog_MonitoringPageClick();

		Thread.sleep(3000);

		System.out.println("-------------------------------------");

	}

	@Test(priority = 86)
	public void TestCatalog_ProductAttributesPageClick() throws InterruptedException {

		dashboard.ValidateCatalog_ProductAttributesPageClick();

		Thread.sleep(3000);

		System.out.println("-------------------------------------");

	}

	@Test(priority = 87)
	public void TestCatalog_ProductFeaturesPageClick() throws InterruptedException {

		dashboard.ValidateCatalog_ProductFeaturesPageClick();

		Thread.sleep(3000);

		System.out.println("-------------------------------------");

	}
	
	@Test(priority = 88)
	public void TestCatalog_ManufacturersPageClick() throws InterruptedException {

		dashboard.ValidateCatalog_ManufacturersPageClick();

		Thread.sleep(3000);

		System.out.println("-------------------------------------");

	}
	
	@Test(priority = 89)
	public void TestCatalog_SuppliersPageClick() throws InterruptedException {

		dashboard.ValidateCatalog_SuppliersPageClick();

		Thread.sleep(3000);

		System.out.println("-------------------------------------");

	}
	
	@Test(priority = 90)
	public void TestCatalog_TagsPageClick() throws InterruptedException {

		dashboard.ValidateCatalog_TagsPageClick();

		Thread.sleep(3000);

		System.out.println("-------------------------------------");

	}
	
	@Test(priority = 91)
	public void TestCatalog_AttachmentsPageClick() throws InterruptedException {

		dashboard.ValidateCatalog_AttachmentsPageClick();

		Thread.sleep(3000);

		System.out.println("-------------------------------------");

	}

	@AfterMethod
	public void CloseSetUp() {

		driver.quit();

		System.out.println("=========Quit========");
	}

}
