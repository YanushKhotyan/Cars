package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

    private WebDriver chromeWebDriver;

    public WebDriver getChromeWebDriver() {
        if (chromeWebDriver == null) {
            System.setProperty("webdriver.chrome.driver", "/Users/julianakhilnitskaza/IdeaProjects/Training/Cars/src/resources/chromedriver 2");
            //System.setProperty("webdriver.chrome.driver", "C:\\Users\\khotyan.y\\IdeaProjects\\Cars54\\src\\resources\\chromedriver.exe");
            chromeWebDriver =  new ChromeDriver();
        }
        return chromeWebDriver;
    }
}
