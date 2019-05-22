package test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import java.util.List;

import static driver.Driver.*;


public class FirstTest extends CarPage {

    public void searchTheBestCar() {

        driver.get("https://av.by/");

        driver.findElement(tabToMakeCar).click();

        Select selectMakeCar = new Select(driver.findElement(By.name("brand_id[]")));

        selectMakeCar.selectByValue("683");

        driver.findElement(tabToModelCar).click();

        Select selectModelCar = new Select(driver.findElement(By.name("model_id[]")));
        selectModelCar.selectByValue("5898");

        driver.findElement(tabToSearchButton).click();

        List<WebElement> objLink = driver.findElements(By.className("listing-item-title"));

        for (WebElement obkCurrentLink : objLink) {
            String strLinkText = obkCurrentLink.getText();

            System.out.println(strLinkText);
        }

    }

}
