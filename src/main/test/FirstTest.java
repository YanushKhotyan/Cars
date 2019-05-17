import driver.Driver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class FirstTest extends CarPage{

    @Test
    public void firstTest() {
        WebDriver driver = new Driver().getChromeWebDriver();
        driver.get("http://s13.ru/");
        WebElement element = driver.findElement(By.xpath("//a[text()='Главная']"));
        element.click();
        driver.close();
    }

    @Test
    public  void searchTheBestCar(){
        WebDriver driver = new Driver().getChromeWebDriver();
        driver.get("https://av.by/");
        driver.findElement(tab).click();
        Select dropdown = new Select(driver.findElement(By.name("brand_id[]")));
        dropdown.selectByVisibleText("Mercedes-Benz"); //dropdown.selectByValue("prog");
        WebElement element = driver.findElement(By.xpath("//div[contains(@class, 'tabsfilter-content-item tabsfilter-content-item--quart')]"));
        element.click();
        driver.close();
    }
}
