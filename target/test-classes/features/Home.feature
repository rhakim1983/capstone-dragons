@allTest
Feature: Retail Home Page

  Background: 
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'malik007@gmail.com' and password 'Start@12345'
    And User click on login button
    And User should be logged in into Account
    And User click on Orders section
    And User click on first order in list
  
 @allSection   
 Scenario: Verify Shop by Department sidebar
		Given User is on retail website
		When User click on All section
		Then below options are present in Shop by Department sidebar

|Electronics|Computers|Smart Home|Sports|Automative|

 @department
 Scenario Outline: Verify department sidebar options
		Given User is on retail website
		When User click on All section
		And User on '<department>'
		Then below options are present in department
		| <optionOne> | <optionTwo> |

Examples:
|department   | optionOne                      | optionTwo|
|Electronics  | TV & Video                     | Video Games|
|Computers    |Accessories                     | Networking |
|Smart Home   | Smart Home Lightning           | Plugs and Outlets|
|Sports       | Athletic Clothing              | Exercise & Fitness|
|Automotive   | Automative Parts & Accessories | MotorCycle & Powersports|



    

 