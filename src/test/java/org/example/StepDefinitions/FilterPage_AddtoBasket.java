package org.example.StepDefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.PageObject.FilterPage;
import org.example.PageObject.Homepage;

public class FilterPage_AddtoBasket {

    FilterPage filterPage = new FilterPage();


    @When("^clicks on the add to trolley of Nike Lean Armbands$")
    public void clicks_on_the_add_to_trolley_of_Nike_Lean_Armbands() throws Throwable {
        filterPage.AddtoTrolley();

    }

    @When("^user clicks on go to trolley button$")
    public void user_clicks_on_go_to_trolley_button() throws Throwable {
        filterPage.GotoTrolley();

    }

    @Then("^user should be able to see the product in the basket$")
    public void user_should_be_able_to_see_the_product_in_the_basket() throws Throwable {
        filterPage.BasketresultURL();

    }

}
