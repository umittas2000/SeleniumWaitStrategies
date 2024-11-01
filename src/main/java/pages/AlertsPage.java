package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsPage {
    private WebDriver driver;

    //Constructor
    public AlertsPage(WebDriver driver) {
        this.driver = driver;
    }

    //Locators
    private By triggerAlertButton = By.xpath("//button[text()='Click for JS Alert']");
    private By triggerConfirmButton = By.xpath("//button[text()='Click for JS Confirm']");
    private By resultText = By.id("result");
    private By triggerPromptButton = By.xpath("//button[text()='Click for JS Prompt']");


    //Action Methods

    public void triggerAlert(){
        driver.findElement(triggerAlertButton).click();
    }

    public void triggerConfirm(){
        driver.findElement(triggerConfirmButton).click();
    }

    public void triggerPrompt(){
        driver.findElement(triggerPromptButton).click();
    }

    public void alert_setInput(String text){
        driver.switchTo().alert().sendKeys(text);
    }

    public void alert_clickToAccept(){
        //We can't access javascript message within current page and DOM
        //That's why we are using .switchTo method to change driver state to JavaScript message
        driver.switchTo().alert().accept();
    }

    public void alert_clickToCancel(){
        //We can't access javascript message within current page and DOM
        //That's why we are using .switchTo method to change driver state to JavaScript message
        driver.switchTo().alert().dismiss();
    }

    public String alert_getText(){
        return driver.switchTo().alert().getText();
    }


    public String getResultText(){
        return driver.findElement(resultText).getText();
    }
}
