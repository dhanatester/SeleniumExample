package uk.co.bbc.stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class StepDefs {
 WebDriver driver;

 public StepDefs(){
  System.setProperty("webdriver.chrome.driver","drivers\\chromedriver.exe");
  driver = new ChromeDriver();
  driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
 }
 @Given("I navigate to BBC website")
 public void i_navigate_to_bbc_website() {
  driver.get("https://www.bbc.co.uk/");
 }

 @When("I click on home Button")
 public void i_click_on_home_button() {
  driver.findElement(By.className("ssrcss-4aca3d-NavigationLink")).click();
 }

 @Then("I should see BBC homepage")
 public void i_should_see_bbc_homepage() {
  String actualTitle = driver.getTitle();
  String expectedTitle = "BBC - Home";
  Assert.assertEquals(actualTitle,expectedTitle);
 }





}
