package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Entry_AdPage {
    private WebDriver driver;

    public Entry_AdPage(WebDriver driver) {
        this.driver = driver;
    }

    //Locators
    private By ModalTriggerLink = By.id("restart-ad");

    //Important point: if there is a link on element, you may not be able to interact with <p>,
    //Just locate <div> element and interact.
    private By modalOkButton = By.xpath("//div[@class='modal-footer']");
    private By modalBody =By.xpath("//div[@class='modal-body']/p");
    private By modalTitle = By.xpath("//div[@class='modal-title']/h3");

    public void clickModalTriggerLink() {
        driver.findElement(ModalTriggerLink).click();
    }

    public void clickModalOkButton() {
        driver.findElement(modalOkButton).click();
    }
    public String getModalWindowTitle(){
       return driver.findElement(modalTitle).getText();
    }

    public String getModalBodyText(){
        return driver.findElement(modalBody).getText();
    }

    public boolean isModalOkButtonDisplayed(){
        return driver.findElement(modalOkButton).isDisplayed();
    }
}
