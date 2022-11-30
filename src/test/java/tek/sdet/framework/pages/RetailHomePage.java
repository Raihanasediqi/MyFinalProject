package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailHomePage extends BaseSetup {

	 public RetailHomePage() {
	        PageFactory.initElements(getDriver(), this);
	

}
	 @FindBy(xpath="//button[@id='hamburgerBtn']")
	    public WebElement All;
	    
	    @FindBy(id = "signinLink")
	    public  WebElement signin ;
	    
	    @FindBy(xpath = "//button[@type='submit']")
	    public WebElement loginButton;
	    
	    @FindBy(id="accountLink")
	    public WebElement account;
	    
	    @FindBy(id="newAccountBtn")
	    public WebElement CreateAccount;
	    
	    @FindBy(xpath="//span[text()='Electronics']")
	    public WebElement electronics;
	    
	    
	    @FindBy(xpath="//span[text()='Computers']")
	    public WebElement computer;
	    
	    @FindBy(xpath="//span[text()='Smart Home']")
	    public WebElement smarthome;
	    
	    @FindBy(xpath="//span[text()='Automative']")
	    public WebElement Automative;
	    
	    @FindBy(xpath="//span[text()='Sports']")
	    public WebElement Sports;
	    
	    @FindBy(xpath="//span[text()='TV & Video']")
	    public WebElement TvAndVideo;
	    



	   @FindBy(xpath="//span[text()='Video Games']")
	    public WebElement VideoGames;
	    
	    @FindBy(xpath="//span[text()='Accessories']")
	    public WebElement Accessories;
	    
	    @FindBy(xpath="//span[text()='Networking']")
	    public WebElement Networking;
	    
	    @FindBy(xpath="//span[text()='Smart Home Lightning']")
	    public WebElement smarthomelightning;
	    
	    @FindBy(xpath="//span[text()='Plugs and Outlets']")
	    public WebElement plugsandoutlets;
	    
	    @FindBy(xpath="//span[text()='Athletic Clothing']")
	    public WebElement AthleticClothing;
	    
	    @FindBy(xpath="//span[text()='Exercise & Fitness']")
	    public WebElement ExerciseFitness;
	    
	    @FindBy(xpath="//span[text()='Automative Parts & Accessories']")
	    public WebElement AutomativePartsAccessories;
	    
	    @FindBy(xpath="//span[text()='MotorCycle & Powersports']")
	    public WebElement MotorCyclePowersports;
	    
	    
	    @FindBy(id = "search")
	    public WebElement allDepartments;
	    
	    @FindBy(xpath="//span[text()='Smart Home']")
	    public WebElement Smarthome;
	    
	    
	    @FindBy(id = "searchInput")
	    public WebElement searchInputField;
	    
	    @FindBy(id = "searchBtn")
	    public WebElement searchButton;
	    
	    @FindBy(xpath="//p[text()='Kasa Outdoor Smart Plug']")
	    public WebElement Kasa;
	    
	    
	    @FindBy(css="select.product__select")
	    public WebElement Quantity;
	    
	    
	    @FindBy(xpath="//option[text()='2']")
	    public WebElement quantity2;
	    
	    
	    
	    
	    @FindBy(id="addToCartBtn")
	    public WebElement AddToCart;
	    
	    
	    
	    @FindBy(id="cartBtn")
	    public WebElement cartBtn;
	    
	    
	    @FindBy(id="proceedBtn")
	    public WebElement proceedBtn;
	    
	    
	    @FindBy(id="addAddressBtn")
	    public WebElement addAddressBtn;
	    
	    @FindBy(id="countryDropdown")
	    public WebElement countryDropdown;
	    
	    @FindBy(id="fullNameInput")
	    public WebElement fullNameInput;
	    
	    @FindBy(xpath="/html/body/div/div[3]/div[2]/div/div/form/div[3]/input")
	    public WebElement PhoneNumber;
	    
	    @FindBy(id="streetInput")
	    public WebElement StreetAddress;
	    
	    @FindBy(id="apartmentInput")
	    public WebElement ApartmentInput;
	    
	    @FindBy(id="cityInput")
	    public WebElement CityInput;
	    
	    @FindBy(name ="state")
	    public WebElement State;
	    
	    @FindBy(id="zipCodeInput")
	    public WebElement ZipCode;
	    
	    @FindBy(id="addressBtn")
	    public WebElement addressBtn;
	     
	    @FindBy(id="addPaymentBtn")
	    public WebElement addPaymentBtn;
	    
	    
	    
	        
	    @FindBy(id="cardNumberInput")
	    public WebElement CardInput;
	    
	    @FindBy(id="nameOnCardInput")
	    public WebElement NameInput;
	    
	    @FindBy(id="expirationMonthInput")
	    public WebElement MonthInput;
	    
	    @FindBy(id="expirationYearInput")
	    public WebElement YearInput;
	    
	    @FindBy(id="securityCodeInput")
	    public WebElement SecurityInput;
	    
	    @FindBy(xpath="//button[@id=\"paymentSubmitBtn\"]")
	    public WebElement AddYourCardbtn;
	    
	    @FindBy(id="placeOrderBtn")
	    public WebElement placeOrderBtn;
	    
	    @FindBy(xpath="//p[text()='Order Placed, Thanks']")
	    public WebElement Thanks;
	    
	    @FindBy(xpath="//p[text()='Apex Legends - 1,000 Apex Coins']")
	    public WebElement Apex;
	    
	
}

		
		
		
		
	
	


