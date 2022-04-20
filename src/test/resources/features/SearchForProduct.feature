Feature: Logged User could search for any product

#  Background: user open browser
#    Given user open the browser

  Scenario: User Can Search For Any Product
    When user login with valid email and password
    And user types product name on the search bar
    And user clicks on the search button
    Then system should display the search results