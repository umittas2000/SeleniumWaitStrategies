package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DynamicLoadingPage {
    private WebDriver driver;

    //Constructor
    public DynamicLoadingPage(WebDriver driver) {
        this.driver = driver;
    }

    //Locators
    private By example1Link = By.xpath("//div[@class='example']/a[1]");
    private By example2Link = By.xpath("//div[@class='example']/a[2]");
    private By startButton = By.xpath("//div[@id='start']/button[1]");
    private By loadingIndicator = By.id("loading");
    private By loadedText = By.id("finish");


    //Action Methods
    public void clickExample1() {
        driver.findElement(example1Link).click();
    }

    public void clickExample2() {
        driver.findElement(example2Link).click();
    }

    public void clickStartButton() {
        driver.findElement(startButton).click();

        //Explicit wait
        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    public String getLoadedTextExplicit() {
        //Wait maximum 10 seconds specifically for this step
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        //Wait until Loading indicator element disappears
        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(loadingIndicator)));

        return driver.findElement(loadedText).getText();
    }

    public String getLoadedTextFluent() {
        //Wait maximum 10 seconds specifically for this step
        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        FluentWait wait = new FluentWait(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoSuchElementException.class);


        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(loadingIndicator)));
        //Wait until Loading indicator element disappears
        //wait.until(ExpectedConditions.invisibilityOf(driver.findElement(loadingIndicator)));

        return driver.findElement(loadedText).getText();
    }


}
