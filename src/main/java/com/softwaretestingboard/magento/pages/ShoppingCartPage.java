package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class ShoppingCartPage extends Utility {
    By shoppingCart = By.xpath("//span[@class='base']");
    By cronusYogaPant = By.xpath("//td[@class='col item']//a[normalize-space()='Cronus Yoga Pant']");
    By size32 = By.xpath("//dd[contains(text(),'32')]");
    By colorBlack = By.xpath("//dd[contains(text(),'Black')]");
    By overnightDuffle = By.xpath("//td[@class='col item']//a[normalize-space()='Overnight Duffle']");
    By qty3 = By.xpath("//span[@class='cart-price']//span[@class='price'][normalize-space()='$45.00']");
    By productPrice = By.xpath("//span[@class='cart-price']//span[@class='price'][normalize-space()='$135.00']");
    By changeQty = By.xpath("//span[@class='cart-price']//span[@class='price'][normalize-space()='$45.00']");
    By updateCart = By.xpath("//span[normalize-space()='Update Shopping Cart']");
    By verifyPrice = By.xpath("//td[@class='col subtotal']//span[@class='price'][normalize-space()='$225.00']");



    public void verifyTheDisplayTextIsShoppingCart(){getTextFromElement(shoppingCart);}
    public void verifyTheProductNameIsCronusYogaPant(){mouseHoverToElement(cronusYogaPant);}
    public void verifyTheProductSizeIs32(){mouseHoverToElement(size32);}
    public void verifyTheProductColorIsBlack(){mouseHoverToElement(colorBlack);}
    public void verifyTheProductNameIsOvernightDuffle(){verifyTheStringMessage(overnightDuffle,"Overnight Duffle");}
    public void verifyQtyIs3(){mouseHoverToElement(qty3);}
    public void verifyTheProductPriceIs$135(){verifyTheStringMessage(productPrice,"$135.00");}
    public void changeTheQtyTo5(){sendTextToElement(changeQty,"5");}
    public void clickOnUpdateShoppingCartButton(){clickOnElement(updateCart);}
    public void verifyTheProductPrice(){verifyTheStringMessage(verifyPrice,"$225.00");}

}
