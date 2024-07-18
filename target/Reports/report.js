$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Feature/ForgottenPassword.feature");
formatter.feature({
  "name": "Validate the forgotpassword functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User should open the chorme browser and goto facebook",
  "keyword": "Given "
});
formatter.match({
  "location": "ForgotPassword.user_should_open_the_chorme_browser_and_goto_facebook()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Validate by passing mobile number to reset the password",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User should click the forgotpassword button",
  "keyword": "When "
});
formatter.match({
  "location": "ForgotPassword.user_shoul_click_the_forgotpassword_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Navigate to the password reset page",
  "keyword": "And "
});
formatter.match({
  "location": "ForgotPassword.navigate_to_the_password_reset_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should pass the moble number",
  "keyword": "And "
});
formatter.match({
  "location": "ForgotPassword.user_should_pass_the_moble_number()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should click the search button",
  "keyword": "And "
});
formatter.match({
  "location": "ForgotPassword.user_should_click_the_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Validate the page url to know if password has resetted",
  "keyword": "Then "
});
formatter.match({
  "location": "ForgotPassword.validate_the_page_url_to_know_if_password_has_resetted()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/Feature/Login.feature");
formatter.feature({
  "name": "Validate the login funtionality of facebook webstie",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User should open the chorme browser and launch the url",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefinition.user_should_open_the_chorme_browser_and_launch_the_url()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Validate with invalid username and password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "name": "User should enter the invalid credentials in the feilds with List",
  "rows": [
    {
      "cells": [
        "HI",
        "BYE",
        "HI2",
        "BYE2"
      ]
    },
    {
      "cells": [
        "hi@123",
        "bye@123",
        "hi2@123",
        "bye2@123"
      ]
    },
    {
      "cells": [
        "hi@234",
        "bye@234",
        "hi2@234",
        "bye2@234"
      ]
    },
    {
      "cells": [
        "hi@345",
        "bye@345",
        "hi2@345",
        "bye2@345"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDefinition.user_should_enter_the_invalid_credentials_in_the_feilds_with_List(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should get the title of the page",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefinition.user_should_get_the_title_of_the_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User to click login button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefinition.user_to_click_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User login check invalid page opendUp",
  "rows": [
    {
      "cells": [
        "user",
        "pass"
      ]
    },
    {
      "cells": [
        "Abcd",
        "123456"
      ]
    },
    {
      "cells": [
        "hi123",
        "abcd@13"
      ]
    },
    {
      "cells": [
        "Smart",
        "SmartSkill"
      ]
    }
  ],
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "status": "passed"
});
});