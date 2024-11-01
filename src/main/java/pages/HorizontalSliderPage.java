package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HorizontalSliderPage {
    private WebDriver driver;

    public HorizontalSliderPage(WebDriver driver) {
        this.driver = driver;
    }

    //Locators
    By slider = By.xpath("//input[@type='range']");
    By sliderResult = By.id("range");

    //Action methods

    /**
     *
     * @param count each step counts as 0.5
     * @throws InterruptedException
     */
    public void sliderUp(int count) throws InterruptedException {
        for(int i=0; i<count; i++){
            driver.findElement(slider).sendKeys(Keys.ARROW_RIGHT);
            Thread.sleep(300);
        }
    }

    public String getSliderResult(){
        return driver.findElement(sliderResult).getText();
    }
}
