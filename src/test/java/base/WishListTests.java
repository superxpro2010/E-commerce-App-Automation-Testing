package base;

import org.testng.annotations.Test;
import pages.AppleMackBookPage;
import pages.BuildYourOwnComputerPage;
import pages.HtcOnePage;

public class WishListTests extends BaseTests {


    @Test
    public void addItemsToWishListTest() throws InterruptedException {
        BuildYourOwnComputerPage buildYourOwnComputerPage =homePage.clickBuildYourOwnComputerItem();
        buildYourOwnComputerPage.selectHDD320();
        buildYourOwnComputerPage.selectRam("4");
        buildYourOwnComputerPage.clickAddToWishList();
        Thread.sleep(2000);
        getWindowManager().goBack();
        AppleMackBookPage appleMackBookPage=homePage.clickAppleMacBookItem();
        appleMackBookPage.clickAddToWishList();
        Thread.sleep(2000);
        getWindowManager().goBack();
        HtcOnePage htcOnePage=homePage.clickHtcOneItem();
        htcOnePage.clickAddToWishList();
        Thread.sleep(10000);


        getWindowManager().goBack();

    }
}
