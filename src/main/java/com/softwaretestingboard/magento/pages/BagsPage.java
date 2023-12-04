package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class BagsPage extends Utility {
    By overnightDuffle = By.xpath("//a[normalize-space()='Overnight Duffle']");
    By textOvernightDuffle = By.xpath("//span[@class='base']");
    By qty3 = By.xpath("//input[@id='qty']");
    By AddToCart = By.xpath("//span[normalize-space()='Add to Cart']");
    By verifyText = By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");
    By shoppingCart = By.xpath("//a[normalize-space()='shopping cart']");


    public void clickOnOvernightDuffle(){clickOnElement(overnightDuffle);}
    public void verifyTheTextOvernightDuffle(){mouseHoverToElement(textOvernightDuffle);}
    public void changeQty3(){sendTextToElement(qty3,"3");}
    public void clickOnAddToCart(){clickOnElement(AddToCart);}
    public void verifyTheText(){verifyTheStringMessage(verifyText,"You added Overnight Duffle to your shopping cart.");}
    public void clickOnShoppingCart(){clickOnElement(shoppingCart);}

}
