package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import test.CarPage;
import test.FirstTest;

import java.util.List;

public class SearchBDDStep {

    FirstTest firstTest = new FirstTest();


    @When("a user search for information about some cars")
    public void aUserSearchForInformationAboutSomeCars() {
        firstTest.searchTheBestCar();
    }

}

