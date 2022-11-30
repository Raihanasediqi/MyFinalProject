Feature: Sign In Feature

  @signInTest
  Scenario: Verify user can sign in into Retail Application
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'Raihana.bibi2022@gmail.com' and password '2022!Bibi'
    And User click on login button
    Then User should be logged in into Account

  @CreateAccount
  Scenario: Verify user can create an account into Retail Website
    Given User is on retail website
    When User click on Sign in option
    And User click on Create New Account button
    And User fill the signUp information with below data
      | name     | email                    | password   | confirmPassword |
      | panthers | Bibi.raihana11@gmail.com | Tek@123456 | Tek@123456      |
    And User click on SignUp button
    Then User should be logged into account page
    #