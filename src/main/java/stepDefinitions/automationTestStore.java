package stepDefinitions;

import java.io.IOException;

import cucumber.api.PendingException;
import cucumber.api.java.en.*;
import pageObjects.automationTestStoreRegistrationPage;
import pageObjects.automationTestStore_AddItemsToCartAndCheckOutPage;

public class automationTestStore extends automationTestStoreRegistrationPage{

	
	public automationTestStore() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	//Scenario 1 - Automation Test Store New User Registration
	@Given("^user on Automation Test Store Homepage$")
	public void user_on_Automation_Test_Store_Homepage() throws Throwable {
		automationTestStoreRegistrationPage.homePage();
	  
	}

	@When("^User click on Login or register link$")
	public void user_click_on_Login_or_register_link() throws Throwable {
	  	automationTestStoreRegistrationPage.clickOnLoginOrRegisterLink();
	  	
	}

	@And("^Click on Continue button for I AM A NEW CUSTOMER\\.$")
	public void click_on_Continue_button_for_I_AM_A_NEW_CUSTOMER() throws Throwable {
		automationTestStoreRegistrationPage.clickOnContinueButton();
	}

	@And("^Fill the all the fields with required data$")
	public void fill_the_all_the_fields_with_required_data() throws Throwable {
		//personal details
		automationTestStoreRegistrationPage.enterFirstName("Raghav");
		automationTestStoreRegistrationPage.enterLastName("Tester");
		automationTestStoreRegistrationPage.enterEmailId("tester09991@gmail.com");
		automationTestStoreRegistrationPage.enterTelephoneNo("+919000112345");
		automationTestStoreRegistrationPage.enterFaxNo("+919000112345");
		
		//Address details
		automationTestStoreRegistrationPage.enterCompanyName("QATester");
		automationTestStoreRegistrationPage.enterAddress1("10, tester1234, Testing");
		automationTestStoreRegistrationPage.enterCompanyName("20, tester1234, Testing");
		automationTestStoreRegistrationPage.enterCityName("Bengaluru");
		automationTestStoreRegistrationPage.selectCountry();
		automationTestStoreRegistrationPage.selectRegionOrState();
		automationTestStoreRegistrationPage.enterPostCode("Bengaluru");
		
		//Login details
		automationTestStoreRegistrationPage.enterLoginName("tester09991");
		automationTestStoreRegistrationPage.enterPassword("tester123456");
		automationTestStoreRegistrationPage.enterPasswordConfirm("tester123456");
		
		
	}

	@And("^Click on radio button with NO$")
	public void click_on_radio_button_with_NO() throws Throwable {
		automationTestStoreRegistrationPage.selectRadioButton();
	}

	@And("^Select the checkbox for Privacy Policy$")
	public void select_the_checkbox_for_Privacy_Policy() throws Throwable {
		automationTestStoreRegistrationPage.selectCheckBox();
	}

	@Then("^Click on Continue button$")
	public void click_on_Continue_button() throws Throwable {
		automationTestStoreRegistrationPage.clickOnContinueButtonInForm();
	}

	@And("^Verify YOUR ACCOUNT HAS BEEN CREATED message displayed\\.$")
	public void verify_YOUR_ACCOUNT_HAS_BEEN_CREATED_message_displayed() throws Throwable {
		automationTestStoreRegistrationPage.confirmContactUsFormSubmissionWasSuccessful();
	}


	
	
	//Scenario 2 - Login to Automation Test Store with created User ID
	
	@And("^User Enter the username \"(.*)\" and password \"(.*)\" $")
	public void uuser_Enter_the_username_and_password(String username, String password) throws Throwable {
		automationTestStoreRegistrationPage.enterLoginUsername(username);
		automationTestStoreRegistrationPage.enterLoginPassword(password);
	}

	@And("^User Clicks on Login button$")
	public void user_Clicks_Login_button() throws Throwable {

		automationTestStoreRegistrationPage.clickOnLoginButton();
	}

	@Then("^Verify user looged in successfully$")
	public void verify_user_looged_in_successfully() throws Throwable {
		automationTestStoreRegistrationPage.LoggedInWasSuccessful();
	}


	
	//Scenario 3 - Add items to Cart and checkout
	
	@And("^User Enter the Username and Password$")
	public void user_Enter_the_Username_and_Password() throws Throwable {
		automationTestStoreRegistrationPage.enterLoginUsername("tester09996");
		automationTestStoreRegistrationPage.enterLoginPassword("tester1234");
	}

	@Then("^Click on Specials link$")
	public void click_on_Specials_link() throws Throwable {
		automationTestStore_AddItemsToCartAndCheckOutPage.clickOnSpecialLink();
	}

	@Then("^Add copule of items into cart$")
	public void add_copule_of_items_into_cart() throws Throwable {
		automationTestStore_AddItemsToCartAndCheckOutPage.clickOnItem1();
		automationTestStore_AddItemsToCartAndCheckOutPage.clickOnItem2();
	}

	@Then("^Go to Cart and Confirm the order success$")
	public void go_to_Cart_and_Confirm_the_order_success() throws Throwable {
		automationTestStore_AddItemsToCartAndCheckOutPage.clickOnCheckoutLink();
		automationTestStore_AddItemsToCartAndCheckOutPage.clickOnConfirmOrderButton();
	}

	
}
