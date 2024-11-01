package keys;

import base.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

public class KeysTests extends BaseTests {

    @Test
    public void testBackSpace() {
        var keyPage = homePage.clickKeyPressesLink();
        keyPage.enterText("A");
        keyPage.enterText(""+Keys.BACK_SPACE);
        Assert.assertEquals(keyPage.getResult(),"You entered: BACK_SPACE");

    }

    @Test
    public void testPi(){
        var keyPage = homePage.clickKeyPressesLink();
        keyPage.enterPi();
        Assert.assertEquals(keyPage.getResult(),"You entered: 4");
    }

    @Test
    public void testSlider() throws InterruptedException {
        var horizontalSliderPage = homePage.clickHorizontalSliderLink();
        horizontalSliderPage.sliderUp(8);
        Assert.assertEquals(horizontalSliderPage.getSliderResult(),"4");
    }
}
