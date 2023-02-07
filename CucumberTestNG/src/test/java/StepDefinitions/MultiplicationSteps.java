package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MultiplicationSteps {

    @Given("do a = {int}")
    public void do_a(Integer int1) {
        System.out.println("A is ::" + int1);
    }
    @Given("do b = {int}")
    public void do_b(Integer int1) {
        System.out.println("B is ::" + int1);
    }
    @When("do c = a * b{int}")
    public void c_a_b(Integer int2) {
        System.out.println("The user ID is ::" + int2);
    }
    @Then("do c = {int}")
    public void c(Integer int3) {
        System.out.println("The user ID is ::" + int3);
    }
}
