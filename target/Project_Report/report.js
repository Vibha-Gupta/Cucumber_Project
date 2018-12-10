$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("openweathermap.feature");
formatter.feature({
  "line": 1,
  "name": "Key functionalities of openweathermap.org site",
  "description": "",
  "id": "key-functionalities-of-openweathermap.org-site",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Successful Verification of home page",
  "description": "",
  "id": "key-functionalities-of-openweathermap.org-site;successful-verification-of-home-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user navigates to openweathermap page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "verify the title of the page",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "verify the logo on the page",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "verify the page heading",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "OpenWeatherMap.user_navigates_to_openweathermap_page()"
});
formatter.result({
  "duration": 14994166139,
  "status": "passed"
});
formatter.match({
  "location": "OpenWeatherMap.verify_the_title_of_the_page()"
});
formatter.result({
  "duration": 7392239,
  "status": "passed"
});
formatter.match({
  "location": "OpenWeatherMap.verify_the_logo_on_the_page()"
});
formatter.result({
  "duration": 43023052,
  "status": "passed"
});
formatter.match({
  "location": "OpenWeatherMap.verify_the_page_heading()"
});
formatter.result({
  "duration": 38386232,
  "status": "passed"
});
formatter.match({
  "location": "OpenWeatherMap.close_the_browser()"
});
formatter.result({
  "duration": 121157494,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Successful Verification of weather search for invalid location",
  "description": "",
  "id": "key-functionalities-of-openweathermap.org-site;successful-verification-of-weather-search-for-invalid-location",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 11,
  "name": "user navigates to openweathermap page",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "verify the title of the page",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "verify the input text field",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "enter invalid city name",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "verify the search button on the page",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "click on search button",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "verify the message shown on page",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "OpenWeatherMap.user_navigates_to_openweathermap_page()"
});
formatter.result({
  "duration": 10273286669,
  "status": "passed"
});
formatter.match({
  "location": "OpenWeatherMap.verify_the_title_of_the_page()"
});
formatter.result({
  "duration": 7884421,
  "status": "passed"
});
formatter.match({
  "location": "OpenWeatherMap.verify_the_input_text_field()"
});
formatter.result({
  "duration": 35117766,
  "status": "passed"
});
formatter.match({
  "location": "OpenWeatherMap.enter_invalid_city_name()"
});
formatter.result({
  "duration": 142048581,
  "status": "passed"
});
formatter.match({
  "location": "OpenWeatherMap.verify_the_search_button_on_the_page()"
});
formatter.result({
  "duration": 39741926,
  "status": "passed"
});
formatter.match({
  "location": "OpenWeatherMap.click_on_search_button()"
});
formatter.result({
  "duration": 1719755075,
  "status": "passed"
});
formatter.match({
  "location": "OpenWeatherMap.verify_the_message_shown_on_page()"
});
formatter.result({
  "duration": 58130141,
  "status": "passed"
});
formatter.match({
  "location": "OpenWeatherMap.close_the_browser()"
});
formatter.result({
  "duration": 116888861,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "Successful Verification of weather search for valid location",
  "description": "",
  "id": "key-functionalities-of-openweathermap.org-site;successful-verification-of-weather-search-for-valid-location",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 21,
  "name": "user navigates to openweathermap page",
  "keyword": "Given "
});
formatter.step({
  "line": 22,
  "name": "enter valid city name",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "click on search button",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "verify the weather details on page",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "OpenWeatherMap.user_navigates_to_openweathermap_page()"
});
formatter.result({
  "duration": 11756482376,
  "status": "passed"
});
formatter.match({
  "location": "OpenWeatherMap.enter_valid_city_name()"
});
formatter.result({
  "duration": 155636329,
  "status": "passed"
});
formatter.match({
  "location": "OpenWeatherMap.click_on_search_button()"
});
formatter.result({
  "duration": 2318062274,
  "status": "passed"
});
formatter.match({
  "location": "OpenWeatherMap.verify_the_weather_details_on_page()"
});
formatter.result({
  "duration": 98979055,
  "status": "passed"
});
formatter.match({
  "location": "OpenWeatherMap.close_the_browser()"
});
formatter.result({
  "duration": 132070966,
  "status": "passed"
});
formatter.scenario({
  "line": 27,
  "name": "Successful Verification of weather search for current location",
  "description": "",
  "id": "key-functionalities-of-openweathermap.org-site;successful-verification-of-weather-search-for-current-location",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 28,
  "name": "user navigates to openweathermap page",
  "keyword": "Given "
});
formatter.step({
  "line": 29,
  "name": "click on current location link",
  "keyword": "Then "
});
formatter.step({
  "line": 30,
  "name": "verify the weather details for current location",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "OpenWeatherMap.user_navigates_to_openweathermap_page()"
});
formatter.result({
  "duration": 12231531806,
  "status": "passed"
});
formatter.match({
  "location": "OpenWeatherMap.click_on_current_location_link()"
});
formatter.result({
  "duration": 188243451,
  "status": "passed"
});
formatter.match({
  "location": "OpenWeatherMap.verify_the_weather_details_for_current_location()"
});
formatter.result({
  "duration": 137281995,
  "status": "passed"
});
formatter.match({
  "location": "OpenWeatherMap.close_the_browser()"
});
formatter.result({
  "duration": 130257132,
  "status": "passed"
});
});