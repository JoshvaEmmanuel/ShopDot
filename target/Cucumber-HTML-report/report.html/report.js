$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/brandPages/brandProfile.feature");
formatter.feature({
  "name": "Validating Brand Profile Menu functionality",
  "description": " User should be able to configure the brand profile so that the retailer will be able to see the user Brand information",
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
  "status": "passed"
});
formatter.step({
  "name": "to hit the Shopdot Url",
  "keyword": "When "
});
formatter.match({
  "location": "Brandprofile.to_hit_the_Shopdot_Url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user Login to the shopdot",
  "keyword": "And "
});
formatter.match({
  "location": "Brandprofile.user_Login_to_the_shopdot()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Display brand profile page",
  "keyword": "And "
});
formatter.match({
  "location": "Brandprofile.display_brand_profile_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate Brand Profile Page without entering Data",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@BP_Tc001"
    }
  ]
});
formatter.step({
  "name": "user click on the Save button without enter any data on the mandatory field",
  "keyword": "And "
});
formatter.match({
  "location": "Brandprofile.user_click_on_the_Save_button_without_enter_any_data_on_the_mandatory_field()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should see the validation error message on the each field",
  "keyword": "Then "
});
formatter.match({
  "location": "Brandprofile.user_should_see_the_validation_error_message_on_the_each_field()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//span[normalize-space()\u003d\u0027Company name is required.\u0027]\"}\n  (Session info: chrome\u003d119.0.6045.200)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027JOSHVA_EMMANUEL\u0027, ip: \u0027192.168.1.5\u0027, os.name: \u0027Windows 11\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002717.0.7\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 119.0.6045.200, chrome: {chromedriverVersion: 119.0.6045.105 (38c72552c5e..., userDataDir: C:\\Users\\Emman\\AppData\\Loca...}, fedcm:accounts: true, goog:chromeOptions: {debuggerAddress: localhost:59422}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}\nSession ID: e128cb6e4ace8d2c129a5bbbab04169a\n*** Element info: {Using\u003dxpath, value\u003d//span[normalize-space()\u003d\u0027Company name is required.\u0027]}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:77)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:499)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:480)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.setpdefinition.Pages.Brandprofile.user_should_see_the_validation_error_message_on_the_each_field(Brandprofile.java:100)\r\n\tat ✽.user should see the validation error message on the each field(file:src/test/resources/brandPages/brandProfile.feature:18)\r\n",
  "status": "failed"
});
});