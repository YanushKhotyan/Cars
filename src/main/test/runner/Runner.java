package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import stepDefinitions.HookBDDStep;
import test.FirstTest;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\khotyan.y\\IdeaProjects\\Cars3\\src\\resources\\features\\AAT-Login Test.feature", glue = "")
public class Runner {


}
