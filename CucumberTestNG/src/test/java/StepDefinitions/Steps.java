package StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.sql.SQLOutput;

public class Steps {

    @Before
    public void setup(Scenario scenario) {
        System.out.println("============================================================================");
        System.out.println("Scenario name::" + scenario.getName());
        System.out.println("Scenario name::" + scenario.getSourceTagNames());
        System.out.println("Scenario name::" + scenario.getStatus());
        System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");

    }
    @After
    public void teardown() {
        System.out.println("============================================================================");
    }

    @Given("the user in on login page")
    public void the_user_in_on_login_page() {
        System.out.println("the user is on login page");
    }
    @When("the user enter valid credentials")
    public void the_user_enter_valid_credentials() {
        System.out.println("Entered username and password");
    }
    @When("hits submit")
    public void hits_submit() {
        System.out.println("Click on submit");
    }
    @Then("the user should be logged in successfully")
    public void the_user_should_be_logged_in_successfully() {
        System.out.println("Yeah I am logged in");
    }

    @When("he enters user id as {string}")
    public void he_enters_user_id_as(String string) {
        System.out.println("The user ID is ::" + string);

    }
    @When("he enters passward as {string}")
    public void he_enters_passward_as(String string) {
        System.out.println("The user password is ::" + string);
    }
}

//https://www.youtube.com/watch?v=DtSYzJtjfXQ&list=PLT5zEYAR7_PbvFgjy9Av2RAoc_apngHc_&index=5
//Pentru MVN test de pe CDM
//https://www.youtube.com/watch?v=RQ_Z859Hd7Q