Feature: As a Brand, I want to be able to view the list of retailers that requested for connect,
          so that I can review and approve/decline accordingly

  Background:
    Given user launch the browser and Maximize window
    When to hit the Shopdot Url
    And user Login to the shopdot application

  @RA01
  Scenario: Viewing Requests for Access
    And the retailer clicks on "Requests for Access" under Retailers main menu
    Then the Application displays the list of retailers requesting access from the brand
    And the sorting order is Pending requests followed by Connected requests and then Declined requests

  @RA02
  Scenario: Retailer Interaction with the 3-dot Menu
    And the retailer clicks on "Requests for Access" under Retailers main menu
    And the retailer clicks on the View/Edit button from 3-dot menu
    Then it should navigate to the Retailer profile screen

  @RA03
  Scenario: Attempts to approve the request without assigning a product
    And the retailer clicks on "Requests for Access" under Retailers main menu
    And retailer clicks on the Retailer Profile
    And it redirect to the retailer profile screen
    And Retailer clicks on the Approve Button without assign any product
    Then it should display the error message "Assign at least one product to approve retailer"

  @RA04
  Scenario:
