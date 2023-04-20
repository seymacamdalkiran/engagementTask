package com.engagement.pages;

import com.engagement.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    public BasePage() {
        PageFactory.initElements(Driver.get(),this);
    }
    @FindBy(id = "ccc-notify-accept")
    @CacheLookup
    public WebElement acceptCookiesButton;

    @FindBy(xpath = "//span[.='Data Hub']")
    @CacheLookup
    public WebElement dataHubText;

    @FindBy(xpath = "//button//span[.='API Dashboard']")
    @CacheLookup
    public WebElement apiDashbordMenu;

    @FindBy(xpath = "//button//span[.='Download']")
    @CacheLookup
    public WebElement downloadMenu;

    @FindBy(xpath = "//button//span[.='Docs']")
    @CacheLookup
    public WebElement docsMenu;

    @FindBy(xpath = "//button//span[.='Support']")
    @CacheLookup
    public WebElement supportMenu;

    @FindBy(xpath = "//button//span[.='Pricing']")
    @CacheLookup
    public WebElement pricingMenu;


    public String getText(String str){
        WebElement element = Driver.get().findElement(By.xpath("//span[.='" + str + "']"));
        return element.getText();
    }

    public void clickOnTabs(String str){
       Driver.get().findElement(By.xpath("//span[.='" + str + "']")).click();
    }
}
