package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {


    private WebDriver driver;


    public WebDriver getChromeWebDriverMac(String value) {

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
                    driver = new FirefoxDriver();
                }
                break;

            case "fireFoxWindow":

                if (driver == null) {
                    //На рабочем компе скопировать путь к файлу
                    System.setProperty("webdriver.gecko.driver", "");
                    driver = new FirefoxDriver();
                }
                break;

        }
        return driver;
    }
}
//    public WebDriver getChromeWebDriverWindow() {
//
//    }
//
//    public WebDriver getGeckdriverWebDriverFireFoxMac() {
//
//    }
//
//    public WebDriver getGeckdriverWebDriverFireFoxWindow() {
//
//    }


