Feature: Logged User could switch between currencies US-Euro

#  Background: user open browser
#    Given user open the browser

  Scenario: Logged User could switch between currencies US-Euro
    And user login with valid email and password
    Then user wants to change his currency to euro
    Then the currency should be changed to euro