Feature: Iceland Search Box

  @IcelandRegression

  Scenario: Iceland Search Functionality

    Given User is in the iceland website
    When User types an item in the search box and clicks on search button
    Then User should be able to see all the products related to that item
