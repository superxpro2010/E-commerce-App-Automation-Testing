Feature: SC10- Logged user could add different products to Wishlist

  Scenario: Logged user could add different products to Wishlist
    Given user opens the Website
    And user enter valid username and password
    And user click on log in button
    And user should login successfully


    #Add Items TO The Wishlist
#    1st Item
    Given user select random category
    Then user should redirected to the page of the selected category
    Then user click on random product
    And user check if the product have attributes
    And user click on add to wishlist
#    2nd Item
    Given user select random category
    Then user should redirected to the page of the selected category
    Then user click on random product
    And user check if the product have attributes
    And user click on add to wishlist
    Then user should found the product added to wishlist in the wishlist

