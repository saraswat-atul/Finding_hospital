Feature: Finding_hospitals

  @regression
  Scenario: Extract surgery option
    When User does click on surgery option
    Then User store and displays the surgery list on the console

  @regression
  Scenario Outline: On the home page under For Corporate open health and wellness plan form
    When User clicks on for corporate option
    Then User clicks on health and wellness plan
    Then User enters Name "<Name>"
    Then User enters Organization "<Organization Name>"
    Then User enters Contact "<Contact Number>"
    Then user enters Email "<Official Email ID>"
    Then User clicks on Organization size
    Then User chooses appropriate size
    Then User clicks on interesed
    Then User chooses appropriate option
    Then User prints the observation on window
    Then user enters Email "<Valid Email>"
    Then User prints the Thank you message on window

    Examples: 
      | Name | Organization Name | Contact Number | Official Email ID | Valid Email     |
      | Atul | Cognizant         |     8860832667 | abc@gmail         | valid@gmail.com |
