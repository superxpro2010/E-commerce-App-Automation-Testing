package base;

import org.testng.annotations.Test;
import pages.HtcOnePage;

public class HtcOneTests extends BaseTests {


    @Test
    public void testAddToCart() throws InterruptedException {
        HtcOnePage htcOnePage = homePage.clickHtcOneItem();
        htcOnePage.clickAddToCart();
        Thread.sleep(1000);
//        softAssert.assertTrue(buildYourOwnComputerPage.getConfirmationText());
//        softAssert.assertAll();
        getWindowManager().goBack();
        Thread.sleep(1000);



    }
}
