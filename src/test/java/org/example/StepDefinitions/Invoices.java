package org.example.StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Page_Options;

import java.net.MalformedURLException;

public class Invoices extends Page_Options {
    @Given("login for creating new app")
    public void login_for_creating_new_app() throws MalformedURLException, InterruptedException {
        SetupApp(APK);
        Login(Users.user_Ashik,Users.password);
    }
    @When("create new  app")
    public void create_new_app() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("verify that the app is created and listed in the apps list")
    public void verify_that_the_app_is_created_and_listed_in_the_apps_list() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("close driver for creating apps")
    public void close_driver_for_creating_apps() {
        Teardown();
    }

}
