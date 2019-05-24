package test;

import static driver.Driver.*;


public class LoginToAv extends CarPage {

    public void openLoginForm() {

        driver.get("https://av.by/");

        driver.findElement(tabToLoginButton).click();

    }

    public void enterCorrectCredentials(String login, String password) {

        driver.findElement(tabToLoginField).sendKeys(login);
        driver.findElement(tabToPasswordField).sendKeys(password);
        driver.findElement(tabSignInButton).click();

    }

    public void checkHomePage() {

        System.out.println("Проверочка прошла супер успешно, можно выпить пивка");
    }


}
