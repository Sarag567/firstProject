Feature: this feature allows the user to create new account
  Background:   Given  step one open chromeBrowser and navigate to the "https://demo.nopcommerce.com/"
    And  step two click to register bottom and go to register page
    When  step three  user reach to registration page choose  gender

  Scenario: by it the user can create valid account
  And  step two click to register bottom and go to register page
  When  step three  user reach to registration page choose  gender
 And   step four user enter first and last name
    And step six user enter date of birth
    And step seven user enter email"<round>"
    And step eight enter company name and click to newsletter
    And step nine enter password and confirm password
    And step ten click to register button
Then user create a new account
@automation
  Scenario: by it the user can create invalid account
    And  step two click to register bottom and go to register page
    When  step three  user reach to registration page choose  gender
    And   step four user enter first and last name
    And step six user enter date of birth
    And step seven user enter invalid email
    And step eight enter company name and click to newsletter
    And step nine enter password and confirm password
    And step ten click to register button
    Then the account isnot created