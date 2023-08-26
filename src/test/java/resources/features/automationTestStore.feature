#Author: Raghav

Feature: Automation Test Store E2E Flows Validation

  @smoke
  Scenario: Automation Test Store New User Registration
    Given user on Automation Test Store Homepage
    When User click on Login or register link
    And Click on Continue button for I AM A NEW CUSTOMER.
    And Fill the all the fields with required data
    And Click on radio button with NO 
    And Select the checkbox for Privacy Policy
    Then Click on Continue button
    And Verify YOUR ACCOUNT HAS BEEN CREATED message displayed.

  @smoke
  Scenario Outline: Login to Automation Test Store with created User ID
    Given user on Automation Test Store Homepage
    When User click on Login or register link
    And User Enter the <username> and <password>
    And User Clicks on Login button
    Then Verify user looged in successfully

    Examples: 
      | username  			|     password 		 |
      | tester09996 		|     tester1234	 |
			| tester09999 		|     tester1234	 |
	
	 @regression
  Scenario: Add items to Cart and Checkout
    Given user on Automation Test Store Homepage
    When User click on Login or register link
    And User Enter the Username and Password
    And User Clicks on Login button
    Then Click on Specials link
    And Add copule of items into cart
    And Go to Cart and Confirm the order success
    
	