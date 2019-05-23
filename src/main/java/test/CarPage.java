package test;

import org.openqa.selenium.By;

public class CarPage {

    public final By tabToMakeCar = By.xpath("//div[contains(@class, 'tabsfilter-content-item tabsfilter-content-item--quart')]");

    public final By tabToModelCar = By.xpath("//div[contains(@class, 'tabsfilter-content-item tabsfilter-content-item--quart')][2]");

    public final By tabToSearchButton = By.xpath("//div[contains(@class, 'tabsfilter-content-item tabsfilter-content-item--submit')]");

    public final By tabToLoginButton = By.xpath("//a[contains(@href, '/login')]");

    public final By tabToLoginField = By.xpath("//input[contains(@id, 'login')]");

    public final By tabToPasswordField = By.xpath("//input[contains(@id, 'password')]");

    public final By tabSignInButton = By.xpath("//input[contains(@name, 'submit')]");

}
