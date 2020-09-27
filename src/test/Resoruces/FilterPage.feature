Feature: FilterPage Functionality

  Background:

    Given User is in the homepage of Argos website
    When User types any product to search in the search box and clicks on the search button
    Then User should be able to see all the products related to search
    When user clicks on Sports and Fitness category
    Then user should be able to see Sports and Fitness category


  @Smoke

    Scenario: Add to Basket

      When clicks on the add to trolley of Nike Lean Armbands
      And user clicks on go to trolley button
      Then user should be able to see the product in the basket