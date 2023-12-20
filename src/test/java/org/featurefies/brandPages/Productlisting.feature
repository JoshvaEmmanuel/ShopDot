
Feature: As a Brand, I want to be able to view, search, edit, sort, and filter my product listing 


  @PL01
  Scenario: View Product Listing initially synced from E-Commerce Website
    Given user launch the browser and Maximize window
    When to hit the Shopdot Url
    And User login to the ShopDot Application
    And User clicks on the products button
#  And Brand clicks on Products Listing menu
  Then the products from the E-Commerce website that are initially synced will be listed
    
   @PL02
   Scenario: Activating products for the first time
     Given user launch the browser and Maximize window
     When to hit the Shopdot Url
     And User login to the ShopDot Application
     And User clicks on the products button
     And Displays the Products Listing Screen
   And user add the Tags for "The Multi-location Snowboard"
   And displays sucessful message
   And user selects Category for "The Multi-location Snowboard"
   And again displays sucessful message
   And the status button become enable
   And the user click on the Inactive button 
   Then congratulation Pop up displays
   And the Inactive changes to Active status

  @PL03
   Scenario: Search for a Product Name
    Given user launch the browser and Maximize window
    When to hit the Shopdot Url
    And User login to the ShopDot Application
    And User clicks on the products button
    And Displays the Products Listing Screen
    When user enters product in the search bar
    Then the Application displays only those Products that match the search keyword
    And the Application displays the result count

  @PL04
  Scenario: Displaying No search results found in ProductListing
    Given user launch the browser and Maximize window
    When to hit the Shopdot Url
    And User login to the ShopDot Application
    And User clicks on the products button
    And Displays the Products Listing Screen
    When Brand enters non existing Product name in the search bar
    Then the following message is displayed in the table:“There are no products that meet your criteria.”


  