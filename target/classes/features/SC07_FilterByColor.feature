
Feature: Logged user could filter with color

  //***Note**** in this case you should select specific category like Apparel > Shoes*

  Scenario: Logged user could filter with color
    Given user opens the Website
    And user click on log in
    And user enter valid username and password
    And user click on log in button
    And user should login successfully
    When user select the shoes sub-category
    And user filter by color
    Then the filtered results should be displayed

