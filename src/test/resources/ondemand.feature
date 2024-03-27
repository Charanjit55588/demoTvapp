@login
Feature: With guest view mode, a user is able to find a movie from OnDemand with 18A rating.

  Scenario Outline: User enters the app as guest view mode and finds a 18A rating movie from the OnDemand list
    Given user opens the app
    And user enters "<email>" address
    And user enters "<password>"
    When user clicks on the sign in
    Then user is taken to home screen

    Examples:
     | email             | password |
     | example1@gmail.com | Password |
     | example2@gmail.com | Password |

 ## The app closes after first set of data because when we click on register the app closes.
  ## Just open the app manually for now