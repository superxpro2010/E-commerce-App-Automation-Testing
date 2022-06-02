
Feature: User could reset his/her password successfully


  Scenario: User could reset his/her password successfully

    Given user opens the Website
    And user click on log in
    When user clicks on the forget password link
    And enter his valid email
    And user clicks RecoverButton
    Then user should see message "Email with instructions has been sent to you."at the top