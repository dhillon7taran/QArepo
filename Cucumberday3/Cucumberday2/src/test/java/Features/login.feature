

Feature: HRM page functionality testing
  

  
  Scenario:login functionality
    Given hrm url is given
   
    When user enters "abc@gmail.com" And user enters "taranjot"
    And click on login button
    Then it should navigate to hrm dashboard
    


