package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
   // protected HomePage homePage;

    //Constructor to create WebDriver instance
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    //Locators


    //Action Methods, click on Form Authentication link
    // returns handle to understand current state of the driver.
    public LoginPage clickFormAuthenticationLink() {
       clickLink("Form Authentication");
        return new LoginPage(driver);
    }
    //Week13 hoversPage
    public HoversPage clickHovers(){
        clickLink("Hovers");
        return new HoversPage(driver);
    }

    //Dropdown Page action method , return related page as handle
    public DropdownPage clickDropdownLink() {
        clickLink("Dropdown");

        return new DropdownPage(driver);
    }


    //Action methods

    //This is just for checking purpose
    // to see what is the state of driver.
    public String getURL(){
        return driver.getCurrentUrl();
    }

    //Generic method to manage clicking the links
    //with this one, we don't need to define 35nos By object
    // for accessing the webpages from HomePage.
    private void clickLink(String linkText){
        driver.findElement(By.linkText(linkText)).click();

    }

    //Week14
    //Dropdown Page action method , return related page as handle
    public KeyPressesPage clickKeyPressesLink() {
        clickLink("Key Presses");

        return new KeyPressesPage(driver);
    }

    //Dropdown Page action method , return related page as handle
    public HorizontalSliderPage clickHorizontalSliderLink() {
        clickLink("Horizontal Slider");

        return new HorizontalSliderPage(driver);
    }

    //AlertsPage
    public AlertsPage clickJavaScriptAlerts(){
        clickLink("JavaScript Alerts");
        return new AlertsPage(driver);
    }

   //FileUploadPage
   public FileUploadPage clickFileUploadLink() {
        clickLink("File Upload");
        return new FileUploadPage(driver);
   }

   //ModalWindowPage
    public Entry_AdPage clickModalWindowLink(){
        clickLink("Entry Ad");
        return new Entry_AdPage(driver);
    }

    //ContextMenu page
    public ContextMenuPage clickContextMenuLink() {
        clickLink("Context Menu");
        return new ContextMenuPage(driver);
    }

    //WysiwygEditor Page
    public WysiwygEditorPage clickWysiwygEditorLink() {
        clickLink("WYSIWYG Editor");
        return new WysiwygEditorPage(driver);
    }

    //Dynamic loading page
    public DynamicLoadingPage clickDynamicLoadingLink() {
        clickLink("Dynamic Loading");

        return new DynamicLoadingPage(driver);
    }
}
