import driver.Driver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;


public class FirstTest extends CarPage{

    @Test
    public void firstTest() {
        WebDriver driver = new Driver().getChromeWebDriverMac("chromeMac");
        driver.get("http://s13.ru/");
        WebElement element = driver.findElement(By.xpath("//a[text()='Главная']"));
        element.click();
        driver.close();
    }

    @Test
    public  void searchTheBestCar(){

        WebDriver driver = new Driver().getChromeWebDriverMac("chromeMac");
        driver.get("https://av.by/");
        driver.findElement(tabToMakeCar).click();

        Select selectMakeCar = new Select(driver.findElement(By.name("brand_id[]")));

        selectMakeCar.selectByValue("683");

        driver.findElement(tabToModelCar).click();

        Select selectModelCar = new Select(driver.findElement(By.name("model_id[]")));
        selectModelCar.selectByValue("5898");

        driver.findElement(tabToSearchButton).click();

        List<WebElement> objLink = driver.findElements(By.className("listing-item-title"));

        for (WebElement obkCurrentLink : objLink){
            String strLinkText = obkCurrentLink.getText();

            System.out.println(strLinkText);
        }

        driver.close();
    }
}
