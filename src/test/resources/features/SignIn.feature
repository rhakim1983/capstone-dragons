@Test
Feature: Retail Signin Feature

  @signInTest
  Scenario: Verify user can sign in into Retail Application
    Given User is on retail website
    When User click On Signin  option
    And User enter email 'malik007@gmail.com' and password 'Start@12345'
    And User click on login button
    Then User should be logged in into Account

  @createAccount
  Scenario: Verify user can create an account into Retail Website
    Given User is on retail website
    When User click on Sign in  option
    And User click on Create New Account button
    And User fill the signUp information with below data
      | name     | email               | password     | confirmPassword |
      | Emal     | emal222@gmail.com   | Test@12345   | Test@12345      |
    And User click on SignUp button
    Then User should be logged into account page
