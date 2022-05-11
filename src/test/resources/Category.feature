Feature: Objective of this feature is to verify not more than 10 jobs are listed in Categories/Jobs.

  Scenario: To verify not more than ten job are listed on the page

    Given User is on the homepage of the website
    When User clicks on the Categories dropdown menu
          And User clicks on Jobs option from the menu
    Then Not more than ten jobs are listed on the page

