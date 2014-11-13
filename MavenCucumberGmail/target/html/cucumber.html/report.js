$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("GmailSignup.feature");
formatter.feature({
  "id": "gmail-signup-feature",
  "description": "",
  "name": "Gmail Signup feature",
  "keyword": "Feature",
  "line": 1
});
formatter.scenario({
  "id": "gmail-signup-feature;to-test-signup-page-for-validation-messages.",
  "description": "",
  "name": "To test Signup page for validation messages.",
  "keyword": "Scenario",
  "line": 3,
  "type": "scenario"
});
formatter.step({
  "name": "I am on Gmail Loginpage",
  "keyword": "Given ",
  "line": 4
});
formatter.step({
  "name": "I click on the Signup page",
  "keyword": "When ",
  "line": 5
});
formatter.step({
  "name": "I click on the Next button without entering mandatory fields",
  "keyword": "And ",
  "line": 6,
  "rows": [
    {
      "cells": [
        "fields",
        "value"
      ],
      "line": 7
    },
    {
      "cells": [
        "FirstName",
        "TestFirstName"
      ],
      "line": 8
    },
    {
      "cells": [
        "LastName",
        "TestLastName"
      ],
      "line": 9
    },
    {
      "cells": [
        "UserID",
        ""
      ],
      "line": 10
    }
  ]
});
formatter.step({
  "name": "It should display an appropriate error message",
  "keyword": "Then ",
  "line": 11
});
formatter.match({
  "location": "GmailSignupStepDefinition.navigateToGmailLoginpage()"
});
formatter.result({
  "duration": 29382548587,
  "status": "passed"
});
formatter.match({
  "location": "GmailSignupStepDefinition.clickOnSignupLink()"
});
formatter.result({
  "duration": 840132155,
  "status": "passed"
});
formatter.match({
  "location": "GmailSignupStepDefinition.enterUserData(DataTable)"
});
formatter.result({
  "duration": 12163196978,
  "status": "passed"
});
formatter.match({
  "location": "GmailSignupStepDefinition.validateError()"
});
formatter.result({
  "duration": 145573738,
  "status": "passed"
});
});