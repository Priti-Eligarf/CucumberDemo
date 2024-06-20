Feature: all login scenarios

  @valid@login
  Scenario: To test the functionality of the login page for valid input
    Given User on the Login page
    #When User enter correct username and password
    When User enter "Admin" and "Admin"
    And Click on Login button
    Then  User should be land on Dashboard

  @invalid@login@notBlank
  Scenario: To test the functionality of the login page for invalid input
    Given User on the Login page
   # When User enter incorrect username and password
    When User enter "username" and "password"
    And Click on Login button
    Then  User should get an error

  @Blank@invalid@login
  Scenario: To test the functionality of the login page for Blank input
    Given User on the Login page
    #When User enter Bank username and password
    When User enter "" and ""
    And Click on Login button
    Then  User should get an error messeage for both username and password

  @userRegistration
  Scenario: to test the functionality of submit button on user registration page
    Given I am on user registration page
    When I enter below details
      | amol ujagare | amol@gmail.com | 54545454 | Pune |
    And I click on submit button
    Then user should be added

