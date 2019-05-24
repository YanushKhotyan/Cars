package oropayTest;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import uiOropay.HomePageUI;
import uiOropay.UISinginForm;

import static driver.Driver.*;

public class HomePageOrapay extends HomePageUI {

    public HomePageOrapay() {

        this.waitForLoad(driver);

    }

    public void waitForLoad(WebDriver driver) {
        ExpectedCondition<Boolean> pageLoadCondition = new
                ExpectedCondition<Boolean>() {
                    public Boolean apply(WebDriver driver) {
                        return ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete");
                    }
                };
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(pageLoadCondition);
    }

    public SignInOropay logOut(){

        return new SignInOropay();
    }
}
