Feature: Key functionalities of openweathermap.org site

Scenario: Successful Verification of home page
Given user navigates to openweathermap page
Then verify the title of the page
And verify the logo on the page
And verify the page heading
Then close the browser

Scenario: Successful Verification of weather search for invalid location
Given user navigates to openweathermap page
Then verify the title of the page
And verify the input text field
And enter invalid city name
And verify the search button on the page
And click on search button
And verify the message shown on page
Then close the browser

Scenario: Successful Verification of weather search for valid location
Given user navigates to openweathermap page 
And enter valid city name 
And click on search button
And verify the weather details on page 
Then close the browser   

Scenario: Successful Verification of weather search for current location
Given user navigates to openweathermap page
Then click on current location link  
And verify the weather details for current location 
Then close the browser