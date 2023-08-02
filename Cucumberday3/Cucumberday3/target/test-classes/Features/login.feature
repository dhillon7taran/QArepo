

Feature: HRM page functionality testing
  

  
  Scenario Outline: login functionality
    Given hrm url is given
    When user enters "<username>" And user enters "<password>"
    And click on login button
    Then it should navigate to hrm dashboard
    
   Examples:
   | username | password |
   | Admin    | admin123 |
   |  abc     | 123      |
   | Admin    | admin123 |
   |  abc     | 123      |
   | Admin    | admin123 |
   |  abc     | 123      |