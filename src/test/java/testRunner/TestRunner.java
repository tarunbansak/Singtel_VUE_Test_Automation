package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
features={"src/test/java/featureFiles"},
tags="@todos",
glue = {"stepDefinitions"},
plugin = {"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","json:target/cucumber.json"},
monochrome = true,
stepNotifications=true)

public class TestRunner {

}
 


