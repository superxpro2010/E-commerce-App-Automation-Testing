Feature: SC11- Logged user could add different products to compare list

  Scenario: Logged user could add different products to compare list
    Given user opens the Website
    And user enter valid username and password
    And user click on log in button
    And user should login successfully

    #Add Items TO The Cart Steps
#    1st Item
    Given user select random category
    Then user should redirected to the page of the selected category
    Then user click on random product
    And user check if the product have attributes
    And user click on add to compare list
#    2nd Item
    Given user select random category
    Then user should redirected to the page of the selected category
    Then user click on random product
    And user check if the product have attributes
    And user click on add to compare list