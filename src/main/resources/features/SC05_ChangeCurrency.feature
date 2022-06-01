
Feature: Logged User could switch between currencies US-Euro

  Scenario: Logged User could switch between currencies US-Euro

    Given user had a valid registered account
    And user navigate to home page
    And user click on log in
    When user enter valid username and password
    And user click on log in button
    Then user should login successfully
    When user change the currency.
    Then the currency should changed successfully.

