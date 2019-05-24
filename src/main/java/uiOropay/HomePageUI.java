package uiOropay;

import org.openqa.selenium.By;

public class HomePageUI {
    public final By tabToUserMenuButton = By.xpath("//button[contains(@class, 'btn user-menu__btn btn--link btn--link_m')]");

    public final By tabToLogoutButton = By.xpath("//button[contains(@class, 'btn user-menu__logout btn--')]");
}
