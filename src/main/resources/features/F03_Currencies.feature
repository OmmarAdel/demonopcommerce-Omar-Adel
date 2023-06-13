@smoke
Feature: F03_Currencies | user can change item currency
  Scenario: user change currency from Dollar to euro
    When user click on list price dropdown and Select another currency "Euro"
        Then new currency should be appear
