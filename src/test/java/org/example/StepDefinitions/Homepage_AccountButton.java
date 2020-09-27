package org.example.StepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.PageObject.Homepage;

public class Homepage_AccountButton {

    Homepage homepage = new Homepage();



    @Given("^User is in the argos website homepage$")
    public void user_is_in_the_argos_website_homepage() throws Throwable {
        homepage.getHomePageURL();


    }

    @When("^User clicks account button$")
    public void user_clicks_account_button() throws Throwable {
        homepage.clickbutton();


    }

    @Then("^User can see the account details$")
    public void user_can_see_the_account_details() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }


}
