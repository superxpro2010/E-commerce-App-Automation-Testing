
Feature: Logged user could select different tags

  Scenario: Logged user could select different tags

    Given user opens the Website
    And user click on log in
    And user enter valid username and password
    And user click on log in button
    And user should login successfully
    When user select the shoes sub-category
    And user select different tags
    Then the filtered results should be opened normally
