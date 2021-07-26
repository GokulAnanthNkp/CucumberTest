Feature: Credit Card Validator
  Feature file to check credit card issue based on pan credit score

  Scenario: 
    Given user in homepage
    When user enters the pan no "APPXA2244X"
    Then credit card is "eligible"

  Scenario: 
    Given user in homepage
    When user enters the pan no "AXVPS7766V"
    Then credit card is "not eligible"

  Scenario: 
    Given user in homepage
    When user enters the pan no "AZERF9654R"
    Then credit card is "Invalid"
