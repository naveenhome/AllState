Feature: Calculator for fun
  Scenario Outline: Regression Testing
    Given user open <browser> and select <url>
    And user enter <firstVal> and <secondVal>
    And Select <Opt>
    When Click on Calculate
    Then Result should be <value>

    Examples: 
      | browser   | url                                         | firstVal | secondVal | Opt   | value |
      | "Firefox" | "http://ata123456789123456789.appspot.com/" |        5 |         4 | "Add" |     9 |
      | "Firefox" | "http://ata123456789123456789.appspot.com/" |        5 |         4 | "Mul" |    20 |
      | "Firefox" | "http://ata123456789123456789.appspot.com/" |        5 |         5 | "Add" |    10 |
      | "Firefox" | "http://ata123456789123456789.appspot.com/" |        5 |         5 | "Add" |    11 |
