package base;

import org.testng.annotations.Test;
import pages.BuildYourOwnComputerPage;

public class BuildYourComputerTests extends BaseTests {


    @Test
    public void testAddToCart() throws InterruptedException {
        BuildYourOwnComputerPage buildYourOwnComputerPage = homePage.clickBuildYourOwnComputerItem();
        buildYourOwnComputerPage.selectRam("4");
        Thread.sleep(3000);
        buildYourOwnComputerPage.selectHDD320();
        Thread.sleep(3000);
        buildYourOwnComputerPage.clickAddToCart();
        Thread.sleep(2000);
//        softAssert.assertTrue(buildYourOwnComputerPage.getConfirmationText());
//        softAssert.assertAll();
        getWindowManager().goBack();
        Thread.sleep(2000);



    }
}
