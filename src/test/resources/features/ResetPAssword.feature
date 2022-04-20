Feature: User could reset his/her password successfully

#  Background: user open browser
#    Given user open the browser

  Scenario: User could reset his/her password successfully
    And click on the Login Link
    When user clicks on the forget password link
    And enter his valid email
    And user clicks RecoverButton
    Then he will receive email to reset his password
