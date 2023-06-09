package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_register;
import org.openqa.selenium.By;
import org.openqa.selenium.support.Color;
import org.testng.asserts.SoftAssert;

public class D01_registerStepDef {

    P01_register pages = new P01_register();


    @Given("user go to register page")
    public void userGoToRegisterPage() {
        pages.clickOnRegisterButton().click();
    }

    @When("user fills mandatory Personal Details {string} {string} {string}")
    public void userFillsMandatoryPersonalDetails(String firstname, String lastname, String email) {
        pages.userEnterFirstName().sendKeys("automation");
        pages.userEnterLastname().sendKeys("tester");
        pages.userEnterEmail().sendKeys("testers1@example.com");
    }

    @And("user fills mandatory password and ConfirmPassword {string} {string}")
    public void userFillsMandatoryPasswordAndConfirmPassword(String password, String ConfirmPassword) {
        pages.userEnterPassword().sendKeys("P@ssw0rd");
        pages.userEnterConfirmPassword().sendKeys("P@ssw0rd");
    }

    @And("user click on register button")
    public void userClickOnRegisterButton() {
        pages.userClickOnRegisterButton().click();
    }

    @Then("Success message is displayed")
    public void successMessageIsDisplayed() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(pages.assertRegistration().isDisplayed());
        softAssert.assertTrue(pages.assertRegistration().getText().contains("Your registration completed"));
        String actualColor =  Hooks.driver.findElement(By.cssSelector("body > div.master-wrapper-page > div.master-wrapper-content > div > div > div > div.page-body > div.result")).getCssValue("color");
        String actualColorHex = Color.fromString(actualColor).asHex();
        softAssert.assertTrue(actualColorHex.equals("#4cb17c"));
        softAssert.assertAll();
    }


}
