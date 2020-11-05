Feature: Login scenarios
  This are the login test cases

  Scenario: User login to application using valid credential
    Given Open login page
    When User enter the valid credential
    Then User should be navigated to home page

  Scenario Outline: User login to application using multiple login credentials
    Given Open login page
    When User enter the <username> and <password> in login fields
    Then User should be navigated to home page
    Examples:
      | username        | password |
      | test1@gmail.com | test1    |
      | test2@gmail.com | test1    |