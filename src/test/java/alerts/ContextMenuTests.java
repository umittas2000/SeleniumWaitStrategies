package alerts;

import base.BaseTests;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContextMenuTests extends BaseTests {

    @Test
    public void contextMenuTest() {
        var contextMenuPage = homePage.clickContextMenuLink();
        contextMenuPage.rightClickInContextFrame();
        String alertText = contextMenuPage.alert_GetText();
        System.out.println(alertText);

        Assert.assertEquals("You selected a context menu",alertText);
        contextMenuPage.alert_ClickOk();

    }
}
