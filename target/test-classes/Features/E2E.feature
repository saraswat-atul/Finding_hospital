Feature: Finding_hospitals

  @smoke
  Scenario Outline: Apply filter to find hospital in bangalore for cardiologist disease at webpage pract.com
    Given User navigates to practo.com
    When User search for the prefered city as "<City>"
    And User search for the prefered speciality as "<Speciality>"
    Then User can see the options under patient stories
    Then User selects ten plus patient stories
    Then User is on experience option
    Then User selects five plus years of experience
    When User is on all filter option
    Then User selects zero to five hundred
    And Again user is on all filter option
    Then User selects available today
    When User is on relevance option
    Then User selects experience high to low
    Then Webpage displays top five doctor details

    Examples: 
      | City      | Speciality   |
      | Bangalore | Cardiologist |

  @regression
  Scenario: Extract surgery option on the practo home page store and display all surgery on console
    When User does click on surgery option
    Then User store and displays the surgery list on the console

  @regression
  Scenario Outline: On the practo home page under For Corporate option fill health and wellness plan form
    When User clicks on for corporate option on home page
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
    Then system prints the Thank you message on window

    Examples: 
      | Name | Organization Name | Contact Number | Official Email ID | Valid Email     |
      | Atul | Cognizant         |     8860832667 | abc@gmail         | valid@gmail.com |
