Feature: User Login


  @Test
  Scenario Outline: User Login
    Given the user enter main page
    When the user fills the fields to login with success
    |username | password|
    |<username>| <password>|
    Then the user successfully login

    Examples:
    |username | password|
        ##@externaldata@./src/test/resources/datadriven/test.xlsx@escenario1@
   |standard_user   |secret_sauce|
