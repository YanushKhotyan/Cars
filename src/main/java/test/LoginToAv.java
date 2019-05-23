package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;
import static driver.Driver.*;


public class LoginToAv extends CarPage {

    public void openLoginForm() {

        driver.get("https://av.by/");

        driver.findElement(tabToLoginButton).click();

//        List<WebElement> objLink = driver.findElements(By.className("box-container js-box-container"));
//
//        for (WebElement obkCurrentLink : objLink) {
//            String strLinkText = obkCurrentLink.getText();
//
//            System.out.println(strLinkText);
//        }

    }

    public void enterCorrectCredentials( String login, String password) {

        //driver.findElement(tabToLoginField).click();
        driver.findElement(tabToLoginField).sendKeys(login);
       // driver.findElement(tabToPasswordField).click();
        driver.findElement(tabToPasswordField).sendKeys(password);
        driver.findElement(tabSignInButton).click();

    }

    public void checkHomePage(){

           System.out.println("Проверочка прошла супер успешно, можно выпить пивка");
    }


}
