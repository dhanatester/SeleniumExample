package uk.co.bbc.testrunner;

import io.cucumber.core.gherkin.Feature;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources",glue = "uk.co.bbc.stepdefs")
public class Runner {

}
