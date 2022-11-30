Feature: Retail Home Page

  Background: 
    Given User is on retail website

  @AllSection
  Scenario: Verify Shop by Department sidebar
    When User click on All section
    Then below options are present in Shop by Department sidebar
      | Electronics | Computers | Smart Home | Sports | Automative |

  @Department
  Scenario Outline: Verify department sidebar options
    When User click on All section
    And User is on '<department>'
    Then below options are present in department
      | <optionOne> | <optionTwo> |

    Examples: 
      | department  | optionOne                      | optionTwo                |
      | Electronics | TV & Video                     | Video Games              |
      | Computers   | Accessories                    | Networking               |
      | Smart Home  | Smart Home Lightning           | Plugs and Outlets        |
      | Sports      | Athletic Clothing              | Exercise & Fitness       |
      | Automotive  | Automative Parts & Accessories | MotorCycle & Powersports |

  @additem
  Scenario: Verify User can add an item to cart
    When User click on Sign in  Option
    And user enter email 'Raihana.bibi2022@gmail.com' and password '2022!Bibi'
    And User click on Login button
    And User should be logged in into account
    And User change the category to 'Smart Home'
    And User search for an item 'kasa outdoor smart plug'
    And User click on Search icon
    And User click on item
    And User select quantity '2'
    And User click add to Cart button
    Then the cart icon quantity should change to '2'

  @placeAnOrder
  Scenario: Verify User can place an order without Shipping address and payment Method on file
    When User click on Sign in  Option
    And User enter email 'Raihana.bibi2022@gmail.com' and password '2022!Bibi'
    And User click on login button
    And User should be logged in into Account
    And User change the category to 'Smart Home'
    And User search for an item 'kasa outdoor smart plug'
    And User click on Search icon
    And User click on item
    And User select quantity '2'
    And User click add to Cart button
    Then the cart icon quantity should change to '2'
    And User click on Cart option
    And User click on Proceed to Checkout button
    And User click Add a new address link for shipping address
    And User fill the new address form with below information
      | Country       | FullName   | PhoneNumber | StreetAddress     | Apt  | City       | State | ZipCode |
      | United States | Nasir |  8179443582 | 5800 Scarcliff Ln | 1033 | Fort Worth | Texas |   76135 |
    And User click Add Your Address  button
    And User click Add a credit card or Debit Card for Payment method
    And User fill the Debit or credit card information
      | CardNumber       | NameOnCard | ExpirationMonth | ExpirationYear | SecurityCode |
      | 4444826332819333 | Ekram      |              11 |           2024 |          546 |
    And User click on Add your card button
    And User click on Place Your Order
    Then a message should be displayed Order Placed, Thanks

  @OrderAdded
  Scenario: Verify User can place an order with Shipping address and payment Method on file
    When User click on Sign in option
    And User enter email 'Raihana.bibi2022@gmail.com' and password '2022!Bibi'
    And User click on login button
    And User should be logged in into Account
    And user change the category to 'Electronics'
    And User search for the item 'Apex Legends'
    And User click on search icon
    And User click on Item
    And user select quantity '5'
    And User click add to cart button
    Then The cart icon quantity should change to '5'
    And User click on cart option
    And User click on proceed to Checkout button
    And User click on place Your Order
    Then A message should be displayed Order Placed, Thanks
