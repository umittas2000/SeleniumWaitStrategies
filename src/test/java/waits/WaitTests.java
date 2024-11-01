package waits;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WaitTests extends BaseTests {

    @Test
    public void testExample1ExplicitWait() {
        //implicit wait is implemented in BaseTests class for all project
        //Explicit wait explained in this test, please navigate Framework layer
        //Find dynamicLoadingPage class and review the code for explicit wait.

        //get the text after loading indicator disappears
        var dynamicLoadingPage = homePage.clickDynamicLoadingLink();

        dynamicLoadingPage.clickExample1();
        dynamicLoadingPage.clickStartButton();
        
        String actualText = dynamicLoadingPage.getLoadedTextExplicit();
        String expectedText = "Hello World!";

        Assert.assertEquals(actualText,expectedText,"LoadedText not matching!");
    }

    @Test
    public void testExample1FluentWait(){
        var dynamicLoadingPage = homePage.clickDynamicLoadingLink();
        dynamicLoadingPage.clickExample1();
        dynamicLoadingPage.clickStartButton();
        
        String actualText = dynamicLoadingPage.getLoadedTextFluent();
        String expectedText = "Hello World!";
        Assert.assertEquals(actualText,expectedText,"LoadedText not matching!");
    }

    @Test
    public void testExample2Fluent(){
        var dynamicLoadingPage = homePage.clickDynamicLoadingLink();
        dynamicLoadingPage.clickExample2();
        dynamicLoadingPage.clickStartButton();

        String actualText = dynamicLoadingPage.getLoadedTextFluent();
        String expectedText = "Hello World!";
        Assert.assertEquals(actualText,expectedText,"LoadedText not matching!");
    }

    @Test
    public void testExample2ExplicitWait() {
        //implicit wait is implemented in BaseTests class for all project
        //Explicit wait explained in this test, please navigate Framework layer
        //Find dynamicLoadingPage class and review the code for explicit wait.

        //get the text after loading indicator disappears
        var dynamicLoadingPage = homePage.clickDynamicLoadingLink();

        dynamicLoadingPage.clickExample1();
        dynamicLoadingPage.clickStartButton();

        String actualText = dynamicLoadingPage.getLoadedTextExplicit();
        String expectedText = "Hello World!";

        Assert.assertEquals(actualText,expectedText,"LoadedText not matching!");
    }




}
