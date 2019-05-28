package oropayTest;

import uiOropay.HomePageUI;

import static driver.Driver.driver;

public class HomePageOropay extends HomePageUI {

    public SignInOropay logOut(){
        driver.findElement(tabToUserMenuButton).click();
        driver.findElement(tabToLogoutButton).click();
        return new SignInOropay();
    }

    public HomePageOropay() {
    }
}
