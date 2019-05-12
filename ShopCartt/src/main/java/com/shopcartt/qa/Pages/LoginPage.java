package com.shopcartt.qa.Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.shopcartt.qa.Base.TestBase;

public class LoginPage extends TestBase {

	// Page Factory
	@FindBy(xpath = "//title")
	WebElement Title;

	@FindBy(xpath = "//img[@id='logo']")
	WebElement PageHeading;

	@FindBy(xpath = "//div[@class='text-center']")
	WebElement Version;

	@FindBy(xpath = "//div[@id='shop-img']")
	WebElement ShopCarttImg;

	@FindBy(xpath = "//div//h4[@id='shop_name']")
	WebElement ShopCarttName;

	@FindBy(xpath = "//input[@id='email']")
	WebElement EmailId;

	@FindBy(xpath = "//span[contains(@for,'email')]")
	WebElement EmailIdErrormsg;

	@FindBy(xpath = "//span[contains(@for,'passwd')]")
	WebElement PasswordErrormsg;

	@FindBy(xpath = "//input[@id='passwd']")
	WebElement Password;

	@FindBy(xpath = "//div[@id='error']//ol//li")
	WebElement FourdigitPasswordError;

	@FindBy(xpath = "//div[@id='error']//li")
	WebElement AlertWindowEmail;

	@FindBy(xpath = "//div[@id='error']")
	WebElement AlertWindowPassword;

	@FindBy(xpath = "//button[@class='btn btn-primary btn-lg btn-block ladda-button']")
	WebElement LoginButton;

	@FindBy(xpath = "//span[contains(text(),'Log in')]")
	WebElement LoginButtonText;

	@FindBy(xpath = "//input[@type='checkbox']")
	WebElement CheckBox;

	@FindBy(xpath = "//label[@for='stay_logged_in']")
	WebElement StayLoggedIn;

	@FindBy(xpath = "//a[@class='show-forgot-password pull-right']")
	WebElement forgetPassword;

	@FindBy(xpath = "//div[@id='login-footer']//p[1]//a")
	WebElement CopyRight;

	@FindBy(xpath = "//i[@class='icon-twitter']")
	WebElement twitter;

	@FindBy(xpath = "//i[@class='icon-facebook']")
	WebElement facebook;

	@FindBy(xpath = "//i[@class='icon-github']")
	WebElement github;
	
	@FindBy(xpath = "//i[@class='icon-google-plus']")
	WebElement googlePlus;

	public LoginPage() {

		PageFactory.initElements(driver, this);
	}

	public String ValidateShopCarttUrl() {

		return driver.getCurrentUrl();
	}

	public String ValidateShopCarttTitle() {

		return driver.getTitle();
	}

	public boolean ValidateShopcarttPageHeading() {

		return PageHeading.isDisplayed();

	}

	public boolean ValidateShopcarttVersion() {

		return Version.isDisplayed();

	}

	public boolean ValidateShopcarttImg() {

		return ShopCarttImg.isDisplayed();

	}

	public String ValidateShopCarttName() {

		return ShopCarttName.getText();

	}

	public String ValidateShopcarttEmailPlaceHolder() {

		return EmailId.getAttribute("placeholder");
	}

	public String ValidateShopcarttPasswordPlaceHolder() {

		return Password.getAttribute("placeholder");
	}

	public void ValidateBlankLogin(String id, String pass) {

		EmailId.clear();
		EmailId.sendKeys(id);

		Password.clear();
		Password.sendKeys(pass);

		LoginButton.click();

		String Emailmsg = EmailIdErrormsg.getText();
		System.out.println("Email : " + Emailmsg);

		String Passwordmsg = PasswordErrormsg.getText();
		System.out.println("Password : " + Passwordmsg);

	}

	public void ValidateBlankEmailCorrectPass(String id, String pass) {

		EmailId.clear();
		EmailId.sendKeys(id);

		Password.clear();
		Password.sendKeys(pass);

		LoginButton.click();

		String Emailmsg = EmailIdErrormsg.getText();
		System.out.println("Email : " + Emailmsg);
	}

	public void ValidateCorrectEmailBlankPassword(String id, String pass) {

		EmailId.clear();
		EmailId.sendKeys(id);

		Password.clear();
		Password.sendKeys(pass);

		LoginButton.click();

		String Passwordmsg = PasswordErrormsg.getText();
		System.out.println("Password : " + Passwordmsg);

	}

	public void ValidateInvalidEmailPassword(String id, String pass) {
		// TODO Auto-generated method stub

		EmailId.clear();
		EmailId.sendKeys(id);

		Password.clear();
		Password.sendKeys(pass);

		LoginButton.click();

		String Emailmsg = EmailIdErrormsg.getText();
		System.out.println("Email : " + Emailmsg);

	}

	public void ValidateInvalidEmailCorrectPassword(String id, String pass) {

		EmailId.clear();
		EmailId.sendKeys(id);

		Password.clear();
		Password.sendKeys(pass);

		LoginButton.click();

		String Emailmsg = EmailIdErrormsg.getText();
		System.out.println("Email : " + Emailmsg);

	}

	public void ValidateCorrectEmailFormatCorrectPassword(String id, String pass) {

		EmailId.clear();
		EmailId.sendKeys(id);

		Password.clear();
		Password.sendKeys(pass);

		LoginButton.click();

		String EmailAlertMsg = AlertWindowEmail.getText();

		System.out.println("Email Alert : " + EmailAlertMsg);

	}

	public void ValidateCorrectEmailInvalidPassword(String id, String pass) {

		EmailId.clear();
		EmailId.sendKeys(id);

		Password.clear();
		Password.sendKeys(pass);

		LoginButton.click();

		String EmailAlertMsg = AlertWindowEmail.getText();

		System.out.println("Email Alert : " + EmailAlertMsg);
	}

	public DashBoard ValidateCorrectLogin(String id, String pass) {

		EmailId.clear();
		EmailId.sendKeys(id);

		Password.clear();
		Password.sendKeys(pass);

		LoginButton.click();

		return new DashBoard();
	}

	public void ValidateInvalidEmailBlankPassword(String id, String pass) {

		EmailId.clear();
		EmailId.sendKeys(id);

		Password.clear();
		Password.sendKeys(pass);

		LoginButton.click();

		String Emailmsg = EmailIdErrormsg.getText();
		System.out.println("Email : " + Emailmsg);

		String Passwordmsg = PasswordErrormsg.getText();
		System.out.println("Password : " + Passwordmsg);

	}

	public void ValidateBlankEmailInvalidPassword(String id, String pass) {

		EmailId.clear();
		EmailId.sendKeys(id);

		Password.clear();
		Password.sendKeys(pass);

		LoginButton.click();

		String Emailmsg = EmailIdErrormsg.getText();
		System.out.println("Email : " + Emailmsg);

	}

	public void ValidateCorrectEmailFormatBlankPassword(String id, String pass) {

		EmailId.clear();
		EmailId.sendKeys(id);

		Password.clear();
		Password.sendKeys(pass);

		LoginButton.click();

		String Passwordmsg = PasswordErrormsg.getText();
		System.out.println("Password : " + Passwordmsg);

	}

	public void ValidateCorrectEmail_4DigitPassword(String id, String pass) {

		EmailId.clear();
		EmailId.sendKeys(id);

		Password.clear();
		Password.sendKeys(pass);

		LoginButton.click();

		String msg = FourdigitPasswordError.getText();

		System.out.println("Password : " + msg);

	}

	public void ValidateCorrectEmail_PasswordMorethan4(String id, String pass) {

		EmailId.clear();
		EmailId.sendKeys(id);

		Password.clear();
		Password.sendKeys(pass);

		LoginButton.click();

		String EmailAlertMsg = AlertWindowEmail.getText();

		System.out.println("Email Alert : " + EmailAlertMsg);
	}

	public String ValidateLogInButtonText() {

		return LoginButtonText.getText();

	}

	public String ValidateLoginInButtonColor() {

		System.out.println("befor mouse over button color is : " + LoginButton.getCssValue("background-color"));

		Actions act = new Actions(driver);

		act.moveToElement(LoginButton).build().perform();

		System.out.println("after mouse over button color is : " + LoginButton.getCssValue("color"));

		return LoginButton.getCssValue("background-color");
	}

	public boolean ValidateNotCheckBoxSelected() {

		return CheckBox.isSelected();

	}

	public void ValidateCheckBoxSelected() {

		CheckBox.click();

	}

	public boolean ValidateCheckBoxDisplayed() {

		return CheckBox.isDisplayed();

	}

	public boolean ValidateStayLoggedInDisplayed() {

		return StayLoggedIn.isDisplayed();

	}

	public String ValidateStayLoggedInText() {

		return StayLoggedIn.getText();
	}

	public String ValidateShopcarttVersionText() {

		return Version.getText();
	}

	public String ValidateforgetPasswordText() {

		return forgetPassword.getText();
	}

	public boolean ValidateforgetPasswordDisplayed() {

		return forgetPassword.isDisplayed();
	}

	public ForgetPasswordPage ValidateforgetPasswordClick() {

		forgetPassword.click();

		return new ForgetPasswordPage();
	}

	public boolean ValidateCopyRightDisplayed() {

		return CopyRight.isDisplayed();
	}

	public String ValidateCopyRightText() {

		return CopyRight.getText();
	}

	public PrestaShopPage ValidateCopyRightClick() {

		CopyRight.click();

		return new PrestaShopPage();

	}

	public void ValidatetwitterColor() {

		System.out.println("befor mouse over button color is : " + twitter.getCssValue("color"));

		Actions act = new Actions(driver);

		act.moveToElement(twitter).build().perform();

		System.out.println("after mouse over button color is : " + twitter.getCssValue("color"));

	}

	public boolean ValidatetwitterDisplayed() {

		return twitter.isDisplayed();

	}

	public void ValidatetwitterClick() {

		twitter.click();
	}

	public boolean ValidatefacebookDisplayed() {

		return facebook.isDisplayed();
	}

	public void ValidatefacebookColor() {

		System.out.println("befor mouse over button color is : " + facebook.getCssValue("color"));

		Actions act = new Actions(driver);

		act.moveToElement(facebook).build().perform();

		System.out.println("after mouse over button color is : " + facebook.getCssValue("color"));

	}

	public void ValidatefacebookClick() {

		facebook.click();
	}

	public void ValidategithubColor() {
		
		System.out.println("befor mouse over button color is : " + github.getCssValue("color"));

		Actions act = new Actions(driver);

		act.moveToElement(github).build().perform();

		System.out.println("after mouse over button color is : " + github.getCssValue("color"));		
	}

	public boolean ValidategithubDisplayed() {
		
		return github.isDisplayed();
	}

	public void ValidategithubClick() {
		
		github.click();
		
	}

	public void ValidategooglePlusColor() {
		
		System.out.println("befor mouse over button color is : " + googlePlus.getCssValue("color"));

		Actions act = new Actions(driver);

		act.moveToElement(googlePlus).build().perform();

		System.out.println("after mouse over button color is : " + googlePlus.getCssValue("color"));	
		
	}

	public boolean ValidategooglePlusDisplayed() {
		
		return googlePlus.isDisplayed();
	}

	public void ValidategooglePlusClick() {
		
		googlePlus.click();
		
	}

}
