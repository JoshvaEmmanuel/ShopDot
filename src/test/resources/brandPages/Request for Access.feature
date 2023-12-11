
Feature: As a Brand, I want to be able to view the list of retailers that requested for connect,
        so that I can review and approve/decline accordingly
  
  Background:
   Given user launch the browser and Maximize window
   When to hit the Shopdot Url
   And user Login to the shopdot
   And user navigated to the onboarding
   And user clicks on Request for Access button from Retailer menu 
   And Display Request for Access page
   
  
  Scenario: Viewing Requests for Access
    Given the user is logged in as a brand representative
    When the user clicks on "Requests for Access" under Retailers main menu
    Then the Application displays the list of retailers requesting access from the brand
    And the sorting order is Pending requests followed by Connected requests and then Declined requests
    
  @tag1
  Scenario: Action 3-dot menu
    And user click on the View/Edit from the Action 3-dot menu
    Then it should redirect to the Retailer Profile Screen 

 
