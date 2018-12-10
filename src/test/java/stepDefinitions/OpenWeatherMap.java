package stepDefinitions;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import BaseClass.Base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;

public class OpenWeatherMap extends Base {
	
	@Given("^user navigates to openweathermap page$")
	 public void user_navigates_to_openweathermap_page() throws Exception
	{
		 initializationMethod();
		 System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/chromedriver");
		 driver = new ChromeDriver();
		 System.out.println("Test Case running on Chrome browser.");
		 driver.get(CONFIG.getProperty("URL"));
		 
		 //Set the page load timeout and implicit wait time.
		 driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@Then("^verify the title of the page$")
	 public void verify_the_title_of_the_page()
	{
		//compare actual title with the expected
		String ActualTitle = driver.getTitle();
		//Assert is deliberately not used, as it will terminate the execution if condition fails. SoftAssert is another option.
		if (ActualTitle.equalsIgnoreCase(CONFIG.getProperty("Expected_Page_Title")))
		{
			System.out.println("Actual page title displayed is: " + ActualTitle + ", as expected.");
		}else
		{
			System.out.println("Expected title was :" + CONFIG.getProperty("Expected_Page_Title") + ", but the Actual Title displayed is: " + ActualTitle);
		}
	}
	
	@And("^verify the logo on the page$")
	 public void verify_the_logo_on_the_page()
	{
		Boolean IsLogoDisplayed = driver.findElement(By.xpath(OR.getProperty("Page_Logo_Xpath"))).isDisplayed();
		//Verify if the logo is displayed
		if (IsLogoDisplayed)
		{
			System.out.println("openweathermap.org site Logo is displayed.");
		}else
		{
			System.out.println("openweathermap.org site Logo is not displayed on page.");
		}
	}
	
	@And("^verify the page heading$")
	 public void verify_the_page_heading()
	{
		String ActualPageHeading = driver.findElement(By.xpath(OR.getProperty("Page_Heading_Xpath"))).getText();
		//Assert is deliberately not used, as it will terminate the execution if condition fails. SoftAssert is another option.
		if (ActualPageHeading.equals(CONFIG.getProperty("Expected_Page_Heading")))
		{
			System.out.println("Actual Heading displayed is: " + ActualPageHeading + " as expected.");
		}else
		{
			System.out.println("Expected heading was: " + CONFIG.getProperty("Expected_Page_Heading") + ", but the Actual heading displayed is: " + ActualPageHeading);
		}
	}
	
	@And("^verify the input text field$")
	 public void verify_the_input_text_field()
	{
		Boolean IsInputFieldDisplayed = driver.findElement(By.xpath(OR.getProperty("City_Input_Xpath"))).isDisplayed();
		if (IsInputFieldDisplayed)
		{
			System.out.println("Input field for City name is displayed.");
		}else
		{
			System.out.println("Input field for City name is not displayed.");
		}
	
	}
	
	@And("^verify the search button on the page$")
	 public void verify_the_search_button_on_the_page()
	{
		Boolean IsSearchButtonDisplayed = driver.findElement(By.xpath(OR.getProperty("Search_Button_Xpath"))).isDisplayed();
		if (IsSearchButtonDisplayed)
		{
			System.out.println("Search button is displayed.");
		}else
		{
			System.out.println("Search button is not displayed.");
		}
	}
			
	@And("^enter invalid city name$")
	 public void enter_invalid_city_name()
	{
		driver.findElement(By.xpath(OR.getProperty("City_Input_Xpath"))).sendKeys(CONFIG.getProperty("Invalid_City_Name"));
		System.out.println("Invalid City Name entered successfully.");
	}
	
	@And("^click on search button$")
	 public void click_on_search_button()
	{
		driver.findElement(By.xpath(OR.getProperty("Search_Button_Xpath"))).click();	
		System.out.println("clicked on search button successfully.");
	}

	@And("^verify the message shown on page$")
	 public void verify_the_message_shown_on_page()
	{
		String ActualText = driver.findElement(By.xpath(OR.getProperty("Warning_Text_Xpath"))).getText();
		if (ActualText.contains(CONFIG.getProperty("Expected_Not_Found_Text")))
		{
			System.out.println("Actual text found: "+ActualText+" on page with invalid city name, is as expected.");
		}else
		{
			System.out.println("Actual text found: "+ActualText+" on page with invalid city name, is not as expected: " + CONFIG.getProperty("Expected_Not_Found_Text"));
		}
	}
	
	@And("^enter valid city name$")
	 public void enter_valid_city_name()
	{
		driver.findElement(By.xpath(OR.getProperty("City_Input_Xpath"))).sendKeys(CONFIG.getProperty("Valid_City_Name"));
		System.out.println("Valid city name entered.");
	}
	
	@And("^verify the weather details on page$")
	 public void verify_the_weather_details_on_page()
	{
		String Temp = driver.findElement(By.xpath(OR.getProperty("Temperature_Xpath"))).getText();
		System.out.println("The Temperature in the city is: " + Temp);
		String DetailedWeather = driver.findElement(By.xpath(OR.getProperty("DetailedWeather_Xpath"))).getText();
		String[] WeatherList = DetailedWeather.split(",");
		System.out.println("The wind and cloud conditions in city is: " + WeatherList[1]);
		System.out.println("The average atmospheric pressure in city is: " + WeatherList[2]);
	}
	
	@Then("^click on current location link$")
	public void click_on_current_location_link()
	{
	 driver.findElement(By.xpath(OR.getProperty("Current_Location_Link_Xpath"))).click();
	}
	
	@And("^verify the weather details for current location$")
	 public void verify_the_weather_details_for_current_location()
	{
		String CurrentCityName = driver.findElement(By.xpath("//h2[@class='weather-widget__city-name']")).getText();
		String CurrentTempreture = driver.findElement(By.xpath("//h3[@class='weather-widget__temperature']")).getText();
		String ActualCurrentDate = driver.findElement(By.xpath("//div[@id='weather-widget']//p[2]")).getText();
		
		//Replace ? with blank space
		String TempCurrentDate = ActualCurrentDate.replace("?", "");
		
		//Replace 'Wrong data' string with blank space
		ActualCurrentDate = TempCurrentDate.replace("Wrong data", "");
		
		//Append 0 if the date is a single digit date.
		String[] tempArray = ActualCurrentDate.split(" ");
		if (tempArray[2].length()!=2) 
			tempArray[2] = ("0"+tempArray[2]);
		ActualCurrentDate = (tempArray[0] + " "+tempArray[1] + " "+ tempArray[2]);
		
		//display the temperature of the current location 
		System.out.println("The current "+CurrentCityName+  " on " + ActualCurrentDate + " is: "+ CurrentTempreture);
		
		//Verify the date displayed is today's date on site.
		Date date = new Date();
		DateFormat dateFormat = new SimpleDateFormat("HH:mm MMM dd");  
	    String TodayDate = dateFormat.format(date);
	    if (TodayDate.equals(ActualCurrentDate)){
	    	System.out.println("The date displayed on the site is Today's date i.e. " + ActualCurrentDate);
	    }
	}
	
	@Then("^close the browser$")
	public void close_the_browser()
	{
	 driver.quit();
	}
}
