package org.example.StepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.PageObject.Homepage;

public class Homepage_SearchBox {
    Homepage homepage = new Homepage();

    @Given("^User is in the homepage of Argos website$")
    public void user_is_in_the_homepage_of_Argos_website() {
        homepage.getHomePageURL();


    }

    @When("^User types any product to search in the search box and clicks on the search button$")
    public void user_types_any_product_to_search_in_the_search_box_and_clicks_on_the_search_button() {
       homepage.dosearch("nike");

    }

    @Then("^User should be able to see all the products related to search$")
    public void user_should_be_able_to_see_all_the_products_related_to_search()  {
        homepage.getResultPageURL();


    }


}
