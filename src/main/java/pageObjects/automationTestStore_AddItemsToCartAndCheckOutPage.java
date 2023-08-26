package pageObjects;

import java.io.IOException;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;


public class automationTestStore_AddItemsToCartAndCheckOutPage extends BasePage{
	
	public automationTestStore_AddItemsToCartAndCheckOutPage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	//Add Items To Cart And Check Out pages
	public @FindBy(xpath = "//div[contains(@class,'block_3')]//li[1]") WebElement specialsLink;
	public @FindBy(css = "//body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[3]/a[1]/i[1]") WebElement linkForItem1;
	public @FindBy(xpath = "//div[4]//div[2]//div[3]//a[1]//i[1]") WebElement linkForItem2;
	
	public @FindBy(xpath = "//div[@class='block_3']//li[4]") WebElement chekoutLink;
	public @FindBy(xpath = "//button[@id='checkout_btn']") WebElement confirmOrder;
	
	//public @FindBy(xpath = "//span[@class='maintext']") WebElement orderSuccessMessage;
	
	

	

	public automationTestStore_AddItemsToCartAndCheckOutPage clickOnSpecialLink() throws Exception {
		waitAndClickElement(specialsLink);
		return new automationTestStore_AddItemsToCartAndCheckOutPage();
	}
	
	public automationTestStore_AddItemsToCartAndCheckOutPage clickOnItem1() throws Exception {
		waitAndClickElement(linkForItem1);
		return new automationTestStore_AddItemsToCartAndCheckOutPage();
	}
	
	public automationTestStore_AddItemsToCartAndCheckOutPage clickOnItem2() throws Exception {
		waitAndClickElement(linkForItem2);
		return new automationTestStore_AddItemsToCartAndCheckOutPage();
	}
	
	public automationTestStore_AddItemsToCartAndCheckOutPage clickOnCheckoutLink() throws Exception {
		waitAndClickElement(chekoutLink);
		return new automationTestStore_AddItemsToCartAndCheckOutPage();
	}
	
	public automationTestStore_AddItemsToCartAndCheckOutPage clickOnConfirmOrderButton() throws Exception {
		waitAndClickElement(confirmOrder);
		return new automationTestStore_AddItemsToCartAndCheckOutPage();
	}
	
	public automationTestStore_AddItemsToCartAndCheckOutPage OrderSuccessfulMessage() throws Exception {
		WebElement orderSuccessMessage = getDriver().findElement(By.xpath("/span[@class='maintext']"));
		WaitUntilWebElementIsVisible(orderSuccessMessage);
		Assert.assertEquals(" Your Order Has Been Processed!", orderSuccessMessage.getText());
		return new automationTestStore_AddItemsToCartAndCheckOutPage();
	}
	
	
	
}
