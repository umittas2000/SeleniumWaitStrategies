package alerts;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ModalWindowTests extends BaseTests {
    @Test
    public void testModalWindow() {
        var entry_AdPage = homePage.clickModalWindowLink();

        if(!entry_AdPage.isModalOkButtonDisplayed()){
            //if it's not opening by default
            entry_AdPage.clickModalTriggerLink();
        }

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(entry_AdPage.getModalWindowTitle(),"");
        softAssert.assertEquals(entry_AdPage.getModalBodyText(),"");

        entry_AdPage.clickModalOkButton();
        softAssert.assertAll();
    }
}
