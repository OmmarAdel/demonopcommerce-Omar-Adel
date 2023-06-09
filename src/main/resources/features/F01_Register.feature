@smoke
Feature: F01_Register | users could register with new accounts
  Scenario: guest user could register with valid data successfully
    Given user go to register page
    When user fills mandatory Personal Details "automation" "tester" "test@exapmle.com"
    And user fills mandatory password and ConfirmPassword "P@ssw0rd" "P@ssw0rd"
    And user click on register button
    Then Success message is displayed