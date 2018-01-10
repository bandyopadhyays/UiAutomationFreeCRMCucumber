package com.freecrm.cucumber.stepdefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefination_Login {
	WebDriver driver;

	@Given("^User is on Login Page$")
	public void user_is_on_Login_Page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:/Users/souni_apu/workspace/com.freecrm.cucumber/src/main/resources/drivers/chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("https:\\www.google.com");
	}

	@When("^User enters User Name \"([^\"]*)\"and Password \"([^\"]*)\"$")
	public void user_enters_User_Name_and_Password(String arg1, String arg2) throws Throwable {
	   
	}

	@When("^User clicks on Login button$")
	public void user_clicks_on_Login_button() throws Throwable {
	   
	}

	@Then("^User lands to home page$")
	public void user_lands_to_home_page() throws Throwable {
	   
	}

}
