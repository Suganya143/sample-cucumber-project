package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty", "html:src/main/resources/cucumber-reports/reports.html" }, features = {
		"src/test/resources/features" }, glue = { "stepdefinitions" })
public class AllTests {

}
