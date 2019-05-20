import org.openqa.selenium.By;

public class CarPage {

    public final By tabToMakeCar= By.xpath("//div[contains(@class, 'tabsfilter-content-item tabsfilter-content-item--quart')]");

    public final By tabToModelCar= By.xpath("//div[contains(@class, 'tabsfilter-content-item tabsfilter-content-item--quart')][2]");

    public final By tabToSearchButton= By.xpath("//div[contains(@class, 'tabsfilter-content-item tabsfilter-content-item--submit')]");

}
