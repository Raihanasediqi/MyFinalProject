package tek.sdet.framework.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class RetailAccountSteps extends CommonUtility{
	POMFactory factory = new POMFactory();
	
	
		
		@When("User click on Account option")
		public void userClickOnAccountOption () {
			click(factory.homePage().account);
			logger.info("user successfylly clicked on Account option");
			slowDown();
		}
		
		
		// @updatePassword
		//  Scenario: Verify User can update Profile Information
		@And("User update Name {string} and Phone {string}")
		public void userUpdateNameAndPhone (String name, String phone) {
			
			
	        clearTextUsingSendKeys(factory.accountpage().NameField);
			sendText(factory.accountpage().NameField,name); 
			
			clearTextUsingSendKeys(factory.accountpage().PhoneField);
			sendText(factory.accountpage().PhoneField,phone);
			logger.info("user entered name and phone successfully");
				
		}
		
		@And("User click on Update button")
		public void userClickOnUpdateButton () {
			click(factory.accountpage().Updatebtn);
			logger.info("user clicked on update button");
			slowDown();
		}

		
		@Then("user profile information should be updated")
		public void userProfileInfoprmationShouldBeUpdated() {
			slowDown();
			Assert.assertTrue(isElementDisplayed(factory.accountpage().Message));
			logger.info("user profile updated successfully");
		}
		
		
		
		// @changePass
		//  Scenario: Verify User can Update password
		
		
		@And("User enter below information")
		public void userEnterBelowInformation (DataTable data) {
			List<Map<String, String>> changepass =data.asMaps(String.class,String.class);
		    sendText(factory.accountpage().PrevPassInput,changepass.get(0).get("previousPassword"));
		    sendText(factory.accountpage().NewPassInput,changepass.get(0).get("newPassword"));
		    sendText(factory.accountpage().ConfirmPassInput,changepass.get(0).get("confirmPassword"));
		    logger.info("user entred below info");
		    slowDown();    
		}
		
		@And("User click on Change Password button")
		public void userClieckOnChangePasswordButton() {
			click(factory.accountpage().ChangePassBtn);
			logger.info("user clicked on Change Password Button");
		}	
		
		@Then("a message should be displayed Password Updated Successfully")
		public void messgaeShouldBeDisplayed() {
			slowDown();
			Assert.assertTrue(isElementDisplayed(factory.accountpage().PassUpdatedSuccessfully));
			logger.info("Password Updated Successfully");
		
		}
		
		// @payment
		//  Scenario: Verify User can add a payment method	
		@And("User click on Add a payment method link")
		public void userClickOnAddAPaymentMethodLink () {
			click(factory.accountpage().AddaPaymentMethod);
			logger.info("user clicked on Add Payment");
			
		}
	
	@And("User fill Debit or credit card information")
		public void userFillDebitOrCreditCardInfo (DataTable data ) {
			List<Map<String, String>> debitOrcredit =data.asMaps(String.class,String.class);
			sendText(factory.accountpage().CardInput,debitOrcredit.get(0).get("cardNumber"));
			sendText(factory.accountpage().NameInput,debitOrcredit.get(0).get("nameOnCard"));
			selectByVisibleText(factory.accountpage().MonthInput,debitOrcredit.get(0).get("expirationMonth"));
			selectByVisibleText(factory.accountpage().YearInput,debitOrcredit.get(0).get("expirationYear"));
			sendText(factory.accountpage().SecurityInput,debitOrcredit.get(0).get("securityCode"));
			
			
		}
		
		@And("User click on Add your card button")
		public void userClickOnAddYoutCardBtn () {
			click(factory.accountpage().AddYourCardbtn);
			logger.info("user clicked on add card btn");
			
		}
		
		@Then("a message should be displayed Payment Method added successfully")
		public void aMsgShouldBeDisplayed() {
			slowDown();
			Assert.assertTrue(isElementDisplayed(factory.accountpage().PaymentMethodAddedSuccessfully));
			logger.info("Payment Method added successfully");
		}
			
		
			
			
		//@updateCrad
		//  Scenario: Verify User can edit Debit or Credit card	
		@And("User select the payment Card")
		public void userSelectedThePaymentCard() {
			click(factory.accountpage().SelectedpaymentCard);
			logger.info("User clicked on payment card");
			slowDown();
		}
		@And("User click on Edit option of card section")
		public void userClickonEditOption () {
			click(factory.accountpage().Edit);
			logger.info("user clicked on Edit");
			
		}
		
		@And("user edit information with below data")
		public void userEnterTheData(DataTable data) {
			clearTextUsingSendKeys(factory.accountpage().CardNumber);
			clearTextUsingSendKeys(factory.accountpage().NameOnCard);
			clearTextUsingSendKeys(factory.accountpage().SecurityCode);
			
			
			List<Map<String, String>> editBttn =data.asMaps(String.class,String.class);
			
			sendText(factory.accountpage().CardNumber,editBttn.get(0).get("cardNumber"));
			sendText(factory.accountpage().NameOnCard,editBttn.get(0).get("nameOnCard"));
			selectByVisibleText(factory.accountpage().MonthInput,editBttn.get(0).get("expirationMonth"));
			selectByVisibleText(factory.accountpage().YearInput,editBttn.get(0).get("expirationYear"));
			sendText(factory.accountpage().SecurityCode,editBttn.get(0).get("securityCode"));
			logger.info("user successfully entred the info");
			slowDown();
		}
		
		@And("user click on Update Your Card button")
		public void userClickonUpdateBttn () {
			click(factory.accountpage().UpdateCardBtn);
			logger.info("user clicked on updateBttn");
		}
		
		@Then("a message should be displayed Payment Method updated Successfully")
		public void aMessageShouldBeDisplayed() {
			slowDown();
		Assert.assertTrue(isElementDisplayed(factory.accountpage().PaymentMethodupdatedSuccessfully));
			
	logger.info("Payment Method added successfully");

		
		}
		
		
		//@removeCard
		//  Scenario: Verify User can remove Debit or Credit card
		
		@And("User click on remove option of card section")
		public void userClickOnRemoveCardfromList () {
			click(factory.accountpage().Remove);
			logger.info("User clicked on remove option");
			slowDown();
		}
		
		@Then("payment details should be removed")
		public void paymentdetailsShouldBeRemoved () {
		//	Assert.assertTrue(isElementDisplayed(factory.accountpage().Account)); There is no msg to validate.
			logger.info("Details removed successfully");
		}
		
		
		
		// @addAddress
		//  Scenario: Verify User can add an Address
		
		@And("User click on Add address option")
		public void userClickOnAddAddressOption() {
			click(factory.accountpage().AddAddress);
			logger.info("userClickedInAddAddressOption");
		}
		
		@And("user fill new address form with below information")
		public void userFillTheInformation(DataTable data) {
			List<Map<String, String>> fillAddress = data.asMaps(String.class,String.class);
			
			selectByVisibleText(factory.accountpage().Country,fillAddress.get(0).get("country"));
			sendText(factory.accountpage().FullName,fillAddress.get(0).get("fullName"));
			sendText(factory.accountpage().PhoneNumber,fillAddress.get(0).get("phoneNumber"));
			sendText(factory.accountpage().StreetAddress,fillAddress.get(0).get("streetAddress"));
			sendText(factory.accountpage().ApartmentInput,fillAddress.get(0).get("apt"));
			sendText(factory.accountpage().CityInput,fillAddress.get(0).get("city"));
			selectByVisibleText(factory.accountpage().State,fillAddress.get(0).get("state"));
			sendText(factory.accountpage().ZipCode,fillAddress.get(0).get("zipCode"));
			logger.info("User filled the field");
			slowDown();
				
		}
		
		@And("User click on Add Your Address button")
		public void userClickAddYourAddressBtn () {
			click(factory.accountpage().Addaddress);
			logger.info("User successfully clicked on Add Your Address button");
		}
	
	@Then("a message should be displayed Address Added Successfully")
		public void aMessageShouldBeDisplayedonScreen() {
			slowDown();
			Assert.assertTrue(isElementDisplayed(factory.accountpage().AddressAddedSuccessfully));
			logger.info("Address Added Successfully");
			
		}
		


	//@EditAddress
	//  Scenario: Verify User can edit an Address added on account
		
		@And("User click on edit address option")
		public void userClickOnEditAddressOption () {
			click(factory.accountpage().EditAddress);
			logger.info("user clicked on Edit button");
			
		}
		
		@And("User fill new address form with below information")
		public void userFillNewAddressFormWithBelowInformation(DataTable Data) {
			List<Map<String, String>> EditNewAdd = Data.asMaps(String.class,String.class);
			
			selectByVisibleText(factory.accountpage().Country,EditNewAdd.get(0).get("country"));
			clearTextUsingSendKeys(factory.accountpage().FullName);
			sendText(factory.accountpage().FullName,EditNewAdd.get(0).get("fullName"));
			clearTextUsingSendKeys(factory.accountpage().PhoneNumber);
			sendText(factory.accountpage().PhoneNumber,EditNewAdd.get(0).get("phoneNumber"));
			clearTextUsingSendKeys(factory.accountpage().StreetAddress);
			sendText(factory.accountpage().StreetAddress,EditNewAdd.get(0).get("streetAddress"));
			clearTextUsingSendKeys(factory.accountpage().ApartmentInput);
			sendText(factory.accountpage().ApartmentInput,EditNewAdd.get(0).get("apt"));
			clearTextUsingSendKeys(factory.accountpage().CityInput);
			sendText(factory.accountpage().CityInput,EditNewAdd.get(0).get("city"));
			selectByVisibleText(factory.accountpage().State,EditNewAdd.get(0).get("state"));
			clearTextUsingSendKeys(factory.accountpage().ZipCode);
			sendText(factory.accountpage().ZipCode,EditNewAdd.get(0).get("zipCode"));
			logger.info("User filled the field");
			slowDown();
			
			
		}
	
	@And("User click update Your Address button")
		public void userClickUpdateYourAddressBtn() {
			click(factory.accountpage().UpdateYourAddress);
			logger.info("User clicked on Update Your Address");
			
		}
		
		@Then("a message should be displayed Address Updated Successfully")
		public void aMsgShouldBeDisplayedOnTheScreeen() {
			slowDown();
			Assert.assertTrue(isElementDisplayed(factory.accountpage().AddressUpdatedSuccessfully));
			logger.info("Your New Address Updated");

		}
	
		
	//@removeOldAddress
	//  Scenario: Verify User can remove Address from Account
		 
		@And("User click on remove option of Address section")
		public void userClickedOnRemoveOption() {
			click(factory.accountpage().RemoveAddress);
			logger.info("User clicked on remove button");
			
		}
		
		@Then("Address details should be removed")
		public void addressDetailsShouldBeRemoved() {
			//Assert.assertTrue(isElementDisplayed(factory.accountpage().Account)); There is no msg to validate.
			logger.info("User removed the address");
			
			
		}
		
	}
	
