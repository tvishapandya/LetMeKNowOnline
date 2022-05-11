Feature: Objective of this feature is to login into the website successfully

  Scenario: To login the website successfully.

    Given User is on the homepage of the website
    When User clicks on Signin link
    And clicks on Login button after entering the Email, password
    Then User panel option displayed. Clicking on that it moves to the profile page where Hello, email id of the user is mentioned.
