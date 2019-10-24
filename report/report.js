$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("E:/workspace/FacebookMavenTest/src/test/resources/resource/Home.feature");
formatter.feature({
  "line": 3,
  "name": "Validating the new features of facebook Homepage",
  "description": "",
  "id": "validating-the-new-features-of-facebook-homepage",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@homepage"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "validate facebook page",
  "description": "",
  "id": "validating-the-new-features-of-facebook-homepage;validate-facebook-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "Open facebook",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "validate data",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Validate other",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "outcome",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "HomePageTest.openfacebook()"
});
formatter.result({
  "duration": 133626802746,
  "status": "passed"
});
formatter.match({
  "location": "HomePageTest.validatedata()"
});
formatter.result({
  "duration": 220789461126,
  "status": "passed"
});
formatter.match({
  "location": "HomePageTest.vaidateother()"
});
formatter.result({
  "duration": 1656411712,
  "error_message": "org.openqa.selenium.NoAlertPresentException: no such alert\n  (Session info: chrome\u003d77.0.3865.90)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027LOGESH\u0027, ip: \u0027192.168.0.126\u0027, os.name: \u0027Windows 8.1\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.3\u0027, java.version: \u00271.8.0_201\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 77.0.3865.90, chrome: {chromedriverVersion: 77.0.3865.40 (f484704e052e0..., userDataDir: C:\\Users\\LOGESH~1\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:54219}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: 3d8ef8298fa3b5d493cf87509d1cb714\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:609)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver$RemoteTargetLocator.alert(RemoteWebDriver.java:932)\r\n\tat TestCases.HomePageTest.vaidateother(HomePageTest.java:40)\r\n\tat ✽.And Validate other(E:/workspace/FacebookMavenTest/src/test/resources/resource/Home.feature:8)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "HomePageTest.outcome()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "HomePageTest.closebrowser()"
});
formatter.result({
  "status": "skipped"
});
});