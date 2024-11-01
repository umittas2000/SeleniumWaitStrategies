package alerts;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertTests extends BaseTests {

    @Test
    public void testAcceptAlert(){
        var alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.triggerAlert();
        alertsPage.alert_clickToAccept();
        String actualResultText = alertsPage.getResultText();
        String expectedResultText = "You successfully clicked an alert";
        System.out.println(actualResultText);
        Assert.assertEquals(actualResultText, expectedResultText,"Result Text is not matched");
    }

    //Click ok button in Javascript alert
    //And read AlertsPage result text
    @Test
    public void testAcceptAlertText(){
        var alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.triggerAlert();
        alertsPage.alert_clickToAccept();

        String actualResultText = alertsPage.getResultText();
        String expectedResultText = "You successfully clicked an alert";

        Assert.assertEquals(actualResultText, expectedResultText);
    }

    //Read Text Message from Javascript Alert
    //after that press cancel button ( .dismiss() method)
    @Test
    public void testGetTextFromAlert(){
        var alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.triggerConfirm();
        String actualAlertText = alertsPage.alert_getText();
        String expectedAlertText = "I am a JS Confirm";
        alertsPage.alert_clickToCancel();

        Assert.assertEquals(actualAlertText, expectedAlertText);
    }

    @Test
    public void testAlertInput(){
        var alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.triggerPrompt();
        alertsPage.alert_setInput("Hello World!");
        alertsPage.alert_clickToAccept();
        String actualAlertText = alertsPage.getResultText();
        String expectedAlertText = "You entered: Hello World!";

        Assert.assertEquals(actualAlertText, expectedAlertText);
    }


}
