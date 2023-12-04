package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {

    By womenMenu = By.xpath("//span[normalize-space()']='Women");
    By tops = By.xpath("//a[@id='ui-id-9']//span[contains(text(),'Tops')]");
    By jackets = By.xpath("//a[@id='ui-id-11']//span[contains(text(),'Jackets')]");
    By menMenu = By.xpath("//span[normalize-space()='Men']");
    By Bottoms = By.xpath("//a[@id='ui-id-18']//span[contains(text(),'Bottoms')]");
    By pants = By.xpath("//a[@id='ui-id-23']//span[contains(text(),'Pants')]");
    By gearMenu = By.xpath("//span[normalize-space()='Gear']");
    By bags = By.xpath("//span[normalize-space()='Bags']");



    public void mouseHoverOnWomen(){
        clickOnElement(womenMenu);
    }
    public void mouseHoverOnTops(){
        mouseHoverToElement(tops);
    }
    public void mouseHoverOnMenMenu(){mouseHoverToElement(menMenu);}
    public void mouesHoverOnBottoms(){mouseHoverToElement(Bottoms);}
    public void clickOnPants(){clickOnElement(pants);}
    public void clickOnJacket(){clickOnElement(jackets);}
    public void mouseHoverOnGearMenu(){mouseHoverToElement(gearMenu);}
    public void clickOnBags(){clickOnElement(bags);}

}
