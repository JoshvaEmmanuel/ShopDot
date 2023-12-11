$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/brandPages/Request%20for%20Access.feature");
formatter.feature({
  "name": "As a Brand, I want to be able to view the list of retailers that requested for connect,",
  "description": "        so that I can review and approve/decline accordingly",
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
  "location": "Prefernces.user_launch_the_browser_and_Maximize_window()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "to hit the Shopdot Url",
  "keyword": "When "
});
formatter.match({
  "location": "Brandprofile.to_hit_the_Shopdot_Url()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user Login to the shopdot",
  "keyword": "And "
});
formatter.match({
  "location": "Brandprofile.user_Login_to_the_shopdot()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user navigated to the onboarding",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user clicks on Request for Access button from Retailer menu",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Display Request for Access page",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "Action 3-dot menu",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "name": "user click on the View/Edit from the Action 3-dot menu",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "it should redirect to the Retailer Profile Screen",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});