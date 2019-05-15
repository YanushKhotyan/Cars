package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

    private WebDriver chromeWebDriver;

    public WebDriver getChromeWebDriver() {
        if (chromeWebDriver == null) {
            System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
            chromeWebDriver =  new ChromeDriver();
        }
        return chromeWebDriver;
    }

}
