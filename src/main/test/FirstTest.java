import driver.Driver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class FirstTest {

    @Test
    public void firstTest() {
        WebDriver driver = new Driver().getChromeWebDriver();
        driver.get("http://s13.ru/");
        WebElement element = driver.findElement(By.xpath("//a[text()='Главная']"));
        element.click();
        driver.close();
    }
}
