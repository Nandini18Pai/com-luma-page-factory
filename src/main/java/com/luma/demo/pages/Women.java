package com.luma.demo.pages;

import com.luma.demo.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class Women extends Utility {

    @FindBy(xpath = "//span[normalize-space()='Women']")
    WebElement womenMenu;

    @FindBy(xpath = "//a[@id='ui-id-9']//span[contains(text(),'Tops')]")
    WebElement topMenu;
    @FindBy(xpath = "//a[@id='ui-id-11']//span[contains(text(),'Jackets')]")
    WebElement womenJackets;
    @CacheLookup
    @FindBy(xpath = "//strong[@class='product name product-item-name']//a")
    List<WebElement> jacketListBefore;
    @CacheLookup
    @FindBy(xpath = "//strong[@class='product name product-item-name']//a")
    List<WebElement> jacketListAfter;
    @FindBy(xpath = "(//select[@id='sorter'])[1]")
    WebElement filterByProductName;

    @FindBy(xpath = "(//select[@id='sorter'])[1]")
    WebElement filterByProductPrice;


    @CacheLookup
    @FindBy(xpath = "//span[@class='price-wrapper ']//span")
    List<WebElement> priceListBefore;

    @CacheLookup
    @FindBy(xpath = "//span[@class='price-wrapper ']//span")
    List<WebElement> priceListAfter;
    public void mouseHoverToWomenMenu() {
        mouseHoverToElement(womenMenu);
    }

    public void mouseHoverWomenTopMenu() {
        mouseHoverToElement(topMenu);
    }

    public void mouseHoverWomenTopMenuClickOnJackets() {
        mouseHoverToElementAndClick(womenJackets);
    }

    public List<String> getJacketsNames() {
        List<WebElement> jacketsElementsList = jacketListBefore;
        List<String> jacketsNameListBefore = new ArrayList<>();
        for (WebElement value : jacketsElementsList) {
            jacketsNameListBefore.add(value.getText());
        }
        return jacketsNameListBefore;
    }

    public void filterByProductName() {
        selectByVisibleTextFromDropDown(filterByProductName, "Product Name");
    }

    public List<String> getJacketsNamesAfterSorting() {
        List<WebElement> jacketsElementsList = jacketListAfter;
        List<String> jacketsNameListBefore = new ArrayList<>();
        for (WebElement value : jacketsElementsList) {
            jacketsNameListBefore.add(value.getText());
        }
        return jacketsNameListBefore;
    }

    public List<Double> getJacketsPriceListBefore() {
        List<WebElement> jacketsPriceElementList = priceListBefore;
        List<Double> jacketsPriceListBefore = new ArrayList<>();
        for (WebElement value : jacketsPriceElementList) {
            //Converting price in to Double and Removing $ from price
            jacketsPriceListBefore.add(Double.valueOf(value.getText().replace("$", "")));
        }
        return jacketsPriceListBefore;
    }

    public void getFilterByProductPrice() {
        selectByVisibleTextFromDropDown(filterByProductPrice, "Price");
    }

    public List<Double> getJacketsPriceListAfter() {
        List<WebElement> jacketsPriceElementList = priceListAfter;
        List<Double> jacketsPriceListAfter = new ArrayList<>();
        for (WebElement value : jacketsPriceElementList) {
            //Converting price in to Double and Removing $ from price
            jacketsPriceListAfter.add(Double.valueOf(value.getText().replace("$", "")));
        }
        return jacketsPriceListAfter;
    }


}
