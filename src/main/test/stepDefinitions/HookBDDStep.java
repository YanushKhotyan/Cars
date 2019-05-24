package stepDefinitions;


import cucumber.api.java.After;
import cucumber.api.java.Before;
import driver.Driver;
import propertyReader.PropertyReader;

import static driver.Driver.*;

public class HookBDDStep {

    @Before
    public void instanceWebDriver() {
        PropertyReader prop = new PropertyReader();
        new Driver().getWebDriver(prop.getDriverName());
        driver.manage().window().maximize();
    }

    @After
    public void afterTest() {
        driver.quit();
        driver = null;
    }


}
