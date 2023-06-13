package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.testng.asserts.SoftAssert;

public class D04_searchStepDef {
    P03_homePage search = new P03_homePage();



    @When("user click on search field {string}")
    public void userClickOnSearchField(String product) {
        search.searchField().sendKeys(product);
        search.searchButton().click();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(search.currentURL().contains("/search?q"));
        softAssert.assertAll();


    }

    @Then("user should see result about this {string}")
    public void userShouldSeeResultAboutThis(String arg0) {
        SoftAssert softAssert = new SoftAssert();
        for (int i=1; i<search.searchResults().size(); i++){
            softAssert.assertTrue(search.searchResults().get(i).getText().toLowerCase().trim().contains(arg0));
            System.out.println(search.searchResults().get(i).getText().toLowerCase().trim());

        }
    }
}
