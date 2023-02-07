package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.sql.SQLOutput;

public class Beer {

    @Given("I have {int} beer cans")
    public void i_have_beer_cans(Integer int1) {
        System.out.println(int1);
    }
    @Given("I have drunk {int} beer cans")
    public void i_have_drunk_beer_cans(Integer int2) {
        System.out.println(int2);
    }
    @When("I go to my fridge")
    public void i_go_to_my_fridge() {

    }
    @Then("I should have {int} beer cans")
    public void i_should_have_beer_cans(Integer int3) {
        System.out.println(int3);
    }

}
