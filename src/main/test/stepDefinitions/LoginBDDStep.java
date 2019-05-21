package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginBDDStep {
    // инстансе тест логина

    @Given("a user with correct data present")
    public void aUserWithCorrectDataPresent() {
        System.out.println("Step1");
    }

    @When("the user login to system")
    public void theUserLoginToSystem() {
        System.out.println("Step2");
    }

    @Then("home page is available")
    public void homePageIsAvailable() {
        System.out.println("Step3");
    }
}
