Feature: Homepage Functionality

  @Smoke

  Scenario: Searchbox Functionality
    Given User is in the homepage of Argos website
    When User types any product to search in the search box and clicks on the search button
    Then User should be able to see all the products related to search

    @Regression

    Scenario: AccountButton Functionality
      Given User is in the argos website homepage
      When User clicks account button
      Then User can see the account details

      @Sanity

      Scenario: Wishlist Butoon

    Given User is in the homepage of Argos website
    When User clicks on Wishlist button
    Then User should be able to see all wishlist

        @MultipleInput

        Scenario Outline: : Search for multiple products
          Given User is in the homepage of Argos website
          When user search for "<products>"
          Then user should be able to search all the products
          Examples:
          |products|
          |nike    |
          |puma    |


  @Calender

  Scenario: Calender Date

    Given User in the homepage of expedia
    And User clicks on flight button
    And User clicks on departing field tab
    When User takes all the dates in the list
    And User clicks on one particular date
    Then User should be able to select the date on which he wants to travel
