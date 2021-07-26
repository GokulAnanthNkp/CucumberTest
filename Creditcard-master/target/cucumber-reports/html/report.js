$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("test.feature");
formatter.feature({
  "line": 1,
  "name": "Credit Card Validator",
  "description": "Feature file to check credit card issue based on pan credit score",
  "id": "credit-card-validator",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "",
  "description": "",
  "id": "credit-card-validator;",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user in homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enters the pan no \"APPXA2244X\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "credit card is \"eligible\"",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_in_homepage()"
});
formatter.result({
  "duration": 7613852542,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "APPXA2244X",
      "offset": 24
    }
  ],
  "location": "StepDefinition.user_enters_the_pan_no(String)"
});
formatter.result({
  "duration": 324290697,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "eligible",
      "offset": 16
    }
  ],
  "location": "StepDefinition.credit_card_is(String)"
});
formatter.result({
  "duration": 959610700,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "",
  "description": "",
  "id": "credit-card-validator;",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "user in homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "user enters the pan no \"AXVPS7766V\"",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "credit card is \"not eligible\"",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_in_homepage()"
});
formatter.result({
  "duration": 9280261185,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "AXVPS7766V",
      "offset": 24
    }
  ],
  "location": "StepDefinition.user_enters_the_pan_no(String)"
});
formatter.result({
  "duration": 258406493,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "not eligible",
      "offset": 16
    }
  ],
  "location": "StepDefinition.credit_card_is(String)"
});
formatter.result({
  "duration": 485145275,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "",
  "description": "",
  "id": "credit-card-validator;",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 15,
  "name": "user in homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "user enters the pan no \"AZERF9654R\"",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "credit card is \"Invalid\"",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_in_homepage()"
});
formatter.result({
  "duration": 7049659170,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "AZERF9654R",
      "offset": 24
    }
  ],
  "location": "StepDefinition.user_enters_the_pan_no(String)"
});
formatter.result({
  "duration": 227526270,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Invalid",
      "offset": 16
    }
  ],
  "location": "StepDefinition.credit_card_is(String)"
});
formatter.result({
  "duration": 240945160,
  "status": "passed"
});
});