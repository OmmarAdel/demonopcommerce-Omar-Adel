package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P03_homePage {
    By clickOnDropDown = By.id("customerCurrency");
    By clickOnSearchField = By.id("small-searchterms");
    By clickOnSearchButton = By.xpath("//*[@id=\"small-search-box-form\"]/button");

    By hoverOnComputers = By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]/a");

    By clickOnNotebooks = By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]/ul/li[2]/a");






    public WebElement clickDropDown(){
        return Hooks.driver.findElement(clickOnDropDown);
    }

    public List<WebElement> listOfItems(){
        return Hooks.driver.findElements(By.className("prices"));
    }

    public WebElement item(){
        return Hooks.driver.findElement(By.className("prices"));
    }

    public WebElement searchField(){
        return Hooks.driver.findElement(clickOnSearchField);
    }
    public WebElement searchButton(){
        return Hooks.driver.findElement(clickOnSearchButton);
    }
    public List<WebElement> searchResults() {
        return Hooks.driver.findElements(By.className("item-box"));
    }
    public String currentURL(){
        return Hooks.driver.getCurrentUrl();
    }
    public WebElement hoverOn (){
        return Hooks.driver.findElement(hoverOnComputers);
    }
    public WebElement clickOnSubCategory (){
        return Hooks.driver.findElement(clickOnNotebooks);
    }


}
