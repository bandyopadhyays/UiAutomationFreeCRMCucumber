@tag
Feature: Login features of FREECRM.COM

  @tag1
  Scenario: Login with valid credentials
    Given User is on Login Page
    When User enters User Name as "souni1" and Password as "Password"
    And User clicks on Login button
    Then User lands to home page
