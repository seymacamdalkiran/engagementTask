package com.engagement.pages;

import com.engagement.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class DocsPage extends BasePage{
    @FindBy(xpath = "//span[@class='MuiTypography-root MuiListItemText-primary MuiTypography-h3 MuiTypography-displayBlock']")
    @CacheLookup
    public List<WebElement> docsList;

    public List<String> getDocsText(){
        List<String> elementsText = BrowserUtils.getElementsText(docsList);
        return elementsText;
    }
}
