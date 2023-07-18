package com.luma.demo.testsuite;

import com.luma.demo.customlisteners.CustomListeners;
import com.luma.demo.pages.Gear;
import com.luma.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)

public class GearTest extends BaseTest {

    Gear gearPage;

    @BeforeMethod(alwaysRun = true)
    public void inIT() {
        gearPage = new Gear();
    }

    @Test(groups = {"sanity", "smoke", "regression"})
    public void userShouldAddProductSuccessFullyToShoppingCart() throws InterruptedException {
        // Mouse Hover on Gear Menu
        gearPage.mouseHoverToGearMenu();

        // Click on Bags
        gearPage.clickOnBags();

        // Click on Product Name ‘Overnight Duffle’
        gearPage.clickOnProductOvernightDuffle();

        // Verify the text ‘Overnight Duffle’
        Assert.assertEquals("Overnight Duffle",
                gearPage.getProductOvernightDuffleText());


        // Change Qty 3
        gearPage.sendProductOvernightDuffleQuantity3();

        // Click on ‘Add to Cart’ Button.
        gearPage.productOvernightDuffleAddToCartButtonClick();
        Thread.sleep(1000);

        // Verify the text ‘You added Overnight Duffle to your shopping cart.’
        Assert.assertEquals("You added Overnight Duffle to your shopping cart.",
                gearPage.getProductOvernightDuffleSuccessMessage());

        // Click on ‘shopping cart’ Link into message
        gearPage.clickOnShoppingCartLink();

        // Verify the product name ‘Overnight Duffle’
        Assert.assertEquals("Overnight Duffle",
                gearPage.getOvernightDuffleText());

        //Verify the Qty is ‘3’
        Assert.assertEquals("3",
                gearPage.getOvernightDuffleQuantity());

        // Verify the product price ‘$135.00’
        Assert.assertEquals("$135.00",
                gearPage.getOvernightDufflePriceText());

        // Change Qty to ‘5’
        gearPage.sendProductOvernightDuffleQuantity5();

        // Click on ‘Update Shopping Cart’ button
        gearPage.clickOnShoppingCartButton();
        Thread.sleep(1000);

        // Verify the product price ‘$225.00’
        Assert.assertEquals("$225.00",
                gearPage.getFinalProductPrice());
    }


}




