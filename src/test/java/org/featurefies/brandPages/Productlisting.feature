
Feature: As a Brand, I want to be able to view, search, edit, sort, and filter my product listing 


  Background:
  #Given User lauch the browser and Maximize the Window
  #When User to hit the ShopDot URL
  And User login to the ShopDot Application
  And User clicks on the products button
  And Displays the Products Listing Screen


  
  @PL_001
  Scenario: View Product Listing initially synced from E-Commerce Website
  And Brand clicks on Products Listing menu
  Then the products from the E-Commerce website (i.e., Shopify) that are initially synced will be listed
    
   @PL_002
   Scenario: Activating products for the first time
   And user selects the Tags
   And displays sucessful message
   And user selects Category
   And again displays sucessful message
   And the status button become enable
   And the user click on the Inactive button 
   Then congratulation Pop up displays
   And the Inactive changes to Active status
   
   
   Scenario: Search for a Product Name
   



  