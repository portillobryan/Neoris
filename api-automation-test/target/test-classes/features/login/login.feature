Feature: ingresa con usuario y contraseña

  Background:
    * url "https://api.demoblaze.com"
    * header Content-Type = 'application/json'
    * header Accept = 'application/json, text/plain, */*'
    * header Accept-Encoding = 'gzip, deflate, br'
    * header Accept-Language = 'es-419,es;q=0.9'
    * def req = read('classpath:features/login/datalogin.csv')


  Scenario Outline: Login with datos success and error
    Given path '/login'
    And request { username: '#(username)', password: '#(password)' }
    When method POST
    Then status 200
    And print response
    And match response.trim().toString() == '"Auth_token: dGVzdDE2OTI4NDc="'

    Examples:
      | read('classpath:features/login/datalogin.csv') |




