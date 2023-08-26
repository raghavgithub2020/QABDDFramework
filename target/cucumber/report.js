$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("automationTestStore.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: Raghav"
    }
  ],
  "line": 3,
  "name": "Automation Test Store E2E Flows Validation",
  "description": "",
  "id": "automation-test-store-e2e-flows-validation",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4538371489,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Automation Test Store New User Registration",
  "description": "",
  "id": "automation-test-store-e2e-flows-validation;automation-test-store-new-user-registration",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "user on Automation Test Store Homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User click on Login or register link",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Click on Continue button for I AM A NEW CUSTOMER.",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Fill the all the fields with required data",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Click on radio button with NO",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Select the checkbox for Privacy Policy",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Click on Continue button",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "Verify YOUR ACCOUNT HAS BEEN CREATED message displayed.",
  "keyword": "And "
});
formatter.match({
  "location": "automationTestStore.user_on_Automation_Test_Store_Homepage()"
});
formatter.result({
  "duration": 15706993738,
  "error_message": "org.openqa.selenium.NoSuchWindowException: no such window: target window already closed\nfrom unknown error: web view not found\n  (Session info: chrome\u003d116.0.5845.110)\nBuild info: version: \u00273.11.0\u0027, revision: \u0027e59cfb3\u0027, time: \u00272018-03-11T20:26:55.152Z\u0027\nSystem info: host: \u0027Raghavendras-MacBook-Air.local\u0027, ip: \u0027fe80:0:0:0:14ae:94e4:b812:c1d3%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002712.6.7\u0027, java.version: \u00271.8.0_333\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 116.0.5845.110, chrome: {chromedriverVersion: 116.0.5845.96 (1a3918166880..., userDataDir: /var/folders/hs/nh7hz94n1v3...}, fedcm:accounts: true, goog:chromeOptions: {debuggerAddress: localhost:49290}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: MAC, platformName: MAC, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}\nSession ID: 7323b9a3d15397af3429d9c751222edc\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:545)\n\tat org.openqa.selenium.remote.RemoteWebDriver.get(RemoteWebDriver.java:273)\n\tat pageObjects.automationTestStoreRegistrationPage.homePage(automationTestStoreRegistrationPage.java:59)\n\tat pageObjects.automationTestStoreRegistrationPage.homePage(automationTestStoreRegistrationPage.java:60)\n\tat pageObjects.automationTestStoreRegistrationPage.homePage(automationTestStoreRegistrationPage.java:60)\n\tat pageObjects.automationTestStoreRegistrationPage.homePage(automationTestStoreRegistrationPage.java:60)\n\tat pageObjects.automationTestStoreRegistrationPage.homePage(automationTestStoreRegistrationPage.java:60)\n\tat pageObjects.automationTestStoreRegistrationPage.homePage(automationTestStoreRegistrationPage.java:60)\n\tat pageObjects.automationTestStoreRegistrationPage.homePage(automationTestStoreRegistrationPage.java:60)\n\tat pageObjects.automationTestStoreRegistrationPage.homePage(automationTestStoreRegistrationPage.java:60)\n\tat pageObjects.automationTestStoreRegistrationPage.homePage(automationTestStoreRegistrationPage.java:60)\n\tat pageObjects.automationTestStoreRegistrationPage.homePage(automationTestStoreRegistrationPage.java:60)\n\tat pageObjects.automationTestStoreRegistrationPage.homePage(automationTestStoreRegistrationPage.java:60)\n\tat pageObjects.automationTestStoreRegistrationPage.homePage(automationTestStoreRegistrationPage.java:60)\n\tat pageObjects.automationTestStoreRegistrationPage.homePage(automationTestStoreRegistrationPage.java:60)\n\tat pageObjects.automationTestStoreRegistrationPage.homePage(automationTestStoreRegistrationPage.java:60)\n\tat stepDefinitions.automationTestStore.user_on_Automation_Test_Store_Homepage(automationTestStore.java:20)\n\tat ✽.Given user on Automation Test Store Homepage(automationTestStore.feature:7)\n",
  "status": "failed"
});
formatter.match({
  "location": "automationTestStore.user_click_on_Login_or_register_link()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "automationTestStore.click_on_Continue_button_for_I_AM_A_NEW_CUSTOMER()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "automationTestStore.fill_the_all_the_fields_with_required_data()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "automationTestStore.click_on_radio_button_with_NO()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "automationTestStore.select_the_checkbox_for_Privacy_Policy()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "automationTestStore.click_on_Continue_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "automationTestStore.verify_YOUR_ACCOUNT_HAS_BEEN_CREATED_message_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 3530607,
  "status": "passed"
});
});