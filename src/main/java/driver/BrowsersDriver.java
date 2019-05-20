package driver;

import org.openqa.selenium.WebDriver;

import javax.crypto.Mac;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class BrowsersDriver {

    Properties prop = new Properties();
    Set URL;
    String str;

    public Properties getProp() {
        return prop;
    }
}
