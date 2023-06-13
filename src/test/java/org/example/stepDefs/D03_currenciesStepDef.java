package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class D03_currenciesStepDef {
    P03_homePage homePage = new P03_homePage();

    @When("user click on list price dropdown and Select another currency {string}")
    public void userClickOnListPriceDropdownAndSelectAnotherCurrency(String arg0) {
        WebElement listDropDown = homePage.clickDropDown();
        Select select = new Select(listDropDown);
        select.selectByVisibleText("Euro");
    }





    @Then("new currency should be appear")
    public void newCurrencyShouldBeAppear() {

        for (int i = 0; i < homePage.listOfItems().size(); i++ ){
            Assert.assertTrue(homePage.item().getText().contains("€"),"wrong solution ");
        }
        System.out.println(homePage.listOfItems().size());

    }



}
