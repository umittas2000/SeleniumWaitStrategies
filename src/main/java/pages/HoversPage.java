package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HoversPage {
    private WebDriver driver;

    //Locators
    private By figureBox = By.className("figure");
    private By captionBox = By.className("figcaption");

    //Constructor
    public HoversPage(WebDriver driver) {
        this.driver = driver;
    }

    // Pass index parameters
    // to hover mouse on to desired web element

    /**
     *
     * @param index starts at 1
     */
    public FigureCaption hoverOverFigure(int index){
        WebElement figure = driver.findElements(figureBox).get(index-1);
        Actions action = new Actions(driver);

        //hover mouse on desired index of
        //figurebox and make captionBox visible to catch
        action.moveToElement(figure).perform();

        //Return captionBox web element
        return new FigureCaption(figure.findElement(captionBox));
    }


    /**
     *  Define an object class to represent FigureCaption WebElement
     *
     */

    public class FigureCaption{
        //define WebElement for Caption.
        private WebElement caption;

        /**
         *  <caption>
         *      <header></header>
         *      <a href></a>
         *  </caption>
         */

        //Locators
        //Locate header and link web elements
        private By header =By.tagName("h5");
        private By link = By.tagName("a");

        //constructor
        //Get caption WebElement during initialization
        public FigureCaption(WebElement caption) {
            this.caption = caption;
        }


        //Action Methods

        //This action method will verify on mouse hover on webelement
        //CaptionBox is displayed or not...
        public boolean isCaptionDisplayed(){
            return caption.isDisplayed();
        }

        //This Action method will return text in Header tag
        public String getHeaderText(){
            return caption.findElement(header).getText();
        }

        //This action method will return link URL
        public String getLink(){
            return caption.findElement(link).getAttribute("href");
        }

        //This action method will return link Text
        public String getLinkText(){
            return caption.findElement(link).getText();
        }
    }
}
