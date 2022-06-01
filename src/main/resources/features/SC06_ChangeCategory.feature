
Feature: Logged user could select different Categories

  Scenario: Logged user could select different Categories

    Given user opens the Website
    And user click on log in
    And user enter valid username and password
    And user click on log in button
    And user should login successfully
    When user hover over the Computers category
    And user choose Notebook sub category.
    Then the category should be opened.
