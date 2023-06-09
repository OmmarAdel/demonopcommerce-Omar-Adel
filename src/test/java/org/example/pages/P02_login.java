package org.example.pages;


import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

public class P02_login {


    By loginPage = By.className("ico-login");
    By emailField = By.id("Email");
    By passwordField = By.id("Password");
    By loginButton = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button");
    By assertLogin = By.className("ico-logout");

    By assertLoginFailed = By.className("message-error");


    public WebElement userGoToLoginPage () {
        return Hooks.driver.findElement(loginPage);
    }

    public WebElement userEnterEmail() {
        return Hooks.driver.findElement(emailField);
    }

    public WebElement userEnterPassWord() {
        return Hooks.driver.findElement(passwordField);
    }

    public WebElement userClickOnLoginButton() {
        return Hooks.driver.findElement(loginButton);
    }

    public WebElement assertLoginSuccessfully() {
        return Hooks.driver.findElement(assertLogin);
    }
    public WebElement assertLoginFailed(){
        return Hooks.driver.findElement(assertLoginFailed);
    }
}
