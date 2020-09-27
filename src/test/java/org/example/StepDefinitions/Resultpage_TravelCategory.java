package org.example.StepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.PageObject.Homepage;

public class Resultpage_TravelCategory {

    Homepage homepage = new Homepage();

    @Given("^user in nike result page$")
    public void user_in_nike_result_page() throws Throwable {
        homepage.getResultPageURL();

    }

    @When("^user clicks on travel category$")
    public void user_clicks_on_travel_category() throws Throwable {


    }

    @Then("^user can see travel category products$")
    public void user_can_see_travel_category_products() throws Throwable {

    }



}
