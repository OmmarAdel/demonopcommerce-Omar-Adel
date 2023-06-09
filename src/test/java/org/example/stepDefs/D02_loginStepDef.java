package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P02_login;
import org.testng.Assert;
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

        Assert.assertTrue(login.assertLoginSuccessfully().isDisplayed());
    }



        @And("user press on login button")
        public void userPressOnLoginButton () {
            login.userClickOnLoginButton().click();
        }

        @Then("user could not login to the system")
        public void userCouldNotLoginToTheSystem () {
            SoftAssert softAssert = new SoftAssert();
            softAssert.assertTrue(login.assertLoginFailed().isDisplayed());

        }

        @When("user login with invalid {string} and {string}")
        public void userLoginWithInvalidAnd (String arg0, String arg1){
            login.userEnterEmail().sendKeys("tesst1@example.com");
            login.userEnterPassWord().sendKeys("P@sssw0rd");
        }

    }