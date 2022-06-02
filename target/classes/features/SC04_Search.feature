
Feature: Logged User could search for any product


  Scenario: User Can Search For Any Product

    Given user opens the Website
    And user click on log in
    And user enter valid username and password
    And user click on log in button
    Then user should login successfully
    When user types product name "Apple" on the search bar
    And user clicks on the search button
    Then system should display the search results
