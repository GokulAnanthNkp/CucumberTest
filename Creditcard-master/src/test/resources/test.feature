Feature: Credit Card Validator
  Feature file to check credit card issue based on pan credit score

  Scenario: Credit card Approved
  Credit card approved based on credit score of Pan number
    Given user in homepage
    When user enters the pan no "APPXA2244X"
    Then credit card is "eligible"

  Scenario: Credit card Declined
  Credit card declined based on credit score of Pan number
    Given user in homepage
    When user enters the pan no "AXVPS7766V"
    Then credit card is "not eligible"

  Scenario: Invalid Pan Number
  Invalid Pan Number entered
    Given user in homepage
    When user enters the pan no "AZERF9654R"
    Then credit card is "Invalid"
