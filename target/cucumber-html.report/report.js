$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("search.feature");
formatter.feature({
  "line": 2,
  "name": "Test Crossword search scenario",
  "description": "",
  "id": "test-crossword-search-scenario",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@search"
    }
  ]
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Test login with valid credentials",
  "description": "",
  "id": "test-crossword-search-scenario;test-login-with-valid-credentials",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "Open chrome and start application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I enter valid \"\u003cusernameNumber\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user should be able to login",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "the user search a book",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user click search button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "application should be closed",
  "keyword": "Then "
});
formatter.examples({
  "line": 11,
  "name": "",
  "description": "",
  "id": "test-crossword-search-scenario;test-login-with-valid-credentials;",
  "rows": [
    {
      "cells": [
        "usernameNumber"
      ],
      "line": 12,
      "id": "test-crossword-search-scenario;test-login-with-valid-credentials;;1"
    },
    {
      "cells": [
        "1"
      ],
      "line": 13,
      "id": "test-crossword-search-scenario;test-login-with-valid-credentials;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 13,
  "name": "Test login with valid credentials",
  "description": "",
  "id": "test-crossword-search-scenario;test-login-with-valid-credentials;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@search"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "Open chrome and start application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I enter valid \"1\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user should be able to login",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "the user search a book",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user click search button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "application should be closed",
  "keyword": "Then "
});
formatter.match({
  "location": "CrossWordTest.open_chrome_and_start_application()"
});
