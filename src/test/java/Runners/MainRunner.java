package Runners;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"classpath:Features"}, glue = {"StepDefinitions"},
        plugin = {"pretty","io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"},
        tags ="@Web-Booking" ,monochrome = true, dryRun = false)
public class MainRunner extends AbstractTestNGCucumberTests {
}
