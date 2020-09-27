package org.example.StepDefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.PageObject.ResultPage;

public class Resultpage_SportsnFitness {

    ResultPage resultPage = new ResultPage();


    @When("^user clicks on Sports and Fitness category$")
    public void user_clicks_on_Sports_and_Fitness_category() throws Throwable {
        resultPage.SportsnFitnessclick();

    }

    @Then("^user should be able to see Sports and Fitness category$")
    public void user_should_be_able_to_see_Sports_and_Fitness_category() throws Throwable {
        resultPage.getSportsURL();

    }



}
