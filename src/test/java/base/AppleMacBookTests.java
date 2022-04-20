package base;

import base.BaseTests;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.AppleMackBookPage;

public class AppleMacBookTests extends BaseTests {


    @Test
    public void testAddToCart() throws InterruptedException {
        AppleMackBookPage appleMackBookPage = homePage.clickAppleMacBookItem();
        appleMackBookPage.clickAddToCart();
        Thread.sleep(1000);
//        softAssert.assertTrue(buildYourOwnComputerPage.getConfirmationText());
//        softAssert.assertAll();
        getWindowManager().goBack();
        Thread.sleep(1000);



    }
}