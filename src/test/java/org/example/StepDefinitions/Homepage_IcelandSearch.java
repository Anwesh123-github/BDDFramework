package org.example.StepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.PageObject.Homepage;
import org.example.PageObject.HomepageIceland;

public class Homepage_IcelandSearch {

    HomepageIceland homepageIceland = new HomepageIceland();

    @Given("^User is in the iceland website$")
    public void user_is_in_the_iceland_website() throws Throwable {
        homepageIceland.IcelandHomepage();

    }

    @When("^User types an item in the search box and clicks on search button$")
    public void user_types_an_item_in_the_search_box_and_clicks_on_search_button() throws Throwable {
        homepageIceland.IcelandSearchBox("crisps");

    }

    @Then("^User should be able to see all the products related to that item$")
    public void user_should_be_able_to_see_all_the_products_related_to_that_item() throws Throwable {
        homepageIceland.AssertIcelandPage();


    }



}
