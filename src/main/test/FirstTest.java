import driver.Driver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;


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

        List<WebElement> mercedesBenz;
        WebDriver driver = new Driver().getChromeWebDriver();
        driver.get("https://av.by/");

        driver.findElement(tabToMakeCar).click();

        Select selectMakeCar = new Select(driver.findElement(By.name("brand_id[]")));

        selectMakeCar.selectByValue("5898");

        driver.findElement(tabToModelCar).click();

        Select selectModelCar = new Select(driver.findElement(By.name("model_id[]")));
        selectModelCar.selectByValue("5898");

        driver.findElement(tabToSearchButton).click();

        List<WebElement> elementList = driver.findElements(tabToMakeCar);

        driver.close();
    }
}
