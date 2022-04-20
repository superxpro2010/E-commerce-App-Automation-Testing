Feature: User could log in with valid email and password
#
#  Background: user open browser
#    Given user open the browser

  #Test Scenario 1
  Scenario: User could log in with valid email and password

  And user navigates to login page
  When user enter valid username and password
#  And user click on login button
  Then user could login successfully
