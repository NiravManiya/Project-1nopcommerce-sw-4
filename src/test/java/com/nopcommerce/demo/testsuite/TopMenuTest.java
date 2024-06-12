package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class TopMenuTest extends TestBase {
    HomePage homePage = new HomePage();

    @Test
    public void verifyPageNavigation() {
        //List of expected test
        List<String> expectedText = Arrays.asList(
                "Computers",
                "Electronics",
                "Apparel",
                "Digital downloads",
                "Books",
                "Jewelry",
                "Gift Cards"
        );
        //List of text from pages
        List<String> actualText = homePage.getTextFromAllMenu();
        //Compare both list
        Assert.assertEquals(actualText, expectedText, "Top menu is not displayed");
    }
}
