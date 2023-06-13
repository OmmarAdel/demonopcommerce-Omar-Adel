@smoke
  Feature: F04_Search | use can search for any product
    Scenario Outline: user could search using product name
        When user click on search field "<product>"
          Then user should see result about this "<product>"

        Examples:
          | product |
          | book    |
          | laptop  |
          | nike    |


    Scenario Outline: user can search with Sku
        When user click on search field "<product>"
          Then user should see result about this "<product>"
      Examples:
        | product   |
        | SCI_FAITH |
        | APPLE_CAM |
        | SF_PRO_11 |