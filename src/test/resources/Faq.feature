Feature: Objective of this feature is to get the first FAQ question from FAQ page

  Scenario: To fetch the first FAQ question from the Faq page

    Given User is on the homepage of the website
    When User clicks on FAQ link
    Then Fetch the first question from the page