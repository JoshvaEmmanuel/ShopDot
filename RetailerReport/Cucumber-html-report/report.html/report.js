$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/RetailerPages/Brands.feature");
formatter.feature({
  "name": "Validating Brands Menu functionality",
  "description": "         As a Retailer, I want to be able to view the list of brands, so that I would know what is available for me",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "user launch the browser and Maximize window",
  "keyword": "Given "
});
formatter.match({
  "location": "Brands.user_launch_the_browser_and_Maximize_window()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "to hit the Shopdot Url",
  "keyword": "When "
});
formatter.match({
  "location": "Brands.to_hit_the_Shopdot_Url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user login to the Shopdot Application",
  "keyword": "And "
});
formatter.match({
  "location": "Brands.user_login_to_the_Shopdot_Application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on the Brands menu",
  "keyword": "And "
});
formatter.match({
  "location": "Brands.click_on_the_Brands_menu()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Sending request to the Brand",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@BL001"
    }
  ]
});
formatter.step({
  "name": "the user is on the Brand Listing page",
  "keyword": "And "
});
formatter.match({
  "location": "Brands.the_user_is_on_the_Brand_Listing_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select a Brands and click on the connect button",
  "keyword": "And "
});
formatter.match({
  "location": "Brands.user_select_a_Brands_and_click_on_the_connect_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "displays the sucessful message \"Connect Request Sent Successfully!\"",
  "keyword": "And "
});
formatter.match({
  "location": "Brands.displays_the_sucessful_message(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on the close button in the popup",
  "keyword": "And "
});
formatter.match({
  "location": "Brands.click_on_the_close_button_in_the_popup()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Status changes to \"Pending\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Brands.status_changes_to(String)"
});
formatter.result({
  "status": "passed"
});
});