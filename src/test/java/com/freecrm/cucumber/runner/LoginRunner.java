package com.freecrm.cucumber.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(features = { "classpath:featurefile/login/Login.feature" }, glue = {
		"com.freecrm.cucumber.stepdefination" })
public class LoginRunner extends AbstractTestNGCucumberTests {

}
