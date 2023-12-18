Feature: As a Brand, I want to be able to view the list of retailers that requested for connect,
          so that I can review and approve/decline accordingly

  Background:
    Given user launch the browser and Maximize window
    When to hit the Shopdot Url
    And user Login to the SHOPDOT application

  @RA01
  Scenario: Viewing Requests for Access
    And the retailer clicks on "Requests for Access" under Retailers main menu
    Then the Application displays the list of retailers requesting access from the brand
    And the sorting order is Pending requests followed by Connected requests and then Declined requests

  @RA02
  Scenario: Retailer Interaction with the 3-dot Menu
    And the retailer clicks on "Requests for Access" under Retailers main menu
    And the retailer clicks on the View or Edit button from 3dot menu
    Then it should navigate to the Retailer profile screen

  @RA03
  Scenario: Attempts to approve the request without assigning a product
    And the retailer clicks on "Requests for Access" under Retailers main menu
    And retailer clicks on the Retailer Profile
    And it redirect to the retailer profile screen
    And Retailer clicks on the Approve Button without assign any product
    Then it should display the error message "Assign at least one product to approve retailer"

  @RA04
  Scenario: Declining Retailer Access Request for a Pending Status
    And the retailer clicks on "Requests for Access" under Retailers main menu
    When Brand clicks on Decline button from Retailer Profile Screen
    Then a confirmation message is display "You are declining <Retailer’s Store Name> request for access.They will not be able to order any of your products in ShopDot.Do you wish to continue?"
    When Brand clicks on "Yes" from the pop-up
    Then the brand-retailer connection request’s status is updated from "Pending" to "Declined"
#    And a success message is displayed on the screen: "<Retailer Name> has been declined access to your products"

  @RA05
  Scenario: Declining an Approved Retailer Request
    And the retailer clicks on "Requests for Access" under Retailers main menu
    When user clicks on "View/Edit" link from one of the Approved retailers
    Then the Retailer Profile Screen is displayed with an option to Decline

    When user clicks on Decline
    Then a pop-up is displayed with the message: "You are declining <Retailer’s Store Name> request for access.They will not be able to order any of your products in ShopDot.Do you wish to continue?"

    When Brand clicks on "Yes" from the pop-up
    Then the retailer connection status is updated from "Connected" to "Declined"

    And all previously assigned products are unassigned
    And a message is displayed on the screen: "<Retailer Name> has no longer access to your products"

