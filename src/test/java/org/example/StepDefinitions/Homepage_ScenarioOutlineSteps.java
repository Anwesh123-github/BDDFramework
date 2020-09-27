package org.example.StepDefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.PageObject.Homepage;

public class Homepage_ScenarioOutlineSteps {

    Homepage homepage = new Homepage();

    @When("^user search for \"([^\"]*)\"$")
    public void user_search_for(String item) throws Throwable {
        homepage.multipleSearch(item);

    }

    @Then("^user should be able to search all the products$")
    public void user_should_be_able_to_search_all_the_products() throws Throwable {

    }



} //end of class
