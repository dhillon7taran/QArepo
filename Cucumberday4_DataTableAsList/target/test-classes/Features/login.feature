Feature: HRM page functionality testing
  Scenario: login functionality
    Given hrm url is given
    When user enters credentials to login 
   
    | Admin  |  admin123  | 
    | pqr    |   123      |
    
    And click on login button
    Then it should navigate to hrm dashboard
    
   