package pageObjects;

import java.io.IOException;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;


public class automationTestStoreRegistrationPage extends BasePage{
	
	public automationTestStoreRegistrationPage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	//Registration page
	public @FindBy(css = "#Login") WebElement loginOrRegisterLink;
	public @FindBy(css = "button[title='Continue']") WebElement continueButton;
	public @FindBy(xpath = "//input[@id='AccountFrm_firstname']") WebElement textField_firstName;
	public @FindBy(xpath = "//input[@id='AccountFrm_lastname']") WebElement textField_lastName;
	public @FindBy(xpath = "//input[@id='AccountFrm_email']") WebElement textField_emailId;
	public @FindBy(xpath = "//input[@id='AccountFrm_telephone']") WebElement textField_telephoneNo;
	public @FindBy(xpath = "//input[@id='AccountFrm_fax']") WebElement textField_faxNo;
	public @FindBy(xpath = "//input[@id='AccountFrm_company']") WebElement textField_companyName;
	public @FindBy(xpath = "//input[@id='AccountFrm_address_1']") WebElement textField_address1;
	public @FindBy(xpath = "//input[@id='AccountFrm_address_2']") WebElement textField_address2;
	public @FindBy(xpath = "//input[@id='AccountFrm_city']") WebElement textField_cityName;
	
	//public @FindBy(xpath = "//select[@id='AccountFrm_zone_id']") WebElement dropDown_RegionOrState;

	public @FindBy(xpath = "//input[@id='AccountFrm_postcode']") WebElement textField_postCode;
	
	//public @FindBy(xpath = "//select[@id='AccountFrm_country_id']") WebElement dropDown_Country;
	
	public @FindBy(xpath = "//input[@id='AccountFrm_loginname']") WebElement textField_loginName;
	public @FindBy(xpath = "//input[@id='AccountFrm_password']") WebElement textField_password;
	public @FindBy(xpath = "//input[@id='AccountFrm_confirm']") WebElement textField_passwordConfirm;
	
	public @FindBy(xpath = "//input[@id='AccountFrm_newsletter0']") WebElement radioButton_subscribe;
	public @FindBy(xpath = "//input[@id='AccountFrm_agree']") WebElement checkBox_privacyPolicy ;
	

	public @FindBy(xpath = "button[title='Continue']") WebElement continueButtonInForm ;
	
	
	
	///Login page
	public @FindBy(xpath = "//input[@id='loginFrm_loginname']") WebElement textField_loginUsername;
	public @FindBy(xpath = "//input[@id='loginFrm_password']") WebElement textField_loginPassword;
	public @FindBy(xpath = "//button[normalize-space()='Login']") WebElement login_Button;
	
	
	
	//Registration page methods
	public automationTestStoreRegistrationPage homePage() throws IOException {
		//getDriver().get("https://google.co.in/");
		getDriver().get("https://automationteststore.com/");
		return homePage();
	}
	
	public automationTestStoreRegistrationPage clickOnLoginOrRegisterLink() throws Exception {
		waitAndClickElement(loginOrRegisterLink);
		return new automationTestStoreRegistrationPage();
	}
	
	public automationTestStoreRegistrationPage clickOnContinueButton() throws Exception {
		waitAndClickElement(continueButton);;
		return new automationTestStoreRegistrationPage();
	}
	
	public automationTestStoreRegistrationPage enterFirstName(String firstName) throws Exception {
		sendKeysToWebElement(textField_firstName, firstName);
		return new automationTestStoreRegistrationPage();
	}
	
	public automationTestStoreRegistrationPage enterLastName(String lastName) throws Exception {
		sendKeysToWebElement(textField_lastName, lastName);
		return new automationTestStoreRegistrationPage();
	}
	
	public automationTestStoreRegistrationPage enterEmailId(String emailId) throws Exception {
		sendKeysToWebElement(textField_emailId, emailId);
		return new automationTestStoreRegistrationPage();
	}
	
	public automationTestStoreRegistrationPage enterTelephoneNo(String telephoneNo) throws Exception {
		sendKeysToWebElement(textField_telephoneNo, telephoneNo);
		return new automationTestStoreRegistrationPage();
	}
	
	public automationTestStoreRegistrationPage enterFaxNo(String faxNo) throws Exception {
		sendKeysToWebElement(textField_faxNo, faxNo);
		return new automationTestStoreRegistrationPage();
	}
	
	public automationTestStoreRegistrationPage enterCompanyName(String companyName) throws Exception {
		sendKeysToWebElement(textField_companyName, companyName);
		return new automationTestStoreRegistrationPage();
	}
	
	public automationTestStoreRegistrationPage enterAddress1(String address1) throws Exception {
		sendKeysToWebElement(textField_address1, address1);
		return new automationTestStoreRegistrationPage();
	}
	
	public automationTestStoreRegistrationPage enterAddress2(String address2) throws Exception {
		sendKeysToWebElement(textField_address2, address2);
		return new automationTestStoreRegistrationPage();
	}
	
	public automationTestStoreRegistrationPage enterCityName(String cityName) throws Exception {
		sendKeysToWebElement(textField_cityName, cityName);
		return new automationTestStoreRegistrationPage();
	}
	public automationTestStoreRegistrationPage selectCountry() throws Exception {
		Select drpCountry = new Select(driver.findElement(By.xpath("//select[@id='AccountFrm_country_id']")));
		drpCountry.selectByVisibleText("India");
		return new automationTestStoreRegistrationPage();
	}
	
	public automationTestStoreRegistrationPage selectRegionOrState() throws Exception {
		Select drpCountry = new Select(driver.findElement(By.xpath("//select[@id='AccountFrm_country_id']")));
		drpCountry.selectByVisibleText("India");
		return new automationTestStoreRegistrationPage();
	}
	
	
	public automationTestStoreRegistrationPage enterPostCode(String postCode) throws Exception {
		sendKeysToWebElement(textField_postCode, postCode);
		return new automationTestStoreRegistrationPage();
	}
	
	public automationTestStoreRegistrationPage enterLoginName(String loginName) throws Exception {
		sendKeysToWebElement(textField_loginName, loginName);
		return new automationTestStoreRegistrationPage();
	}
	
	public automationTestStoreRegistrationPage enterPassword(String password) throws Exception {
		sendKeysToWebElement(textField_password, password);
		return new automationTestStoreRegistrationPage();
	}
	
	public automationTestStoreRegistrationPage enterPasswordConfirm(String passwordConfirm) throws Exception {
		sendKeysToWebElement(textField_passwordConfirm, passwordConfirm);
		return new automationTestStoreRegistrationPage();
	}
	
	
	public automationTestStoreRegistrationPage selectRadioButton() throws Exception {
		waitAndClickElement(radioButton_subscribe);
		return new automationTestStoreRegistrationPage();
	}
	
	public automationTestStoreRegistrationPage selectCheckBox() throws Exception {
		waitAndClickElement(checkBox_privacyPolicy);
		return new automationTestStoreRegistrationPage();
	}
	
	public automationTestStoreRegistrationPage clickOnContinue() throws Exception {
		waitAndClickElement(continueButtonInForm);
		return new automationTestStoreRegistrationPage();
	}
	
	
	
	
	
	/*/ public automationTestStoreRegistrationPage enterLasttName(DataTable dataTable, int row, int column) throws Exception {
		List<List<String>> data = dataTable.raw();
		sendKeysToWebElement(textfield_LastName, data.get(row).get(column));
		return new automationTestStoreRegistrationPage();
	}
	
	public ContactUs_Page enterEmailAddress(String emailAddress) throws Exception {
		sendKeysToWebElement(textfield_EmailAddress, emailAddress);
		return new ContactUs_Page();
	}
	
	public ContactUs_Page enterComments(DataTable dataTable, int row, int column) throws Exception {
		List<List<String>> data = dataTable.raw();
		sendKeysToWebElement(textfield_Message, data.get(row).get(column));
		return new ContactUs_Page();
	} /*/
	
	
	
	public automationTestStoreRegistrationPage clickOnContinueButtonInForm() throws Exception {
		//Assert.fail();
		waitAndClickElement(continueButtonInForm);
		return new automationTestStoreRegistrationPage();
	}
	
	public automationTestStoreRegistrationPage confirmContactUsFormSubmissionWasSuccessful() throws Exception {
		WebElement registrationSuccess = getDriver().findElement(By.xpath("//span[@class='maintext']"));
		WaitUntilWebElementIsVisible(registrationSuccess);
		Assert.assertEquals(" Your Account Has Been Created!", registrationSuccess.getText());
		return new automationTestStoreRegistrationPage();
	}

	
	
	//Login page methods
	
	public automationTestStoreRegistrationPage enterLoginUsername(String loginUsername) throws Exception {
		sendKeysToWebElement(textField_loginUsername, loginUsername);
		return new automationTestStoreRegistrationPage();
	}
	
	public automationTestStoreRegistrationPage enterLoginPassword(String password) throws Exception {
		sendKeysToWebElement(textField_loginPassword, password);
		return new automationTestStoreRegistrationPage();
	}
	
	public automationTestStoreRegistrationPage clickOnLoginButton() throws Exception {
		//Assert.fail();
		waitAndClickElement(login_Button);
		return new automationTestStoreRegistrationPage();
	}
	
	
	public automationTestStoreRegistrationPage LoggedInWasSuccessful() throws Exception {
		WebElement loginSuccess = getDriver().findElement(By.xpath("//div[@class='menu_text']"));
		WaitUntilWebElementIsVisible(loginSuccess);
		Assert.assertEquals("Welcome back test", loginSuccess.getText());
		return new automationTestStoreRegistrationPage();
	}
	
	
	
}
