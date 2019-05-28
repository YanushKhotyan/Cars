package oropayTest;
import uiOropay.UISinginForm;

import static driver.Driver.*;

public class SignInOropay extends UISinginForm {


    public HomePageOropay signIn(String login, String password){
        driver.get("http://mps6-dev-testers.mhd.local:8080/");
        driver.findElement(tabToEmailField).sendKeys(login);
        driver.findElement(tabToPasswordField).sendKeys(password);
        driver.findElement(tabToSignInButton).click();
        return new HomePageOropay();
    }

    public SignInOropay() {
    }
}
