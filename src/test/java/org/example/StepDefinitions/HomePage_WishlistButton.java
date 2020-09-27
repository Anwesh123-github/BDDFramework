package org.example.StepDefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.PageObject.Homepage;

public class HomePage_WishlistButton {

    Homepage homepage = new Homepage();

    @When("^User clicks on Wishlist button$")
    public void user_clicks_on_Wishlist_button() throws Throwable {
        homepage.wishlistclick();

    }

    @Then("^User should be able to see all wishlist$")
    public void user_should_be_able_to_see_all_wishlist() throws Throwable {
        homepage.WishListResultURL();

    }



}
