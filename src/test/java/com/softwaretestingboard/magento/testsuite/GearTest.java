package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.BagsPage;
import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.ShoppingCartPage;
import com.softwaretestingboard.magento.testbase.TestBase;
import org.testng.annotations.Test;

public class GearTest extends TestBase {
    HomePage homePage = new HomePage();
    BagsPage bagsPage = new BagsPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();

    @Test
    public void userShouldAddProductSuccessFullyToShoppingCart(){
        homePage.mouseHoverOnGearMenu();
        homePage.clickOnBags();
        bagsPage.clickOnOvernightDuffle();
        bagsPage.verifyTheTextOvernightDuffle();
        bagsPage.changeQty3();
        bagsPage.clickOnAddToCart();
        bagsPage.verifyTheText();
        bagsPage.clickOnShoppingCart();
        shoppingCartPage.verifyTheProductNameIsCronusYogaPant();
        shoppingCartPage.verifyTheProductNameIsOvernightDuffle();
        shoppingCartPage.verifyQtyIs3();
        shoppingCartPage.verifyTheProductPriceIs$135();
        shoppingCartPage.changeTheQtyTo5();
        shoppingCartPage.clickOnUpdateShoppingCartButton();
        shoppingCartPage.verifyTheProductPrice();
    }

}
