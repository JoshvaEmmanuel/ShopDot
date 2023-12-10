$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/RetailerPages/RetailerOnboarding.feature");
formatter.feature({
  "name": "Validating the Retailer Onboarding",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Updating the Retailer Profile Page for new user",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User Launch the Browser and Maximize the Window",
  "keyword": "Given "
});
formatter.match({
  "location": "retailerProfile.user_Launch_the_Browser_and_Maximize_the_Window()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User hit the Shopdot URL",
  "keyword": "When "
});
formatter.match({
  "location": "retailerProfile.user_hit_the_Shopdot_URL()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Login to the ShopDot Application",
  "keyword": "And "
});
formatter.match({
  "location": "retailerProfile.user_Login_to_the_ShopDot_Application()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchWindowException: no such window: target window already closed\nfrom unknown error: web view not found\n  (Session info: chrome\u003d119.0.6045.200)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027JOSHVA_EMMANUEL\u0027, ip: \u0027192.168.1.3\u0027, os.name: \u0027Windows 11\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002717.0.7\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 119.0.6045.200, chrome: {chromedriverVersion: 119.0.6045.105 (38c72552c5e..., userDataDir: C:\\Users\\Emman\\AppData\\Loca...}, fedcm:accounts: true, goog:chromeOptions: {debuggerAddress: localhost:52101}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}\nSession ID: e7b2019a52c14e7e54a992b14bdab6a6\n*** Element info: {Using\u003dxpath, value\u003d//input[@placeholder\u003d\u0027Email address\u0027]}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:77)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:499)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:480)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.retailerPageStep.retailerProfile.user_Login_to_the_ShopDot_Application(retailerProfile.java:35)\r\n\tat ✽.User Login to the ShopDot Application(file:src/test/resources/RetailerPages/RetailerOnboarding.feature:7)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "User Click on the Setting button",
  "keyword": "And "
});
formatter.match({
  "location": "retailerProfile.user_Click_on_the_Setting_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Display the Retailer Profile Menu Page",
  "keyword": "And "
});
formatter.match({
  "location": "retailerProfile.display_the_Retailer_Profile_Menu_Page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user enter Company name in Company name field",
  "keyword": "And "
});
formatter.match({
  "location": "retailerProfile.user_enter_Company_name_in_Company_name_field()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user enter the email in the Contact email field",
  "keyword": "And "
});
formatter.match({
  "location": "retailerProfile.user_enter_the_email_in_the_Contact_email_field()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user phone number in the Contact phone number field",
  "keyword": "And "
});
formatter.match({
  "location": "retailerProfile.user_phone_number_in_the_Contact_phone_number_field()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user uplod the logo",
  "keyword": "And "
});
formatter.match({
  "location": "retailerProfile.user_uplod_the_logo()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user enter the Retailer name",
  "keyword": "And "
});
formatter.match({
  "location": "retailerProfile.user_enter_the_Retailer_name()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user enter website on the Retailer website field",
  "keyword": "And "
});
formatter.match({
  "location": "retailerProfile.user_enter_website_on_the_Retailer_website_field()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user slect one option from the Retailer category field",
  "keyword": "And "
});
formatter.match({
  "location": "retailerProfile.user_slect_one_option_from_the_Retailer_category_field()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user select Retailer values",
  "keyword": "And "
});
formatter.match({
  "location": "retailerProfile.user_select_Retailer_values()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "enter data on the About the retailer field",
  "keyword": "And "
});
formatter.match({
  "location": "retailerProfile.enter_data_on_the_About_the_retailer_field()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user enter the link on the Add a Youtube or Vimeo video link field",
  "keyword": "And "
});
formatter.match({
  "location": "retailerProfile.user_enter_the_link_on_the_Add_a_Youtube_or_Vimeo_video_link_field()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user upload the store photo",
  "keyword": "And "
});
formatter.match({
  "location": "retailerProfile.user_upload_the_store_photo()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user enter address",
  "keyword": "And "
});
formatter.match({
  "location": "retailerProfile.user_enter_address()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user select the Country",
  "keyword": "And "
});
formatter.match({
  "location": "retailerProfile.user_select_the_Country()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user select the State",
  "keyword": "And "
});
formatter.match({
  "location": "retailerProfile.user_select_the_State()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user enter City",
  "keyword": "And "
});
formatter.match({
  "location": "retailerProfile.user_enter_City()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user enter ZIP",
  "keyword": "And "
});
formatter.match({
  "location": "retailerProfile.user_enter_ZIP()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user click on the Save button",
  "keyword": "And "
});
formatter.match({
  "location": "retailerProfile.user_click_on_the_Save_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "Billing setup",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "click on the billing menu",
  "keyword": "And "
});
formatter.match({
  "location": "Billing.click_on_the_billing_menu()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchWindowException: no such window: target window already closed\nfrom unknown error: web view not found\n  (Session info: chrome\u003d119.0.6045.200)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027JOSHVA_EMMANUEL\u0027, ip: \u0027192.168.1.3\u0027, os.name: \u0027Windows 11\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002717.0.7\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 119.0.6045.200, chrome: {chromedriverVersion: 119.0.6045.105 (38c72552c5e..., userDataDir: C:\\Users\\Emman\\AppData\\Loca...}, fedcm:accounts: true, goog:chromeOptions: {debuggerAddress: localhost:52101}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}\nSession ID: e7b2019a52c14e7e54a992b14bdab6a6\n*** Element info: {Using\u003dxpath, value\u003d//a[@data-link\u003d\u0027Billing\u0027]}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:77)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:499)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:480)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.retailerPageStep.Billing.click_on_the_billing_menu(Billing.java:67)\r\n\tat ✽.click on the billing menu(file:src/test/resources/RetailerPages/RetailerOnboarding.feature:31)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "retailer click on the Add new credit card",
  "keyword": "And "
});
formatter.match({
  "location": "Billing.retailer_click_on_the_Add_new_credit_card()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "displays Add new credit card screen",
  "keyword": "And "
});
formatter.match({
  "location": "Billing.displays_Add_new_credit_card_screen()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "retailer enter firstname",
  "keyword": "And "
});
formatter.match({
  "location": "Billing.retailer_enter_firstname()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "enter lastname",
  "keyword": "And "
});
formatter.match({
  "location": "Billing.enter_lastname()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "enter Phone number",
  "keyword": "And "
});
formatter.match({
  "location": "Billing.enter_Phone_number()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "enter Card number",
  "keyword": "And "
});
formatter.match({
  "location": "Billing.enter_Card_number()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "enter Expiration date",
  "keyword": "And "
});
formatter.match({
  "location": "Billing.enter_Expiration_date()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "enter CVV number",
  "keyword": "And "
});
formatter.match({
  "location": "Billing.enter_CVV_number()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "enter Billing address",
  "keyword": "And "
});
formatter.match({
  "location": "Billing.enter_Billing_address()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "retailer selects Country",
  "keyword": "And "
});
formatter.match({
  "location": "Billing.retailer_selects_Country()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "retailer selects the State",
  "keyword": "And "
});
formatter.match({
  "location": "Billing.retailer_selects_the_State()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "retailer enter City",
  "keyword": "And "
});
formatter.match({
  "location": "Billing.retailer_enter_City()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "retailer enter ZIP",
  "keyword": "And "
});
formatter.match({
  "location": "Billing.retailer_enter_ZIP()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click on the save button",
  "keyword": "And "
});
formatter.match({
  "location": "Billing.click_on_the_save_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "redirect to the main screen",
  "keyword": "Then "
});
formatter.match({
  "location": "Billing.redirect_to_the_main_screen()"
});
formatter.result({
  "status": "skipped"
});
});