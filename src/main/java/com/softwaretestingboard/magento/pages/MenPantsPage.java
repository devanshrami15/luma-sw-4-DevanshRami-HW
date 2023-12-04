package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class MenPantsPage extends Utility {
    By cronusYogaPant = By.xpath("//a[normalize-space()='Cronus Yoga Pant']");
    By size32 = By.xpath("//div[@class='swatch-opt-880']//div[@id='option-label-size-143-item-175']");
    By blackColor = By.xpath("//div[@class='swatch-opt-880']//div[@id='option-label-color-93-item-49']");
    By addToCartButton = By.xpath("//li[1]//div[1]//div[1]//div[3]//div[1]//div[1]//form[1]//button[1]//span[1]");
    By verifyText = By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");
    By shoppingCart = By.xpath("//a[normalize-space()='shopping cart']");


    public void mouseHoverOnCronusYogaPant(){mouseHoverToElement(cronusYogaPant);}
    public void clickOnSize32(){clickOnElement(size32);}
    public void clickOnBlackColor(){clickOnElement(blackColor);}
    public void clickOnAddToCartButton(){mouseHoverToElementAndClick(addToCartButton);}
    public void verifyTheText(){verifyTheStringMessage(verifyText,"You added Cronus Yoga Pant to your shopping cart.");}
    public void clickOnShoppingCart(){clickOnElement(shoppingCart);}

}
