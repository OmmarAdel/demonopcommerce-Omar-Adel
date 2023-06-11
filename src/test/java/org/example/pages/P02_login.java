package org.example.pages;


import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

public class P02_login {


    By loginPage = By.className("ico-login");
    By emailField = By.id("Email");
    By passwordField = By.id("Password");
    By loginButton = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button");
    By myAccountTab = By.className("ico-account");


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

    public WebElement myAccountTabIsDisplayed(){
        return Hooks.driver.findElement(myAccountTab);
    }
    public String displayMessageError (){
        return Hooks.driver.findElement(By.className("message-error"))
                .getCssValue("color");
    }

}
