package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.WomenJacketsPage;
import com.softwaretestingboard.magento.testbase.TestBase;
import org.testng.annotations.Test;

public class WomenTest extends TestBase {

    HomePage homePage = new HomePage();
    WomenJacketsPage womenJacketsPage = new WomenJacketsPage();

    @Test
    public void verifyTheSortByProductNameFilter(){
        homePage.mouseHoverOnWomen();
        homePage.mouseHoverOnTops();
        homePage.clickOnJacket();
        womenJacketsPage.selectProductNameFromDropDown();
        womenJacketsPage.productNameDisplayInAscendingOrder();
    }

    @Test
    public void verifyTheSortByPriceFilter(){
        homePage.mouseHoverOnWomen();
        homePage.mouseHoverOnTops();
        homePage.clickOnJacket();
        womenJacketsPage.selectPriceFroDropDown();
        womenJacketsPage.displayPriceLowToHigh();
    }

}
