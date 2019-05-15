import driver.Driver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class FirstTest {

    @Test
    public void firstTest() {
        WebDriver driver = new Driver().getChromeWebDriver();
        driver.get("http://mycompany.site.com");
        WebElement element = driver.findElement(By.id("#element_id"));
    }
}
