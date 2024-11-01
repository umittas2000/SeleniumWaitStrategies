package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WysiwygEditorPage {
    private WebDriver   driver;
    private String editorIframeId = "";

    //Constructor
    public WysiwygEditorPage(WebDriver driver) {
        this.driver = driver;
    }

    //Locators
    private By textArea = By.id("tinymce");
    private By decreaseIndentButton = By.cssSelector("#mceu_12 button");


    //Action Methods
    public void clearTextArea(){
        switchToEditArea();
        driver.findElement(textArea).clear();
        switchToMainArea();
    }

    public void setTextArea(String text){
        switchToEditArea();
        driver.findElement(textArea).sendKeys(text);
        switchToMainArea();
    }

    public String getTextFromEditor(){
        switchToEditArea();
        String text = driver.findElement(textArea).getText();
        switchToMainArea();
        return text;
    }

    private void switchToEditArea(){
        driver.switchTo().frame(editorIframeId);
    }

    public void switchToMainArea(){
        driver.switchTo().parentFrame();
    }

    public void decreaseIndention(){
        driver.findElement(decreaseIndentButton).click();
    }
}
