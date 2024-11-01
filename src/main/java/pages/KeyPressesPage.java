package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class KeyPressesPage {
    private WebDriver driver;

    public KeyPressesPage(WebDriver driver) {
        this.driver = driver;
    }

    //Locators
    private By inputField = By.id("target");
    private By resultText = By.id("result");


    //Action Methods and handles
    public void enterText(String text) {
        driver.findElement(inputField).sendKeys(text);
    }

    public String getResult(){
        return driver.findElement(resultText).getText();
    }

    public void enterPi(){
        enterText(Keys.chord(Keys.ALT,"p")+"=3.14");
    }

}
