package tek.capstone.dragons.steps;

import io.cucumber.java.en.*;

import java.util.List;

//import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import tek.capstone.dragons.pages.POMFactory;
import tek.capstone.dragons.utilities.CommonUtility;

public class RetailOrderSteps extends CommonUtility {

	POMFactory factory = new POMFactory();

	@When("User change the category to {string}")
	public void userChangeTheCategoryTo(String smartHome) {
		selectByVisibleText(factory.retailorderpage().allDepartmentsDropdown, smartHome);
		logger.info(smartHome + "option is selected successfully");

	}
	@When("User search for an item {string}")
	public void userSearchForAnItem(String kasaoutdoorsmartplug) {
		sendText(factory.retailorderpage().searchInputField, kasaoutdoorsmartplug);
		logger.info(kasaoutdoorsmartplug + "item name was entered successfully");
	}
	@When("User click on Search icon")
	public void userClickOnSearchIcon() {
		click(factory.retailorderpage().searchBttn);
		logger.info("search button was clicked successfully");
	}

	@When("User click on item")
	public void userClickOnItem() throws InterruptedException {
		Thread.sleep(2000);
		click(factory.retailorderpage().kasaOutdoorSmartPlugItem);
		logger.info("item was clicked successfully");

	}
	@When("User select quantity {string}")
	public void userSelectQuantity(String itemQty) {
		selectByVisibleText(factory.retailorderpage().producQtyDropdown, itemQty);
		logger.info(itemQty + "was selected successfully");

	}
	@When("User click add to Cart button")
	public void userClickAddToCartButton() {
		click(factory.retailorderpage().addToCardBttn);
		logger.info("add to cart button was clicked successfully");

	}
	@Then("the cart icon quantity should change to {string}")
	public void theCartIconQuantityShouldChangeTo(String itemQtyInTheCart) {
		Assert.assertEquals(itemQtyInTheCart, factory.retailorderpage().cartQtyField.getText());
		logger.info(itemQtyInTheCart + "quantity was displayed in the cart");

	}
	//new
	@When("User search for an item  Apex Legends {string}")
	public void userSearchForAnItemApexLegends(String apexLegends) {
		sendText(factory.retailorderpage().searchInputField, apexLegends);
		logger.info(apexLegends + "entered successfully");

	}
	
	@When("user select  Apex Legends quantity {string}")
	public void userSelectApexLegendsQuantity(String itemQty) {
		selectByVisibleText(factory.retailorderpage().producQtyDropdown, itemQty);
		logger.info(itemQty + " quantity was selected successfully");
		
	}
	@Then("The cart icon quantity Apex Legends should change to {string}")
	public void theCartIconQuantityApexLegendsShouldChangeTo(String expectedQty) {
		Assert.assertEquals(expectedQty, factory.retailorderpage().cartQtyField.getText());
		logger.info(expectedQty + "quantity was validated successfuly");
		
	}
	@Then("User click on cart option")
	public void userClickOnCartOption() {
		click(factory.retailorderpage().cartBttn);
		logger.info("cart button was clicked successfully");

	}
	@Then("User click on proceed to Checkout button")
	public void userClickOnProceedToCheckoutButton() {
		click(factory.retailorderpage().proccedToCheckOutBtn);
		logger.info("procced to checkout button was clicked successfully");

	}
	@Then("User click on place Your Order")
	public void userClickOnPlaceYourOrder() {
		click(factory.retailorderpage().placeOrderBttn);
		logger.info("Place your order button was clicked successfully");

	}
	@Then("A message should be displayed {string}")
	public void aMessageShouldBeDisplayed(String orderPlaced) {
		Assert.assertTrue(isElementDisplayed(factory.retailorderpage().orderPlaceSuccessllyMessage));
		
	}
	@When("User click on item Apex Legends")
	public void userClickOnItemApexLegends() {
		click(factory.retailorderpage().apexLegendsItem);
		logger.info("item was clicked successfully");
		
	}
	@When("User click on Orders section")
	public void userClickOnOrdersSection() {
		click(factory.retailorderpage().orderLink);
		logger.info("Order link clicked successfully");
		
	}
	@When("User click on first order in list")
	public void userClickOnFirstOrderInList() {
		List<WebElement> listOfOrders = factory.retailorderpage().listOfOrder;
		for(int i = 0; i < listOfOrders.size(); i++) {
			if(factory.retailorderpage().orderDetailsDisplay.getText().equalsIgnoreCase("Hide Details")) {
				if(factory.retailorderpage().cancelBttn.isDisplayed()) {
					break;
				}
			}else if(factory.retailorderpage().orderDetailsDisplay.getText().equalsIgnoreCase("Show Details")) {
					click(factory.retailorderpage().orderDetailsDisplay);
					if(factory.retailorderpage().cancelBttn.isDisplayed()) {
						break;
					}
		      }
		}
	}
	//CancelOrder 
	@When("User click on Cancel The Order button")
	public void userClickOnCancelTheOrderButton() {
		click(factory.retailorderpage().cancelBttn);
		logger.info("Cancel the order button was clicked Successfully");

	}
	@When("User select the cancelation Reason {string}")
	public void userSelectTheCancelationReason(String cancellationReason) {
		selectByVisibleText(factory.retailorderpage().cancellationReason, cancellationReason);
		logger.info(cancellationReason + " reason was selected successfully");
	}
	@When("User click on Cancel Order button")
	public void userClickOnCancelOrderButton() {
		click(factory.retailorderpage().cancelSubmitBttn);
		logger.info("Cancel submit button was clicked successfully");
	}
	@Then("a cancelation message should be displayed {string}")
	public void aCancelationMessageShouldBeDisplayed(String cancellationMssg) {
	    Assert.assertEquals(cancellationMssg, factory.retailorderpage().yourOrderCancelledMssg);
	    logger.info(cancellationMssg + "was verified successfully");
	}
		
	
	@When("User click on Return Items button")
	public void userClickOnReturnItemsButton() {
		click(factory.retailorderpage().returnItemBttn);
		logger.info("return button was clicked successfully");
    
	}
	@When("User select the Return {string}")
	public void userSelectTheReturn(String Itemdamaged) {
		selectByVisibleText(factory.retailorderpage().reasonInputBttn, Itemdamaged);
		logger.info(Itemdamaged + "was selected");
    
	}
	@When("User select the drop off service {string}")
	public void userSelectTheDropOffService(String FedEx) {
		selectByVisibleText(factory.retailorderpage().dropOffInputBttn, FedEx);
		logger.info(FedEx + " service was selected");
    
	}
	@When("User click on Return Order button")
	public void userClickOnReturnOrderButton() {
		click(factory.retailorderpage().returnOrderSubmitBttn);
		logger.info("return order button was clicked successfully");
    
	}
	@Then("a cancelation message should be displayed Return was successful")
	public void aCancelationMessageShouldBeDisplayedReturnWasSuccessful() {
		Assert.assertTrue(isElementDisplayed(factory.retailorderpage().returnWasSuccessfull));
		logger.info("Return was successfull message displayed");
    
	}
	
	//Review Order Placed 
	@When("User click on Review button")
	public void userClickOnReviewButton() {
		click(factory.retailorderpage().reviewBttn);
		logger.info("Review button was clicked");
		
	}
	@When("User write Review headline {string} and {string}")
	public void userWriteReviewHeadlineAnd(String string, String string1) {
		sendText(factory.retailorderpage().headlineInputText, string);
		sendText(factory.retailorderpage().reviewTextInputText, string1);
		logger.info("User successfully write comment in Review section");


	}
	@When("User click Add your Review button")
	public void userClickAddYourReviewButton() {
		click(factory.retailorderpage().addYourReviewBttn);
		logger.info("Add Your Review button was clicked successfully");


	}
	@Then("a review message should be displayed Your review was added successfully")
	public void aReviewMessageShouldBeDisplayedYourReviewWasAddedSuccessfully() {
		Assert.assertTrue(isElementDisplayed(factory.retailorderpage().yourReviewWasAddedSuccessfully));
		logger.info("Your review was added successfully");


	}

}



	

