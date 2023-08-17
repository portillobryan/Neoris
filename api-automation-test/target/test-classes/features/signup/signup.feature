Feature: registro con usuario y contraseña

  Background:
    * url "https://api.demoblaze.com"
    * header Content-Type = 'application/json'
    * header Accept = 'application/json, text/plain, */*'
    * header Accept-Encoding = 'gzip, deflate, br'
    * header Accept-Language = 'es-419,es;q=0.9'
    * def req = read('classpath:features/signup/datasignup.csv')


  Scenario Outline: Registry with datos success and error
    Given path '/signup'
    And request { username: '#(username)', password: '#(password)' }
    When method POST
    Then status 200
    And print response
    And match response.trim().toString() == '""'

    Examples:
      | read('classpath:features/signup/datasignup.csv') |




