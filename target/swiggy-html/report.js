$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/SwiggyFunctionality.feature");
formatter.feature({
  "name": "Singup functionality in swiggy website",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Search"
    }
  ]
});
formatter.scenario({
  "name": "Provide the signUp functions to swiggy users",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Search"
    },
    {
      "name": "@Sanity"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "The user is on the swiggy home page",
  "keyword": "Given "
});
formatter.match({
  "location": "SwiggySignUp.the_user_is_on_the_swiggy_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on SignUp",
  "keyword": "When "
});
formatter.match({
  "location": "SwiggySignUp.user_click_on_signup()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be redirected to SignUp page",
  "keyword": "Then "
});
formatter.match({
  "location": "SwiggySignUp.user_should_be_redirected_to_signup_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Provide the SignUp functions to swiggy user",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "name": "The user is on the swiggy SignUp page",
  "keyword": "Given "
});
formatter.step({
  "name": "User enters \"\u003cPhoneNumber\u003e\"\"\u003cName\u003e\"\"\u003cEmail\u003e\" and \"\u003cPassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "User should be able to SignUp",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "PhoneNumber",
        "Name",
        "Email",
        "Password"
      ]
    },
    {
      "cells": [
        "8888888888",
        "user",
        "user@gmail.com",
        "abc123"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Provide the SignUp functions to swiggy user",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Search"
    },
    {
      "name": "@Sanity"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "The user is on the swiggy SignUp page",
  "keyword": "Given "
});
formatter.match({
  "location": "SwiggySignUp.the_user_is_on_the_swiggy_signup_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters \"8888888888\"\"user\"\"user@gmail.com\" and \"abc123\"",
  "keyword": "When "
});
formatter.match({
  "location": "SwiggySignUp.user_enters_somethingsomethingsomething_and_something(String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be able to SignUp",
  "keyword": "Then "
});
formatter.match({
  "location": "SwiggySignUp.user_should_be_able_to_signup()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});