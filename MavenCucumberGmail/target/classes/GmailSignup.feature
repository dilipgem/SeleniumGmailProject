## This is a feature file to test Gmail Signup Error Validation
## Author: Dilip Shrikhande Date: 13-Nov-2014

Feature: Gmail Signup feature

  Scenario: To test Signup page for validation messages.
    Given I am on Gmail Loginpage
    When I click on the Signup page
    And I click on the Next button without entering mandatory fields
      | fields    | value         |
      | FirstName | TestFirstName |
      | LastName  | TestLastName  |
      | UserID    |               |
    Then It should display an appropriate error message
