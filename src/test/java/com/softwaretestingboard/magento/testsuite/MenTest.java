package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.MenPantsPage;
import com.softwaretestingboard.magento.pages.ShoppingCartPage;
import com.softwaretestingboard.magento.testbase.TestBase;
import org.testng.annotations.Test;

public class MenTest extends TestBase {

    HomePage homePage = new HomePage();
    MenPantsPage menPantsPage = new MenPantsPage();
    ShoppingCartPage shoppingCartPage= new ShoppingCartPage();

    @Test
    public void userShouldAddProductSuccessFullyToShoppInCart(){
        homePage.mouseHoverOnMenMenu();
        homePage.mouesHoverOnBottoms();
        homePage.clickOnPants();
        menPantsPage.mouseHoverOnCronusYogaPant();
        menPantsPage.clickOnSize32();
        menPantsPage.mouseHoverOnCronusYogaPant();
        menPantsPage.clickOnBlackColor();
        menPantsPage.mouseHoverOnCronusYogaPant();
        menPantsPage.clickOnAddToCartButton();
        menPantsPage.verifyTheText();
        menPantsPage.clickOnShoppingCart();
        shoppingCartPage.verifyTheDisplayTextIsShoppingCart();
        shoppingCartPage.verifyTheProductNameIsCronusYogaPant();
        shoppingCartPage.verifyTheProductSizeIs32();
        shoppingCartPage.verifyTheProductColorIsBlack();
    }
}
