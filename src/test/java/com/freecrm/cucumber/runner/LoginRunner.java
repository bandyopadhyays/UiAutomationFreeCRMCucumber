package com.freecrm.cucumber.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

/**
 * 
 * In glue mention all the package name which are required to run the Runner class. Like test base and step definition is required. 
 * In test base we have before and after hook. Until this is in glue hooks can not be associated with runner.   
 *
 */

@CucumberOptions(features = { "classpath:featurefile/login/Login.feature" }, glue = {
		"classpath:com.freecrm.cucumber.stepdefination",
		"classpath:com.freecrm.cucumber.testbase"})
public class LoginRunner extends AbstractTestNGCucumberTests {

}
