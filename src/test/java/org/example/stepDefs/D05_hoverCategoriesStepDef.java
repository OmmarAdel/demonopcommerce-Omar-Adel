package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import static org.example.stepDefs.Hooks.driver;


public class D05_hoverCategoriesStepDef {
    P03_homePage homePage = new P03_homePage();





    @When(": user hover on one category and click on sub category")
    public void userHoverOnOneCategoryAndClickOnSubCategory() {
        WebElement label = homePage.hoverOn();
        new Actions(driver).moveToElement(label).perform();
        homePage.clickOnSubCategory().click();
    }

    @Then(": user see result for sub category")
    public void userSeeResultForSubCategory() {
        Assert.assertTrue(homePage.currentURL().contains("notebooks"));
    }
}
