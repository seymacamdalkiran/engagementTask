package com.engagement.stepDefs;

import com.engagement.pages.DocsPage;
import io.cucumber.java.en.*;
import org.junit.Assert;

import java.util.List;

public class Docs_StepDefs {
    DocsPage docsPage=new DocsPage();
    @Then("Verify the items on the side menu")
    public void verify_the_items_on_the_side_menu(List<String> expected) {
        List<String> actual = docsPage.getDocsText();
        Assert.assertEquals(expected, actual);
    }
}
