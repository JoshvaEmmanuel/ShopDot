Feature: Validating Integrations menu functionality
  
  Background:
 Given User launch the browser and Maximize the window
 When to hit the Shopdot Url
 And user Login to the Shopdot application
 And user clicks on Integrations menu from Settings
 And Display Integrations menu page
 
 @IP001
 Scenario: Validating the Connect button is Disabled on the Integrations page 
 And user click on the connect button it should be Disabled
 Then user should see error text on below the field 
 
 @IP002
 Scenario: Validating Integrations page with entering invalid Store Name 
 And user enter invalid store name in the field
 Then user should see the error text message on below the Field
 
 @IP003
 Scenario: Validating Integrations page with entering valid Store Name
 And user enter Store name 
 And user click on the Connect button
 And user should see the sucessful message on the page 
 Then it should navigate to the Shopify Login page 
 And user Login to the Shopify
 And navigate to the shopdot Integrations screen with the status Connected
 
  @IP004
  Scenario: Disconnect store from the ShopDot
  And user click on the Disconnect from Shopify button
  Then user will see the pop-up Message on the screen
  And user click on the Disconnect button on the Pop-up message
  And user should see the sucessful message
  And user should able to see the Reconnect shopify button and display the Disconneted status
  
  @IP005
  Scenario: reconnecting the store from shopify
  And user click on the Reconnect Shopify button
  Then sucessful message display on the Screen
  And user should able to see the Disconnect from Shopify button and display the Connected status

  @IP006
  Scenario: Validating whether user is able to connect with Existing Shopify Store Name
   And the user enters an existing Shopify store name in the connection field
   And user click on the Connect button
   And displays a Error message if the store name exists
  

