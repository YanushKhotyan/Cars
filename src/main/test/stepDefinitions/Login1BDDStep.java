package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.jupiter.api.Test;
import test.LoginToAv;

public class Login1BDDStep {

    LoginToAv loginToAv = new LoginToAv();

    @Given("a user with data")
    public void aUserWithData() {
        loginToAv.openLoginForm();

    }

    @When("the user (.*) and (.*) to website")
    public void theUserLOGINAndPASSWORDToWebsite(String login, String password) {
        loginToAv.enterCorrectCredentials(login, password);
    }


    @Then("home page is opened")
    public void homePageIsOpened() {
        loginToAv.checkHomePage();
    }
}
