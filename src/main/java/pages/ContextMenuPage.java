package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPage {
    private WebDriver driver;

    public ContextMenuPage(WebDriver driver) {
        this.driver = driver;
    }

    //locators
    private By contextFrame = By.id("hot-spot");


    //action Methods
    public String alert_GetText(){
        return driver.switchTo().alert().getText();
    }

    public void rightClickInContextFrame(){
        Actions action = new Actions(driver);
        WebElement contextFrameWebElement = driver.findElement(contextFrame);
        action.contextClick(contextFrameWebElement).perform();
    }

    public void alert_ClickOk(){
        driver.switchTo().alert().accept();
    }

}
