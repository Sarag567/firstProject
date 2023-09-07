Feature: Login
@login
  Scenario: login with valid account
    Given user go to login page
    And user enter valid email and password
    And click to login button
    And select remember chick box
    And user can go to profile page
    Then user can log in to the website