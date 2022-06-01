
Feature: User Can Login Successfully.

  Scenario: User Can Login Normally.

    Given user had a valid registered account
    And user navigate to home page
    And user click on log in
    When user enter valid username and password
    And user click on log in button
    Then user should login successfully
    And user click on log out button



