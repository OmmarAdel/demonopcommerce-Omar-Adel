package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P02_login;
import org.openqa.selenium.support.Color;
import org.testng.asserts.SoftAssert;

public class D02_loginStepDef {

    P02_login login = new P02_login();


    @Given("user go to login page")
    public void userGoToLoginPage (){
        login.userGoToLoginPage().click();
    }


    @When("user login with valid email and password")
    public void userLoginWithValidEmailAndPassword() {

        login.userEnterEmail().sendKeys("testers1@example.com");
        login.userEnterPassWord().sendKeys("P@ssw0rd");

    }

    @And("user click on login button")
    public void userClickOnLoginButton() {
        login.userClickOnLoginButton().click();
    }

    @Then("user login to the system successfully")
    public void userLoginToTheSystemSuccessfully() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(login.myAccountTabIsDisplayed().isDisplayed());
        softAssert.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/");
        softAssert.assertAll();

    }


        @When("user login with invalid email And password {string} and {string}")
        public void userLoginWithInvalidEmailAndPasswordAnd(String arg0, String arg1) {
            login.userEnterEmail().sendKeys("tesst1@example.com");
            login.userEnterPassWord().sendKeys("P@sssw0rd");
        }
        @And("user press on login button")
        public void userPressOnLoginButton () {
            login.userClickOnLoginButton().click();
    }

        @Then("user could not login to the system")
        public void userCouldNotLoginToTheSystem () {
            SoftAssert softAssert = new SoftAssert();
            String errorMessage = login.displayMessageError();
            String errorMessageHex = Color.fromString(errorMessage).asHex();
            softAssert.assertTrue(errorMessageHex.equals("#e4434b"));
            softAssert.assertAll();

    }
}