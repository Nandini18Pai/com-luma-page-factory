package com.luma.demo.pages;

import com.luma.demo.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Men extends Utility {

    @FindBy(xpath = "//span[normalize-space()='Men']")
    WebElement menMenu;

    @FindBy(xpath = "//a[@id='ui-id-18']")
    WebElement bottoms;

    @FindBy(xpath = "//a[@id='ui-id-23']//span[contains(text(),'Pants')]")
    WebElement pants;

    @FindBy(xpath = "//a[normalize-space()='Cronus Yoga Pant']")
    WebElement yogaPant;

    @FindBy(xpath = "(//div[@class='swatch-option text'])[1]")
    WebElement pantSize32;

    @FindBy(xpath = "(//div[@class='swatch-option color'])[1]")
    WebElement pantColourBlack;

    @FindBy(xpath = "(//span[contains(text(),'Add to Cart')])[1]")
    WebElement cronusYogaPantAddToCart;

    @FindBy(xpath = "//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")
    WebElement yogaPantShoppingCartText;

    @FindBy(xpath = "//a[normalize-space()='shopping cart']")
    WebElement shoppingCartLinkIntoMessage;

    @FindBy(xpath = "//span[@class='base']")
    WebElement yogaShoppingCartText;

    @FindBy(xpath = "//td[@class='col item']//a[normalize-space()='Cronus Yoga Pant']")
    WebElement productIsCronusYogaPant;

    @FindBy(xpath = "//dd[contains(text(),'32')]")
    WebElement productSizeIs32;//dd[contains(text(),'Black')]

    @FindBy(xpath = "//dd[contains(text(),'Black')]")
    WebElement productYogaPantColourBlack;

    public void mouseHoverToManMenu() {
        mouseHoverToElement(menMenu);
    }
    public void  mouseHoverOnBottoms() {
        mouseHoverToElement(bottoms);
    }
    public void clickOnPants(){
        clickOnElement(pants);
    }
    public void  mouseHoverOnCronusYogaPant() {
        mouseHoverToElement(yogaPant);
    }
    public void mouseHoverOnCronusYogaPantAndClickOnSize32() {
        mouseHoverToElementAndClick(pantSize32);
    }
    public void mouseHoverOnCronusYogaPantAndClickOnColourBlack() {
        mouseHoverToElementAndClick(pantColourBlack);
    }
    public void mouseHoverOnCronusYogaPantAndClickOnAddToCartButton() {
        mouseHoverToElementAndClick(cronusYogaPantAddToCart);
    }
    public String getProductAddedCronusYogaPantToYourShoppingCartText(){
        return getTextFromElement(yogaPantShoppingCartText);
    }
    public void clickOnShoppingCartLinkIntoMessageText(){
        clickOnElement(shoppingCartLinkIntoMessage);
    }
    public String getCartLinkMessageText() {
        return getTextFromElement(yogaShoppingCartText);
    }
    public String getProductNameCronusYogaPant() {
        return getTextFromElement(productIsCronusYogaPant);
    }
    public String getProductSizeIs32() {
        return getTextFromElement(productSizeIs32);
    }

    public String getProductYogaPantColorBlack() {
        return getTextFromElement(productYogaPantColourBlack);



    }
}
