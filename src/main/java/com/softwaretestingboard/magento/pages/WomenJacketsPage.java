package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class WomenJacketsPage extends Utility {


    By sortBy = By.xpath("//div[@class='page-wrapper']//div[2]//div[3]//select[1]");
    By alphabeticalOrder = By.xpath("//strong[@class = 'product name product-item-name']");
    By sortByFilter = By.xpath("//div[@class='page-wrapper']//div[2]//div[3]//select[1]),price");
    By lowToHigh = By.xpath("//span[@class = 'normal-price']//span[@class = 'price']");

    public void selectProductNameFromDropDown(){selectByValueFromDropDown(sortBy, "Product Name");
    }

    public void productNameDisplayInAscendingOrder(){
        verifyTheListIsAscendingOrder(alphabeticalOrder);
    }
    public void selectPriceFroDropDown(){selectByValueFromDropDown(sortByFilter,"Price");}

    public void displayPriceLowToHigh(){clickOnElement(lowToHigh);}
}
