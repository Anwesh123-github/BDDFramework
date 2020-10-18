package org.example.StepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.PageObject.Homepage;

public class Homepage_ExpediaCalender {

    Homepage homepage = new Homepage();

    @Given("^User in the homepage of expedia$")
    public void user_in_the_homepage_of_expedia() throws Throwable {
        homepage.flightclick();

    }

    @Given("^User clicks on flight button$")
    public void user_clicks_on_flight_button() throws Throwable {
        homepage.departingclick();

    }

    @Given("^User clicks on departing field tab$")
    public void user_clicks_on_departing_field_tab() throws Throwable {

    }

    @When("^User takes all the dates in the list$")
    public void user_takes_all_the_dates_in_the_list() throws Throwable {

    }

    @When("^User clicks on one particular date$")
    public void user_clicks_on_one_particular_date() throws Throwable {
        homepage.departuredate();

    }

    @Then("^User should be able to select the date on which he wants to travel$")
    public void user_should_be_able_to_select_the_date_on_which_he_wants_to_travel() throws Throwable {

    }



}
