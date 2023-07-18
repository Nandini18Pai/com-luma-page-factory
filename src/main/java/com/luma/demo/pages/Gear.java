package com.luma.demo.pages;

import com.luma.demo.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Gear extends Utility {

    @FindBy(xpath = "//span[normalize-space()='Gear']")
    WebElement gearMenu;

    @FindBy(xpath = "//span[normalize-space()='Bags']")
    WebElement bagsMenu;
    @FindBy(xpath = "//a[normalize-space()='Overnight Duffle']")
    WebElement productDuffle;

    @FindBy(xpath = "//span[@class='base']")
    WebElement productDuffleText;

    @FindBy(xpath = "//input[@id='qty']")
    WebElement productDuffleQuantity;

    @FindBy(xpath = "//button[@id='product-addtocart-button']")
    WebElement productDuffleAddCart;

    @FindBy(xpath = "//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")
    WebElement productDuffleSuccessesMessage;

    @FindBy(xpath = "//a[normalize-space()='shopping cart']")
    WebElement shoppingCartLinkMessage;

    @FindBy(xpath = "//td[@class='col item']//a[normalize-space()='Overnight Duffle']")
    WebElement overnightDuffleText;

    @FindBy(xpath = "//input[@title='Qty']")
    WebElement overnightDuffleQuantity;

    @FindBy(xpath = "(//span[@class='cart-price']//span)[2]")
    WebElement productDufflePrice;

    @FindBy(xpath = "(//input[@class='input-text qty'])[1]")
    WebElement productQuantityChange;

    @FindBy(xpath = "//span[normalize-space()='Update Shopping Cart']")
    WebElement updateShoppingCartButton;

    @FindBy(xpath = "(//span[@class='cart-price']//span)[2]")
    WebElement productFinalPriceText;

    public void mouseHoverToGearMenu() {
        mouseHoverToElement(gearMenu);
    }

    public void clickOnBags() {
        mouseHoverToElementAndClick(bagsMenu);
    }

    public void clickOnProductOvernightDuffle(){
        clickOnElement(productDuffle);
    }

    public String getProductOvernightDuffleText(){
        return getTextFromElement(productDuffleText);
    }



    public void sendProductOvernightDuffleQuantity3(){
        clearTextFromField(productDuffleQuantity);
        sendTextToElement(productDuffleQuantity, "3");
    }

    public void productOvernightDuffleAddToCartButtonClick(){
        clickOnElement(productDuffleAddCart);
    }

    public String getProductOvernightDuffleSuccessMessage(){
        return getTextFromElement(productDuffleSuccessesMessage);
    }

    public void  clickOnShoppingCartLink(){
        clickOnElement(shoppingCartLinkMessage);
    }

    public String getOvernightDuffleText(){
        return getTextFromElement(overnightDuffleText);
    }

    public String getOvernightDufflePriceText(){
        return getTextFromElement(productDufflePrice);
    }

    public void sendProductOvernightDuffleQuantity5(){
        clearTextFromField(productDuffleQuantity);
        sendTextToElement(productQuantityChange, "5");
    }

    public void clickOnShoppingCartButton(){
        clickOnElement(updateShoppingCartButton);
    }

    public String getFinalProductPrice(){
        return getTextFromElement(productFinalPriceText);
    }

    public String getOvernightDuffleQuantity(){
        return getAttributeValue(overnightDuffleQuantity);
    }






}
