@e2e
Feature: User could register with valid data

  Background: user open browser
    Given user open the browser

  Scenario: User could register with valid data
    And user clicks on the register link
    When user entered the valid data
    And user should Click on the Continue button
    Then user should register successfully
