package com.Shopcartt.qa.Tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.shopcartt.qa.Base.TestBase;
import com.shopcartt.qa.Pages.DashBoard;
import com.shopcartt.qa.Pages.ForgetPasswordPage;
import com.shopcartt.qa.Pages.LoginPage;
import com.shopcartt.qa.Pages.PrestaShopPage;

public class LoginPageTestCases extends TestBase {

	LoginPage loginPage;
	DashBoard dashBoard;
	ForgetPasswordPage forgetPasswordPage;
	PrestaShopPage prestaShopPage;

	public LoginPageTestCases() {

		super();
	}

	@BeforeMethod
	public void setUp() {

		Intialization();

		loginPage = new LoginPage();
		dashBoard = new DashBoard();
		forgetPasswordPage = new ForgetPasswordPage();
		prestaShopPage = new PrestaShopPage();

	}

	@Test(priority = 1)
	public void TestShopcarttLoginPage() {

		String titleExp = loginPage.ValidateShopCarttTitle();

		String titleAct = "ShopCartt > Administration panel (PrestaShop™)";

		Assert.assertEquals(titleExp, titleAct);

	}

	@Test(priority = 2)
	public void TestShopcarttPageHeading() {

		boolean bool = loginPage.ValidateShopcarttPageHeading();
		
		Assert.assertTrue(bool);
	}

	@Test(priority = 3)
	public void TestShopcarttVersion() {

		boolean bool = loginPage.ValidateShopcarttVersion();
		
		Assert.assertTrue(bool);
	}

	@Test(priority = 4)
	public void TestShopcarttVersionText() {

		String act = loginPage.ValidateShopcarttVersionText();

		String exp = "1.6.1.23";

		Assert.assertEquals(act, exp);

		System.out.println("Actual Version : " + act);

		System.out.println("Expected Version : " + exp);
	}

	@Test(priority = 5)
	public void TestShopcarttImg() {

		boolean bool = loginPage.ValidateShopcarttImg();
		Assert.assertTrue(bool);
	}

	@Test(priority = 6)
	public void TestShopcarttName() {

		String act = loginPage.ValidateShopCarttName();

		String exp = "ShopCartt";

		Assert.assertEquals(act, exp);

		System.out.println("Actual : " + act);

		System.out.println("Expected : " + exp);

		System.out.println("--------------------------------------");

	}

	@Test(priority = 7)
	public void TestEmailPlaceHolder() {

		// Email Placeholder

		String act = loginPage.ValidateShopcarttEmailPlaceHolder();

		String exp = " test@example.com";

		Assert.assertEquals(act, exp);

		System.out.println("Actual : " + act);

		System.out.println("Expected : " + exp);

		System.out.println("--------------------------------------");
	}

	@Test(priority = 8)

	public void TestPasswordPlaceHolder() {

		// Password Placeholder

		String act = loginPage.ValidateShopcarttPasswordPlaceHolder();

		String exp = " Password";

		System.out.println("Actual : " + act);

		System.out.println("Expected : " + exp);

		Assert.assertEquals(act, exp);

		System.out.println("--------------------------------------");
	}

	@Test(priority = 9)
	public void TestBlankLogin() {

		// Blank Email & Password

		loginPage.ValidateBlankLogin(" ", " ");

		System.out.println("--------------------------------------");

	}

	@Test(priority = 10)
	public void TestBlankEmail_CorrectPass() {

		// Blank Email & Correct Password

		loginPage.ValidateBlankEmailCorrectPass(" ", prop.getProperty("password"));

		System.out.println("--------------------------------------");

	}

	@Test(priority = 11)
	public void TestCorrectEmail_BlankPassword() {

		// Correct Email & Blank Password

		loginPage.ValidateCorrectEmailBlankPassword(prop.getProperty("username"), " ");

		System.out.println("--------------------------------------");

	}

	@Test(priority = 12)
	public void TestInvalidEmail_Password() {

		// Invalid Email & Invalid Password

		loginPage.ValidateInvalidEmailPassword("cffhd", "dfghj");

		System.out.println("--------------------------------------");
	}

	@Test(priority = 13)
	public void TestInvalidEmail_CorrectPassword() {

		// Invalid Email & Correct Password

		loginPage.ValidateInvalidEmailCorrectPassword("abcef", prop.getProperty("password"));

		System.out.println("--------------------------------------");
	}

	@Test(priority = 14)
	public void TestCorrectEmailFormat_CorrectPassword() {

		// Correct Format Email & Valid Password

		loginPage.ValidateCorrectEmailFormatCorrectPassword("abc@gmail.com", prop.getProperty("password"));

		System.out.println("--------------------------------------");

	}

	@Test(priority = 15)
	public void TestCorrectEmail_InValidPassword() {

		// Correct Email & Invalid Password

		loginPage.ValidateCorrectEmailInvalidPassword(prop.getProperty("username"), "passwordhgf");

		System.out.println("--------------------------------------");

	}

	@Test(priority = 16)
	public void TestInvalidEmail_BlankPassword() {

		// Invalid Email & Blank Password

		loginPage.ValidateInvalidEmailBlankPassword("sdfghj", " ");

		System.out.println("--------------------------------------");

	}

	@Test(priority = 17)
	public void TestBlankEmail_InvalidPassword() {

		// Blank Email & Invalid Password

		loginPage.ValidateBlankEmailInvalidPassword(" ", "asdfghj");

		System.out.println("--------------------------------------");

	}

	@Test(priority = 18)
	public void TestCorrectEmailFormat_BlankPassword() {

		// Correct Format Email & Blank Password

		loginPage.ValidateCorrectEmailFormatBlankPassword("abc@gmail.com", " ");

		System.out.println("--------------------------------------");

	}

	@Test(priority = 19)
	public void TestCorrectEmail_4DigitPassword() {

		// Correct Format Email & Correct Password

		loginPage.ValidateCorrectEmail_4DigitPassword(prop.getProperty("username"), "bbbb");

		System.out.println("--------------------------------------");

	}

	@Test(priority = 20)
	public void TestCorrectEmail_PasswordMorethan4() {

		// Correct Format Email & Correct Password

		loginPage.ValidateCorrectEmail_PasswordMorethan4(prop.getProperty("username"), "bbbbbbbb");

		System.out.println("--------------------------------------");

	}

	@Test(priority = 21)
	public void TestLogInButtonText() {

		String act = loginPage.ValidateLogInButtonText();

		String exp = "LOG IN";

		Assert.assertEquals(act, exp);

		System.out.println("Login Button Actual : " + act);

		System.out.println("Login Button Expected : " + exp);

		System.out.println("--------------------------------------");

	}

	@Test(priority = 22)
	public void TestLogInButtonColor() {

		loginPage.ValidateLoginInButtonColor();

		System.out.println("--------------------------------------");

	}

	@Test(priority = 23)
	public void TestCheckBoxNotSelected() {

		boolean b = loginPage.ValidateNotCheckBoxSelected();

		System.out.println("Check Box Not Selected : " + b);

		System.out.println("--------------------------------------");

	}

	@Test(priority = 24)
	public void TestCheckBoxSelected() {

		loginPage.ValidateCheckBoxSelected();

		System.out.println("--------------------------------------");

	}

	@Test(priority = 25)
	public void TestCheckStayLoggedInDisplay() {

		boolean b = loginPage.ValidateStayLoggedInDisplayed();

		System.out.println("Stay Logged In Displayed : " + b);

		System.out.println("--------------------------------------");

	}

	@Test(priority = 26)
	public void TestStayLoggedInText() {

		String act = loginPage.ValidateStayLoggedInText();

		String exp = "Stay logged in";

		Assert.assertEquals(act, exp);

		System.out.println("Stay Logged In Actaul : " + act);

		System.out.println("Stay Logged In Expected : " + exp);

		System.out.println("--------------------------------------");

	}

	@Test(priority = 27)
	public void TestCorrectLogin() {

		// Valid Email & Password

		dashBoard = loginPage.ValidateCorrectLogin(prop.getProperty("username"), prop.getProperty("password"));

		System.out.println("--------------------------------------");
	}

	@Test(priority = 28)
	public void TestforgetPasswordText() {

		String act = loginPage.ValidateforgetPasswordText();

		String exp = "I forgot my password";

		Assert.assertEquals(act, exp);

		System.out.println("Forget Password Actual : " + act);

		System.out.println("Forget Password Expected : " + exp);

		System.out.println("--------------------------------------");
	}

	@Test(priority = 29)
	public void TestforgetPasswordDisplayed() {

		boolean b = loginPage.ValidateforgetPasswordDisplayed();

		System.out.println("Forget Password Is Displayed : " + b);

		System.out.println("--------------------------------------");
	}

	@Test(priority = 29)
	public void TestforgetPasswordClick() throws InterruptedException {

		loginPage.ValidateforgetPasswordClick();
		
		Thread.sleep(2000);

		System.out.println("--------------------------------------");
	}

	@Test(priority = 30)
	public void TestCopyRightDisplayed() {

		boolean b = loginPage.ValidateCopyRightDisplayed();

		System.out.println("Copy Right Link is Displayed : " + b);

		System.out.println("--------------------------------------");
	}

	@Test(priority = 31)
	public void TestCopyRightText() {

		String act = loginPage.ValidateCopyRightText();

		String exp = "© PrestaShop™ 2007-2019 - All rights reserved";

		System.out.println("Copy Right Actual : " + act);

		System.out.println("Copy Right Expected : " + exp);

		System.out.println("--------------------------------------");
	}

	@Test(priority = 32)
	public void TestCopyRightClick() {

		prestaShopPage = loginPage.ValidateCopyRightClick();

		System.out.println("--------------------------------------");
	}

	@Test(priority = 33)
	public void TesttwitterColor() {

		loginPage.ValidatetwitterColor();

		System.out.println("--------------------------------------");
	}

	@Test(priority = 34)
	public void TesttwitterDisplayed() {

		boolean b = loginPage.ValidatetwitterDisplayed();

		System.out.println("Twitter Displayed : " + b);

		System.out.println("--------------------------------------");
	}

	@Test(priority = 35)
	public void TesttwitterClick() throws InterruptedException {

		loginPage.ValidatetwitterClick();
		
		Thread.sleep(3000);

		System.out.println("--------------------------------------");
	}

	@Test(priority = 36)
	public void TestfacebookColor() {

		loginPage.ValidatefacebookColor();

		System.out.println("--------------------------------------");
	}

	@Test(priority = 37)
	public void TestfacebookDisplayed() {

		boolean b = loginPage.ValidatefacebookDisplayed();

		System.out.println("Twitter Displayed : " + b);

		System.out.println("--------------------------------------");
	}

	@Test(priority = 38)
	public void TestfacebookClick() throws InterruptedException {

		loginPage.ValidatefacebookClick();
		
		Thread.sleep(2000);

		System.out.println("--------------------------------------");
	}
	
	@Test(priority = 39)
	public void TestgithubColor() {

		loginPage.ValidategithubColor();

		System.out.println("--------------------------------------");
	}

	@Test(priority = 40)
	public void TestgithubDisplayed() {

		boolean b = loginPage.ValidategithubDisplayed();

		System.out.println("Twitter Displayed : " + b);

		System.out.println("--------------------------------------");
	}

	@Test(priority = 41)
	public void TestgithubClick() throws InterruptedException {

		loginPage.ValidategithubClick();
		
		Thread.sleep(2000);

		System.out.println("--------------------------------------");
	}
	
	@Test(priority = 42)
	public void TestgooglePlusColor() {

		loginPage.ValidategooglePlusColor();

		System.out.println("--------------------------------------");
	}

	@Test(priority = 43)
	public void TestgooglePlusDisplayed() {

		boolean b = loginPage.ValidategooglePlusDisplayed();

		System.out.println("Twitter Displayed : " + b);

		System.out.println("--------------------------------------");
	}

	@Test(priority = 44)
	public void TestgooglePlusClick() throws InterruptedException {

		loginPage.ValidategooglePlusClick();
		
		Thread.sleep(2000);

		System.out.println("--------------------------------------");
	}

	@AfterMethod
	public void CloseSetUp() {

		driver.quit();

		System.out.println("*******Closing*********");
	}

}
