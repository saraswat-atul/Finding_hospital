Feature: Finding_hospitals

  @smoke
  Scenario Outline: Applying filter as per the need of cutomser to find hospital
    Given User navigates to practo.com
    When User search for the prefered city as "<City>"
    And User search for the prefered speciality as "<Speciality>"
    Then User can see the options under patient stories
    Then User can select any patient stories
    When User is on experience option
    Then User can select an option as years of experience
    When User is on all filter option
    Then User can select an option zero to five hundred
    And Again user is on all filter option
    Then User can select an option as available today
    When User is on relevance option
    Then User can select an option as experience-high to low
    And User is to select display top doctor details

    Examples: 
      | City      | Speciality   |
      | Bangalore | Cardiologist |
