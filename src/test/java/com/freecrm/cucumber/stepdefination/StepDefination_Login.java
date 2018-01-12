package com.freecrm.cucumber.stepdefination;

import com.freecrm.cucumber.config.uiActions.LoginPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefination_Login {
	
	//private final Logger log = LoggerUtil.getLogger(StepDefination_Login.class);
	private LoginPage objLoginPage; 

	@Given("^User is on Login Page$")
	public void user_is_on_Login_Page() throws Throwable {
		objLoginPage = new LoginPage();
	}

	@When("^User enters User Name as \"([^\"]*)\" and Password as \"([^\"]*)\"$")
	public void user_enters_User_Name_as_and_Password_as(String arg1, String arg2) throws Throwable {
	    objLoginPage.setUserName(arg1);
	    objLoginPage.setPassword(arg2);
	}

	@When("^User clicks on Login button$")
	public void user_clicks_on_Login_button() throws Throwable {
	   objLoginPage.clickOnLoginBtn();
	}

	@Then("^User lands to home page$")
	public void user_lands_to_home_page() throws Throwable {
	   
	}

}
