package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
import propertyReader.PropertyReader;


public class Driver {


    private WebDriver driver;

    public WebDriver getWebDriver(String value) {
        PropertyReader prop = new PropertyReader();
        switch (value) {
            case "chromeMac":

                if (driver == null) {

                    System.setProperty("webdriver.chrome.driver", "/Users/julianakhilnitskaza/IdeaProjects/Training/Cars/src/resources/chromedriver 2");
                    driver = new ChromeDriver();
                }
                break;

            case "chromeWindow":

                if (driver == null) {
                    System.setProperty("webdriver.chrome.driver", "C:\\Users\\khotyan.y\\IdeaProjects\\Cars54\\src\\resources\\chromedriver.exe");
                    driver = new ChromeDriver();
                }
                break;

            case "fireFoxMac":

                if (driver == null) {
                    System.setProperty("webdriver.gecko.driver", "/Users/julianakhilnitskaza/IdeaProjects/Training/Cars/src/resources/geckodriver");
                    FirefoxProfile fp = new FirefoxProfile();
                    fp.setAcceptUntrustedCertificates(true);
                    fp.containsWebDriverExtension();
                    driver = new FirefoxDriver(fp);
                }
                break;

            case "fireFoxWindow":

                if (driver == null) {
                    System.setProperty("webdriver.gecko.driver", "C:\\Users\\khotyan.y\\IdeaProjects\\Cars3\\src\\resources\\geckodriver.exe");
                    FirefoxProfile fp = new FirefoxProfile();
                    fp.setAcceptUntrustedCertificates(true);
                    fp.containsWebDriverExtension();
                    driver = new FirefoxDriver(fp);
                }
                break;

        }
        return driver;
    }
}



