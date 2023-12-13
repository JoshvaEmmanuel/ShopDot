Feature: Validating Brand Profile Menu functionality 

 User should be able to configure the brand profile so that the retailer will be able to see the user Brand information
 
 Background:
 Given user launch the browser and Maximize window
 When to hit the Shopdot Url
 And user Login to the shopdot
 #And user navigated to the onboarding
 #And user clicks on Brand Profile menu from Settings
 And Display brand profile page


 @BP_Tc001
 Scenario: To validate Brand Profile Page without entering Data
 
 And user click on the Save button without enter any data on the mandatory field
 Then user should see the validation error message on the each field
 
 @BP_Tc002
 Scenario: Update Brand Profile Page
 
 And user enter company name on the Company name field
 And user enter email on the Contact email field
 And user enter phone numer in the Contact phone number field
 And user upload the logo in the Upload logo field
 And user enter brand name in the Brand name filed
 And user enter website in the Brand website field
 And user selects three Brand category from the Brand category field
 And user selects Brand values from the Brand values field
 And user enters data in the About the brand field box
 And user enters link in the Add a Youtube or Vimeo video link field
 And user click on the Save button
 And User is automatically moved to the next page, which is Prefernces Page
 Then user should see the Sucessful message
 
 
  @BP_Tc003
  Scenario: Validating Brand profile page with entring invalid format in Contact Email field link Field
  
  When user enter the emailid "Test@)9////" in Contact email Field
   Then user should see the error message "Must be a valid email." below the fields


 



 




