Feature: Resultpage functionality

  Background:

    Given User is in the homepage of Argos website
    When User types any product to search in the search box and clicks on the search button
    Then User should be able to see all the products related to search

  @Travel
    Scenario: click on travel

      Given user in nike result page
      When user clicks on travel category
      Then user can see travel category products

      @Regression
      Scenario: click on £5-£10 button

        Given user in nike result page
        When user clicks on £5-£10 price range
        Then user should be able to see all items in that price range

        @Smoke
        Scenario: Click on Sports and Fitness functionality

          Then User should be able to see all the products related to search
          When user clicks on Sports and Fitness category
          Then user should be able to see Sports and Fitness category

          @Sanity
          Scenario: Click

