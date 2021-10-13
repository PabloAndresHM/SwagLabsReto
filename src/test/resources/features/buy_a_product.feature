@autor: Pablo Andres Hernandez Morales

Feature: Swag Labs Mobile application automation successful buy
         I, as a user, want to complete a buy in the application

  Scenario Outline: Try to buy a product in swag application
    Given that Brandon login to application to buy a product
      |user|password|
      |<user>|<password>|
    When he add the product, he go to the shopping car to finish his buy
      | name   | surname   | zip   |
      | <name> | <surname> | <zip> |
    Then you should see the message that indicate that the shop is successful
    |message|
    |<message>|
    Examples:
      |user         |password    | name         | surname   | zip   |message            |
      |standard_user|secret_sauce| Pablo Andres | Hernandez | 22001 |CHECKOUT: COMPLETE!|