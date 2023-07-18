package com.luma.demo.testsuite;


import com.luma.demo.customlisteners.CustomListeners;
import com.luma.demo.pages.Men;
import com.luma.demo.utilities.Utility;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(CustomListeners.class)
public class MenTest extends Utility {

    Men manPage;

    @BeforeMethod(alwaysRun = true)
    public void inIT() {
        manPage = new Men();
    }

    @Test(groups = {"smoke","sanity", "regression"})
    public void userShouldAddProductSuccessFullyToShoppingCart() throws InterruptedException {

        manPage.mouseHoverToManMenu();
        // Mouse Hover on Bottoms
        manPage.mouseHoverOnBottoms();
        // Click on Pants
        manPage.clickOnPants();
        // Mouse Hover on product name Cronus Yoga Pant and click on size 32.
        manPage.mouseHoverOnCronusYogaPant();
        manPage.mouseHoverOnCronusYogaPantAndClickOnSize32();
        // Mouse Hover on product name Cronus Yoga Pant and click on colour Black.
        manPage.mouseHoverOnCronusYogaPantAndClickOnColourBlack();
        // Mouse Hover on product name Cronus Yoga Pant and click on ‘Add To Cart’ Button.
        manPage.mouseHoverOnCronusYogaPant();
        manPage.mouseHoverOnCronusYogaPantAndClickOnAddToCartButton();
        Thread.sleep(1000);
        // Verify the text You added Cronus Yoga Pant to your shopping cart.
        Assert.assertEquals("You added Cronus Yoga Pant to your shopping cart.",
                manPage.getProductAddedCronusYogaPantToYourShoppingCartText());
        // Click on ‘shopping cart’ Link into message
        manPage.clickOnShoppingCartLinkIntoMessageText();
        // Verify the text ‘Shopping Cart.'
        Assert.assertEquals("Shopping Cart",
                manPage.getCartLinkMessageText());
        // Verify the product name ‘Cronus Yoga Pant’
        Assert.assertEquals("Cronus Yoga Pant",
                manPage.getProductNameCronusYogaPant());
        // Verify the product size ‘32’
        Assert.assertEquals("32",
                manPage.getProductSizeIs32());
        // Verify the product colour ‘Black’
        Assert.assertEquals("Black",
                manPage.getProductYogaPantColorBlack());

    }


}
