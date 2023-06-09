package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P01_register {
    By registerButton = By.className("ico-register");
    By firstName = By.id("FirstName");
    By lastname = By.id("LastName");
    By email = By.id("Email");
    By password = By.id("Password");
    By confirmPassword = By.id("ConfirmPassword");
    By clickOnRegisterButton = By.id("register-button");
    By assertRegister = By.className("result");






    public WebElement clickOnRegisterButton(){
       return Hooks.driver.findElement(registerButton);
    }

    public WebElement userEnterFirstName (){
        return Hooks.driver.findElement(firstName);
    }
    public WebElement userEnterLastname (){
        return Hooks.driver.findElement(lastname);
    }
    public WebElement userEnterEmail (){
        return Hooks.driver.findElement(email);
    }
    public WebElement userEnterPassword (){
        return Hooks.driver.findElement(password);
    }
    public WebElement userEnterConfirmPassword (){
        return Hooks.driver.findElement(confirmPassword);
    }
    public WebElement userClickOnRegisterButton (){
        return Hooks.driver.findElement(clickOnRegisterButton);
    }

    public WebElement assertRegistration (){
        return Hooks.driver.findElement(assertRegister);
    }


}
