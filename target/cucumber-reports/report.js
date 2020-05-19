$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resource/Login.feature");
formatter.feature({
  "name": "Login Feature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Open Browser",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "open browser",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefs.LoginDefs.open_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter url",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefs.LoginDefs.enter_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter UId And pw",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefs.LoginDefs.enter_UId_And_pw()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "CLick on enter",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefs.LoginDefs.click_on_enter()"
});
formatter.result({
  "status": "passed"
});
});