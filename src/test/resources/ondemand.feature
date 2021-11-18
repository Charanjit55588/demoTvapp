@demo
Feature: With guest view mode, a user is able to find a movie from OnDemand with 18A rating.

  Scenario: User enters the app as guest view mode and finds a 18A rating movie from the OnDemand list
    Given user opens he app and enter as guest mode
    And user click on the OnDemand option
    And user scrolls to find a movie with 18A rating
    When user click on the 18A rating
    Then user confirms the 18A is displayed on the movie details page

