Feature: As a Brand, I want to be able to view the list of retailers that I have approved, so I can manage them accordingly

  Background:
    Given user launch the browser and Maximize window
    When to hit the Shopdot Url
    And user Login to the SHOPDOT application

  @CR01
  Scenario: Displaying the Connected Retailer List

    When Brand clicks on "Connected Retailers" option from Retailers menu
    Then the list of approved retailers is displayed in alphabetical order by Retailer Name
    And the total number of connected retailers for that brand is displayed on the top next to Connected Retailers

  @CR02
  Scenario: Displaying Empty Approved Retailers List
    When Brand clicks on Approved Retailers option from Retailers menu
    And the Application verifies that there are no approved retailers for that Brand
    Then the following screen will be displayed: "Action buttons for Invite Retailers and View Requests for Access are displayed"

  @CR03
  Scenario: Searching within Connected Retailer List
    Given Brand clicks on "Connected Retailers" option from Retailers menu
    When user enters characters in the search bar
    Then the Application displays only those approved retailers that match the search keyword
    And the Application displays the result count

  @CR04
  Scenario: Displaying No Search Results Found
    Given Brand clicks on "Connected Retailers" option from Retailers menu
    When Brand enters character in the search bar
    And the Application does not find any match for the search keyword
    Then the following message is displayed in the table “There are no approved retailers that meet your criteria”
    And the following buttons are displayed:
      | Invite Retailers       | View Request for Access |
    And the Application displays the result count (which is 0)

    @CR05
  Scenario: Filtering Connected Retailers by Retailer Category
      Given Brand clicks on "Connected Retailers" option from Retailers menu
    When Brand selects retailer category as filter
    Then the Application filters out the Connected Retailers List that match the selected filters
    And displays the selected filters on top of the list
    And the Application displays the result count


  @CR06
  Scenario: Filtering Connected Retailers by State
    Given Brand clicks on "Connected Retailers" option from Retailers menu
    When Brand selects state as filter
    Then the Application filters out the Connected Retailers List that match the selected filters
    And displays the selected filters on top of the list
    And the Application displays the result count


