Feature: this is login feature
  Scenario: login with valid Credentials
    Given open the application url
    When I enter userID and password and then click on login button
    Then login should be successful