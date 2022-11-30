package tek.sdet.framework.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class HomeSteps extends CommonUtility {
	POMFactory factory = new POMFactory();
	
	



@Given("User is on retail website")
public void userIsOnRetailWebsite() {
String expectedTitle = "React App";
String actualTitle = getTitle();// wrote this one in CommonUtility
Assert.assertEquals(expectedTitle, actualTitle);
logger.info(actualTitle +" is equal to "+ expectedTitle);

}


//@AllSection
//Scenario: Verify Shop by Department sidebar

@When("User click on All section")
public void userClickedOnAllSection() {
	click(factory.homePage().All);
	logger.info("User clicked on All Section successfully");
	
}

@Then("below options are present in Shop by Department sidebar")
public void belowOptionsArePresentInShopByDepartmentSidebar(DataTable options) {
    List<List<String>> optionsToDisplay = options.asLists(String.class);
    Assert.assertTrue(isElementDisplayed(getDriver().findElement(By.xpath("//span[text() = '" + optionsToDisplay.get(0).get(0) + "']" ))));
           logger.info("options Electronics, Computers, Smart Home, Sports and Automative are present");
}



//@Department
//Scenario Outline: Verify department sidebar options

    String department;
   @When("User is on {string}")
    
    public String userOnElectronics(String department) {

       switch (department) {
        case "Electronics":
            Assert.assertTrue(isElementDisplayed(factory.homePage().electronics));
            logger.info("user is on Electronics section");
            break;
            
        case "Computers":
            Assert.assertTrue(isElementDisplayed(factory.homePage().computer));
            logger.info("user is on Computers section");
            break;
            
        case "Smart Home":
            Assert.assertTrue(isElementDisplayed(factory.homePage().smarthome));
            logger.info("user is on Smart Home section");
            break;

        case "Sports":
            Assert.assertTrue(isElementDisplayed(factory.homePage().Sports));
            logger.info("user is on Sports section");
            break;
            
        case "Automotive":
            Assert.assertTrue(isElementDisplayed(factory.homePage().Automative));
            logger.info("user is on Automotive section");
            break;
        default:

       }

      return this.department = department;
   }


@Then("below options are present in department")
    public void belowOptionsArePresentInDepartment(DataTable dataTable) {
        List<List<String>> department = dataTable.asLists();

       switch (this.department) {
        case "Electronics":
            click(factory.homePage().electronics);
            String video = getText(factory.homePage().VideoGames);
            String TVAndVideo = getText(factory.homePage().TvAndVideo);
            Assert.assertEquals(TVAndVideo, department.get(0).get(0));
            Assert.assertEquals(video, department.get(0).get(1));
            logger.info(video + " options are present in department" + TVAndVideo);
            break;
        case "Computers":
            click(factory.homePage().computer);
            String Accessories = getText(factory.homePage().Accessories);
            String Networking = getText(factory.homePage().Networking);
            Assert.assertEquals(Accessories, department.get(0).get(0));
            Assert.assertEquals(Networking, department.get(0).get(1));
            logger.info(Accessories + " options are present in department" + Networking);
            break;
        case "Smart Home":
            click(factory.homePage().smarthome);
            String SmartHomeLightning = getText(factory.homePage().smarthomelightning);
            String PlugsandOutlets = getText(factory.homePage().plugsandoutlets);
            Assert.assertEquals(SmartHomeLightning, department.get(0).get(0));
            Assert.assertEquals(PlugsandOutlets, department.get(0).get(1));
            logger.info(SmartHomeLightning + " options are present in department" + PlugsandOutlets);
            break;
        case "Sports":
            click(factory.homePage().Sports);
            String AthleticClothing = getText(factory.homePage().AthleticClothing);
            String ExerciseFitness = getText(factory.homePage().ExerciseFitness);
            Assert.assertEquals(AthleticClothing, department.get(0).get(0));
            Assert.assertEquals(ExerciseFitness, department.get(0).get(1));
            logger.info(AthleticClothing + " options are present in department" + ExerciseFitness);
            break;
        case "Automotive":
            click(factory.homePage().Automative);
            String AutomativePartsAccessories = getText(factory.homePage().AutomativePartsAccessories);
            String MotorCyclePowersports = getText(factory.homePage().MotorCyclePowersports);
            Assert.assertEquals(AutomativePartsAccessories, department.get(0).get(0));
            Assert.assertEquals(MotorCyclePowersports, department.get(0).get(1));
            logger.info(MotorCyclePowersports + " options are present in department" + AutomativePartsAccessories);
            break; } }
   
   //@additem
  // Scenario: Verify User can add an item to cart
   
   
@When("User click on Sign in  Option") 
public void userClickOnSignInOptionn() {
	click(factory.homePage().signin);
	logger.info("user clicked on sign in option succefully");
	
}

@And("user enter email {string} and password {string}")
public void userEnterEmailAndPassword (String email,String password) {
	sendText(factory.signInPage().emailField,email);
	sendText(factory.signInPage().passwrodField,password);
	logger.info("user entered email" + email + "and password" + password);
}

@And("User click on Login button")
public void userClickOnLoginButton () {
	click(factory.signInPage().logIn);
	logger.info("user clicked on login button");
		
}

@And("User should be logged in into account")
public void userShouldBeLoggedInIntoAccount () {
	Assert.assertTrue(isElementDisplayed(factory.homePage().account));
	logger.info("User could login successfully");
	
}

@And("User change the category to {string}")
public void userChangeThecategorytoSmartHome(String SmartHome) {
	selectByVisibleText(factory.homePage().allDepartments,SmartHome);
	logger.info("All Department changed to" + SmartHome );		
}

@And("User search for an item {string}")
public void userSearchForAnItemKasaOutdoorSmartHome(String item) {
	sendText(factory.homePage().searchInputField,item);
	logger.info("user entred " + item);	
}




@And("User click on Search icon")
public void userClickOnSearchIcon() {
	click(factory.homePage().searchButton);
	logger.info("user clicked on search button");	
}

@And("User click on item")
public void userClickOnItem() {
	click(factory.homePage().Kasa);
	logger.info("user clicked on item");
}

@And("User select quantity {string}")
public void userSelectQuantity(String adad) {
	sendText(factory.homePage().Quantity,adad);
	logger.info("user selected quantity '2' ");		
}




@And("User click add to Cart button")
public void userClickAddToCartBttn() {
	click(factory.homePage().AddToCart);
	logger.info("user clicked on Add To Cart");	
}

@Then("the cart icon quantity should change to {string}")
public void TheCartIconQuantityShouldChangeTo2(String two) {
	Assert.assertTrue(isElementDisplayed(factory.homePage().cartBtn,two));
	logger.info("cart icone changed to '2' ");
}

//@placeAnOrder
//  Scenario: Verify User can place an order without Shipping address and payment Method on file

@And("User click on Cart option")
public void userClickOnCartOption () {
	click(factory.homePage().cartBtn);
	logger.info("user clicked on Cart Option");		
}

@And("User click on Proceed to Checkout button")
public void userClickOnProceedToCheckOutBtn() {
	click(factory.homePage().proceedBtn);
	logger.info("user clicked on Proceed to Checkout");		
}

@And("User click Add a new address link for shipping address")
public void userClickAddANewAddressLinkForShippingAddress() {
	click(factory.homePage().addAddressBtn);
	logger.info("user clicked on Add New Address link");		
}
	
@And("User fill the new address form with below information")
public void userFillAddressFormWithBelwoInformation(DataTable data) {
    List<Map<String, String>> fillNewAddress = data.asMaps(String.class,String.class);
	
selectByVisibleText(factory.homePage().countryDropdown,fillNewAddress.get(0).get("Country"));
	sendText(factory.homePage().fullNameInput,fillNewAddress.get(0).get("FullName"));
	sendText(factory.homePage().PhoneNumber,fillNewAddress.get(0).get("PhoneNumber"));
	sendText(factory.homePage().StreetAddress,fillNewAddress.get(0).get("StreetAddress"));
	sendText(factory.homePage().ApartmentInput,fillNewAddress.get(0).get("Apt"));
	sendText(factory.homePage().CityInput,fillNewAddress.get(0).get("City"));
	selectByVisibleText(factory.homePage().State,fillNewAddress.get(0).get("State"));
	sendText(factory.homePage().ZipCode,fillNewAddress.get(0).get("ZipCode"));
	logger.info("User filled the field");
	

}

@And("User click Add Your Address  button")
public void user_Click_AddYourAddressOption() {
	click(factory.homePage().addressBtn);
	logger.info("user clicked Add Your Address Button");
	
}

@And("User click Add a credit card or Debit Card for Payment method")
public void userClickAddACreditCardForPayment() {
	clickElementWithJS(factory.homePage().addPaymentBtn);
	logger.info("user clicked Add a credit card information");
}



@And("User fill the Debit or credit card information")
public void userFillTheBelowCardInformation(DataTable data) {
	List<Map<String, String>> debitNewcredit = data.asMaps(String.class,String.class);
	sendText(factory.homePage().CardInput,debitNewcredit.get(0).get("CardNumber"));
	sendText(factory.homePage().NameInput,debitNewcredit.get(0).get("NameOnCard"));
	selectByVisibleText(factory.homePage().MonthInput,debitNewcredit.get(0).get("ExpirationMonth"));
	selectByVisibleText(factory.homePage().YearInput,debitNewcredit.get(0).get("ExpirationYear"));
	sendText(factory.homePage().SecurityInput,debitNewcredit.get(0).get("SecurityCode"));
	
}

@And("User click on Add your card Button")
public void user_ClickOnAddYourCardBttn() {
	click(factory.homePage().AddYourCardbtn);
	logger.info("user clicked on Add Your card button");
}


@And("User click on Place Your Order")
public void userClickedOnPlaceYourOrder() {
	click(factory.homePage().placeOrderBtn);
	logger.info("user clicked on Place Your Order");
	
}

@Then("a message should be displayed Order Placed, Thanks")
public void aMsgShouldBeDisplayed() {
	Assert.assertTrue(isElementDisplayed(factory.homePage().Thanks));
	logger.info("A message popped up on the top of the screen");
	
}


//@OrderAdded
//  Scenario: Verify User can place an order with Shipping address and payment Method on file

@And("user change the category to {string}")
public void userChange_The_Category(String Electronics ) {
	selectByVisibleText(factory.homePage().allDepartments,Electronics);
	logger.info("All Department changed to" + Electronics );
	
}



@And("User search for the item {string}")
public void user_searchForTheItem(String ItemElectronic) {
	sendText(factory.homePage().searchInputField,ItemElectronic);
	logger.info("user entred " + ItemElectronic);	
}

@And("User click on search icon")
public void userClicked_on_Search() {
	click(factory.homePage().searchButton);
	logger.info("user clicked on search button");
}

@And("User click on Item")
public void user_Clicked_on_Item() {
	click(factory.homePage().Apex);
	logger.info("user clicked on item");
}

@And("user select quantity {string}")
public void user_Selected_qAuantity(String five) {
	sendText(factory.homePage().Quantity,five);
	logger.info("user selected quantity '5' ");	
}

@And("User click add to cart button")
public void user_cLick_addToCartBttn() {
	click(factory.homePage().AddToCart);
	logger.info("user clicked on Add To Cart");
}

@Then("The cart icon quantity should change to {string}")
public void quantity_changedTo(String five) {
	Assert.assertTrue(isElementDisplayed(factory.homePage().cartBtn,five));
	logger.info("cart icone changed to '5' ");
	
}

@And("User click on cart option")
public void userClicked_onCart() {
	click(factory.homePage().cartBtn);
	logger.info("user clicked on Cart Option");
}

@And("User click on proceed to Checkout button")
public void user_clickOn_ProceedCheckOut(){
	click(factory.homePage().proceedBtn);
	logger.info("user clicked on Proceed to Checkout");
}

@And("User click on place Your Order")
public void userClickedOnpLaceYoUrOrdeR() {
	click(factory.homePage().placeOrderBtn);
	logger.info("user clicked on Place Your Order");
}

@Then("A message should be displayed Order Placed, Thanks")
public void aMessage_should_Be_Displayed() {
	Assert.assertTrue(isElementDisplayed(factory.homePage().Thanks));
	logger.info("A message popped up on the top of the screen");
}

}
