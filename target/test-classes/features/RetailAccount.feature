@TestRetail
Feature: Retail Account Page

  Background: 
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'malik007@gmail.com' and password 'Start@12345'
    And User click on login button
    And User should be logged in into Account
    When User click on Account option

  @updateNameAndPhone
  Scenario: Verify User can update Profile Information
    When User click on Account option
    And User update Name 'Reshan' and Phone '333-434-9999'
    And User click on Update button
    Then user profile information should be updated

  @payment
  Scenario: Verify User can add a payment method
    And User click on Add a payment method link
    And User fill Debit or credit card information
      | cardNumber       | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 2222333355553434 | Azizi     |               11|           2026 |          897 |
    And User click on Add your Card button
    Then a message should be displayed 'Payment Method added sucessfully'

  @editCrad
  Scenario: Verify User can edit Debit or Credit card
    When User click on Account option 
    And User click on Edit option of card section     
    And user edit information with below data
      | cardNumber       | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 6562859624954599 | John       |              9  |           2028 |          190 |
    And user click on Update Your Card button

  @removeCard
  Scenario: Verify User can remove Debit or Credit card
    When User click on Account option 
    And User select the card ending with '3434'
    And User click on remove option of card section
    Then payment details should be removed

  @addAddress
  Scenario: Verify User can add an Address
    When User click on Account option
    And User click on Add address option
    And user fill new address form with below information
      | country     | fullName     | phoneNumber | streetAddress | apt  | city  | state | zipCode |
      | United States   | Wali        |  5434560760 | 1960 Morse Ave        | 18   | Sacramento | California | 95825 |
    And User click on Add Your Address button 
    Then a message should be displayed 'Address Added Successfully'
    
  @EditAddress
  Scenario: Verify User can edit an Address added on account
    And User click on edit address option
    And User fill new address form with below information
      | country     | fullName | phoneNumber | streetAddress | apt | city  | state | zipCode |
      | Turkey      | Jawad    |  2334567896 | 34 st         | 48  | Mamak | Ankara|  20019   |
    And User click update Your Address button
    Then a message should be displayed 'Address Updated Successfully'

  @removeOldAddress
  Scenario: Verify User can remove Address from Account
    And User click on remove option of Address section
    Then Address details should be removed
