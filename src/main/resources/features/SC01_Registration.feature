@End-To-End
Feature: User could register with valid data

  Scenario: User could register with valid data
    Given  user has a valid email
    And user navigate to home page
    And user clicks on the register link
    When user entered the valid data
    Then complete Registration message "Your registration completed" should be displayed
    And user should login successfully
    Then user click on log out button
