Feature: Searching new cars
  
  In order to search new cars
  As a user
  I have to navigate to carwale.com

  Scenario: Finding new cars on carwale website
    Given user navigates to carwale website
    And user moveover to new cars
    Then user clicks on FindNewCars
    Then user clicks on Toyota cars
    And user validates the carTitle as Toyota Cars
