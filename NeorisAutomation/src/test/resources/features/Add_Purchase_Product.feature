Feature: Add two products and completes the purchase


  Background:
    Given the user enter main page
    When the user fills the fields to login with success
      |username | password|
        ##@externaldata@./src/test/resources/datadriven/test.xlsx@escenario1@
   |standard_user   |secret_sauce|

  @Test
  Scenario Outline: Add and purchase Product
    When the user add with success the products
     |product| product2|
     |<product>|<product2>|
    When the user completes the purchase
      |firstname| lastname| zipcode |
      |<firstname>|<lastname>|<zipcode>|
    Then the user confirms the purchase

    Examples:
      |product | product2 | firstname| lastname |zipcode|
        ##@externaldata@./src/test/resources/datadriven/test.xlsx@escenario2@
   |Sauce Labs Backpack   |Sauce Labs Bike Light   |Bryan   |Test   |2055|
